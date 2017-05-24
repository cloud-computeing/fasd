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
    
    <title>My JSP 'Moderator_Insert_Main.jsp.jsp' starting page</title>
    
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
		
		<h1>版主添加</h1>
		</div>
		
		<div id="content">

			<form
				action="${pageContext.request.contextPath }/admin/insertModerator.action"
				method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<td>版主&nbsp;id&nbsp;&nbsp;：</td>
						<td><input type="text" name="moderatorid" />
						</td>
					</tr>
					<tr>
						<td>版主姓名&nbsp;&nbsp;：</td>
						<td><input type="text" name="moderatorname" />
						</td>
					</tr>
					<tr>
						<td>版主性别 &nbsp;</td>
						<td><input type="radio" name="moderatorsex" checked="checked"
							value="男" />男&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"
							name="moderatorsex" value="女" />女</td>
					</tr>


					<tr>
						<td>版主头像上传&nbsp;：</td>
						<!-- <td><input type="text" name="moderatorheadid" /></td> -->
						<td><input type="hidden" name="pic" /> <br> <c:if
								test="${pic !=null}">
								<img src="/pic/${pic}" width="10" height="10" />
								<br />
							</c:if> <!-- <img src="/pic/" width=100 height=100 /> --> <input
							type="file" name="pictureFile" />
						</td>
					</tr>




					<tr>
						<td>版主密码&nbsp;&nbsp;：</td>
						<td><input type="password" name="moderatorpassword" />
						</td>
					</tr>
					<tr>
						<td colspan="2" id="moderator_button"><input type="submit"
							value="提交" />
						</td>
					</tr>
				</table>
			</form>

		</div>

	</div>
	</body>
</html>
