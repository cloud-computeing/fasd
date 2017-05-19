<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
管理员名字：${admin.adminname } <br>
如果出现管理员名字则测试成功

<form id="photo"
		action="${pageContext.request.contextPath }/photo.action"
		method="post" enctype="multipart/form-data">
		<input type="hidden" name="pic" value="<%-- ${item.pic } --%>" />
		图片<br>
		<c:if test="${pic !=null}">
						<img src="/pic/${pic}" width=100 height=100 />
						<br />
		</c:if> 
		<img src="/pic/d4c8c64d-e157-4d26-be6d-772e7461963f.jpg" width=100 height=100 />
		<input type="file" name="pictureFile" />
		<input type="submit" value="提交">
</form>

</body>
</html>