<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/updateUser.action" method="post">
用户id：<input type="text" name="userid" value="${user.userid }" /><br>
用户姓名：<input type="text" name="username" value="${user.username }"/><br/>
用户性别 ：<input type="text" name="usersex" value="${user.usersex }"/><br/>
用户头像id：<input type="text" name="userheadid" value="${user.userheadid }"/><br/>
用户邮箱：<input type="text" name="usermail" value="${user.usermail }"/><br/>
用户密码：<input type="text" name="userpassword" value="${user.userpassword }"/><br/>
用户签名：<input type="text" name="signature" value="${user.signature }"/><br/>
用户权限：<input type="text" name="flag" value="${user.flag }"/><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>