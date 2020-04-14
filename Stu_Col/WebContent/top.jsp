<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String Name =(String)session.getAttribute("UserNm");
	if(Name==null)
	{
		response.sendRedirect("Index.html");
	}
%>

<html>
<head>
<title>成绩管理</title>
</head>
<style>
.div1 {
	width: 100%;
	max-width: 600px;
	height: 400px;
	position: absolute;
    
	left: 50%;
	margin-left: -300px;
        }
 
a{
text-decoration:none;
color:white;
}
</style>
<body background="image/2.jpg">
<center>
	<div class="div1">
	<div><font size=7>学生成绩管理系统</font></div>

	<div>
      <p align="right"><font size=3 color=white>欢迎您使用：<%=Name %></font>      </p>
      <p align="right">
        <a href="Index.html" title="安全退出"  target="_top">登出</a>
      </p>
    </div>
    </div>
	
</center>
</body>
</html>