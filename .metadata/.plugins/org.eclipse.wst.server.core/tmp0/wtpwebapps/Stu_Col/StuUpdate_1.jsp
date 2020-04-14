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
	String UserId=new String(request.getParameter("UserId").getBytes("iso-8859-1"),"utf-8");
	if(UserId==null) UserId="";
	String UserPwd=new String(request.getParameter("UserPwd").getBytes("iso-8859-1"),"utf-8");
	if(UserPwd==null) UserPwd="";
	String UserName=new String(request.getParameter("UserName").getBytes("iso-8859-1"),"utf-8");
	if(UserName==null) UserName="";
	String UserAge=new String(request.getParameter("UserAge").getBytes("iso-8859-1"),"utf-8");
	if(UserAge==null) UserAge="";
	String UserClass=new String(request.getParameter("UserClass").getBytes("iso-8859-1"),"utf-8");
	if(UserClass==null) UserClass="";
	
	Test t=new Test();
	String del=t.StuUpdate(UserId,UserPwd,UserName,UserAge,UserClass);
	if(del.equals("修改成功"))
		session.setAttribute("xiugai1", "修改成功");
	else if(del.equals("修改失败")) 
		session.setAttribute("xiugai1", "修改失败");
	else 
		session.setAttribute("xiugai1", "请确认学号和密码匹配");
	response.sendRedirect("StuUpdate.jsp");	
%>
</font>
</body>
</html>