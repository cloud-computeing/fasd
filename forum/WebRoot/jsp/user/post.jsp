<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/jsp/css/post.css">
<title>用户个人详细信息</title>
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
									class="top-nav-user-menuft nav-msg" href="" _tystat="新版底导航/城市">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
								</li>
								<li id="top_nav_msg" class="top-nav-menu-litg"><a
									id="top_nav_msg_user" class="top-nav-user-menu nav-msg" href=""
									title=""> <span class="top-ico-user-msg"></span> </a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- 主题部分 -->
	<div id="huebox" class="skin-c111 hue-gray"
		style="background-image:url(Picuter/111.jpg); min-height:671px;">
		<div id="doc">
			<div id="hd">
				<div class="clearfix header-profile self-profile">
					<div class="img-left">
						<a class="user-pic" href=""> <img
							alt="" src="/pic/${user.userheadid }"
							width="130" height="130px"> </a>
					</div>
					<div class="text-right">
						<h1 class="cf">
							<a class="user-name" href="">${user.username }</a>
						</h1>
						<div class="info-bar clearfix">
							<a class="logout-btn" href="" _tystat="退出">退出</a>
						</div>

					</div>
				</div>
				<div class="alpha-bar"></div>
				<a id="skinCornerBox" class="skinCorner" href="" title="皮肤设置"></a>
			</div>
			<div id="bd" class="layout-wrapper-lmr clearfix">
				<div class="layout-left">
					<div id="left_nav">
						<ul class="clearfix">
							<li class="curr"><a class="index" href="">个人首页</a></li>
							<li><a class="post" href="" target="_blank"> 我的帖子 <span
									class="num"></span> </a></li>
							<li><a class="reply" href="" target="_blank"> 我的回帖 <span
									class="num"></span> </a></li>
						</ul>
					</div>
				</div>
				<!-- 发帖功能 -->
				<form
					action="${pageContext.request.contextPath }/post/addPost.action"
					enctype="multipart/form-data" method="post">
					<div class="layout-middle">
						<div id="twitter_area">
							<div class="suiji-report" style="width:550px">
								<div class="hd">
									<span class="suiji-icon">发帖</span> <span class="arrow"></span>
								</div>
								<!-- 下拉框 -->
								<div class="edit-wrap">
									<div class="bd">
										<div class="sels">
											<a class="friend" href="">板块</a> <select name="plateid">
												<option value="null">-请选择类型-</option>
												<c:forEach items="${allPlate }" var="plates">
													<c:forEach items="${plates.value }" var="plate">
														<option value="${plate.plateid }">${plate.platename
															}</option>
													</c:forEach>
												</c:forEach>
											</select>
										</div>

										<!-- 标题设置 -->
										<div class="title">
											<textarea id="suiji_title" class="title-area" title=""
												rows="" cols="" init-value="点击设置标题" name="posttitle"
												style="width:534px;padding:0px 15px;overflow-y:scroll;height:35px;">点击设置标题</textarea>
										</div>

										<!-- 文本详情 -->
										<div class="content">
											<textarea id="suiji_text" class="text-area"
												placeholder="帖子内容" name="content"
												style="width:534px;padding:0px 15px;overflow-y:scroll;height:140px;border:0;"
												bindcursor="true" rows="" cols=""></textarea>
										</div>
										<div class="pics"></div>
										<div class="tags-wrap">
												<textarea class="text-area"
												placeholder="隐藏内容" name="hidecontent"
												style="width:534px;padding:0px 15px;overflow-y:scroll;height:80px;border:0;"
												bindcursor="true" rows="" cols=""></textarea>
										</div>
									</div>
									<input type="file" name="picture"/>
									<div class="ft">
										<!-- <input class="cancle" value="取消" type="button">  --><input
											class="submit" value="发 布" type="submit">
									</div>
								</div>
							</div>
						</div>
				</form>
			</div>
		</div>
		<div></div>
	</div>
	</div>
	<div id="foot"></div>
	</div>
</body>
</html>