<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>开始评分</title>
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/bootstrap-3.0.3-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/res/js/self/grid.css" rel="stylesheet">
    
    <link href="${pageContext.request.contextPath}/res/img/login/login.css" rel="stylesheet" type="text/css" />
	<script src="${pageContext.request.contextPath}/res/js/jquery1.10.2/jquery-1.10.2.min.js" type="text/javascript"></script> 
	<script src="${pageContext.request.contextPath}/res/js/jquery.json-2.4.js" type="text/javascript"></script> 
</head>
<script type="text/javascript">
$(function(){
	$("select").change(function(){
	   var totleGrade = 0;
	   var objDetail = {};
	   $("select").each(function(){
		    objDetail[$(this).attr("theMean")] = $(this).val();
        	totleGrade+=new Number($(this).val());
	    });
	   $("#grade").val(totleGrade);
	   $("#pfDetail").val($.toJSON(objDetail));
	   $("#totalGradeTD").html(totleGrade);
	});
});

function gotoSubmit(){
	$("form").submit();
}
</script>

<body>
<div align="center">
	<h2>个人绩效考核责任打分表</h2>
	被考核人：${boperuserdept.dname}-${boperuser.uusername}  (考核期：${kaoheqi}) 考核人：${operuser.uusername}
	<table cellspacing="0" cellpadding="0" border="1">
	  <col width="93" />
	  <col width="790" />
	  <col width="72" />
	  <col width="93" />
	  <tr height="33">
	    <td height="33" width="176">考核指标</td>
	    <td width="733">指标含义</td>
	    <td width="129">满分</td>
	    <td width="153">实际得分</td>
	  </tr>
	  <tr height="60">
	    <td rowspan="3" height="140" width="176">政治素质</td>
	    <td width="733">1.是否重视加强自身思想政治建设。认真学习贯彻中国特色社会主义理论体系，自觉同党中央保持高度一致，执行党的路线、方针、政策。维护企业平安稳定大局，落实公司党政决策部署态度坚决</td>
	    <td width="129">3分</td>
	    <td width="153">
	    	<select theMean="1">
	    	  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			</select>
		</td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">2.是否坚持自我学习，注重加强思想政治和岗位相关专业知识的学习，不断提高理论素养</td>
	    <td width="129">4分</td>
	    <td width="153">
	   		<select theMean="2">
	   		  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">3.是否具备大局观念，把对本单位负责与对国家、对企业负责统一起来</td>
	    <td width="129">3分</td>
	    <td width="153">
			<select theMean="3">
		      <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			</select>
		</td>
	  </tr>
	  <tr height="33">
	    <td rowspan="2" height="66" width="176">敬业精神</td>
	    <td width="733">1.是否严格遵守工作制度，忠于职守、坚守岗位，有效利用工作时间</td>
	    <td width="129">6分</td>
	    <td width="153">
	    	<select theMean="4">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">2.是否对工作持积极态度</td>
	    <td width="129">4分</td>
	    <td width="153">
	    	<select theMean="5">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td rowspan="3" height="99" width="176">执行力</td>
	    <td width="733">1.目标导向。是否严格遵照工作要求和上级指示，始终以达成工作目标为唯一目的</td>
	    <td width="129">4分</td>
	    <td width="153">
	    	<select theMean="6">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">2.责任感。是否敢于承担责任，对工作负责</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="7">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">3.投入程度。是否全力投入工作，积极主动解决问题</td>
	    <td width="129">6分</td>
	    <td width="153">
	    	<select theMean="8">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="176">团结协作</td>
	    <td width="733">1.指是否善于与他人合作共事，相互支持，充分发挥各自的优势，保持良好的团队工作氛围</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="9">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td rowspan="2" height="66" width="176">知识技能</td>
	    <td width="733">1.专业知识。指对本专业理论知识的掌握情况，工作中遇到问题是否可以提出独立见解</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="10">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">2.实务技能。指对工作所需实务技能的掌握程度，能否满足工作需要及对他人提供帮助</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="11">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td rowspan="2" height="66" width="176">工作业绩</td>
	    <td width="733">1.准确性。指是否能够按照计划严格执行，并确保在每个细节上减少差错</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="12">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="733">2.工作效率。指对时间和资源的利用是否充分以及工作进度能否满足要求</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="13">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="33">
	    <td height="33" width="176">廉洁从业</td>
	    <td width="733">1.是否遵守廉洁从业工作纪律，依法合规开展工作，严格执行公司各项规章制度</td>
	    <td width="129">10分</td>
	    <td width="153">
	    	<select theMean="14">
			  <option value="0.0">0</option>
			  <option value="0.5">0.5</option>
			  <option value="1.0">1</option>
			  <option value="1.5">1.5</option>
			  <option value="2.0">2</option>
			  <option value="2.5">2.5</option>
			  <option value="3.0">3</option>
			  <option value="3.5">3.5</option>
			  <option value="4.0">4</option>
			  <option value="4.5">4.5</option>
			  <option value="5.0">5</option>
			  <option value="5.5">5.5</option>
			  <option value="6.0">6</option>
			  <option value="6.5">6.5</option>
			  <option value="7.0">7</option>
			  <option value="7.5">7.5</option>
			  <option value="8.0">8</option>
			  <option value="8.5">8.5</option>
			  <option value="9.0">9</option>
			  <option value="9.5">9.5</option>
			  <option value="10.0">10</option>
			</select>
	    </td>
	  </tr>
	  <tr height="26">
	    <td height="26" width="176">总分</td>
	    <td colspan="3" id="totalGradeTD">0.0</td>
	  </tr>
	</table>
	<p align="center">
	<form action="savePf" method="post">
		<input name="grade" id="grade" type="hidden" value="0.0"/>
		<input name="bPfUserDid" id="bPfUserDid" type="hidden" value="${boperuser.did}"/>
		<input name="pfDetail" id="pfDetail" type="hidden" value=""/>
		<a class="btn btn-lg btn-success" onclick="gotoSubmit()">提交</a>
	</form>
	</p>
</div>
</body>
</html>

