/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2019-03-08 11:21:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.Window;

public final class StuUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>信息修改</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"image/3.jpg\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<p><font size=5><b>信息修改</b></font>\r\n");
      out.write("\t<font size=4>\r\n");
      out.write("\t<form action=\"StuUpdate_1.jsp\" method=post id=\"form\">\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t输入你的学号：<input type=\"text\" name=\"UserId\" id=\"UserId\" value=\"\"><br>\r\n");
      out.write("\t\t输入你的密码：<input type=\"text\" name=\"UserPwd\" id=\"UserPwd\" value=\"\"><br>\r\n");
      out.write("\t\t输入你的姓名：<input type=\"text\" name=\"UserName\" id=\"UserName\" value=\"\"><br>\r\n");
      out.write("\t\t输入你的年龄：<input type=\"text\" name=\"UserAge\" id=\"UserAge\" value=\"\"><br>\r\n");
      out.write("\t\t输入你的班级：<input type=\"text\" name=\"UserClass\" id=\"UserClass\" value=\"\"><br>\r\n");
      out.write("\t\t<p></p><input type=\"button\" name=\"b\" value=\"更新\" onclick=\"Check()\"/>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");

		String xg=(String)session.getAttribute("xiugai1");
		if(xg==null) 
			xg="";
		
	
      out.write("\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<p><font size=4 color=red>");
      out.print(xg );
      out.write("</font>\r\n");
      out.write("\t\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction Check()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar form=document.getElementById(\"form\");\r\n");
      out.write("\t\tvar id=document.getElementById(\"UserId\").value;\r\n");
      out.write("\t\tvar pwd=document.getElementById(\"UserPwd\").value;\r\n");
      out.write("\t\tvar name=document.getElementById(\"UserName\").value;\r\n");
      out.write("\t\tvar age=document.getElementById(\"UserAge\").value;\r\n");
      out.write("\t\tvar classes=document.getElementById(\"UserClass\").value;\r\n");
      out.write("\t\tif(id==\"\"||pwd==\"\"||name==\"\"||age==\"\"||classes==\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\twindow.alert(\"有未填项\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
