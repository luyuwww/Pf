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
       	<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
        <script type="text/javascript">
	        $(document).ready(function() {
	        	$('input[name=oldps]').focus();
	        	//打印后台信息
	        	if('${returnMsg}'!=""){
	        		alert('${returnMsg}');
	        		$('input[name=oldps]').focus();
	        	}
	        	
	        	$('input[name=newps2]').keypress(function(e) {
	        		if (e.which == 13)
	        			gotoSubmit();
	        	});
	        });
			function gotoSubmit(){
				if(gotoFocus($('input[name=oldps]'))){
					alert("密码不可以为空,请输入");
					$('input[name=oldps]').focus();
					return
				}
				if(gotoFocus($('input[name=newps1]'))){
					alert("新密码不可以为空,请输入");
					$('input[name=newps1]').focus();
					return
				}
				if(gotoFocus($('input[name=newps2]'))){
					alert("确认的密码不可以为空,请输入");
					$('input[name=newps2]').focus();
					return
				}
				var oldps = $('input[name=oldps]').val();
				var newps1 = $('input[name=newps1]').val();
				var newps2 = $('input[name=newps2]').val();
				if(newps1 != newps2){
					alert("二次密码不同请重新输入");
					$('input[name=newps2]').val("");
					$('input[name=newps2]').focus();
					return;
				}
				$("form").submit();
			}
			
			function gotoFocus(ele){
				if(ele.val() == ""){
					return true;
				}else{
					return false;
				}
				
			}
		</script>
	</head>
	<body>
		<form action="submitPasword" method="post">
			<div class="container">
				<h2>修改密码: ${user.uusername}</h2>
				<br>
				老密码: <input name="oldps" id="oldps" type="password"/><br>
				新密码: <input name="newps1" id="newps1" type="password"/><br>
				再输入: <input name="newps2" id="newps2" type="password"/><br><br>
				<a class="btn btn-lg btn-success" onclick="gotoSubmit()">提交</a>
				<a class="btn btn-lg btn-info" href="${pageContext.request.contextPath}/goto2Button">返回</a>
			</div>
			</div>
		</form>
	</body>
</html>
