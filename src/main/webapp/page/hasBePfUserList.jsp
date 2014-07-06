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
			<div align="center">
				 <h2>被你打过分的人</h2>
				 <br>
			</div>
			<table class="table table-hover">
				<thead>
					<tr>
						<th>#</th>
						<th>被打分人</th>
						<th>总分</th>
						<th>预览</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${hasBePfUserList}" varStatus="count">
      					<c:choose>
	      					<c:when test="${(count.index) mod 2 == 0 }">
	      						<tr>
	      					</c:when>
	      					<c:otherwise>
	      						<tr class="active">
	      					</c:otherwise>
      					</c:choose>
						<td>${count.index+1}</td>
						<td>${user.boperusername}</td>
						<td>${user.taccount}</td>
						<td><a href="${pageContext.request.contextPath}/gotoViewHasBeDetail?boperusercode=${user.boperusercode}&totalCount=${user.taccount}">预览</a></td>
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
