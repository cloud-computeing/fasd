<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
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
		<a href="${pageContext.request.contextPath}/post/like.action?postid=${post.postid}&&flag='zan'">
			点赞${post.goodamount}</a>
		
	</div>
	<c:forEach items="${allReply }" var="reply">
	
		<div style="width: 800px;background-color: red;">
		 	<c:if test="${reply.replytoobjectid==null }">
			 	<div>
					评论人:${reply.replyername }    时间 :${reply.replytime } 
				</div>
				<div>
					${reply.replycontent }
				</div>
				<c:forEach items="${allReply }" var="r">
					<c:if test="${r.replytoobjectid==reply.replyerid }">
					
					<div>
						回复评论人:${r.replytoobjectname }  时间:${r.replytime }<br>
						
						回复内容:${r.replycontent } 
					</div>
				</c:if>
				
				</c:forEach>
				
				<div>
					楼层 :${reply.floor }  回复 赞
				</div>
		 	</c:if>
		 	
			
		</div>
	</c:forEach>
	<div>
		评论
		<form action="${pageContext.request.contextPath }/post/reply.action">
			<input type="hidden" value="${post.postid}" name="postid">
			<textarea rows="10" cols="100" name="replycontent"></textarea>
			<input type="submit" value="回复">
		</form>
	</div>
	
	
</body>
</html>
