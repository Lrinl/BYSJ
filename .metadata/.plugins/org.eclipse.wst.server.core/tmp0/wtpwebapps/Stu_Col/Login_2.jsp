<%@ page contentType="text/html; charset=GB2312" import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%@ page import="Stu.Test" %>


<%
	String UserNm =request.getParameter("userId");
	String UserPasswd =request.getParameter("userPwd");
	if(UserNm ==null||UserPasswd==null) response.sendRedirect("Index.html");
	Test t=new Test();
	String strCheckLogin =t.PtLogin(UserNm,UserPasswd);
	if (strCheckLogin.equals("成功登入"))
	{
		session.setAttribute("UserNm",UserNm);
		session.setAttribute("UserPasswd",UserPasswd);
		response.sendRedirect("Login_Success_2.html");
	}
%>

<html>
<head>
<title>
</title>
</head>
<body>
<center>
</center>
<hr>
<Center>
	<%=strCheckLogin %>
	<p></p>
	<script language="javascript">
		window.alert("用户名或者密码错误!");
		window.location.href='Index.html';
	</script>
	
</Center>
</body>
</html>