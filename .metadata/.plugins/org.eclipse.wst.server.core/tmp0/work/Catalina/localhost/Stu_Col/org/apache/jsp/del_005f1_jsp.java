/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2019-03-08 11:20:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.event.WindowStateListener;
import java.awt.Window;
import java.sql.*;
import java.util.List;

public final class del_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>删除成绩</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"image/4.jpg\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<font size=5><b>删除成绩</b></font>\r\n");
      out.write("\t<font size=4>\r\n");
      out.write("\t<form action=\"del_2.jsp\" method=post id=\"form\" name=\"delform\">\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th align=left>\r\n");
      out.write("\t\t\t<font size=4>输入学号:</font> <input type=\"text\" id=\"numberId\" name=\"number\" >\r\n");
      out.write("\t\t\t");

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
			
      out.write("\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th align=center>\r\n");
      out.write("\t\t\t<input type=\"button\" name=\"b\" onclick=\"datacheck()\" value=\"删除\">\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function datacheck(){\r\n");
      out.write("\tvar form=document.getElementById(\"form\");\r\n");
      out.write("\tif(delform.number.value==\"\"){\r\n");
      out.write("\t\twindow.alert(\"您必须输入学号!\");\r\n");
      out.write("\t\tdocument.getElementById(\"numberId\").focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
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