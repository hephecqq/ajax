<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
</head>
<body>
<script type="text/javascript">
	$(function(){
		$("a").click(function(){
			var url=this.href;
			var args={"time":new Date()};
//任何一个html节点都可以使用load()方法来加载远程数据，结果直接插入到该HTML节点中
			$("#details").load(this.href);
			return false;
		})
	});
</script>
<h1>People</h1>
<ul>
	<li><a href="files/andy.html">Andy</a></li>
	<li><a href="files/rich.html">Rich</a></li>
	<li><a href="files/jere.html">Jere</a></li>
</ul>
<div id="details">
	
</div>
</body>
</html>