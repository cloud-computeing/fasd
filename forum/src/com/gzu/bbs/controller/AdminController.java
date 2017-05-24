package com.gzu.bbs.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.gzu.bbs.mapper.UserMapper;
import com.gzu.bbs.pojo.Admin;
import com.gzu.bbs.pojo.Moderator;
import com.gzu.bbs.pojo.ModeratorVo;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.pojo.PlateVo;
import com.gzu.bbs.pojo.Platetype;
import com.gzu.bbs.pojo.PlatetypeCustom;
import com.gzu.bbs.pojo.PlatetypeVo;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.pojo.User;
import com.gzu.bbs.pojo.UserVo;
import com.gzu.bbs.service.AdminService;
import com.gzu.bbs.service.ModeratorService;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.PlatetypeService;
import com.gzu.bbs.service.PostService;
import com.gzu.bbs.service.UserService;
import com.gzu.bbs.util.Global;
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
		return "admin/moderator/Moderator_Detail";
	}
	
	//这里是查询所有的版主信息
	/*@RequestMapping(value="/allModerator")
	public String selectStringAllModerator(Model model) throws Exception{
		List<Moderator> allModerators = new ArrayList<Moderator>();
		allModerators = moderatorService.allModerators();
		model.addAttribute("allModerators", allModerators);
		return "admin/moderator/allModerator";
	}*/
	
	//这里是插入版主的信息
	@RequestMapping(value="/insertModerator")
	public String insertModerator(@Validated Moderator moderator,BindingResult bindingResult,Model model,MultipartFile pictureFile)throws Exception{
			Moderator moderator2 = new Moderator();
			if(bindingResult.hasErrors()){
				List<ObjectError> allErrors = bindingResult.getAllErrors();
				for(ObjectError objectError:allErrors){
					System.out.println(objectError.getDefaultMessage());
				}
				model.addAttribute("allErrors", allErrors);
				return "admin/moderator/Moderator_Insert";
			}
			moderator2 = moderatorService.selectModerator(moderator.getModeratorid());
			if(moderator2!=null){
				if((moderator2.getModeratorid()).equals(moderator.getModeratorid())){
					return "admin/moderator/Moderator_Insert";//这里是id重复了，最好是跳转页
				}
			}
			//版主头像上传
			String newFile;
			newFile = Global.upload(pictureFile);
			moderator.setModeratorheadid(newFile);
		    int a = moderatorService.insertModerator(moderator);
			return "redirect:mohuModerator.action";
			
	}
	
	//这里是删除版主的信息
	@RequestMapping(value="/deletModerator")
	public String deletModerator(Moderator moderator,Integer id) throws Exception{
		int a = moderatorService.deletModerator(id);
		return "redirect:mohuModerator.action";
	}
	
	//这里是更新版主信息
	@RequestMapping(value="/updateModerator")
	public String updateModerator(@Validated Moderator moderator,BindingResult bindingResult,Model model,Integer id,MultipartFile pictureFile) throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "redirect:mohuModerator.action";
		}
		//文件上传
		String newFile;
		newFile = Global.upload(pictureFile);
		moderator.setModeratorheadid(newFile);
		moderatorService.updateModerator(moderator);
		return "redirect:mohuModerator.action";
	}
	
	//模糊查询版主
	@RequestMapping(value="/someModerator")
	public String selectBy(String name,Model model)throws Exception{
		List<Moderator> someModerators = new ArrayList<Moderator>();
		if(name.equals(" ")||name==null){
			return "redirect:mohuModerator.action";
		}
		someModerators = moderatorService.someModerators(name);
		model.addAttribute("someModerators", someModerators);
		return "admin/moderator/Moderator_SomeModerator";
	}
	
	//查询版主管理的板块
	@RequestMapping(value="/plate")
	public String selectPlate(Integer id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = moderatorService.somePlates(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/moderator/Moderator_Plate";
	}
	//************************************版主和板块类型的分界线********************************
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
		return "admin/plateType/PlateType_Detail";
	}
	//删除板块类型的信息
	@RequestMapping(value="/deletPlateType")
	public String deletPlateType(Integer id)throws Exception{
		int a = platetypeService.deletPlateType(id);
		return "redirect:mohuPlatetype.action";
	}
	//添加板块类型的信息
	@RequestMapping(value="/insertPlateType")
	public String insertPlateType(@Validated Platetype plateType,BindingResult bindingResult,Model model)throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "admin/plateType/PlateType_Insert";
		}
			Platetype platetype2 = new Platetype();
			platetype2 = platetypeService.onePlateType(plateType.getPlatetypeid());
			if(platetype2!=null){
				return "admin/plateType/PlateType_Insert";
			}
			platetypeService.insertPlateType(plateType);
			return "redirect:mohuPlatetype.action";
		
	}
	//更新板块类型的信息
	@RequestMapping(value="/updatePlateType")
	public String updatePlateType(@Validated Platetype platetype,BindingResult bindingResult,Integer id,Model model)throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "redirect:mohuPlatetype.action";
		}
		platetypeService.updatePlateType(platetype);
		return "redirect:mohuPlatetype.action";
	}
	//查询板块类型关联的板块
	@RequestMapping(value="/selectplate")
	public String sePlate(Integer id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = platetypeService.somePlate(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/plateType/PlateType_SomePlate";
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
	
	@RequestMapping(value="/updatep")
	public String updatep(Model model) throws Exception{
		//查询全部的版主
				List<Moderator> allModerators = new ArrayList<Moderator>();
				List<PlatetypeCustom> allPlatetypes = new ArrayList<PlatetypeCustom>();
				allPlatetypes = platetypeService.queryAllType();
				allModerators = moderatorService.queryAllModerator();
				model.addAttribute("allPlatetypes", allPlatetypes);
				model.addAttribute("allModerators", allModerators);
				return "redirect:onePlate.action";
	}
	//板块详情
	@RequestMapping(value="/onePlate")
	public String onePlate(Integer id,Model model,Plate plate,Moderator moderator,Platetype platetype)throws Exception{
		List<Moderator> allModerators = new ArrayList<Moderator>();
		List<PlatetypeCustom> allPlatetypes = new ArrayList<PlatetypeCustom>();
		allPlatetypes = platetypeService.queryAllType();
		allModerators = moderatorService.queryAllModerator();
		model.addAttribute("allPlatetypes", allPlatetypes);
		model.addAttribute("allModerators", allModerators);
		plate = plateService.onePlate(id);
		moderator = moderatorService.selectModerator(plate.getModeratorid());
		platetype = platetypeService.onePlateType(plate.getPlatetypeid());
		model.addAttribute("moderator", moderator);
		model.addAttribute("platetype", platetype);
		model.addAttribute("plate", plate);
		return "admin/plate/Plate_Detail";
	}
	
	@RequestMapping(value="/insertP")
	public String insertP(Model model) throws Exception{
		//查询全部的版主
		List<Moderator> allModerators = new ArrayList<Moderator>();
		List<PlatetypeCustom> allPlatetypes = new ArrayList<PlatetypeCustom>();
		allPlatetypes = platetypeService.queryAllType();
		allModerators = moderatorService.queryAllModerator();
		model.addAttribute("allPlatetypes", allPlatetypes);
		model.addAttribute("allModerators", allModerators);
		return "admin/plate/Plate_Insert";
	}
	//添加板块信息
	
	@RequestMapping(value="/insertPlate")
	public String insertPlate(@Validated Plate plate,BindingResult bindingResult,Model model)throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "redirect:insertP.action";
		}
		
			Plate plate2 = new Plate();
			//查询全部的板块类型
			plate2 = plateService.onePlate(plate.getPlateid());
			if(plate2==null){
				plateService.insertPlate(plate);
			}
			return "forward:/admin/insertP.action";
	}
	
	//删除板块
	@RequestMapping(value="/deletPlate")
	public String deletPlate(Integer id)throws Exception{
		plateService.deletPlate(id);
		return "redirect:mohuPlate.action";
	}
	
	//跟新板块信息
	@RequestMapping(value="/updatePlate")
	public String updatePlate(@Validated Plate plate,BindingResult bindingResult,Model model) throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "redirect:mohuPlate.action";
		}
		plateService.updatePlate(plate);
		return "redirect:mohuPlate.action";
	}
	
	//模糊查询板块
	@RequestMapping(value="/somePlates")
	public String somePlates(String id,Model model)throws Exception{
		List<Plate> somePlates = new ArrayList<Plate>();
		somePlates = plateService.somePlates(id);
		model.addAttribute("somePlates", somePlates);
		return "admin/plate/Plate_SomePlate";
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
		return "admin/user/User_SomeUser";
	}
	
	//用户信息详情
	@RequestMapping(value="/oneUser")
	public String oneUser(User user,Model model,String id) throws Exception{
		user = userService.selectUser(id);
		model.addAttribute("user", user);
		return "admin/user/User_Detail";
	}
	
	//添加用户信息
	@RequestMapping(value="/insertUser")
	public String insertUser(@Validated User user,BindingResult bindingResult,Model model,MultipartFile pictureFile)throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "admin/user/User_Insert";
		}
		String newFile;
		newFile = Global.upload(pictureFile);
		user.setUserheadid(newFile);
			userService.insertUser(user);
			return "redirect:mohuUser.action";
	}
	
	//删除用户信息
	@RequestMapping(value="/deletUser")
	public String deletUser(String id) throws Exception{
		userService.deletUser(id);
		return "redirect:mohuUser.action";
	}
	
	//更新用户信息
	@RequestMapping(value="/updateUser")
	public String updateUser(@Validated User user,BindingResult bindingResult,Model model,MultipartFile pictureFile) throws Exception{
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for(ObjectError objectError:allErrors){
				System.out.println(objectError.getDefaultMessage());
			}
			model.addAttribute("allErrors", allErrors);
			return "redirect:mohuUser.action";
		}
		String newFile;
		newFile = Global.upload(pictureFile);
		user.setUserheadid(newFile);
		userService.updateUser(user);
		return "redirect:mohuUser.action";
	}
	
	//版主信息的分页
	@RequestMapping(value="/mohuModerator")
	public String mohuModerator(ModeratorVo moderatorVo,Model model) throws Exception{
		int a = moderatorService.someCount();
		if(moderatorVo.getNowPage()==null || moderatorVo.getNowPage()==0){
			moderatorVo.setNowPage(1);
		}
		List<Moderator> allModerators = new ArrayList<Moderator>();
		moderatorVo.setSize(7);
		moderatorVo.setStart((moderatorVo.getNowPage()-1)*moderatorVo.getSize());
		allModerators = moderatorService.mohu(moderatorVo);
		int count = (a/moderatorVo.getSize());
		if (count%(moderatorVo.getSize())!=0){
			count+=1;
		}
		moderatorVo.setCount(count);
		model.addAttribute("allModerators", allModerators);
		model.addAttribute("moderatorVo", moderatorVo);
		return "admin/moderator/Moderator_List";
	}
	
	//用户信息的分页
	@RequestMapping(value="/mohuUser")
	public String mohuUser(UserVo userVo,Model model) throws Exception{
		int a = userService.someCount();
		if(userVo.getNowPage()==null || userVo.getNowPage()==0){
			userVo.setNowPage(1);
		}
		List<User> allUsers = new ArrayList<User>();
		userVo.setSize(7);
		userVo.setStart((userVo.getNowPage()-1)*userVo.getSize());
		allUsers = userService.mohu(userVo);
		int count = (a/userVo.getSize());
		if (count%(userVo.getSize())!=0){
			count+=1;
		}
		userVo.setCount(count);
		model.addAttribute("allUsers", allUsers);
		model.addAttribute("userVo", userVo);
		return "admin/user/User_List";
	}
	
	//板块信息的分页
	@RequestMapping(value="/mohuPlate")
	public String mohuUser(PlateVo plateVo,Model model) throws Exception{
		int a = plateService.count();
		if(plateVo.getNowPage()==null || plateVo.getNowPage()==0){
			plateVo.setNowPage(1);
		}
		List<Plate> allPlates = new ArrayList<Plate>();
		plateVo.setSize(7);
		plateVo.setStart((plateVo.getNowPage()-1)*plateVo.getSize());
		allPlates = plateService.mohu(plateVo);
		int count = (a/plateVo.getSize());
		if (count%(plateVo.getSize())!=0){
			count+=1;
		}
		plateVo.setCount(count);
		model.addAttribute("allPlates", allPlates);
		model.addAttribute("userVo", plateVo);
		return "admin/plate/Plate_List";
	}
	//板块类型信息的分页
	@RequestMapping(value="/mohuPlatetype")
	public String mohuPlatetype(PlatetypeVo platetypeVo,Model model) throws Exception{
		int a = platetypeService.count();
		if(platetypeVo.getNowPage()==null || platetypeVo.getNowPage()==0){
			platetypeVo.setNowPage(1);
		}
		List<Platetype> allPlatetypes = new ArrayList<Platetype>();
		platetypeVo.setSize(7);
		platetypeVo.setStart((platetypeVo.getNowPage()-1)*platetypeVo.getSize());
		allPlatetypes = platetypeService.mohu(platetypeVo);
		int count = (a/platetypeVo.getSize());
		if (count%(platetypeVo.getSize())!=0){
			count+=1;
		}
		platetypeVo.setCount(count);
		model.addAttribute("allPlatetypes", allPlatetypes);
		model.addAttribute("userVo", platetypeVo);
		return "admin/plateType/PlateType_List";
	}
}
