<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- 引入Spring表单标签库 --%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 引入EL表达式格式化库 --%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--设置文件路径 --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统首页</title>
<!-- 引入CSS文件 -->
<link href="<%= basePath %>CSS/indexCSS.css" rel="stylesheet" type="text/css" />
<!-- 引入JS文件 -->
<script type="text/javascript" src="<%=basePath%>/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/js/layui/layui.all.js"></script>
<!-- 引入外部JS文件 -->
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
<script type="text/javascript"
	src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>
<style>
body{
	background-image:url(<%=basePath%>/images/background.png);
	background-size: auto;
}
</style>
</head>
<body style="height: 100%; margin: 0">
	<!-- 标题栏 -->
	<div class="title">
		<a href="${pageContext.request.contextPath }/index/main"><img src="<%=basePath%>/images/logo.png" id="logoArea" alt="网站图标"/></a>
		<h1 id="mainTitle">istar-科创板风险分析平台</h1>
		<p id="subTitle">powered by VICTOIRE小组</p>
	</div>
	
	<!-- 用户输入区 -->
	<div class="inputArea">
		<form:form id="formArea" modelAttribute="userChoose" method="post"
			action="${pageContext.request.contextPath }/index/selectData">
			请选择你要查询的公司：
			<form:select path="company">
				<option />请选择公司
				<form:options items="${companyName }"></form:options>
			</form:select>
			<form:button value="提交">提交</form:button>
		</form:form>
	</div>
	
	<!-- 内容展示区-001 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">公司名称：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyName }</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">法定代表人：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo.companyRepresentative == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo.companyRepresentative }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyRepresentative }</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-002 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">注册资本：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo.companyRegisterAssets == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo.companyRegisterAssets }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyRegisterAssets }&nbsp;万元</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">成立时间：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyRegisterDate_string }</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-003 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">公司行业：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyYield }</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">主营任务：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyBusiness }</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-004 -->
	<div class="mainDiv" id="graphArea">
		<!-- 根据查询情况输出结果 -->
		<c:choose>
			<c:when test="${sessionScope.companyInfo == null }">
				<p class="subResultTitle">图形展示区：</p>
				<p class="subTipContent">当前暂无公司信息</p>
			</c:when>
			<c:when test="${empty sessionScope.companyInfo }">
				<p class="subResultTitle">图形展示区：</p>
				<p class="subTipContent">当前暂无公司信息</p>
			</c:when>
			<c:otherwise>
				<div id="container" style="height: 300px"></div>
			</c:otherwise>
		</c:choose>
	</div>

	<!-- 内容展示区-005 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">年均营收复合增长率：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent"><fmt:formatNumber type="number" value="${sessionScope.companyInfo.compositeRate * 100}" maxFractionDigits="2"/> %</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">发明专利数量：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyResult == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyResult }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyResult.inventorNum } &nbsp;个</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-006 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">研发项目数量：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyResult == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyResult }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyResult.developNum}&nbsp;个</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">重要奖项：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyResult == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyResult }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyResult.priceNum }&nbsp;个</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-007 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">行业背景：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyResult == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyResult }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent" id="yieldContent">${sessionScope.companyResult.yieldBackground}</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">风险名称：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyRiskList == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyRiskList }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<ul class="riskList">
						<!-- 循环输出风险列表 -->
						<c:forEach items="${sessionScope.companyRiskList }" var="aRisk" varStatus="aRiskStatus">
							<li><a href=javascript:void(0); onclick = "getRiskSummary('${aRisk.riskName}')">${aRisk.riskName }</a></li>
						</c:forEach>
					</ul>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
	
	<!-- 内容展示区-008 -->
	<div class="mainDiv">
		<div class="firstDiv">
			<p class="subResultTitle">公司评分：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent">${sessionScope.companyInfo.companyScore}&nbsp;分</p>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="secondDiv">
			<p class="subResultTitle">推荐等级：</p>
			<!-- 根据查询情况输出结果 -->
			<c:choose>
				<c:when test="${sessionScope.companyInfo == null }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:when test="${empty sessionScope.companyInfo }">
					<p class="subTipContent">当前暂无公司信息</p>
				</c:when>
				<c:otherwise>
					<p class="subResultContent" style="color:red;">${sessionScope.companyInfo.finalLevel }</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
