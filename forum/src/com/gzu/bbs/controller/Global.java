package com.gzu.bbs.controller;

import javax.servlet.http.HttpServletRequest;

public class Global {
	//获取用户登录id
		public static String getUserId(HttpServletRequest request){
			return (String) request.getSession().getAttribute("userid");
		}
}
