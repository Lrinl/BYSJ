/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.77
 * Generated at: 2019-03-08 11:20:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class append_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>成绩录入</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"image/4.jpg\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<p><font size=5><b>成绩录入</b></font>\r\n");
      out.write("\t<font size=4>\r\n");
      out.write("\t<form action=\"append_2.jsp\" method=post id=\"form\">\r\n");
      out.write("\t\t同学学号：<input type=\"text\" name=\"number\" id=\"number\" ><br>\r\n");
      out.write("\t\t数学成绩：<input type=\"text\" name=\"math\" id=\"math\" ><br>\r\n");
      out.write("\t\tSQL成绩：<input type=\"text\" name=\"sql\" id=\"sql\" ><br>\r\n");
      out.write("\t\t英语成绩：<input type=\"text\" name=\"english\" id=\"english\" ><br>\r\n");
      out.write("\t\tJava成绩：<input type=\"text\" name=\"java\" id=\"java\" ><br>\r\n");
      out.write("\t\t软测成绩：<input type=\"text\" name=\"test\" id=\"test\" ><br>\r\n");
      out.write("\t\t所属学期：<select name=\"term\" id=\"term\" class=\"form-control\"  style = \"width:160px;height:22px;\">   \r\n");
      out.write("        <option value=\"第一学期\" selected=\"selected\">第一学期</option>   \r\n");
      out.write("        <option value=\"第二学期\">第二学期</option>   \r\n");
      out.write("        <option value=\"第三学期\">第三学期</option>   \r\n");
      out.write("        <option value=\"第四学期\">第四学期</option>    \r\n");
      out.write("            \r\n");
      out.write("      </select><br>\r\n");
      out.write("\t\t<input type=\"button\" name=\"b\" value=\"添加\" onclick=\"check()\">\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");

		String lr=(String)session.getAttribute("tianjia");
		if(lr==null) 
			lr="";
	
      out.write("\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<p><font size=4 color=red>数据录入：");
      out.print(lr );
      out.write("</font>\r\n");
      out.write("\t</font>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function check()\r\n");
      out.write("{\r\n");
      out.write("\tvar form=document.getElementById(\"form\");\r\n");
      out.write("\tvar number=document.getElementById(\"number\").value;\r\n");
      out.write("\tvar math=document.getElementById(\"math\").value;\r\n");
      out.write("\tvar sql=document.getElementById(\"sql\").value;\r\n");
      out.write("\tvar english=document.getElementById(\"english\").value;\r\n");
      out.write("\tvar java=document.getElementById(\"java\").value;\r\n");
      out.write("\tvar test=document.getElementById(\"test\").value;\r\n");
      out.write("\tif(number==\"\"||math==\"\"||sql==\"\"||english==\"\"||java==\"\"||test==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\twindow.alert(\"有未填项\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\telse \r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
