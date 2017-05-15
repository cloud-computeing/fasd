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
<table>
<c:forEach var="someUsers" items="${ someUsers}">
<tr>
	<td>${someUsers.userid}</td>  
	<td>${someUsers.userpassword}</td>  
	<td>${someUsers.username}</td>  
	<td>${someUsers.usermail}</td>  
	<td>${someUsers.usersex}</td>
	<td>${someUsers.userheadid}</td>  
	<td>${someUsers.signature}</td>  
	<td>${someUsers.flag}</td>    
	<td><a href="${pageContext.request.contextPath }/admin/deletUser.action?id=${ someUsers.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneUser.action?id=${ someUsers.userid}">修改用户信息</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>