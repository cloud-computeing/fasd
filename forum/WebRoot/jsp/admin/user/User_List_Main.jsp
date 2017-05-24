<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'User_List_Main.jsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="plate_list_main.css">
	

  </head>
  
  <body>
   <div class="main">
		<div id="header">
		<h1>板猪管理页面</h1>
		</div>
		<div id="return">

			<input type="button" name="Submit"
				 value="返回上一页">
		</div>
		<div id="search">
		<br>
			<form action="">
				<input type="text" placeholder="搜一下"> <input type="submit"
					value="搜索"  />
			</form>


		</div>
		<div id="content"></div>

	</div>
  </body>
</html>
