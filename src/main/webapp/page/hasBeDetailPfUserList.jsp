<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>评分详细列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/img/login/login.css" rel="stylesheet" type="text/css" />
		<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
	</head>
	<body>
		<div class="container">
			<table class="table table-hover">
				<p class="lead">${beoperuser.uusername} 被考核详情：总分(${totalCount})</p>
				<thead>
					<tr>
						<th>#</th>
						<th>考核项</th>
						<th>分</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="theGrade" items="${hasBePfDetail}" varStatus="count">
	      					<c:choose>
		      					<c:when test="${(count.index) mod 2 == 1 }">
		      						<tr>
		      					</c:when>
		      					<c:otherwise>
		      						<tr class="active">
		      					</c:otherwise>
	      					</c:choose>
							<td>${count.index+1}</td>
							<td>${theGrade.themean}</td>
							<td>${theGrade.thecount} </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div align="left">
				<a class="btn btn-lg" href="${pageContext.request.contextPath}/goto2Button">返回</a>
			</div>
		</div>
	</body>
</html>
