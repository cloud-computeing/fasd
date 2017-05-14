package com.gzu.bbs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.Post;
import com.gzu.bbs.pojo.LikeVo;
import com.gzu.bbs.pojo.ThumpupnumKey;
import com.gzu.bbs.service.PostService;

@Controller
@RequestMapping(value="/post")
public class PostController {
	@Autowired
	private PostService postService;
	@RequestMapping(value="/postDetails")
	public String postDetails(Model model,Integer postId) throws Exception{
		Post post=postService.queryPostById(postId);
		if(post==null){
			return "error/error";
		}else{
			model.addAttribute("post", post);
			return "post/postDetails";
		}
	}
	
	@RequestMapping(value="/like")
	public String like(Model model,HttpServletRequest request,Integer postId){
		String userid=Global.getUserId(request);
		if(userid==null){
			model.addAttribute("url", "${pageContext.request.contextPath }/index.action");
			model.addAttribute("message", "未登录");
			return "forward";
		}else{
			LikeVo likeVo=new LikeVo();
			ThumpupnumKey thumpupnumKey=new ThumpupnumKey();
			thumpupnumKey.setPostid(postId);
			thumpupnumKey.setUserid(Integer.parseInt(userid));
			likeVo.setToKey(thumpupnumKey);
			postService.like(likeVo);
			return "forward:/post/postDetails.action";
		}
		
		
	}
}
