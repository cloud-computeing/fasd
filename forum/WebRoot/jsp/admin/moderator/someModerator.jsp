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
<div style="position:absolute;top:30%;left:30%;width:800px;height:420px;">
<h4>模糊查询的结果：</h4>
<table>
<tr>
<td>版主的id</td>
<td>版主的姓名</td>
<td>版主的密码</td>
<td>版主的性别</td>
<td>版主的头像id</td>
<td>修改版主的信息</td>
<td>查询版主管理的板块</td>
<td>删除该版主</td>
</tr>
<c:forEach var="someModerators" items="${ someModerators}">
<tr>
<td>${someModerators.moderatorid}</td>  
	<td>${someModerators.moderatorname}</td>  
	<td>${someModerators.moderatorpassword}</td>  
	<td>${someModerators.moderatorsex}</td>  
	<td>${someModerators.moderatorheadid}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/oneModerator.action?id=${ allModerators.moderatorid}">前往</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/plate.action?id=${ allModerators.moderatorid}">前往</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/deletModerator.action?id=${ allModerators.moderatorid}">删除</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>