<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>成绩查询</title>
</head>
<STYLE type=text/css>
td{
    FONT-SIZE: 14px; LINE-HEIGHT: 28px;text-align:center
}
 
</STYLE>
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
	<p><font size=5>成绩查询</font>
	<font size=4>
	<tr>
		<td width="93%" height="16">
			<table border="1" width="100%" cellspacing="0" cellpadding="0" >
			<tr>
				<td width="100%" bgcolor="#DBDBDB" colspan="2" ><font color="#ffffff" >请选择查询的方式</font></td>
			</tr>
			<tr>
				<td  bgcolor="#BC8F8F" >
					<form method="post" action="query_2.jsp" name="form">
					按学号查询：<input type="text" name="number" value=""><br>
					<input type="submit" value="查询" name="g"> 
					</form>
				</td>
				<td  bgcolor="#BC8F8F" >
					<form method="post" action="query_3.jsp" name="form">
					按班级查询：<input type="text" name="classes" value=""><br>
					<input type="submit" value="查询" name="s"> 
					</form>
				</td>
				
			</tr>
			</table>
		</td>
	</tr>

	<br>
<%
String number=null;
String name=null;
String classes=null;
String term=null;
float math,english,sql,java,test,total;
	Connection con=(Connection)session.getAttribute("con");
	ResultSet rs=(ResultSet)session.getAttribute("rs");
	ResultSet cu=(ResultSet)session.getAttribute("cs");
	
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
	if(cu!=null){
		
		while(cu.next()){
			out.print("<TR>");
			number=cu.getString(1);
			name=cu.getString(2);
			classes=cu.getString(3);
			math=cu.getInt(4);
			sql=cu.getInt(5);
			english=cu.getInt(6);
			java=cu.getInt(7);
			test=cu.getInt(8);
			term=cu.getString(9);
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
	</font></p>
</center>
</body>
</html>