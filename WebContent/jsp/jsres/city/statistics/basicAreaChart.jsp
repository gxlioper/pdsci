<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>江苏省住院医师规范化培训管理平台</title>
<jsp:include page="/jsp/jsres/htmlhead-jsres.jsp">
	<jsp:param name="basic" value="true"/>
	<jsp:param name="jbox" value="true"/>
	<jsp:param name="font" value="true"/>
</jsp:include>
<script type="text/javascript">
</script>
</head>

<body>
<div class="main_bd">
	<div class="div_search">
		专业：<select class="select" style="width: 106px;">
		    	<option selected="selected" value="0">全部</option>
	    	</select>&#12288;
	    基地获批文号：<select class="select">
		    		<option selected="selected" value="0">第一批(苏卫科教[2008]18号)</option>
		    		<option selected="selected" value="0">第二批(苏卫科教[2008]28号)</option>
		    		<option selected="selected" value="0">第三批(苏卫科教[2011]1号)</option>
		    		<option selected="selected" value="0">第四批(苏卫科教[2012]8号)</option>
		    		<option selected="selected" value="0">第五批(苏卫科教[2012]13号)</option>
		    		<option selected="selected" value="0">第六批(苏卫科教[2013]26号)</option>
		    		<option selected="selected" value="0">第七批(苏卫科教[2014]16号)</option>
		    		<option selected="selected" value="0">其他</option>
		    		<option selected="selected" value="0">无</option>
	    		</select>
	    &#12288;<input class="btn_green" type="button" value="查询"/>
	</div>
	<div class="search_table">
        <img src="<s:url value='/jsp/jsres/province/statistics/basicAreaChart.bmp'/>" />
	</div>
</div>
</body>
</html>