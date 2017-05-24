<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Moderator_Detail_Main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="jsp/css/moderator_insert_main.css">
	

  </head>
  
  <body>
  <div class="main">
		<div id="header">
		<h1>版主信息修改</h1>
		</div>
		
		<div id="content">
			<form action="${pageContext.request.contextPath }/admin/updateModerator.action" method="post" enctype="multipart/form-data">
				<table>
			<tr>
			<td>版主&nbsp;id&nbsp;：</td>
			<td><input type="text" name="moderatorid" value="${ moderator.moderatorid}" readonly="true"/></td>
			</tr>
			<tr>
			<td>版主姓名&nbsp;：</td>
			<td><input type="text" name="moderatorname" value="${ moderator.moderatorname}"/></td></tr>
			<tr><td>版主性别 &nbsp;</td>
			<td><input type="text" name="moderatorsex" value="${ moderator.moderatorsex}" readonly="true"/></td></tr>
			
			<tr><td>版主头像：</td>
			<td><input type="hidden" name="pic" value="${ moderator.moderatorheadid}"/> <br> <c:if
								test="${pic !=null}">
								<img src="/pic/${pic}" width="10" height="10" />
								<br />
							</c:if> <!-- <img src="/pic/" width=100 height=100 /> --> <input
							type="file" name="pictureFile" />
						</td></tr>
			
			<tr><td>版主密码&nbsp;：</td>
			<td><input type="password" name="moderatorpassword" value="${ moderator.moderatorpassword}"/></td></tr>
			<tr>
			<td colspan="2" id="moderator_button"><input type="submit" value="提交" /></td>
			</tr>
			</table>
			</form>

		</div>

	</div>
  </body>
</html>
