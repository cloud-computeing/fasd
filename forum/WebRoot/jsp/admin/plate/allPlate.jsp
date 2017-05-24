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
<a style="text-decoration:none;padding:2px 10px;font-weight:700;color:#000000;" href="${pageContext.request.contextPath }//admin/insertP.action">添加新的版块</a><br/></P>
<div style="width:300px;height:50px;"> 
<form action="${pageContext.request.contextPath }/admin/somePlates.action">
<input style="width:140px;height:30px;margin:9px 2p 5px 9px;line-height:30px;" type="text" name="id"> <input type="submit" value='搜索' />
</form>
</div>
</div>
<table>
<tr>
<td>板块id</td>
<td>板块名字</td>
<td>版主id</td>
<td>关联的板块类型id</td>
<td>删除板块类型</td>
<td>修改板块信息</td>
</tr>
<c:forEach var="allPlates" items="${ allPlates}">
<tr>
<td>${allPlates.plateid}</td>  
	<td>${allPlates.platename}</td>  
	<td>${allPlates.moderatorid}</td>  
	<td>${allPlates.platetypeid}</td>  
	<td><a href="${pageContext.request.contextPath }/admin/deletPlate.action?id=${ allPlates.plateid}">删除</a></td>
	<td><a href="${pageContext.request.contextPath }/admin/onePlate.action?id=${ allPlates.plateid}">前往</a></td>
</tr>
</c:forEach>
</table>

<div style="position:absolute;right:35%;bottom:0;">
<table>
<tr>
<c:choose>
				<c:when test="${plateVo.nowPage==1}">
					首页
					上一页
				</c:when>
				<c:otherwise>
					<a href="${pageContext.request.contextPath}/admin/mohuPlate.action?nowPage=1">
						首页</a>
					<a href="${pageContext.request.contextPath}/admin/mohuPlate.action?nowPage=${plateVo.nowPage-1}">
						上一页</a>
				</c:otherwise>
	</c:choose>
	<c:choose>
				<c:when test="${plateVo.nowPage==plateVo.count}">
					下一页
					尾页
				</c:when>
				<c:otherwise>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuPlate.action?nowPage=${plateVo.nowPage+1}">
						下一页</a>
					<a style="text-decoration:none" href="${pageContext.request.contextPath}/admin/mohuPlate.action?nowPage=${plateVo.count}">
						尾页</a>
				</c:otherwise>
	</c:choose>
	</tr>
</table>
</div>
</div>

</body>
</html>