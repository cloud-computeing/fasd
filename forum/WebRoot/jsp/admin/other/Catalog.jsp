<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Catalog.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="jsp/css/catalog.css">
	

  </head>
  
  <body>
   <div class="catalog">
			<div id="menu">
				<h4>贵大论坛后台管理菜单栏</h4>
			</div>
			<div id="plate">
				<a id="title">板&nbsp;块&nbsp;管&nbsp;理</a>
				<a href="${pageContext.request.contextPath}/admin/insertP.action">板块添加</a><br>
				<a href="${pageContext.request.contextPath}/admin/mohuPlate.action">板块操作</a><br>
				
				
			</div>
			<div id="moderator">
				<a id="title">板&nbsp;主&nbsp;管&nbsp;理</a>
				<a href="jsp/admin/moderator/Moderator_Insert.jsp">板主添加</a><br>
				<a href="${pageContext.request.contextPath}/admin/mohuModerator.action">板主操作</a><br>
				
				
			</div>
			<div id="plateType">
				<a id="title">板&nbsp;块&nbsp;类&nbsp;型&nbsp;管&nbsp;理</a>
				<a href="jsp/admin/plateType/PlateType_Insert.jsp">板块类型添加</a><br>
				<a href="${pageContext.request.contextPath}/admin/mohuPlatetype.action">板块类型操作</a><br>
				
			</div>

			<div id="user">
				<a id="title">用&nbsp;户&nbsp;管&nbsp;理</a>
				<a href="jsp/admin/user/User_Insert.jsp">用户添加</a><br>
				<a href="${pageContext.request.contextPath}/admin/mohuUser.action">用户操作</a><br>
			</div>

</div>

		
  </body>
</html>
