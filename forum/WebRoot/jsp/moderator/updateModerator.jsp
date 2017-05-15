<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/updateModerator.action" method="post">
版主id：<input type="text" name="moderatorid" value="${ moderator.moderatorid}"/><br>
版主姓名：<input type="text" name="moderatorname" value="${ moderator.moderatorname}"  /><br/>
版主性别 ：<input type="text" name="moderatorsex" value="${ moderator.moderatorsex}" /><br/>
版主头像id：<input type="text" name="moderatorheadid" value="${ moderator.moderatorheadid}" /><br/>
版主密码：<input type="text" name="moderatorpassword" value="${ moderator.moderatorpassword}"/><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>