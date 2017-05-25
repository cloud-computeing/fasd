package com.gzu.bbs.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.pojo.User;
import com.gzu.bbs.service.PlateService;
import com.gzu.bbs.service.UserService;
import com.gzu.bbs.util.Global;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private PlateService plateService;
	@Autowired
	private UserService userService;
	//进入发帖页面
		@RequestMapping(value="/post")
		public String post(Model model,HttpServletRequest request) throws Exception{
			String userid=Global.getUserId(request);
			if(userid==null || "".equals(userid)){
				return "index";
			}
			User user=userService.selectUser(userid);
			//查询全部的板块
			Map<String,List<PlateCustom>> allPlate=plateService.queryAllPlateByType();
			model.addAttribute("user", user);
			model.addAttribute("allPlate", allPlate);
			return "user/post";
		}
	
}
