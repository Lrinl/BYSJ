<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="Stu.Test" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<%
		String number=new String(request.getParameter("number").getBytes("iso-8859-1"),"utf-8");
		if(number==null)
			number="";
		Test t=new Test();
		ResultSet shu=t.query(number);
		if(shu==null) session.setAttribute("rs","null");
		else session.setAttribute("rs", shu);
		response.sendRedirect("query_1_1.jsp");		
	%>

</body>
</html>