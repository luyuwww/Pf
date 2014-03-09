<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>等待您评分用户列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/img/login/login.css" rel="stylesheet" type="text/css" />
		<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
		<script type="text/javascript">
			$(document).ready(function() {
				//打印后台信息
				if('${returnMsg}'!=""){
					alert('${returnMsg}');
				}
				
			});
		</script>
	</head>
	<body>
		<div class="container">
			<h2>等待您评分用户列表</h2>
			<c:forEach var="user" items="${noBePfUserList}" varStatus="count">
				<div class="row">
					<div class="col-md-1">${count.index+1}</div>
					<div class="col-md-4">${user.uusername}</div>
					<div class="col-md-1">
						<a href="/Pf/gotoPf?bePfUserCode=${user.uusercode}&rand=<%=Math.random()%>"> 开始评分</a>
					</div>
				</div>
			</c:forEach>
			<a class="btn btn-lg" href="${pageContext.request.contextPath}/goto2Button">返回</a>
		</div>
	</body>
</html>
