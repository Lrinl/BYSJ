<%@page import="java.awt.event.WindowStateListener"%>
<%@page import="java.awt.Window"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>删除成绩</title>

</head>
<style>
thead, tr {
border-top-width: 1px;
border-top-style: solid;
border-top-color: #a8bfde;
}
table{
border-bottom-width: 1px;
border-bottom-style: solid;
border-bottom-color: #a8bfde;
}
td,th {
padding: 5px 10px;
font-size: 12px;
font-family: Verdana;
color: #5b7da3;
}

tr{
background: #d3dfed
}tr{
background: #FFF
}
</style>

<body background="image/4.jpg">
<center>
	
	<form action="display_1.jsp" method=post>
		<input type="submit" name="a" value="显示所有学生信息">
	</form>
	<% 
	String number=null;
	String name=null;
	String classes=null;
	String term=null;
	float math,english,sql,java,test,total;
	Connection con=(Connection)session.getAttribute("con");
	ResultSet rs=(ResultSet)session.getAttribute("rs");
	
	out.print("<br>");
	out.print("<br>");
	out.print("<Table>");
	out.print("<TR>");
	out.print("<TH width=100>"+"学号"+"</th>");
	out.print("<TH width=100>"+"姓名"+"</th>");
	out.print("<TH width=100>"+"班级"+"</th>");
	out.print("<TH width=100>"+"数学"+"</th>");
	out.print("<TH width=100>"+"数据库"+"</th>");
	out.print("<TH width=100>"+"英语"+"</th>");
	out.print("<TH width=100>"+"JAVA"+"</th>");
	out.print("<TH width=100>"+"软件测试"+"</th>");
	out.print("<TH width=100>"+"学期"+"</th>");
	out.print("<TH width=100>"+"总分"+"</th>");
	out.print("</TR>");
	if(rs!=null){
		
		while(rs.next()){
			out.print("<TR>");
			number=rs.getString(1);
			name=rs.getString(2);
			classes=rs.getString(3);
			math=rs.getInt(4);
			sql=rs.getInt(5);
			english=rs.getInt(6);
			java=rs.getInt(7);
			test=rs.getInt(8);
			term=rs.getString(9);
			total=math+sql+sql+english+java+test;
			out.print("<TD align='center'>"+number+"</TD>");
			out.print("<TD align='center'>"+name+"</TD>");
			out.print("<TD align='center'>"+classes+"</TD>");
			out.print("<TD align='center'>"+math+"</TD>");
			out.print("<TD align='center'>"+sql+"</TD>");
			out.print("<TD align='center'>"+english+"</TD>");
			out.print("<TD align='center'>"+java+"</TD>");
			out.print("<TD align='center'>"+test+"</TD>");
			out.print("<TD align='center'>"+term+"</TD>");
			out.print("<TD align='center'>"+total+"</TD>");
			out.print("</TR>");
		}
		
	}
	
	out.print("</Table>");
	%>
	</font>
	</center>
</body>
</html>
<script language="javascript">
function datacheck(){
	var form=document.getElementById("form");
	if(delform.number.value==""){
		window.alert("您必须输入学号!");
		document.getElementById("numberId").focus();
		return;
	}
	else
		form.submit();
	
}
</script>