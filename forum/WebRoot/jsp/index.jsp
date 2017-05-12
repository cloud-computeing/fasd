<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
<div style="width: 200;background-color: green;float: left;" >
	  热点：<br>
 <c:forEach var="plate" items="${allPlate['热点'] }">
 	${plate.plateid }
    ${plate.platename }
    ${plate.moderatorid }
    ${plate.platetypeid }<br>
 </c:forEach>
    <c:forEach var="plates" items="${allPlate }">
    	<c:if test="${plates.key!='热点'}">
	    		${plates.key}:<br>
		    	<c:forEach var="plate" items="${plates.value}">
		    		${plate.plateid }
		    		${plate.platename }
		    		${plate.moderatorid }
		    		${plate.platetypeid }<br>
		    	</c:forEach>
    	</c:if>
    </c:forEach>
</div>
<div style="background-color: red;width: 800;float: left;">
<c:forEach var="post" items="${allPost}">
		${post.postid}
		${post.posttitle}
		${post.userid}
		${post.username}
		${post.clickamount}
		${post.goodamount}
		${post.replyamount}
		${post.latestreplytime}
		${post.pictureid}
		${post.topflag}
		${post.plateid}
		${post.content}
		<br>
	</c:forEach>
</div>
	
  </body>
</html>
