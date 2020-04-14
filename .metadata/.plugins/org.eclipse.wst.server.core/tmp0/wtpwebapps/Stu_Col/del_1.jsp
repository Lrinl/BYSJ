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


<body background="image/4.jpg">
<center>
	<font size=5><b>删除成绩</b></font>
	<font size=4>
	<form action="del_2.jsp" method=post id="form" name="delform">
	<table>
		<tr>
			<th align=left>
			<font size=4>输入学号:</font> <input type="text" id="numberId" name="number" >
			<%
				String del=(String)session.getAttribute("del");
				int i=0;
				if(del==null) del="";
				if(del=="删除成功")
				{
					out.print(" <script language='javascript'>alert('删除成功') </script>");
				}
				else if(del=="删除失败")
					out.print(" <script language='javascript'>alert('删除失败') </script>");
				else
					out.print(del);
			%>
			</th>
		</tr>
		<tr>
			<th align=center>
			<input type="button" name="b" onclick="datacheck()" value="删除">
			</th>
		</tr>
	</table>
	</form>
	<br><br>
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