<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>查看用户得分列表</title>
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
	    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<table class="table table-hover" border="1">
				<caption class="table thumbnail" >
					<h2>用户得分列表</h2>
				</caption>
				<thead>
					<tr>
						<th></th>
						<th>部门</th>
						<th>姓名</th>
						<th colspan="3">正职人员</th>
						<th colspan="3">副职人员</th>
						<th colspan="3">内设部门管理人员</th>
						<th colspan="3">普通人员</th>
						<th colspan="3">所有人</th>
					</tr>
					<tr>
						<th>#</th>
						<th>(被考核)</th>
						<th>(被考核)</th>
						
						<th>人数</th>
						<th>平均分</th>
						<th>总分</th>
						
						<th>人数</th>
						<th>平均分</th>
						<th>总分</th>

						<th>人数</th>
						<th>平均分</th>
						<th>总分</th>
						

						<th>人数</th>
						<th>平均分</th>
						<th>总分</th>
						
						<th>人数</th>
						<th>平均分</th>
						<th>总分</th>
					</tr>
				</thead>
				<tbody>
						<c:forEach var="tGrade" items="${totalGradeList}" varStatus="count">
      					<c:choose>
	      					<c:when test="${(count.index) mod 2 == 0 }">
	      						<tr>
	      					</c:when>
	      					<c:otherwise>
	      						<tr class="active">
	      					</c:otherwise>
      					</c:choose>
						<td>${count.index+1}</td>
						<td>${tGrade.beOperUserDepName}</td>
						<td>${tGrade.boperusername}</td>
						
						<td>${tGrade.zzPersons}</td>
						<td>${tGrade.zzAverage}</td>
						<td>${tGrade.zzCount}</td>
						
						<td>${tGrade.fzPersons}</td>
						<td>${tGrade.fzAverage}</td>
						<td>${tGrade.fzCount}</td>
						
						<td>${tGrade.zsbmMgrPersons}</td>
						<td>${tGrade.zsbmMgrAverage}</td>
						<td>${tGrade.zsbmMgrCount}</td>
						
						<td>${tGrade.ptryPersons}</td>
						<td>${tGrade.ptryAverage}</td>
						<td>${tGrade.ptryCount}</td>
						
						<td>${tGrade.totalPersons}</td>
						<td>${tGrade.totalAverage}</td>
						<td>${tGrade.totalCount}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div align="left">
				<a class="btn btn-lg" href="${pageContext.request.contextPath}/goto2Button">返回</a>
			</div>
			<div align="right">
				<a class="btn btn-lg btn-warning"
					href="${pageContext.request.contextPath}/getXlsFile">导出Excel</a>
			</div>
		</div>
	</body>
</html>
