package com.gzu.bbs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.gzu.bbs.pojo.LikeVo;
import com.gzu.bbs.pojo.Plate;
import com.gzu.bbs.pojo.Post;
import com.gzu.bbs.pojo.PostCustom;
import com.gzu.bbs.pojo.ReplyCustom;
import com.gzu.bbs.pojo.ThumpupnumKey;
import com.gzu.bbs.pojo.User;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.PostService;
import com.gzu.bbs.service.UserService;
import com.gzu.bbs.util.Global;

@Controller
@RequestMapping(value="/post")
public class PostController {
	@Autowired
	private PostService postService;
	@Autowired
	private PlateService plateService;
	@Autowired
	private UserService userService;
	
	//帖子详情
	@SuppressWarnings("unused")
	@RequestMapping(value="/postDetails")
	public String postDetails(Model model,Integer postid,String flag,HttpServletRequest request) throws Exception{
		String userid=Global.getUserId(request);
		User user = null;
		if(userid!=null || !"".equals(userid)){
			user=userService.selectUser(userid);
		}
		//查询帖子回复最多的几个
		List<Map<User,PostCustom>> allUser=new ArrayList<Map<User,PostCustom>>();
		List<PostCustom> pc=postService.queryPostCA(3);
		for(PostCustom p:pc){
			Map<User,PostCustom> up=new HashMap<User,PostCustom>();
			User u=userService.selectUser(p.getUserid());
			up.put(u,p);
			allUser.add(up);
		}
		List<ReplyCustom> all=new ArrayList<ReplyCustom>();
		if(flag==null){
			postService.clickamount(postid);//点击后点击量加一
		}
		Post post=postService.queryPostById(postid);//查询帖子
		all=postService.queryReplyByPid(postid);//查询帖子评论
		Plate plate=plateService.onePlate(post.getPlateid());//查询板块名字
		if(post==null){
			return "error/error";
		}else{
			model.addAttribute("allUser", allUser);//显示帖子回复最多的几个人
			model.addAttribute("user", user);//显示用户
			model.addAttribute("post", post);//显示帖子
			model.addAttribute("plate", plate);//显示板块
			model.addAttribute("allReply", all);//显示回复
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
	public String addComments(Model model,ReplyCustom replyCustom,Integer reply_id,HttpServletRequest request) throws Exception{
		String replyerId=Global.getUserId(request);
		String replyerName=Global.getUserName(request);
		if(replyerId==null){
			model.addAttribute("url", "jsp/index.jsp");//跳转到主页
			model.addAttribute("message", "未登录");
			return "forward";
		}else{
			
			long l = System.currentTimeMillis();//生成当前系统时间
			replyCustom.setReplytime(new Date(l));
			replyCustom.setReplyerid(replyerId);
			replyCustom.setReplyername(replyerName);
			if(replyCustom.getReplytoobjectid()==null||"".equals(replyCustom.getReplytoobjectid())){
				replyCustom.setFloor(postService.queryCount(replyCustom.getPostid(),1)+1);
				replyCustom.setReplyid(0);
				replyCustom.setReplytoobjectid(null);
				replyCustom.setReplytoobjectname(null);
			}else{
				replyCustom.setFloor(postService.queryCount(replyCustom.getPostid(),2)+1);
				replyCustom.setReplyid(reply_id);
			}
			postService.insertReply(replyCustom);
			postService.UpdateReply(replyCustom.getPostid());
			return "forward:/post/postDetails.action";
		}
	}
	//发帖
	@RequestMapping(value="/addPost",method=RequestMethod.POST)
	public String addPost(PostCustom postCustom,HttpServletRequest request,MultipartFile picture) throws Exception{
		String userid=Global.getUserId(request);
		String username=Global.getUserName(request);
		String newFile;
		newFile=Global.upload(picture);
		postCustom.setUserid(userid);
		postCustom.setUsername(username);
		postCustom.setPictureid(newFile);
		long l = System.currentTimeMillis();//生成当前系统时间
		postCustom.setPosttime(new Date(l));
		postCustom.setTopflag(0);
		postService.posting(postCustom);
		return "redirect:/index.action";
	}
}
