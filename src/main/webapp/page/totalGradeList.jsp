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
			<div align="center">
				 <h2>神华工程公司${kaoheqi}绩效考核成绩</h2>
				 <br>
			</div>
			<table class="table table-striped table-bordered table-condensed text-center">
				<thead>
					<tr>
						<th class="text-center">#</th>
						<th class="text-center">部门</th>
						<th class="text-center">姓名</th>
						<th colspan="2" class="text-center">正职人员</th>
						<th colspan="3" class="text-center">副职人员</th>
						<th colspan="2" class="text-center">内设部门管理人员</th>
						<th colspan="3" class="text-center">普通人员</th>
						<th colspan="3" class="text-center">所有人</th>
					</tr>
					<tr>
						<th></th>
						<th></th>
						<th class="text-center">(被考核)</th>
						
						<th class="text-center">人数</th>
						<th class="text-center">总分</th>
						
						<th class="text-center">人数</th>
						<th class="text-center">平均分</th>
						<th class="text-center">总分</th>

						<th class="text-center">人数</th>
						<th class="text-center">总分</th>
						

						<th class="text-center">人数</th>
						<th class="text-center">平均分</th>
						<th class="text-center">总分</th>
						
						<th class="text-center">人数</th>
						<th class="text-center">平均分</th>
						<th class="text-center">总分</th>
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
						<td>${tGrade.zzCount}</td>
						
						<td>${tGrade.fzPersons}</td>
						<td>${tGrade.fzAverage}</td>
						<td>${tGrade.fzCount}</td>
						
						<td>${tGrade.zsbmMgrPersons}</td>
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
				<a class="btn btn-lg" href="${pageContext.request.contextPath}/logon">登出</a>
			</div>
			<div align="right">
				<a class="btn btn-lg btn-warning"
					href="${pageContext.request.contextPath}/getXlsFile">导出Excel</a>
			</div>
		</div>
	</body>
</html>
