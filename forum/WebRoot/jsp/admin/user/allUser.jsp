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

<a href="${pageContext.request.contextPath }/jsp/admin/user/insertUser.jsp">添加新的用户</a><br/>
<form action="${pageContext.request.contextPath }/admin/someUser.action">
<input type="text" name="id"> <input type="submit" value='搜索'/>
</form>

<table>
<c:forEach var="allUsers" items="${ allUsers}">
<tr>
	<td>${allUsers.userid}</td>  
	<td>${allUsers.userpassword}</td>  
	<td>${allUsers.username}</td>  
	<td>${allUsers.usermail}</td>  
	<td>${allUsers.usersex}</td>
	<td>${allUsers.userheadid}</td>  
	<td>${allUsers.signature}</td>  
	<td>${allUsers.flag}</td>    
	
	<td><a href="${pageContext.request.contextPath }/admin/deletUser.action?id=${ allUsers.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneUser.action?id=${ allUsers.userid}">修改用户信息</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>