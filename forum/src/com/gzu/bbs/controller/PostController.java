package com.gzu.bbs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.LikeVo;
import com.gzu.bbs.pojo.Post;
import com.gzu.bbs.pojo.ReplyCustom;
import com.gzu.bbs.pojo.ThumpupnumKey;
import com.gzu.bbs.service.PostService;

@Controller
@RequestMapping(value="/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	//帖子详情
	@RequestMapping(value="/postDetails")
	public String postDetails(Model model,Integer postid) throws Exception{
		List<ReplyCustom> all=new ArrayList<ReplyCustom>();
		postService.clickamount(postid);//点击后点击量加一
		Post post=postService.queryPostById(postid);//查询帖子
		all=postService.queryReplyByPid(postid);//查询帖子评论
		if(post==null){
			return "error/error";
		}else{
			model.addAttribute("post", post);
			model.addAttribute("allReply", all);
			return "post/postDetails";
		}
	}
	//点赞
	@RequestMapping(value="/like")
	public String like(Model model,HttpServletRequest request,Integer postid){
		String userid=Global.getUserId(request);
		if(userid==null){
			model.addAttribute("url", "index.jsp");
			model.addAttribute("message", "未登录");
			return "forward";
		}else{
			LikeVo likeVo=new LikeVo();
			ThumpupnumKey thumpupnumKey=new ThumpupnumKey();
			thumpupnumKey.setPostid(postid);
			thumpupnumKey.setUserid(Integer.parseInt(userid));
			likeVo.setToKey(thumpupnumKey);
			postService.like(likeVo);
			return "forward:/post/postDetails.action";
		}
	}
	//添加评论
	@RequestMapping(value="/reply")
	public String addComments(ReplyCustom replyCustom,HttpServletRequest request) throws Exception{
		String replyerId=Global.getUserId(request);
		String replyerName=Global.getUserName(request);
		replyCustom.setReplytime(new Date());
		replyCustom.setReplyerid(replyerId);
		replyCustom.setReplyername(replyerName);
		postService.insertReply(replyCustom);
		return "forward:/post/postDetails.action";
	}
}
