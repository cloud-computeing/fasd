<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>板块详情页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="jsp/css/moderator_insert_main.css">

<!-- <script language=javascript>
	function go() {
		window.history.go(-1);
	}
	/* setTimeout("go()", 3000); */
</script> -->
</head>

<body>
	<div class="main">
		<div id="header">
		<h1>板块添加</h1>
		</div>
		
		<div id="content">
			<form action="${pageContext.request.contextPath }/admin/insertPlate.action" >
				板块的id：<input type="text" name="plateid" /><br><br> 
				板块名称：<input type="text" name="platename" /><br><br>  
				版主&nbsp;&nbsp;&nbsp;&nbsp;：<select name="moderatorid">
				<option value="null" name="1">-请选择-</option>
				<c:forEach items="${allModerators }" var="Moderator">
						<option value="${Moderator.moderatorid }">${Moderator.moderatorname }</option>
				</c:forEach>
		</select><br><br> 
				板块类型：<select name="platetypeid">
				<option value="null" name="2">-请选择-</option>
				<c:forEach items="${allPlatetypes }" var="Platetype">
						<option value="${Platetype.platetypeid }">${Platetype.platetypename }</option>
				</c:forEach>
		</select><br><br><br>
				<input type="submit" value="提交" />
			</form>

		</div>

	</div>
</body>
</html>
