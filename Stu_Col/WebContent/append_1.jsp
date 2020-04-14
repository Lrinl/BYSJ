<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>成绩录入</title>
</head>
<body background="image/4.jpg">
<center>
	<p><font size=5><b>成绩录入</b></font>
	<font size=4>
	<form action="append_2.jsp" method=post id="form">
		同学学号：<input type="text" name="number" id="number" ><br>
		数学成绩：<input type="text" name="math" id="math" ><br>
		SQL成绩：<input type="text" name="sql" id="sql" ><br>
		英语成绩：<input type="text" name="english" id="english" ><br>
		Java成绩：<input type="text" name="java" id="java" ><br>
		软测成绩：<input type="text" name="test" id="test" ><br>
		所属学期：<select name="term" id="term" class="form-control"  style = "width:160px;height:22px;">   
        <option value="第一学期" selected="selected">第一学期</option>   
        <option value="第二学期">第二学期</option>   
        <option value="第三学期">第三学期</option>   
        <option value="第四学期">第四学期</option>    
            
      </select><br>
		<input type="button" name="b" value="添加" onclick="check()">
	
	<br>
	<%
		String lr=(String)session.getAttribute("tianjia");
		if(lr==null) 
			lr="";
	%>
	</p>
	<p><font size=4 color=red>数据录入：<%=lr %></font>
	</font>
</center>
</body>
</html>
<script language="javascript">
function check()
{
	var form=document.getElementById("form");
	var number=document.getElementById("number").value;
	var math=document.getElementById("math").value;
	var sql=document.getElementById("sql").value;
	var english=document.getElementById("english").value;
	var java=document.getElementById("java").value;
	var test=document.getElementById("test").value;
	if(number==""||math==""||sql==""||english==""||java==""||test=="")
		{
		window.alert("有未填项");
		return;
		}		
	else 
		form.submit();
		
}
</script>
