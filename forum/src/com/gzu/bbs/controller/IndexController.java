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
	public String index(Model model,PostVo postVo,Integer currentPage,Integer size) throws Exception{
		//查询全部的板块
		Map<String,List<PlateCustom>> allPlate=plateService.queryAllPlateByType();
		//某类总帖子数
		int sum=0;
		int pagecount=0;
		size=1;//每页显示多少条数据
		//进行帖子分页
		if(postVo.getPostCustom()==null){//默认进入热帖榜
			currentPage=1;
			PostCustom p=new PostCustom();
			postVo.setBegin(0);
			postVo.setSize(size);
			p.setClickamount(50);
			postVo.setPostCustom(p);
		}else if (currentPage==null||currentPage==0) {
			/*if(" ".equals(postVo.getPostCustom().getPosttitle())){
				postVo.getPostCustom().setPosttitle(null);
			}*/
			currentPage=1;
			postVo.setBegin(0);
			postVo.setSize(size);
			/*postVo.setBegin((currentPage-1)*size);
			postVo.setSize(size);*/
			
		}else{
			postVo.setBegin((currentPage-1)*size);
			postVo.setSize(size);
		}
		sum=postService.querySumPost(postVo);
		pagecount=(int)sum/size;
		List<PostCustom> allPost=postService.queryPostPage(postVo);
		//设置某板块的全部帖子总数,总页数，当前页
		model.addAttribute("sum", sum);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pagecount", pagecount);
		if(allPlate==null || allPost==null){
			return "error/error";
		}else{
			model.addAttribute("allPlate", allPlate);
			model.addAttribute("allPost", allPost);
			
			
			return "index";
		}
		
	}
}
