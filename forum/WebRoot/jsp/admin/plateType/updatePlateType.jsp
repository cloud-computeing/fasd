<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/updatePlateType.action" method="post">
板块类型id：<input type="text" name="platetypeid" value="${platetype.platetypeid}"/><br>
板块类型名字：<input type="text" name="platetypename" value="${platetype.platetypename}" /><br/>
管理的版主id ：<input type="text" name="moderatorid" value="${platetype.moderatorid}" /><br/>
<input type="submit" value="提交"/>
</form>
...
</body>
</html>