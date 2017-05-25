
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/jsp/css/index.css">
<title>贵大论坛</title>
<script type="text/javascript">
function sub(currentPage){
	document.getElementById("currentpage").value=currentPage;
	bbs_type_search.submit();
};



var tt=null;
var kkk;
var n=0;
var timer=0;


window.onload=function(){
	var li=document.getElementById("btn").getElementsByTagName("li");
	kkk=document.getElementById("imm").getElementsByTagName("a");
	for(var i=0;i<kkk.length;i++){
		if(i!=0){
			kkk[i].style.opacity=0;
		}
	}
	for(var j=0;j<li.length;j++){
			li[j].onmouseover=function(){
				var that=this;
				that.style.background="aquamarine";
				tt=setTimeout(function(){ var index=that.innerHTML-1;
					n=index;
					if(index <kkk.length){
						for(var o=0;o<li.length;o++){
							li[o].className="";
							kkk[o].style.opacity=0;
							kkk[o].style.zIndex=9998;
						}
						that.className="on";
						kkk[index].style.opacity=1;
						kkk[index].style.zIndex=9999;
						kkk[index].style.transition="opacity 0.8s";
					  /* leftf(-300,0,kkk[index]);*/
					}
				},100);

			};
		li[j].onmouseout=function(){
			var that=this;
			that.style.background="#cccccc";
			clearTimeout(tt);
		};
		}



	var left=document.getElementById("left1");
	var right=document.getElementById("right1");
	var jiao=document.getElementById("jiao");
	var body=document.getElementById("cont");

	timer = setInterval("autoplay()",2000);
	body.onmouseover=function(){
		jiao.style.display="block";
		clearInterval(timer);
	};
	body.onmouseout=function(){
		jiao.style.display="none";
		timer = setInterval("autoplay()",2000);
		
	};
	left.onclick=function(){
		if(n>0){
			n--;
		}else if(n==0){
			n=kkk.length-1;
		}
		var li=document.getElementById("btn").getElementsByTagName("li");
		li[n].onmouseover();
	};
	right.onclick=function(){
		n=n>=(kkk.length-1)?0:++n;
		var li=document.getElementById("btn").getElementsByTagName("li");
		li[n].onmouseover();
	};

 };

function leftf(start,end,ele){ 
	var tt=setInterval(function (){
	start+=10;
	ele.style.left=start+"px";
	if(start==end){
		clearInterval(tt);
	}
			},20);
};

function autoplay(){
	n=n>=(kkk.length-1)?0:++n;
	var li=document.getElementById("btn").getElementsByTagName("li");
	li[n-1].style.background="#cccccc";
	li[n].onmouseover();
};


</script>
</head>
<style type="text/css">
	.btn ul li.on{
		background-color: aquamarine;
	}
