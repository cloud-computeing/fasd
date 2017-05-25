<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
	<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jsp/css/postDetails.css">
<!-- <link rel="stylesheet" type="text/css" href="postDetails.css"> -->
<title>帖子详情</title>
<script type="text/javascript">
	function erji(name,id,rid){
	
		document.getElementById("replytoobjectname_").value=name;
		document.getElementById("replytoobjectid_").value=id;
		document.getElementById("replyid_").value=rid;
		document.getElementById("haha").innerHTML="发表回复";
		if(rid==0){
			document.getElementById("textAreaContainer").value=" ";
		}
		/* document.getElementById("textAreaContainer").value="@"+name+":"; */
		
	}
</script>
</head>
<body>
	<%--头部 --%>
	<div id="top_nav_banner">
		<div id="top_nav_wrap" style="">
			<div id="top_nav" class="clearfix">
				<div class="top-nav-logo">
					<img alt="" src="Picuter/logo.png">
				</div>
				<div class="top-nav-main clearfix">
					<div class="top-nav-menu clearfix">
						<div class="top-nav-fl clearfix">
							<ul class="top-nav-menu-list clearfix">
								<li class="top-nav-menu-li top-nav-menu-li-first"><a
									class="top-nav-main-menu  on" appstr="bbs" href="">贵大论坛</a></li>
								<li class="top-nav-menu-li">| <a class="top-nav-main-menu"
									_checklocation="1" href="">聚焦贵大</a> |</li>
								<li class="top-nav-menu-li"><a class="top-nav-main-menu"
									_checklocation="1" href="">榜单贵大</a> |</li>
								<li class="top-nav-menu-lf"><span id="top_nav_menu_more"
									class="top-nav-main-menu"></span></li>
							</ul>
						</div>
						<div id="top_search" class="top-nav-fr top-search"
							style="overflow:hidden;">
							<div class="search-btn"></div>
							<div class="clearfix search-wrap">
								<form id="top_search_form" method="get" action="">
									<input id="top_search_submit_btn" class="top-search-submit"
										value="" type="submit"> <input id="top_search_key"
										class="top-search-key off" autocomplete="off" value=""
										bindcursor="ture" type="text">
								</form>
							</div>
						</div>
						<div class="top-nav-fr" id="top_user_menu">
							<ul class="top-nav-menu-list clearfix">
								<li class="top-nav-menu-li top-nav-menu-li-first"><a
									class="top-nav-user-menu with-logo" id="top-nav-user-menu"
									href=""> <img class="logo" alt=""
										src="/pic/${user.userheadid }">
										${user.username } <i class="top-ico-main-arrow"></i> </a></li>
								<li class="top-nav-menu-li"><a
									class="top-nav-user-menuft nav-msg" href="" _tystat="新版底导航/城市">贵阳</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<%--主体部分 --%>
	<div>
		<div id="doc">
			<div class="hd"></div>
			<div class="atl-location clearfix">
				<p class="crumbs">
					<a href="${pageContext.request.contextPath }/index.action">贵大论坛</a> > <em> <a class="addpost" href=""
						rel="nofollow">${plate.platename }</a> </em> <a class="addpost" href="${pageContext.request.contextPath }/user/post.action" rel="nofollow">[我要发帖]</a>
				</p>
			</div>
			<div id="post_head" class="atl-head">
				<h1 class="atl-title">
					<span class="s_title"> <span style="font-weight:400;">${post.posttitle}</span>
					</span> <span id="q_button_170_25_w">
						<div id="q_button_170_25"></div> </span>
				</h1>
				<div class="atl-menu clearfix js-bbs-act">
					<div class="info_icon_box">
						<span class="info_icon faceblue"></span>
					</div>
					<div class="atl-info">
						<span> 楼主: <a class="js-vip-check" target="_blank">${post.username}</a>
						</span> <span>时间：<fmt:formatDate value="${post.posttime}" pattern="yyyy-MM-dd HH:mm:ss"/> </span> <span>点击：${post.clickamount}</span> <span
							title="共2个回帖和0个评论">回复：${post.replyamount}</span>
					</div>
				</div>
				<div class="mb15 cf">
					<div class="read-menu cf">
						<a id="dashang_btn" href="" title="打赏">打赏</a> <a class="see-host"
							href="">看楼主</a> <span class="font-set-box clearfix"> <a
							href="javascript:" id="font_set" class="font-set" _open="0">设置</a>
						</span>
					</div>
				</div>
			</div>
			<div class="atl-main">
				<div class="atl-item host-item">
					<div class="atl-content">
						<div class="atl-con-hd clearfix">
							<div class="atl-con-hd-l"></div>
							<div class="atl-con-hd-r"></div>
						</div>
						<div class="atl-con-bd clearfix">
							<div class="bbs-content clearfix">
								${post.content }<br>
								
								<img alt="" src="/pic/${post.pictureid }"
									 style="display: blockw;width: 200px;height: 100px">
									 <c:choose >
										 <c:when test="${hidecontent != null }">
										 	<c:if test="${post.hidecontent !=null }">
										 		<p style="color: red;">隐藏内容:${post.hidecontent }</p>
										 	</c:if>
										 </c:when>
										 <c:otherwise>
										 	<c:if test="${post.hidecontent !=null }">
										 		<p style="color: green;">回复看隐藏内容</p>
										 	</c:if>
										 </c:otherwise>
									   </c:choose>
							</div>
							<div id="alt_action" class="clearfix"></div>
							<div class="clearfix mt20 mb10">
								<div id="alt_reply" class="atl-reply">
									<a class="reportme a-link" href="" replyid="0"
										style="visibility:visible;">举报</a> <span class="tuijian">
										<a class="a-link-2" href=""></a> <a class="zantop" _count="0"
										href="${pageContext.request.contextPath}/post/like.action?postid=${post.postid}&&flag='zan'">
										点赞${post.goodamount} </a> </span>
								</div>
							</div>
						</div>
						<div class="atl-con-ft clearfix">
							<div class="atl-con-ft-l"></div>
							<div class="atl-con-ft-r"></div>
						</div>
						<div id="niuren_ifm">
							<div class="shang-recommend">
								<div class="hd mb10 cf">
									<div class="tabs">
										<span class="curr" data-type="receive">被赞最多</span>
									</div>
									<div class="tips">
										<span class="receive-tips" style="display:inline;">按照该板块帖子被赞次数排行</span>
									</div>
								</div>
								<div class="bd">
								
									<ul class="receive-box cf" style="display:block;">
										<c:forEach items="${allUser }" var="ue" varStatus="status">
											<c:forEach items="${ue }" var="u">
											<li><span class="rank rank-1">${status.index+1 }</span>
												<div class="info">
													<a href="" target="_blank"> <img class="info-pic"
														src="/pic/${u.key.userheadid }"> </a>
													<p class="info-name">
														<a href="" target="_blank">${u.key.username }</a>
													</p>
													<p class="info-shang">${u.value.goodamount }人赞过</p>
												</div>
												<div class="summary">
													<a href="${pageContext.request.contextPath}/post/postDetails.action?postid=${u.value.postid }" target="_blank">${u.value.posttitle }</a>
												</div></li>
											</c:forEach>
										</c:forEach>
										
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 这是用户评论 -->
				<c:forEach items="${allReply }" var="reply">
					<%-- <div>
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
					</div> --%>
					
					<div class="atl-item">
						<c:if test="${reply.replytoobjectid==null }">
							<div class="atl-head">
								<div class="atl-head-reply"></div>
								<div class="atl-info">
									<span> 用户昵称: <a class="js-vip-check" href=""
										target="_blank">${reply.replyername }</a> </span> <span>时间：<fmt:formatDate value="${reply.replytime }" pattern="yyyy-MM-dd HH:mm:ss"/>
										</span>
								</div>
							</div>
							<div class="atl-content">
								<div class="atl-con-hd clearfix">
									<div class="atl-con-hd-l"></div>
									<div class="atl-con-hd-r"></div>
								</div>
								<div class="atl-con-bd clearfix">
									<div class="bbs-content">
										${reply.replycontent }<br>
									</div>
									<!--二级评论  -->
									<div>
									
										<div>
											<c:forEach items="${allReply }" var="r">
												<c:if test="${r.replytoobjectid==reply.replyerid && r.replyid==reply.id }">
													<div>
														<div style="float: left;">
															${r.replytoobjectname }:  
														</div>
														<div  style="float: right;">
															<fmt:formatDate value="${r.replytime }" pattern="yyyy-MM-dd HH:mm:ss"/><br>
														
														</div>
														<div>
														
															<br>&nbsp;&nbsp;${r.replycontent } 
														</div>
													
														
														
													</div>
												</c:if>
											</c:forEach>
										</div>
									</div>
									<div class="atl-reply">
										来自： <a class="a-link" href="" target="_blank" rel="nofollow">贵大论坛客户端</a>
										| <a class="reportme a-link" href="" author="击出日"
											style="visibility:visible;">举报</a> | <span>楼层 :${reply.floor }</span> | <a
											class="a-link-2 reply" href="#textAreaContainer" onclick="erji('${reply.replyername }','${reply.replyerid }','${reply.id }')">回复</a><!--  | <a href=""
											class="a-link-2 ir-remark" floor="2" _stat="" title="插入评论">评论</a> -->
									</div>
								</div>
							</div>
						</c:if>
					</div>
				</c:forEach>



			</div>
			<div class="clearfix"></div>

			<div class="post-div clearfix">
				<a class="a-anchor" href="" name="fabu_anchor"></a>
				<div class="mb10">
					<span id="author_name_reply"> <img
						src="/pic/${user.userheadid }"> <a>${user.username }</a>
					</span> <span id="haha" style="color:#999;">发表评论</span>
				</div>
			<!--用户回复，评论  -->
				<form action="${pageContext.request.contextPath }/post/reply.action">
					<input type="hidden" name="postid" value="${post.postid }"><!--帖子id  -->
					<input type="hidden" name="replytoobjectid" id="replytoobjectid_">
					<input type="hidden" name="replytoobjectname" id="replytoobjectname_">
					<input type="hidden" name="reply_id" id="replyid_">
					<div id="bbsPost" style="position:relative;">
					
						<div style="position:relative;width:632px;height:213px;">
							<textarea id="textAreaContainer" name="replycontent" class="textAreaContainer"
								style="width:630px;" bindcursor="ture"></textarea>
						</div>
						<p class="post-p">
							<span class="fl mt10" style="color:#8A8A8A;"> 请遵守 <a
								class="hrefgonyue" target="_blank" href="${pageContext.request.contextPath}/jsp/guida/gzu.jsp">贵大社区公约</a>
								言论文明，不得违反国家法律法规 </span>
							<!-- <button class="common-submitBtn" type="button" title="快捷发表">回复</button> -->
							<input type="button"class="common-submitBtn" value="清空" onclick="erji('','',0)">
							<input type="submit"class="common-submitBtn" value="回复">
						</p>
					</div>
				</form>
			</div>

			<div class="foot">
				<p>
					<a href="" rel="nofollow" target="_blank">关于论坛</a> | <a href=""
						rel="nofollow" target="_blank">广告服务</a> | <a href=""
						rel="nofollow" target="_blank">开放平台</a> | <a href=""
						rel="nofollow" target="_blank">隐私和版权</a> | <a href=""
						rel="nofollow" target="_blank">联系我们</a> | <a href=""
						rel="nofollow" target="_blank">加入我们</a> | <a href=""
						rel="nofollow" target="_blank">手机应用</a> | <a href=""
						rel="nofollow" target="_blank">侵权投诉</a>
				</p>
				<p class="copyright">贵大论坛</p>
			</div>
		</div>
	</div>
</body>
</html>