package com.gzu.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gzu.bbs.pojo.Admin;
import com.gzu.bbs.service.AdminService;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/test")
	public String test(Model model,Integer adminid) throws Exception{
		Admin admin=adminService.queryAdmin(adminid);
		model.addAttribute("admin", admin);
		return "test";
	}
}
