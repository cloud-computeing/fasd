package com.gzu.bbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.PlateCustom;
import com.gzu.bbs.service.PlateService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private PlateService plateService;
	//进入发帖页面
		@RequestMapping(value="/post")
		public String post(Model model) throws Exception{
			//查询全部的板块
			Map<String,List<PlateCustom>> allPlate=plateService.queryAllPlateByType();
			model.addAttribute("allPlate", allPlate);
			return "user/post";
		}
	
}
