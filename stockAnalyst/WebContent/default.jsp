<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--设置文件路径 --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<!-- 引入CSS文件 -->
<link href="<%= basePath %>CSS/defaultCSS.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- 背景图形区域 -->
	<div id="backgroundArea-01">
		<p></p>
	</div>
	<div id="backgroundArea-02">
		<p></p>
		<a href="${pageContext.request.contextPath }/default.jsp"><img src="<%=basePath%>/images/logo.png" id="logoArea" alt="网站图标"/></a>
	</div>
	
	<!-- 正文区域 -->
	<div id="title">
		<p class="titleContent">欢迎使用istar-科创板风险分析平台</p>
		<form id="formArea" action="${pageContext.request.contextPath }/index/main" method="post">
			<input id="sureButton" type="submit" value="点击进入" />
		</form>
	</div>
</body>
</html>