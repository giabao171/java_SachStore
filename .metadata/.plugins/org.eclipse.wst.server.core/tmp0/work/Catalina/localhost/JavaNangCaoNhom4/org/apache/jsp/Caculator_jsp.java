/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-10-13 09:11:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Caculator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	.wrapper {\r\n");
      out.write("		position: fixed;\r\n");
      out.write("		left: 0;\r\n");
      out.write("		top:0;\r\n");
      out.write("		bottom:0;\r\n");
      out.write("		right:0;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		justify-content:center;\r\n");
      out.write("		background-color: #2484c3;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.caculator {\r\n");
      out.write("		width: 290px;\r\n");
      out.write("		border-radius: 9px;\r\n");
      out.write("		box-shadow: 0 0 3px #000;\r\n");
      out.write("		background-color: #fff;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("		padding: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.input {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: space-between;\r\n");
      out.write("		margin-bottom: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=number] {\r\n");
      out.write("		width: 130px;\r\n");
      out.write("		height: 20px;\r\n");
      out.write("	    border-radius: 4px;\r\n");
      out.write("	    border: 2px solid #2484c3;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.operator {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: space-between;\r\n");
      out.write("		margin-bottom: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=submit] {\r\n");
      out.write("		width: 70px;\r\n");
      out.write("	    height: 30px;\r\n");
      out.write("	    border: 1px solid #2484c3;\r\n");
      out.write("	    border-radius: 4px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input[type=text] {\r\n");
      out.write("		width: 100%;\r\n");
      out.write("	    height: 30px;\r\n");
      out.write("	    border: 1px solid #2484c3;\r\n");
      out.write("	    border-radius: 4px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
 
long a=0, b=0,kq=0;
	if(request.getAttribute("aa") != null) {
		a =(long)request.getAttribute("aa");
		b =(long)request.getAttribute("bb");
		kq =(long)request.getAttribute("kq");
	}

      out.write("\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		<form class=\"caculator\" method=\"post\" action=\"Text\">\r\n");
      out.write("			<div class=\"input\">\r\n");
      out.write("				<input type=\"number\" name=\"ipValue1\" value=");
      out.print( a);
      out.write(">\r\n");
      out.write("				<input type=\"number\" name=\"ipValue2\" value=");
      out.print( b);
      out.write(">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"operator\">\r\n");
      out.write("				<input type = \"submit\" value=\"+\" name=\"ope\">\r\n");
      out.write("				<input type = \"submit\" value=\"-\" name=\"ope\">\r\n");
      out.write("				<input type = \"submit\" value=\"*\" name=\"ope\">\r\n");
      out.write("				<input type = \"submit\" value=\"/\" name=\"ope\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<input type=\"number\" name=\"result\" value= ");
      out.print(kq );
      out.write(">\r\n");
      out.write("		</form>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
