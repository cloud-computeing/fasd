<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/admin/insertPlates.action" method="post">
板块id：<input type="text" name="plateid" /><br>
板块名字：<input type="text" name="platename" /><br/>
管理该板块的版主的id：<input type="text" name="moderatorid" /><br/>
板块属于哪一类：<input type="text" name="platetypeid" /><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>