<%@page import="java.awt.Window"%>
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
<font size=3>
<%
	String number=new String(request.getParameter("number").getBytes("iso-8859-1"),"utf-8");
	if(number==null) number="";
	
	String newMath=request.getParameter("math");
	if(newMath==null) newMath="0";
	float math=Float.parseFloat(newMath);
	
	String newsql=request.getParameter("sql");
	if(newsql==null) newsql="0";
	float sql=Float.parseFloat(newsql);
	
	String newenglish=request.getParameter("english");
	if(newenglish==null) newenglish="0";
	float english=Float.parseFloat(newenglish);
	
	String newJava=request.getParameter("java");
	if(newJava==null) newJava="0";
	float java=Float.parseFloat(newJava);
	
	String newsoftTest=request.getParameter("softTest");
	if(newsoftTest==null) newsoftTest="0";
	float softTest=Float.parseFloat(newsoftTest);
	
	String term=new String(request.getParameter("term").getBytes("iso-8859-1"),"utf-8");
	Test t=new Test();
	String del=t.update(number, math, sql, english, java,softTest,term);
	if(del.equals("修改成功"))
		session.setAttribute("xiugai", "修改成功");
	else if(del.equals("修改失败")) 
		session.setAttribute("xiugai", "修改失败");
		
	else
		session.setAttribute("xiugai", "没有这个学号");
	response.sendRedirect("update_1.jsp");	
%>
</font>
</body>
</html>