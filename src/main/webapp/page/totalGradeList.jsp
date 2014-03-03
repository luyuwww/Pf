<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>查看用户成绩列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/img/login/login.css" rel="stylesheet" type="text/css" />
		<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<div class="container">
			<h2>所有用户列表</h2>
			<div class="row">
				<div class="col-md-1">序号</div>
				<div class="col-md-2">用户姓名</div>
				<div class="col-md-2">用户code</div>
				<div class="col-md-1">用户分数</div>
			</div>
			<c:forEach var="user" items="${totalGradeList}" varStatus="count">
				<div class="row">
					<div class="col-md-1">${count.index+1}</div>
					<div class="col-md-2">${user.boperusername}</div>
					<div class="col-md-2">${user.boperusercode}</div>
					<div class="col-md-1">${user.taccount}</div>
				</div>
			</c:forEach>
		</div>
	</body>
</html>
