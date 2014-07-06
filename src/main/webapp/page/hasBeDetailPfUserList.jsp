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
			<table class="table table-striped table-bordered table-condensed">
				  <div class="page-header">
				    <h1>${beoperuser.uusername} 被考核详情：总分(<a id="totalCount">${totalCount}</a>)<small>双击可以修改成绩</small></h1>
				  </div>
				<thead>
					<tr>
						<th>#</th>
						<th width="1000">考核项</th>
						<th>分/修改</th>
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
							<td width="1000">${theGrade.themean}</td>
							<td ondblclick="changeComonbox(this,${theGrade.did} , ${theGrade.thecount} ,'${theGrade.themean}')">${theGrade.thecount} </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div align="left">
				<a class="btn btn-lg" href="${pageContext.request.contextPath}/goto2Button">返回</a>
			</div>
		</div>
	</body>
	<script type="text/javascript">
		$.ajaxSetup({cache: false });
		function changeComonbox(obj , did , val , tmean){
			var i= 0.0;
			var max = getMax(tmean);
			var selVal = "<select theMean='14' onchange='gotoUpdate(this , this.value , "+did+" , "+val+")'>";
			while(i <= max ){
				if(val == i){
					selVal = selVal + ("<option value="+ i+" selected>"+i+"</option>");
					
				}else{
					selVal = selVal + ("<option value="+ i+">"+i+"</option>");
				}
				i = i + 0.5;
			}
			selVal = selVal + ("</select>");
			obj.innerHTML = selVal;
		}
		function gotoUpdate(sel , selVal , did , val){
		    $.ajax({url: 		"${pageContext.request.contextPath}/changeGrade?did="+did+"&updateVal="+selVal ,
		    		success: 	function(data){
		        					if(data != ""){
			        					$("#totalCount").html(data);
		        					}
		        					sel.parentNode.innerHTML = selVal;
		    					}
		    });
			//window.location.reload();
		}
		
		function getMax(val){
			var maxGrad = 10;
			if(val == '1.是否重视加强自身思想政治建设。认真学习贯彻中国特色社会主义理论体系，自觉同党中央保持高度一致，执行党的路线、方针、政策。维护企业平安稳定大局，落实公司党政决策部署态度坚决'){
				 maxGrad = 3;
			}else if(val == '2.是否坚持自我学习，注重加强思想政治和岗位相关专业知识的学习，不断提高理论素养'){
				 maxGrad = 4;
			}else if(val == '3.是否具备大局观念，把对本单位负责与对国家、对企业负责统一起来'){
				 maxGrad = 3;
			}else if(val == '1.是否严格遵守工作制度，忠于职守、坚守岗位，有效利用工作时间'){
				 maxGrad = 6;
			}else if(val == '2.是否对工作持积极态度'){
				 maxGrad = 4;
			}else if(val == '1.目标导向。是否严格遵照工作要求和上级指示，始终以达成工作目标为唯一目的'){
				 maxGrad = 4;
			}else	if(val == '2.责任感。是否敢于承担责任，对工作负责'){
				 maxGrad = 10;
			}else	if(val == '3.投入程度。是否全力投入工作，积极主动解决问题'){
				 maxGrad = 6;
			}else	if(val == '1.指是否善于与他人合作共事，相互支持，充分发挥各自的优势，保持良好的团队工作氛围'){
				 maxGrad = 10;
			}else	if(val == '1.专业知识。指对本专业理论知识的掌握情况，工作中遇到问题是否可以提出独立见解'){
				 maxGrad = 10;
			}else	if(val == '2.实务技能。指对工作所需实务技能的掌握程度，能否满足工作需要及对他人提供帮助'){
				 maxGrad = 10;
			}else	if(val == '1.准确性。指是否能够按照计划严格执行，并确保在每个细节上减少差错'){
				 maxGrad = 10;
			}else if(val == '2.工作效率。指对时间和资源的利用是否充分以及工作进度能否满足要求'){
				 maxGrad = 10;
			}else	if(val == '1.是否遵守廉洁从业工作纪律，依法合规开展工作，严格执行公司各项规章制度'){
				 maxGrad = 10;
			}else{
				 maxGrad = 10;
			}
			return maxGrad;
		}
	</script>
</html>
