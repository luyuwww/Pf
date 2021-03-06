<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>日志列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>你共需打分(${want2pfTotalNum}) 人</h2>
			<br>
			<a class="btn btn-lg btn-success"
				href="${pageContext.request.contextPath}/viewHasPF">查看已评分(${haspfnum})</a>
			<a class="btn btn-lg btn-danger"
	 			href="${pageContext.request.contextPath}/viewWant2PF">你还需评分(${want2pfTotalNum-haspfnum})</a>
	 		<c:if test="${currntUserCode == 'ROOT'}"><!-- root才可以查看所有 -->
	 			<br><br>
				<a class="btn btn-lg btn-warning"
		 			href="${pageContext.request.contextPath}/viewAllGrade">查看所有用户分数</a>
	 		</c:if>
	 		<br>
	 		<br>
			<a class="btn btn-lg" href="${pageContext.request.contextPath}/logon">登出</a>
			<a class="btn btn-lg" href="${pageContext.request.contextPath}/updatePassword">修改密码</a>
		</div>
	</body>
</html>
