package com.gzu.bbs.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
	public String index(Model model,PostVo postVo) throws Exception{
		//查询全部的板块
		Map<String,List<PlateCustom>> allPlate=plateService.queryAllPlateByType();
		//某类总帖子数
		postVo.setSum(0);
		postVo.setPagecount(0);
		postVo.setSize(5);//每页显示多少条数据
		//进行帖子分页
		if(postVo.getPostCustom()==null){//默认进入热点
			postVo.setCurrentPage(1);
			PostCustom p=new PostCustom();
			p.setPlateid(allPlate.get("热点").get(0).getPlateid());
			postVo.setBegin(0);
			postVo.setPostCustom(p);
		}else if (postVo.getCurrentPage()==null||postVo.getCurrentPage()==0) {
			postVo.setCurrentPage(1);
			postVo.setBegin(0);
			if(postVo.getPostCustom().getPosttitle()==null&&" ".equals(postVo.getPostCustom().getPosttitle())){
				
				postVo.getPostCustom().setPosttitle(null);
			}
			
			
			
			/*postVo.setBegin((currentPage-1)*size);
			postVo.setSize(size);*/
			
		}else{
			postVo.setBegin((postVo.getCurrentPage()-1)*postVo.getSize());
		}
		postVo.setSum(postService.querySumPost(postVo));
		//设置z总页数
		int pt=(int)(postVo.getSum()/postVo.getSize());
		if((postVo.getSum()%postVo.getSize())!=0){
			pt +=1;
		}
		postVo.setPagecount(pt);
		List<PostCustom> allPost=postService.queryPostPage(postVo);
		//设置某板块的全部帖子总数,总页数，当前页
		model.addAttribute("postVo", postVo);
		if(allPlate==null || allPost==null){
			return "error/error";
		}else{
			model.addAttribute("allPlate", allPlate);
			model.addAttribute("allPost", allPost);
			
			
			return "index";
		}
		
	}
	
}
