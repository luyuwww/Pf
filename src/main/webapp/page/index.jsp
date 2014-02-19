<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>用户登录</title>
<link href="${pageContext.request.contextPath}/res/img/login/login.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
<script type="text/javascript">
$(document).ready(function() {
	//打印后台信息
	if('${returnMsg}'!=""){
		alert('${returnMsg}');
	}
	$("#usercode").focus();
	$("#usercode").keypress(function(e) {
		if (e.which == 13)
			gotoSubmit();
	});
	$("#passwd").keypress(function(e) {
		if (e.which == 13)
			gotoSubmit();
	});
});


String.prototype.Trim = function(){return this.replace(/(^\s*)|(\s*$)/g,"");} 
function aa(){
	document.login.submit(); 
}
function gotoSubmit(){
	var uname = $("#usercode").val().Trim();
	var upwd = $("#passwd").val().Trim();
	if(uname != "" && upwd != ""){
		document.forms[0].submit();
		aa();
	}else{
		alert("用户名密码,不可以为空!");
		return false;
	}
} 
</script>
</head>
<body>

    <div id="login">
	     <div id="top">
		      <div id="top_left"><img src="${pageContext.request.contextPath}/res/img/login/login_03.gif" /></div>
			  <div id="top_center"></div>
		 </div>
		 	<form action="/Pf/login" name="login" method="post">
		 <div id="center">
		      <div id="center_left"></div>
			  <div id="center_middle">
			       <div id="user">用 户
			         <input type="text" name="usercode" id="usercode"/>
			       </div>
				   <div id="password">密   码
				     <input type="password" id="passwd" name="passwd" />
				   </div>
				   <div id="btn"><a href="#" onclick="aa()">登录</a><a href="#">清空</a></div>
			  </div>
			  <div id="center_right"></div>		 
		 </div>
		 	</form>
		 <div id="down">
		      <div id="down_left">
			      <div id="inf">
                       <span class="inf_text">评分中心</span>
			      </div>
			  </div>
			  <div id="down_center"></div>		 
		 </div>

	</div>
</body>
</html>
