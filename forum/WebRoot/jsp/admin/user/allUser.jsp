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

<div style="position:absolute;top:20%;left:20%;width:900px;height:420px;">
<div style="position:relative;">
<P style="width:300px;height:30px;line-height:30px;margin-bottom:10px;color:black;font-size:16px;">
<a style="text-decoration:none;padding:2px 10px;font-weight:700;color:#000000;" href="${pageContext.request.contextPath }/jsp/admin/user/User_Insert.jsp">添加新的用户</a><br/></P>
<div style="width:300px;height:50px;"> 
<form action="${pageContext.request.contextPath }/admin/someUser.action">
<input style="width:140px;height:30px;margin:9px 2p 5px 9px;line-height:30px;" type="text" name="id"> <input type="submit" value='搜索' />
</form>
</div>
</div>

<table>
<tr>
<td>用户id</td>
<td>用户密码</td>
<td>用户名字</td>
<td>用户邮箱</td>
<td>用户性别</td>
<td>用户签名</td>
<td>用户权限</td>
<td>删除用户</td>
<td>修改用户信息</td>
</tr>
<c:forEach var="allUsers" items="${ allUsers}">
<tr>
	<td>${allUsers.userid}</td>  
	<td>${allUsers.userpassword}</td>  
	<td>${allUsers.username}</td>  
	<td>${allUsers.usermail}</td>  
	<td>${allUsers.usersex}</td> 
	<td>${allUsers.signature}</td> 
	<td>${allUsers.flag}</td>
	<td><a href="${pageContext.request.contextPath }/admin/deletUser.action?id=${ allUsers.userid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/oneUser.action?id=${ allUsers.userid}">前往</a></td>
</tr>
</c:forEach>
</table>

<div style="position:absolute;right:35%;bottom:0;">
<table>
<tr>
<c:choose>
				<c:when test="${userVo.nowPage==1}">
					首页
					上一页
				</c:when>
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/admin/mohuUser.action?nowPage=1">
						首页</a>
					<a href="${pageContext.request.contextPath}/admin/mohuUser.action?nowPage=${userVo.nowPage-1}">
						上一页</a>
				</c:otherwise>
	</c:choose>
	<c:choose>
				<c:when test="${userVo.nowPage==userVo.count}">
					下一页
					尾页
				</c:when>
				<c:otherwise>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuUser.action?nowPage=${userVo.nowPage+1}">
						下一页</a>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuUser.action?nowPage=${userVo.count}">
						尾页</a>
				</c:otherwise>
	</c:choose>
	</tr>
</table>
</div>
</div>
</body>
</html>