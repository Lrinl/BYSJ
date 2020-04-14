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
		
		String classes=new String(request.getParameter("classes").getBytes("iso-8859-1"),"utf-8");
		if(classes==null)
			classes="";
		Test t=new Test();
		ResultSet cu=t.classes(classes);
		if(cu==null) session.setAttribute("cs","null");
		else session.setAttribute("cs", cu);
		response.sendRedirect("query_1.jsp");		
	%>

</body>
</html>