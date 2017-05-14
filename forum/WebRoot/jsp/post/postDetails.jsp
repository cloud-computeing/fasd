<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'postDetails.jsp' starting page</title>

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
	<div>${post.postid} ${post.posttitle} ${post.userid}
		${post.username} ${post.clickamount} ${post.goodamount}
		${post.replyamount} ${post.latestreplytime} ${post.pictureid}
		${post.topflag} ${post.plateid} ${post.content} ${post.posttime}
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/post/like.action?postId=${post.postid}&&flag='zan'">
			点赞${post.goodamount}</a>
		
	</div>
	
	<div>
		
	</div>
</body>
</html>
