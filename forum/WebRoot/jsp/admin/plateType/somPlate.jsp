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
<c:forEach var="somePlates" items="${somePlates }">
<tr>
<td>${somePlates.plateid}</td>
<td>${somePlates.platename}</td>
<td>${somePlates.moderatorid}</td>
<td>${somePlates.platetypeid}</td>
</tr>
</c:forEach>
</table>
...
</body>
</html>