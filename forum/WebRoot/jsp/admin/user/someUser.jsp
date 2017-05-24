<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="position:absolute;top:30%;left:25%;width:900px;height:420px;">
<h4>模糊查询的结果：</h4>
<table>
<tr>
<td>用户名字</td>
<td>用户密码</td>
<td>用户id</td>
<td>用户邮箱</td>
<td>用户性别</td>
<td>用户头像id</td>
<td>用户签名</td>
<td>用户权限</td>
<td>删除用户</td>
<td>修改用户信息</td>
</tr>
<c:forEach var="someUsers" items="${ someUsers}">
<tr>
	<td>${someUsers.username}</td>  
	<td>${someUsers.userid}</td>  
	<td>${someUsers.userpassword}</td>  
	<td>${someUsers.usermail}</td>  
	<td>${someUsers.usersex}</td>
	<td>${someUsers.userheadid}</td>  
	<td>${someUsers.signature}</td>  
	<td>${someUsers.flag}</td>    
	<td><a href="${pageContext.request.contextPath }/admin/deletUser.action?id=${ someUsers.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneUser.action?id=${ someUsers.userid}">前往</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>