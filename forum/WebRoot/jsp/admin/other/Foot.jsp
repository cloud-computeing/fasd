<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Foot.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="jsp/css/foot.css">
	

  </head>
  
  <body>
    <div class="footer">
    
    
    <a >版权所有：贵大论坛编辑部</a>
    <span id="line"></span>
     <a >主管单位：贵大论坛中心</a>
     <span id="line"></span>
      <a >主办单位：贵大论坛团体</a>
      <br>
       <a>本系统由贵州大学软工142班贵大论坛团体设计</a>
   
    <!-- <ul>
    <li id="line">版权所有：贵大论坛编辑部</li>
    <span></span>
     <li id="line">主管单位：贵大论坛中心</li>
      <li >主办单位：贵大论坛团体</li></br>
       <li>本系统由贵州大学软工142班贵大论坛团体设计</li>
    </ul> -->
   <!--  <ol>
    <li>本系统由贵州大学软工142班贵大论坛团体设计</li>
    </ol> -->
    </div>
  </body>
</html>
