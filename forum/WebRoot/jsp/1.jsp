<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="everybody.css">
<title>用户个人详细信息</title>
	<script>
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
			clearTimeout(tt)
		}
		}



	var left=document.getElementById("left");
	var right=document.getElementById("right");
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
			n--
		}else if(n==0){
			n=kkk.length-1;
		}
		var li=document.getElementById("btn").getElementsByTagName("li");
		li[n].onmouseover()
	};
	right.onclick=function(){
		n=n>=(kkk.length-1)?0:++n;
		var li=document.getElementById("btn").getElementsByTagName("li");
		li[n].onmouseover()
	}
}

;
function leftf(start,end,ele){ var tt=setInterval(function (){
	start+=10;
	ele.style.left=start+"px";
	if(start==end){
		clearInterval(tt);
	}
			},20)
}

function autoplay(){
	n=n>=(kkk.length-1)?0:++n;
	var li=document.getElementById("btn").getElementsByTagName("li");
	li[n].onmouseover()
};
</script>
</head>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
		list-style-type:none;
	}
	a,img{border:0;}
	#cont{
		position: relative;
		width: 620px;
		height: 220px;
		margin:40px auto 0 auto
	}
	.imm a{
		position: absolute;
		padding-left: 12%;
		padding-top: 6%;
	}
	.btn ul {
		position: absolute;
		z-index: 10000;
		bottom: 15px;
		right: 20px;

	}
	.btn ul li{
		width: 20px;
		height: 20px;
		background-color: #cccccc;
		border-radius: 50%;
		list-style: none;
		float: left;
		margin: 0 5px;
		text-align: center;
		color: white;
		line-height: 20px;
		cursor: pointer;
	}
	.btn ul li.on{
		background-color: aquamarine;
	}
	/*.diin{
		width: 100%;
		height: 30px;
		background-color: black;
		opacity: 0.5;
		position: absolute;
		bottom: 0;
		color: white;
		z-index: 10000;
	}*/
	#jiao{
		display: none;
	}
   #left{
	   width: 35px;
	   height: 50px;
	   background-color: #555555;
	   opacity: 0.6;
	   z-index: 9999;
	   display: block;
	   position: absolute;
	   top: 35%;
	   left: 20px;
	   color: white;
	   font-size: 20px;
	   line-height: 50px;
	   text-align: center;
	   text-decoration: none;
   }
	#right{
		width: 35px;
		height: 50px;
		background-color: #555555;
		opacity: 0.6;
		z-index: 9999;
		display: block;
		position: absolute;
		top: 36%;
		right: 20px;
		color: white;
		font-size: 20px;
		line-height: 50px;
		text-align: center;
		text-decoration: none;

	}
</style>

</head>
<body>
	<div id="cont">
		<div class="lii"></div>
		<div class="btn" id="btn">
			<ul>
				<li class="on">1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
			</ul>
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
			<a href="#" id="left">&lt;</a> <a href="#" id="right">&gt;</a>
		</div>
	</div>


 
</body>
</html>

 
 