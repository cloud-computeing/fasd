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
<c:forEach var="someModerators" items="${ someModerators}">
<tr>
<td>${someModerators.moderatorid}</td>  
	<td>${someModerators.moderatorname}</td>  
	<td>${someModerators.moderatorpassword}</td>  
	<td>${someModerators.moderatorsex}</td>  
	<td>${someModerators.moderatorheadid}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/deletModerator.action?id=${ someModerators.moderatorid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneModerator.action?id=${ someModerators.moderatorid}">修改版主信息</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>