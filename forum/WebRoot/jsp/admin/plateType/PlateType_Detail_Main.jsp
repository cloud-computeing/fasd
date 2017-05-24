<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'PlateType_Detail_Main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="jsp/css/platetype_insert_main.css">
	

  </head>
  
  <body>
    <div class="main">
		<div id="header">
			<h1>板块类型信息修改</h1>
		</div>
		<div id="content">
			<form action="${pageContext.request.contextPath }/admin/updatePlateType.action" method="post">
				<table>
					<tr>
						<td>版块类型&nbsp;id&nbsp;&nbsp;：</td>
						<td><input type="text" name="platetypeid" value="${platetype.platetypeid}" readonly="true"/></td>
					</tr>
					<tr>
						<td>板块类型名称&nbsp;&nbsp;：</td>
						<td><input type="text" name="platetypename" value="${platetype.platetypename}"/></td>
						</tr>
					<tr>
						<td colspan="2" id="plate_button"><input type="submit"
							value="提交" /></td>
					</tr>
					
				</table>
			</form>

		</div>

	</div>
  </body>
</html>
