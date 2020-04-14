<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="Stu.Test"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<font size=3>
<%
	String number=new String(request.getParameter("number").getBytes("iso-8859-1"),"utf-8");
	if(number==null) number="";
	String math=request.getParameter("math");
	if(math==null) math="0";
	String sql=request.getParameter("sql");
	if(sql==null) sql="0";
	String english=request.getParameter("english");
	if(english==null) english="0";
	String java=request.getParameter("java");
	if(java==null) java="0";
	String test=request.getParameter("test");
	if(test==null) test="0";
	String term=new String(request.getParameter("term").getBytes("iso-8859-1"),"utf-8");
	if(term==null) term="";
	Test t=new Test();
	if(t.insert(number, math, english,english, java, test,term)) 
		session.setAttribute("tianjia", "成功");
	else
		session.setAttribute("tianjia", "失败,请重新录入信息");
	response.sendRedirect("append_1.jsp");
%>
</font>
</body>
</html>