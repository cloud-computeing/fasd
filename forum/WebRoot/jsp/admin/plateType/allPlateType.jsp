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

<a href="${pageContext.request.contextPath }/jsp/admin/plateType/insertPlateType.jsp">添加新的板块类型</a><br/>

<table>
<tr>
<td>板块类型的id</td>
<td>板块类型的名字</td>
<td>管理板块的版主的id</td>
</tr>
<c:forEach var="allPlatetypes" items="${ allPlatetypes}">
<tr>
	<td>${allPlatetypes.platetypeid}</td>  
	<td>${allPlatetypes.platetypename}</td>  
	<td>${allPlatetypes.moderatorid}</td>   
	<td><a href="${pageContext.request.contextPath }/admin/deletPlateType.action?id=${ allPlatetypes.platetypeid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/onePlateType.action?id=${ allPlatetypes.platetypeid}">修改板块类型信息</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/selectplate.action?id=${ allPlatetypes.platetypeid}">板块类型关联的板块</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>