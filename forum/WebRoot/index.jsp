<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    This is my JSP page.<br>
    <%
    	session.setAttribute("userid","123"	);
    	session.setAttribute("userName","二哈"	);
     %>
    <a href="${pageContext.request.contextPath }/jsp/test.jsp">测试</a>
    <a href="${pageContext.request.contextPath }/index.action">主页</a>
    <a href="${pageContext.request.contextPath }/user/post.action">发帖</a>
    
  </body>
</html>
