<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'post.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="${pageContext.request.contextPath }/post/addPost.action">


		<select name="plateid">
			<option value="null">-请选择-</option>
			<c:forEach items="${allPlate }" var="plates">
				<c:forEach items="${plates.value }" var="plate">
					<option value="${plate.plateid }">${plate.platename }</option>
				</c:forEach>
			</c:forEach>

		</select><br> 文章名字：<input type="text" name="posttitle"><br>


		<%-- <select id="selProvince" onChange = "getCity(this.options[this.selectedIndex].value)">   
            <option value="请选择">-请选择-</option>  
            <c:forEach items="${allPlate }"var="plateType">
				<option value="${plateType.key }">${plateType.key }</option>
			</c:forEach>
        </select>  
      
        <select id="selCity">  
            <option>-请选择-</option>
        </select> --%>
		<textarea rows="10" cols="60" name="content"></textarea>
		<br> <input type="submit" value="发帖">
	</form>
</body>
</html>
