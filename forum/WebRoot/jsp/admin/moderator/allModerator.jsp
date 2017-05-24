<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="position:absolute;top:20%;left:20%;width:800px;height:420px;">
<div style="position:relative;">
<P style="width:300px;height:30px;line-height:30px;margin-bottom:10px;color:black;font-size:16px;">
<a style="text-decoration:none;padding:2px 10px;font-weight:700;color:#000000;" href="${pageContext.request.contextPath }/jsp/admin/moderator/Moderator_Insert.jsp">添加新的版主</a><br/></P>
<div style="width:300px;height:50px;"> 
</div>
</div>
 
<table>
<tr>
<td>版主的id</td>
<td>版主的姓名</td>
<td>版主的密码</td>
<td>版主的性别</td>
<td>修改版主的信息</td>
<td>查询版主管理的板块</td>
<td>删除该版主</td>

</tr>
	<c:forEach var="allModerators" items="${ allModerators}">
	<tr>
	<td>${allModerators.moderatorid}</td>  
	<td>${allModerators.moderatorname}</td>  
	<td>${allModerators.moderatorpassword}</td>  
	<td>${allModerators.moderatorsex}</td> 
	<td><a href="${pageContext.request.contextPath }/admin/oneModerator.action?id=${ allModerators.moderatorid}">前往</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/plate.action?id=${ allModerators.moderatorid}">前往</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/deletModerator.action?id=${ allModerators.moderatorid}">删除</a></td>
	</tr>
</c:forEach>
</table>
 
<div style="position:absolute;right:35%;bottom:0;">
<table>
<tr>
<c:choose>
				<c:when test="${moderatorVo.nowPage==1}">
					首页
					上一页
				</c:when>
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/admin/mohuModerator.action?nowPage=1">
						首页</a>
					<a href="${pageContext.request.contextPath}/admin/mohuModerator.action?nowPage=${moderatorVo.nowPage-1}">
						上一页</a>
				</c:otherwise>
	</c:choose>
	<c:choose>
				<c:when test="${moderatorVo.nowPage==moderatorVo.count}">
					下一页
					尾页
				</c:when>
				<c:otherwise>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuModerator.action?nowPage=${moderatorVo.nowPage+1}">
						下一页</a>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuModerator.action?nowPage=${moderatorVo.count}">
						尾页</a>
				</c:otherwise>
	</c:choose>
	</tr>
</table>
</div>
</div>
 
</body>
</html>