</style>
<body>

	<%--头部 --%>
	<div id="top_nav_banner">
		<div class="top_nav_wrap">
			<div id="top_nav" class="clearfix">
				<div class="top-nav-logo">
					<img alt="" src="jsp/css/Picuter/logo.png">
				</div>
				<div class="top-nav-main clearfix">
					<div class="top-nav-menu clearfix">
						<div class="top-nav-fl clearfix">
							<ul class="top-nav-menu-list clearfix">
								<li class="top-nav-menu-li top-nav-menu-li-first"><a
									class="top-nav-main-menu  on" title="" href="#">聚焦</a>
								</li>
								<li class="top-nav-menu-li"><a class="top-nav-main-menu"
									name="">贵大榜</a>
								</li>
								<li class="top-nav-menu-li"><span id="top_nav_menu_more"
									class="top-nav-main-menu"> </span>
								</li>
							</ul>
						</div>
						<div id="top_search" class="top-nav-fr top-search"
							style="overflow: hidden;">
							<div class="search-btn" style=""></div>
							<div class="clearfix search-wrap">
								<form id="top_search_form" method="get"
									action="http://search.tianya.cn/bbs">
									<input id="top_search_submit_btn" class="top-search-submit"
										value="" type="submit"> <input id="top_search_key"
										class="top-search-key off" autocomplete="off" value=""
										name="q" type="text">
								</form>
							</div>
						</div>
						<div id="top_user_menu" class="top-nav-frt">
							<ul class="top-nav-menu-list clearfix">
								<li class="top-nav-menu-li  top-nav-menu-li-first"><a
									id="js_login" class="top-nav-user-menu" href="">登录</a>
								</li>
								<li class="top-nav-menu-li"><a id=""
									class="top-nav-user-menu" href="" target="_blank">注册</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%--中间部分 --%>
	<div id="bbsdoc" class="bbsdoc">
		<div class="clearfix"></div>
		<div class="hd"></div>
		<%--主体部分 --%>
		<div id="bd" class="layout-lmr clearfix">
			<div id="left">
				<div id="bbs_left_nav" class="bbs_left_nav">
					<ul class="nav_parent">
						<li class="bbs_home"><a class="bbs_home_link" href="">论坛首页</a>
						</li>
						<li><a class="folder expand" href="">我的大学</a>
						</li>
					</ul>
					<div class="line"></div>
					<div class="nav_child_box" style="display: block;">
						<ul class="nav_child">
							<li class="child_hd"><span class="child_name">热点</span>
							</li>
							<c:forEach var="plate" items="${allPlate['热点'] }">
								<li><a class="child_link"
									href="${pageContext.request.contextPath}/index.action?postCustom.plateid=${plate.plateid }">


										${plate.platename } </a>
								</li>
							</c:forEach>
						</ul>

						<ul class="nav_child">
							<c:forEach var="plates" items="${allPlate }">
								<c:if test="${plates.key!='热点'}">
									<li class="child_hd"><span class="child_name">${plates.key}</span>
									</li>
									<c:forEach var="plate" items="${plates.value}">
										<li><a class="child_link"
											href="${pageContext.request.contextPath}/index.action?postCustom.plateid=${plate.plateid }">
												${plate.platename }</a>
										</li>
									</c:forEach>
								</c:if>
							</c:forEach>
						</ul>
					</div>
					<div class="line"></div>
				</div>
			</div>


			<div id="main">
				<%-- <div class="clearfix">
					<div id="q_topbanner_685_90"
						class="banner-img-mb10 ads-loc-holder clearfix"
						data-ads-order="01" data-ads-url-type="01">
						<div class="adsame-box" style="position: relative; *zoom: 1;">
							<div style="border: none;">
							<!--主页图片                                   **************  -->
								<img alt="" src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
							</div>
						</div>
					</div>
				</div> --%>
				<div class="headlines">
					<div class="location clearfix">
						<div class="text">
							<strong>印象贵大</strong>
							<!-- <a id="block_join_btn" title="加入本版" href=""></a> -->
						</div>
						<!--***************************  -->
					</div>
					<div class="headlines-tab">
						<ul class="location-tabs">
							<li class="cur">本版置顶</li>
							<li>本版介绍</li>
						</ul>
						<div class="wrap-1 mt5 clearfix">
							<div class="wrap-1 mt5 clearfix">
								<div id="cont"
									style="position:relative;width:670px;height:180px;margin:1px 0;">
									<div class="lii">
										<div class="btn" id="btn">
											<ul
												style="position:absolute;z-index:1000;bottom:15px;right:15px;">
												<li class="on"
													style="position:relative;width:20px;height:20px;background-color:#cccccc;border-radius:50%;float:left;list-style:none;margin: 0 5px;text-align: center;color: white;cursor:pointer;line-height: 20px;">1</li>
												<li
													style="position:relative;width:20px;height:20px;background-color:#cccccc;border-radius:50%;float:left;list-style:none;margin: 0 5px;text-align: center;color: white;cursor:pointer;line-height: 20px;">2</li>
												<li
													style="position:relative;width:20px;height:20px;background-color:#cccccc;border-radius:50%;float:left;list-style:none;margin: 0 5px;text-align: center;color: white;cursor:pointer;line-height: 20px;">3</li>
												<li
													style="position:relative;width:20px;height:20px;background-color:#cccccc;border-radius:50%;float:left;list-style:none;margin: 0 5px;text-align: center;color: white;cursor:pointer;line-height:20px;">4</li>
											</ul>
										</div>
									</div>
									<div class="imm" id="imm">
										<a href=""> <img
											style="position:absolute;width:670px;height:180px;"
											src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
										</a> <a href=""> <img
											style="position:absolute;width:670px;height:180px;"
											src="${pageContext.request.contextPath }/jsp/css/Picuter/">
										</a> <a href=""> <img
											style="position:absolute;width:670px;height:180px;"
											src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
										</a> <a href=""><img
											style="position:absolute;width:670px;height:180px;"
											src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
										</a>
									</div>
									<div id="jiao">
										<a href="#" id="left1"
											style="width:35px;height:50px;background-color:red;opacity:0.6;z-index:9999;display:block;position:absolute;top:60px;left:20px;color:white; font-size:20px;line-height:50px;text-align:center;text-decoration:none;">&lt;</a>
										<a href="#" id="right1"
											style="width:35px;height:50px;background-color:red;opacity:0.6;z-index:9999;display:block;position:absolute;top:60px;right:20px;color:white; font-size:20px;line-height:50px;text-align:center;text-decoration:none;">&gt;</a>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="bbs-type">
						<div class="tab-list clearfix">

							<ul class="clearfix">
								<li class="curr"><a href="">默认</a>
								</li>
								<li><a href="">最新</a>
								</li>
								<li><a href="">问答</a>
								</li>
								<li class="more"><a href="">更多</a>
								</li>
								<li class="float-li"><a class="btn-gray btn-post" href="">发帖</a>
								</li>
								<li class="float-li fold-li">
									<div id="bbs_btn_list" class="btn-list">
										<a href=""><span class="arrow">提问</span> </a>
									</div></li>
								<li class="float-li"><a class="btn-gray" href="">刷新</a>
								</li>
								<li class="top-search clearfix">
									<form id="bbs_type_search"
										action="${pageContext.request.contextPath }/index.action">
										<!-- 提交 -->
										<input class="top-search-submit" type="button"
											onclick="sub(1)"> <input class="top-search-key off"
											name="postCustom.posttitle" type="text"
											value="${postVo.postCustom.posttitle }">
										<!--板块id  -->
										<input type="hidden" name="postCustom.plateid"
											value="${allPost[0].plateid}"> <input type="hidden"
											name="currentPage" id="currentpage">
									</form></li>
							</ul>

						</div>
					</div>
					<div class="mt5">
						<table class="tab-bbs-list tab-bbs-list-2" width="100%"
							cellspacing="0" border="0">
							<colgroup>
								<col class="col-title">
								<col class=" ">
								<col class=" ">
								<col class="">
								<col class="col-date">
							</colgroup>
							<tbody>
								<tr>
									<th scope="col">标题</th>
									<th scope="col">作者</th>
									<th scope="col">点击</th>
									<th scope="col">回复</th>
									<th scope="col">发帖时间</th>
								</tr>
							</tbody>
							<tbody>

								<c:forEach var="post" items="${allPost}">
									<tr class="bg">
										<td class="td-title faceblue"><span class="face"
											title="普通帖"></span> <a
											href="${pageContext.request.contextPath}/post/postDetails.action?postid=${post.postid}"
											target="_blank"> ${post.posttitle}</a></td>
										<td><a class="author" href="" target="_blank">${post.username}</a>
										</td>
										<td>${post.clickamount}</td>
										<td>${post.replyamount}</td>

										<td title="2017-05-14 15:46" style="font-size: 12px;"><fmt:formatDate
												value="${post.posttime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

						<c:choose>
							<c:when test="${postVo.currentPage==1}">
					首页
					上一页
				</c:when>
							<c:otherwise>
								<input type="button" value="首页" onclick="sub(1)">

								<input type="button" value="上一页"
									onclick="sub(${postVo.currentPage-1})">

							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${postVo.currentPage ==postVo.pagecount}">
					下一页
					尾页
				</c:when>
							<c:otherwise>
								<input type="button" value="下一页"
									onclick="sub(${postVo.currentPage+1})">
								<input type="button" value="尾页"
									onclick="sub(${postVo.pagecount})">
							</c:otherwise>
						</c:choose>
					</div>

				</div>
			</div>
		</div>










</body>
</html>
