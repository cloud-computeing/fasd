package com.gzu.bbs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.gzu.bbs.mapper.UserMapper;
import com.gzu.bbs.pojo.Admin;
import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.User;
import com.gzu.bbs.service.AdminService;
import com.gzu.bbs.service.ModeratorService;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.PlatetypeService;
import com.gzu.bbs.service.PostService;
import com.gzu.bbs.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.ws.wsdl.parser.InaccessibleWSDLException;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private ModeratorService moderatorService;
	@Autowired 
	private PlateService plateService;
	@Autowired
	private PlatetypeService platetypeService;
	@Autowired
	private UserService userService;
	@Autowired
	private PostService postService;
	
	/**
	 * 版主的controller
	 * @param model
	 * @param moderator
	 * @param id
	 * @return
	 * @throws Exception
	 */
	//查询版主的详细信息
	@RequestMapping(value="/oneModerator")
	public String oneModerator(Model model,Moderator moderator,Integer id) throws Exception{
		moderator = moderatorService.selectModerator(id);
		model.addAttribute("moderator",moderator);
		return "admin/moderator/updateModerator";
	}
	
	//这里是查询所有的版主信息
	@RequestMapping(value="/allModerator")
	public String selectStringAllModerator(Model model) throws Exception{
		List<Moderator> allModerators = new ArrayList<Moderator>();
		allModerators = moderatorService.allModerators();
		model.addAttribute("allModerators", allModerators);
		return "admin/moderator/allModerator";
	}
	
	//这里是插入版主的信息
	@RequestMapping(value="/insertModerator")
	public String insertModerator(Moderator moderator)throws Exception{
		if((moderator.getModeratorheadid()!=null)&&(moderator.getModeratorid()!=null)&&(moderator.getModeratorpassword()!=null)
				&&(moderator.getModeratorsex()!=null)&&(moderator.getModeratorname()!=null)){
			Moderator moderator2 = new Moderator();
			moderator2 = moderatorService.selectModerator(moderator.getModeratorid());
			if(moderator2!=null){
				if((moderator2.getModeratorid()).equals(moderator.getModeratorid())){
					return "admin/moderator/insertModerator";//这里是id重复了，最好是跳转页
				}
			}
			int a = moderatorService.insertModerator(moderator);
			return "redirect:allModerator.action";
		}
		return "admin/moderator/insertModerator";
	}
	
	//这里是删除版主的信息
	@RequestMapping(value="/deletModerator")
	public String deletModerator(Moderator moderator,Integer id) throws Exception{
		int a = moderatorService.deletModerator(id);
		return "redirect:allModerator.action";
	}
	
	//这里是更新版主信息
	@RequestMapping(value="/updateModerator")
	public String updateModerator(Moderator moderator,Integer id) throws Exception{
		moderatorService.updateModerator(moderator);
		return "redirect:allModerator.action";
	}
	
	//模糊查询版主
	@RequestMapping(value="/someModerator")
	public String selectBy(String name,Model model)throws Exception{
		List<Moderator> someModerators = new ArrayList<Moderator>();
		someModerators = moderatorService.someModerators(name);
		model.addAttribute("someModerators", someModerators);
		return "admin/moderator/someModerator";
	}
	
	//查询版主管理的板块
	@RequestMapping(value="/plate")
	public String selectPlate(Integer id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = moderatorService.somePlates(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/moderator/somPlate";
	}
	//************************************板块和板块类型的分界线********************************
	/**
	 * 板块类型的controller
	 * @param model
	 * @return
	 * @throws Exception
	 */
	//查询所有的板块类型
	@RequestMapping(value="/allPlateType")
	public String allPlateType(Model model)throws Exception{
		List<PlatetypeCustom> allPlatetypes  = new ArrayList<PlatetypeCustom>();
		allPlatetypes = platetypeService.queryAllType();
		model.addAttribute("allPlatetypes", allPlatetypes);
		return "admin/plateType/allPlateType";
	}
	
	//查询板块类型的详细信息
	@RequestMapping(value="/onePlateType")
	public String onePlateType(Model model,Platetype platetype,Integer id)throws Exception{
		platetype = platetypeService.onePlateType(id);
		model.addAttribute("platetype", platetype);
		return "admin/plateType/updatePlateType";
	}
	//删除板块类型的信息
	@RequestMapping(value="/deletPlateType")
	public String deletPlateType(Integer id)throws Exception{
		int a = platetypeService.deletPlateType(id);
		return "admin/redirect:allPlateType.action";
	}
	//添加板块类型的信息
	@RequestMapping(value="/insertPlateType")
	public String insertPlateType(Platetype plateType)throws Exception{
		if((plateType.getModeratorid()!=null)&&(plateType.getPlatetypeid()!=null)&&(plateType.getPlatetypename()!=null)){
			Moderator moderator = new Moderator();
			moderator = moderatorService.selectModerator(plateType.getModeratorid());
			Platetype platetype2 = new Platetype();
			platetype2 = platetypeService.onePlateType(plateType.getPlatetypeid());
			if(platetype2!=null){
				return "admin/plateType/insertPlateType";
			}
			if(moderator==null){
				return "admin/plateType/insertPlateType";
			}
			int a = platetypeService.insertPlateType(plateType);
			return "redirect:allPlateType.action";
		}
		return "admin/plateType/insertPlateType";
	}
	//更新板块类型的信息
	@RequestMapping(value="/updatePlateType")
	public String updatePlateType(Model model,Integer id,Platetype platetype)throws Exception{
		platetypeService.updatePlateType(platetype);
		return "redirect:allPlateType.action";
	}
	//查询板块类型关联的板块
	@RequestMapping(value="/selectplate")
	public String sePlate(Integer id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = platetypeService.somePlate(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/plateType/somPlate";
	}
	//*********************************************板块类型和板块的分界线**********************************************
	/**
	 * 板块的controller
	 * @param model
	 * @return
	 * @throws Exception
	 */
	//查询所有的板块
	@RequestMapping(value="/allPlates")
	public String allPlates(Model model)throws Exception{
		List<Plate> allPlates = new ArrayList<Plate>();
		allPlates = plateService.allPlates();
		model.addAttribute("allPlates", allPlates);
		return "admin/plate/allPlate";
	}
	
	//板块详情
	@RequestMapping(value="/onePlate")
	public String onePlate(Integer id,Model model,Plate plate)throws Exception{
		plate = plateService.onePlate(id);
		model.addAttribute("plate", plate);
		return "admin/plate/updatePlate";
	}
	//添加板块信息
	@RequestMapping(value="/insertPlates")
	public String insertPlate(Plate plate,Model model)throws Exception{
		
		if((plate.getModeratorid()!=null)&&(plate.getPlateid()!=null)&&(plate.getPlatename()!=null)&&(plate.getPlatetypeid()!=null)){
			Plate plate2 = new Plate();
			Moderator moderator = new Moderator();
			Platetype platetype = new Platetype();
			moderator = moderatorService.selectModerator(plate.getModeratorid());
			platetype = platetypeService.onePlateType(plate.getPlatetypeid());
			plate2 = plateService.onePlate(plate.getPlateid());
			if((plate2==null)&&(moderator!=null)&&(platetype!=null)){
				plateService.insertPlate(plate);
				return "redirect:allPlates.action";
			}
		}
		return "admin/plate/insertPlate";
	}
	
	//删除板块
	@RequestMapping(value="/deletPlate")
	public String deletPlate(Integer id)throws Exception{
		plateService.deletPlate(id);
		return "redirect:allPlates.action";
	}
	
	//跟新板块信息
	@RequestMapping(value="/updatePlate")
	public String updatePlate(Plate plate,Model model) throws Exception{
		plateService.updatePlate(plate);
		return "redirect:allPlates.action";
	}
	
	//模糊查询板块
	@RequestMapping(value="/somePlates")
	public String somePlates(String id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = plateService.somePlates(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/plate/somePlate";
	}
	//*****************************************************板块和用户的分界线*******************************************************
	//查询全部
	 @RequestMapping(value="/allUser")
	public String allUsers(Model model)throws Exception{
		List<User> allUsers = new ArrayList<User>();
		allUsers = userService.allUser();
		model.addAttribute("allUsers", allUsers);
		return "admin/user/allUser";
	}

	
	//模糊查询
	@RequestMapping(value="/someUser")
	public String someUsers(String id,Model model) throws Exception{
		List<User> someUsers = new ArrayList<User>();
		someUsers = userService.someUsers(id);
		model.addAttribute("someUsers", someUsers);
		return "admin/user/someUser";
	}
	
	//用户信息详情
	@RequestMapping(value="/oneUser")
	public String oneUser(User user,Model model,String id) throws Exception{
		user = userService.selectUser(id);
		model.addAttribute("user", user);
		return "admin/user/updateUser";
	}
	
	//添加用户信息
	@RequestMapping(value="/insertUser")
	public String insertUser(User user)throws Exception{
		if((user.getUsersex()!=null)||(user.getUserpassword()!=null)||(user.getUsername()!=null)||(user.getUsermail()!=null)||(user.getUserid()!=null)||(user.getUserheadid()!=null)
				||(user.getSignature()!=null)){
			userService.insertUser(user);
			return "redirect:allUser.action";
		}
		return "admin/user/insertUser";
	}
	
	//删除用户信息
	@RequestMapping(value="/deletUser")
	public String deletUser(String id) throws Exception{
		userService.deletUser(id);
		return "redirect:allUser.action";
	}
	
	//更新用户信息
	@RequestMapping(value="/updateUser")
	public String updateUser(User user) throws Exception{
		userService.updateUser(user);
		return "redirect:allUser.action";
	}
	
	//用户信息的分页
	
	
}
