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
		$("a").mouseenter(function(){
			//使用load方法进行处理Ajax
			var url=this.href;
			var args={"time":new Date()};
			$("#content").load(url,args);
			//取消默认行为
			return false;
		});
	});
</script>
<a href="helloAjax.txt">HelloAjax</a>
<div id="content">
	<!--把结果直接放在此处-->
</div>

</body>
</html>