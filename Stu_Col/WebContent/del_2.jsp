<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="Stu.Test"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String number=new String(request.getParameter("number").getBytes("iso-8859-1"),"utf-8");
	number=number.trim();
	if(number==null)
		number="";
	Test t=new Test();
	if(t.del(number).equals("删除成功"))
		session.setAttribute("del", "删除成功");
	else if(t.del(number).equals("删除失败"))
		session.setAttribute("del", "删除失败");
	else
		session.setAttribute("del", "没有这个学号");
	response.sendRedirect("del_1.jsp");
%>
</body>
</html>