<script type="text/javascript">
	
	function getRiskSummary(riskName) {
		var riskName = riskName;
		console.log("riskName" + riskName);
		
		$.ajax({
			//请求类型
			type: "post",
			//请求路径
			url: "${pageContext.request.contextPath}/index/readRiskSummary",
			//返回的数据类型
			dataType: "json",
			//发送的数据
			data:JSON.stringify({riskName: riskName}),
			//定义发送的数据格式为json
			contentType: "application/json; charset=utf-8",
			success: function(data){
				console.log(data);
				
				//获取数据
				var riskSummary = data.riskSummary;
				
				//定义返回的内容
				var contentHtml = "<h2>风险详情</h2>" + "<h4>风险名称：</h4><p>" + riskName + "</p><h4>风险摘要：</h4><p>" + riskSummary + "</p>";
				layer.open({
					type:1,
					title: '风险详细信息',
					area: ['600px', '400px'],
					content: contentHtml
				});
			}
			
		})
	}
	
	//Echarts部分
	//获取数据展示容器
	var dom = document.getElementById("container");
	
	//初始化Echarts
	var myChart = echarts.init(dom);
	var app = {};
	option = null;

	//初始数据
	var dataset = [
		[ 'product', '2018', '2017', '2016' ]
	];
	var dataXaxis = [];

	//创建Echarts选项
	option = {
		title : {
			text : '财务数据展示',
			subtext : '数据来源于各大公司的上市保荐书和审计报告'
		},
		legend : {},
		tooltip : {},
		toolbox: {
	        show : true,
	        feature : {
	            dataView : {show: false, readOnly: false},
	            magicType : {show: true, type: ['line', 'bar']},
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
		dataset : {
			source : dataset
		},
		xAxis : {
			type : 'category',
			data : dataXaxis
		},
		yAxis : {},
		series : [
			{type : 'bar'}, 
			{type : 'bar'}, 
			{type : 'bar'} 
			]
	};
	
	//初始化Echarts
	if (option && typeof option === "object") {
		myChart.setOption(option, true);
	}
	
	//绘图
	function displayData(myEcharts) {
		myEcharts.setOption({
			dataset : {
				source : dataset
			},
			xAxis : {
				type : 'category',
				data : dataXaxis
			},
		});
		console.log("Echarts设置完成！");
	}
	//读取数据
	function readData(myEcharts) {
		$.ajax({
			//请求路径
			url: "${pageContext.request.contextPath}/index/readGraph",
			//请求类型
			type: "post",
			//返回的数据类型
			dataType: "json",
			success:function(data){
				console.log(data);
				
				//创建6个数组作为最里层的数组
				var subDataset001 = new Array();
				var subDataset002 = new Array();
				var subDataset003 = new Array();
				var subDataset004 = new Array();
				var subDataset005 = new Array();
				var subDataset006 = new Array();
				
				//开始给数据赋值，并取出销售净利率
				subDataset001[0] = '销售净利率';
				subDataset001[1] = Math.round(data.shopRate_2018 * 10000) / 100;
				subDataset001[2] = Math.round(data.shopRate_2017 * 10000) / 100;
				subDataset001[3] = Math.round(data.shopRate_2016 * 10000) / 100;
				//保存到dataset中
				dataset[1] = subDataset001;
				//测试
				console.log("1.dataset: " + dataset);
				
				//开始给数据赋值，并取出总资产周转率
				subDataset002[0] = '总资产周转率';
				subDataset002[1] = Math.round(data.totalAssetsCircleRate_2018 * 10000) / 100;
				subDataset002[2] = Math.round(data.totalAssetsCircleRate_2017 * 10000) / 100;
				subDataset002[3] = Math.round(data.totalAssetsCircleRate_2016 * 10000) / 100;
				//保存到dataset中
				dataset[2] = subDataset002;
				//测试
				console.log("2.dataset: " + dataset);
				
				//开始给数据赋值，并取出资产净利率
				subDataset003[0] = '资产净利率';
				subDataset003[1] = Math.round(data.assetsRate_2018 * 10000) / 100;
				subDataset003[2] = Math.round(data.assetsRate_2017 * 10000) / 100;
				subDataset003[3] = Math.round(data.assetsRate_2016 * 10000) / 100;
				//保存到dataset中
				dataset[3] = subDataset003;
				//测试
				console.log("3.dataset: " + dataset);
				
				//开始给数据赋值，并取出资产负债率
				subDataset004[0] = '资产负债率';
				subDataset004[1] = Math.round(data.assetsLiabilityRate_2018 * 10000) / 100;
				subDataset004[2] = Math.round(data.assetsLiabilityRate_2017 * 10000) / 100;
				subDataset004[3] = Math.round(data.assetsLiabilityRate_2016 * 10000) / 100;
				//保存到dataset中
				dataset[4] = subDataset004;
				//测试
				console.log("4.dataset: " + dataset);
				
				//开始给数据赋值，并取出权益乘数
				subDataset005[0] = '权益乘数';
				subDataset005[1] = Math.round(data.equityMultiplier_2018 * 10000) / 100;
				subDataset005[2] = Math.round(data.equityMultiplier_2017 * 10000) / 100;
				subDataset005[3] = Math.round(data.equityMultiplier_2016 * 10000) / 100;
				//保存到dataset中
				dataset[5] = subDataset005;
				//测试
				console.log("5.dataset: " + dataset);
				
				//开始给数据赋值，并取出净资产收益率
				subDataset006[0] = '净资产收益率';
				subDataset006[1] = Math.round(data.roe_2018 * 10000) / 100;
				subDataset006[2] = Math.round(data.roe_2017 * 10000) / 100;
				subDataset006[3] = Math.round(data.roe_2016 * 10000) / 100;
				//保存到dataset中
				dataset[6] = subDataset006;
				//测试
				console.log("6.dataset: " + dataset);
				
				//给X轴的标签数据赋值
				dataXaxis = ['销售净利率', '总资产周转率', '资产净利率', '资产负债率', '权益乘数', '净资产收益率'];

				//开始绘图
				console.log("绘制图形开始！");
				displayData(myEcharts);
			}
		});
	}
	
	readData(myChart);
</script>
</html>