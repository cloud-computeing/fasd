package com.gzu.bbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.PostVo;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.PostService;

@Controller
public class IndexController {
	@Autowired
	private PlateService plateService;
	
	@Autowired
	private PostService postService;
	@RequestMapping(value="/index")
	public String index(Model model,PostVo postVo1,Integer currentPage,Integer size) throws Exception{
		//查询全部的板块
		Map<String,List<PlateCustom>> allPlate=plateService.queryAllPlateByType();
		
		//进行帖子分页
		/*if(" ".equals(postVo.getPostCustom().getPosttitle())){
			postVo.getPostCustom().setPosttitle(null);
		}
		
		postVo.setBegin((currentPage-1)*size);
		postVo.setSize(size);
		*/
		
		PostVo postVo=new PostVo();
		postVo.setBegin(0);
		postVo.setSize(2);
		PostCustom p=new PostCustom();
		p.setClickamount(50);
		/*p.setPosttitle("");
		p.setPlateid(1);*/
		postVo.setPostCustom(p);
		List<PostCustom> allPost=postService.queryPostPage(postVo);
		
		if(allPlate==null || allPost==null){
			return "error/error";
		}else{
			model.addAttribute("allPlate", allPlate);
			model.addAttribute("allPost", allPost);
			return "index";
		}
		
	}
}
