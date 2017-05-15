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

<a href="${pageContext.request.contextPath }/jsp/moderator/insertModerator.jsp">添加新的版主</a><br/>
<form action="${pageContext.request.contextPath }/admin/someModerator.action">
<input type="text" name="name"> <input type="submit" value='搜索'/>
</form>

<table>
<c:forEach var="allModerators" items="${ allModerators}">
<tr>
<td>${allModerators.moderatorid}</td>  
	<td>${allModerators.moderatorname}</td>  
	<td>${allModerators.moderatorpassword}</td>  
	<td>${allModerators.moderatorsex}</td>  
	<td>${allModerators.moderatorheadid}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/deletModerator.action?id=${ allModerators.moderatorid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneModerator.action?id=${ allModerators.moderatorid}">修改版主信息</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/plateType.action?id=${ allModerators.moderatorid}">查询版主管理的板块类型</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/plate.action?id=${ allModerators.moderatorid}">查询版主管理的板块</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>