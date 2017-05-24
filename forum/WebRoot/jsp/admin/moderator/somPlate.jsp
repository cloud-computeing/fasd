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
<div style="position:absolute;top:30%;left:30%;width:700px;height:420px;">
<div style="position:absolute;top:1%;left:30%;width:400px;height:420px;">
<h1>版主管理的板块</h1>
</div>
<div style="position:absolute;top:30%;left:15%;width:500px;height:420px;">
<table>
<tr>
<td>版主的的id</td>
<td>管理的板块id</td>
<td>管理的板块名字</td>
<td>管理的板块所属的板块类型id</td>
</tr>
<c:forEach var="somePlates" items="${somePlates }">
<tr>
<td>${somePlates.moderatorid}</td>
<td>${somePlates.plateid}</td>
<td>${somePlates.platename}</td>
<td>${somePlates.platetypeid}</td>
</tr>
</c:forEach>
</table>
</div>
</div>
</body>
</html>