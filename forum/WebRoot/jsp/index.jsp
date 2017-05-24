 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jsp/css/index.css">
<title>贵大论坛</title>
<script type="text/javascript">
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
				clearTimeout(tt);
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
			}
		}

		
		function leftf(start,end,ele){ var tt=setInterval(function (){
			start+=10;
			ele.style.left=start+"px";
			if(start==end){
				clearInterval(tt);
			}
					},20);
		}

		function autoplay(){
			n=n>=(kkk.length-1)?0:++n;
			var li=document.getElementById("btn").getElementsByTagName("li");
			li[n].onmouseover();
		};

function sub(currentPage){
	document.getElementById("currentpage").value=currentPage;
	//alert(document.getElementById("currentpage").value);
	bbs_type_search.submit();
}


</script>
</head>
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
									class="top-nav-main-menu  on" title="" href="#">聚焦</a></li>
								<li class="top-nav-menu-li"><a class="top-nav-main-menu"
									name="">贵大榜</a></li>
								<li class="top-nav-menu-li"><span id="top_nav_menu_more"
									class="top-nav-main-menu"> </span></li>
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
									id="js_login" class="top-nav-user-menu" href="">登录</a></li>
								<li class="top-nav-menu-li"><a id=""
									class="top-nav-user-menu" href="" target="_blank">注册</a></li>
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
						<li><a class="folder expand" href="">我的大学</a></li>
					</ul>
					<div class="line"></div>
					<div class="nav_child_box" style="display: block;">
						<ul class="nav_child">
							<li class="child_hd"><span class="child_name">热点</span></li>
							<c:forEach var="plate" items="${allPlate['热点'] }">
								<li><a class="child_link"
									href="${pageContext.request.contextPath}/index.action?postCustom.plateid=${plate.plateid }">


										${plate.platename } </a></li>
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
												${plate.platename }</a></li>
									</c:forEach>
								</c:if>
							</c:forEach>
						</ul>
					</div>
					<div class="line"></div>
				</div>
			</div>

			<div class="right">
				<div id="q_button_180_90_1" class="banner-img-mb10 ads-loc-holder"
					data-ads-order="02">
					<div class="adsame-box" style="position: relative; *zoom: 1;">
						<div class="box_adsame" style="border: none;"></div>
					</div>
				</div>
				<div id="mod-pic-toggle-ad" class="section ads-loc-holder"
					data-ads-order="03">
					<div class="adsame-box" style="position: relative; *zoom: 1;">
						<div style="border: none">
							<iframe style="vertical-align: middle;" scrolling="no" src=""
								width="180px" height="150px"></iframe>
						</div>
						<img alt="" src="http://801.tianya.cn/2015/leftbottom.png"
							style="width: 29px; height: 16px; position: absolute; left: 0; bottom: 0; border: 0;">
					</div>
				</div>
			</div>

			<div id="main">
				<div class="clearfix">
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
				</div>
				<div class="headlines">
					<div class="location clearfix">
						<div class="text">
							<strong>印象贵大</strong> <!-- <a id="block_join_btn" title="加入本版" href=""></a> -->
						</div>
						<!--***************************  -->
					</div>
					<div class="headlines-tab">
						<ul class="location-tabs">
							<li class="cur">本版置顶</li>
							<li>本版介绍</li>
						</ul>
						<div class="wrap-1 mt5 clearfix">
                        <div class="waer_top">
                           <div class="lii">
		                   <div class="btn" id="btn">
		                    <ul>
		                     <li class="on">1</li>
				             <li>2</li>
				             <li>3</li>
				             <li>4</li>
		                    </ul>
                        </div>
                        </div>
            <div class="imm" id="imm">
			<a href=""> <img
				src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
			</a> <a href=""> <img
				src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
			</a> <a href=""> <img
				src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
			</a> <a href=""><img
				src="${pageContext.request.contextPath }/jsp/css/Picuter/logo.png">
			</a>
		   </div>
		   	<div id="jiao" >
			<a href="#" id="left1">&lt;</a> <a href="#" id="right1">&gt;</a>
		    </div>
						</div>
					</div>
				</div>
				<div id="main_xiangguan" class="main_xiangguan clearfix">
					<div class="title">相关板块:</div>
					<div class="btns"></div>
					<div class="main-list clearfix">
						<ul class="clearfix" style="margin-top: 0px;">
							<li><a href="#" title="贵阳">贵阳</a></li>
							<li><a href="#" title="花城婚嫁">花城婚嫁</a></li>
							<li><a href="#" title="贵阳消费">贵阳消费</a></li>
							<li><a href="#" title="贵阳房产">贵阳房产</a></li>
						</ul>
					</div>
				</div>
				<div class="moderator" _stat="/stat/bbs/list/版主">
					斑竹: <a href="" target="_blank" title=""> 行者无疆2017 <span
						class="ico-gray"></span> </a> <a href="" target="_blank" title="">
						春满人间 <span class="ico-gray"></span> </a>
				</div>
				
					<div class="bbs-type">
						<div class="tab-list clearfix">
						
							<ul class="clearfix">
								<li class="curr"><a href="">默认</a></li>
								<li><a href="">最新</a></li>
								<li><a href="">问答</a></li>
								<li class="more"><a href="">更多</a></li>
								<li class="float-li"><a class="btn-gray btn-post" href="">发帖</a>
								</li>
								<li class="float-li fold-li">
									<div id="bbs_btn_list" class="btn-list">
										<a href=""><span class="arrow">提问</span> </a>
									</div>
								</li>
								<li class="float-li"><a class="btn-gray" href="">刷新</a></li>
									<li class="top-search clearfix">
								<form id="bbs_type_search" action="${pageContext.request.contextPath }/index.action">
									<!-- 提交 --> <input
										class="top-search-submit"type="button" onclick="sub(1)">
									<input class="top-search-key off"
										name="postCustom.posttitle" type="text" value="${postVo.postCustom.posttitle }">
										<!--板块id  -->
										<input type="hidden" name="postCustom.plateid"
										value="${allPost[0].plateid}">
										<input type="hidden" name="currentPage" id="currentpage">
								</form>
									</li>
							</ul>
					
						</div>
						<div class="type-list">
							全部\ <a href="" rel="nofollow">游天下</a>\ <a href="" rel="nofollow">品美味</a>\
							<a href="" rel="nofollow">宿酒店</a>\ <a href="" rel="nofollow">购实惠</a>\
							<a href="" rel="nofollow">游乐场</a>\ <a href="" rel="nofollow">路线图</a>\
							<a href="" rel="nofollow">求结伴</a>
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
											target="_blank"> ${post.posttitle}</a>
										</td>
										<td><a class="author" href="" target="_blank">${post.username}</a>
										</td>
										<td>${post.clickamount}</td>
										<td>${post.replyamount}</td>
										
										<td title="2017-05-14 15:46" style="font-size: 12px;">
											<fmt:formatDate value="${post.posttime}" pattern="yyyy-MM-dd HH:mm:ss"/>
										</td>
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
								<input type="button"value="首页"onclick="sub(1)">
									
								<input type="button"value="上一页"onclick="sub(${postVo.currentPage-1})">
									
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${postVo.currentPage ==postVo.pagecount}">
					下一页
					尾页
				</c:when>
							<c:otherwise>
								<input type="button"value="下一页"onclick="sub(${postVo.currentPage+1})">
								<input type="button"value="尾页"onclick="sub(${postVo.pagecount})">
							</c:otherwise>
						</c:choose>
					</div>
				
			</div>
		</div>
	</div>










	<%--footer --%>
	<div id="barcode_float" class="barcode-float">
		<a href="" target="_blank">
			<p>贵大论坛客户端</p> <img alt=""
			src="http://static.tianyaui.com/global/bbs/web/static/images/weixin_code_1800255.jpg">
			<p>玩转课堂</p> </a>
	</div>

</body>
</html>
 