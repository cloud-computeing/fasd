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
<td>板块id</td>
<td>板块名字</td>
<td>版主id</td>
<td>板块的类型</td>
<td>删除板块信息</td>
<td>修改板块信息</td>
</tr>
<c:forEach var="somePlates" items="${ somePlates}">
<tr>
<td>${somePlates.plateid}</td>  
	<td>${somePlates.platename}</td>  
	<td>${somePlates.moderatorid}</td>  
	<td>${somePlates.platetypeid}</td> 
	<td><a href="${pageContext.request.contextPath }/admin/deletPlate.action?id=${ somePlates.plateid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/onePlate.action?id=${ somePlates.plateid}">前往</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>