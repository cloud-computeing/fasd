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

<a href="${pageContext.request.contextPath }/jsp/admin/plate/insertPlate.jsp">添加新的板块</a><br/>

<form action="${pageContext.request.contextPath }/admin/somePlates.action">
<input type="text" name="id"> <input type="submit" value='搜索'/>
</form>

<table>
<c:forEach var="allPlates" items="${ allPlates}">
<tr>
<td>${allPlates.plateid}</td>  
	<td>${allPlates.platename}</td>  
	<td>${allPlates.moderatorid}</td>  
	<td>${allPlates.platetypeid}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/deletPlate.action?id=${ allPlates.plateid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/onePlate.action?id=${ allPlates.plateid}">修改板块信息</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>