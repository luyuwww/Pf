<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>已被您评分用户列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>已被您评分用户列表</h2>
			<c:forEach var="user" items="${hasBePfUserList}" varStatus="count">
				<div class="row">
					<div class="col-md-1">${count.index+1}</div>
					<div class="col-md-4">${user.boperusername}</div>
					<div class="col-md-1">${user.taccount}</div>
				</div>
			</c:forEach>
			<a class="btn btn-lg" href="${pageContext.request.contextPath}/goto2Button">返回</a>
		</div>
	</body>
</html>
