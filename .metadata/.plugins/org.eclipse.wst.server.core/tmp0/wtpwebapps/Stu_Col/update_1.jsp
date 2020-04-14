<%@page import="java.awt.Window"%>
<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>成绩修改</title>
</head>
<body background="image/4.jpg">
<center>
	<p><font size=5><b>成绩录入</b></font>
	<font size=4>
	<form action="update_2.jsp" method=post id="form">
		<br><br>
		输入修改者的学号：<input type="text" name="number" id="numberId" value=""><br>
		输入新的数学成绩：<input type="text" name="math" id="mathId" value=""><br>
		输入新的SQL成绩：<input type="text" name="sql" id="sqlId" value=""><br>
		输入新的英语成绩：<input type="text" name="english" id="englishId" value=""><br>
		输入新的java成绩：<input type="text" name="java" id="javaId" value=""><br>
		输入新的软测成绩：<input type="text" name="softTest" id="softTestId" value=""><br>
		输入新的所属学期：<select name="term" id="termId" class="form-control"  style = "width:160px;height:22px;">   
        <option value="第一学期" selected="selected">第一学期</option>   
        <option value="第二学期">第二学期</option>   
        <option value="第三学期">第三学期</option>   
        <option value="第四学期">第四学期</option>    
            
      </select><br>
		<p></p><input type="button" name="b" value="更新" onclick="Check()">
	<br>
	<%
		String xg=(String)session.getAttribute("xiugai");
		if(xg==null) 
			xg="";
		
	%>
	<br><br>
	<p><font size=4 color=red><%=xg %></font>
</center>
</body>
</html>
<script language="javascript">
	function Check()
	{
		var form=document.getElementById("form");
		var number=document.getElementById("numberId").value;
		var math=document.getElementById("mathId").value;
		var sql=document.getElementById("sqlId").value;
		var english=document.getElementById("englishId").value;
		var java=document.getElementById("javaId").value;
		var softTest=document.getElementById("softTestId").value;
		var term=document.getElementById("termId").value;
		if(number==""||math==""||sql==""||english==""||java==""||softTest==""||term=="")
			{
				window.alert("有未填项");
			}
		else
			form.submit();
	}
</script>