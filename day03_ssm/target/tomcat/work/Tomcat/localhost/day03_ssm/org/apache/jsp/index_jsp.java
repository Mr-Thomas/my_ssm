/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-13 00:48:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"account/findAll\">测试查询</a><br>\r\n");
      out.write("\r\n");
      out.write("<form action=\"account/saveAccount\" method=\"post\">\r\n");
      out.write("    姓名:<input type=\"text\" name=\"name\"><br>\r\n");
      out.write("    金额:<input type=\"text\" name=\"money\"><br>\r\n");
      out.write("    <input type=\"submit\" value=\"保存\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"account/transfer\" method=\"post\">\r\n");
      out.write("    姓名:<input type=\"text\" name=\"oldAccount\"><br>\r\n");
      out.write("    姓名:<input type=\"text\" name=\"newAccount\"><br>\r\n");
      out.write("    金额:<input type=\"text\" name=\"money\"><br>\r\n");
      out.write("    <input type=\"submit\" value=\"保存\">\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"account/initUpdate\">initUpdate默认页面</a><br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"account/textDemo\">请求转发</a><br>\r\n");
      out.write("<a href=\"account/textDemo1\">请求转发1</a><br>\r\n");
      out.write("<a href=\"account/springForward\">SpringMVC_请求转发</a><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"account/textDemo01\">重定向01</a><br>\r\n");
      out.write("<a href=\"account/textDemo02\">重定向02</a><br>\r\n");
      out.write("<a href=\"account/springRedirect\">SpringMVC_重定向</a><br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"account/writeDemo\">直接写出</a><br>\r\n");
      out.write("\r\n");
      out.write("<a href=\"account/findAll01\">MedolAndView</a><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
