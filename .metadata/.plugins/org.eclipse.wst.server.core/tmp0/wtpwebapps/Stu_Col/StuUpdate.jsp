<%@page import="java.awt.Window"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>信息修改</title>
</head>
<body background="image/3.jpg">
<center>
	<p><font size=5><b>信息修改</b></font>
	<font size=4>
	<form action="StuUpdate_1.jsp" method=post id="form">
		<br><br>
		输入你的学号：<input type="text" name="UserId" id="UserId" value=""><br>
		输入你的密码：<input type="text" name="UserPwd" id="UserPwd" value=""><br>
		输入你的姓名：<input type="text" name="UserName" id="UserName" value=""><br>
		输入你的年龄：<input type="text" name="UserAge" id="UserAge" value=""><br>
		输入你的班级：<input type="text" name="UserClass" id="UserClass" value=""><br>
		<p></p><input type="button" name="b" value="更新" onclick="Check()"/>
	<br>
	<%
		String xg=(String)session.getAttribute("xiugai1");
		if(xg==null) 
			xg="";
		
	%>
	<br><br>
	<p><font size=4 color=red><%=xg %></font>
	
</center>

</body>
</html>

<script language="javascript">
	function Check()
	{
		var form=document.getElementById("form");
		var id=document.getElementById("UserId").value;
		var pwd=document.getElementById("UserPwd").value;
		var name=document.getElementById("UserName").value;
		var age=document.getElementById("UserAge").value;
		var classes=document.getElementById("UserClass").value;
		if(id==""||pwd==""||name==""||age==""||classes=="")
			{
				window.alert("有未填项");
			}
		else
			form.submit();
	}
</script>