<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312" 
import="com.jspsmart.upload.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    
<% 
// 新建一个SmartUpload对象 
SmartUpload su = new SmartUpload(); 
// 初始化 
su.initialize(pageContext); 
// 设定contentDisposition为null以禁止浏览器自动打开文件， 
//保证点击链接后是下载文件。若不设定，则下载的文件扩展名为 
//doc时，浏览器将自动用word打开它。扩展名为pdf时， 
//浏览器将用acrobat打开。 
su.setContentDisposition(null); 
// 下载文件 
su.downloadFile("/pic/d4c8c64d-e157-4d26-be6d-772e7461963f.jpg"); 
%>
  </body>
</html>
