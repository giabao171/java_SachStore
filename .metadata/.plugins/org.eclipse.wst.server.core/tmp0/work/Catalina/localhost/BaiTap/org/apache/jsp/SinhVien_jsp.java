/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-09-29 07:28:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.sinhvienbean;
import bo.monhocbo;
import bo.sinhvienbo;
import bean.monhocbean;
import java.util.ArrayList;

public final class SinhVien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bo.monhocbo");
    _jspx_imports_classes.add("bean.sinhvienbean");
    _jspx_imports_classes.add("bo.sinhvienbo");
    _jspx_imports_classes.add("bean.monhocbean");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>Sinh Viên</title>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  	<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("  	<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("  	<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("  	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	.title {\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		font-size: 20px;\r\n");
      out.write("		color:#fff;\r\n");
      out.write("		background-color: #007bff;\r\n");
      out.write("		width: 100%;\r\n");
      out.write("		display: flex;\r\n");
      out.write("		align-item:center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.image {\r\n");
      out.write("		width: 150px;\r\n");
      out.write("		height:150px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.flex {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: row;\r\n");
      out.write("		justify-content:center;\r\n");
      out.write("		align-item:center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.text {\r\n");
      out.write("		font-size: 15px;\r\n");
      out.write("		color:#007bff\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.monhoc-box {\r\n");
      out.write("		top: 50px;\r\n");
      out.write("		height: 600px;\r\n");
      out.write("		border: 0.5px solid #007bff;\r\n");
      out.write("		position:fixed;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.fixed {\r\n");
      out.write("		position:fixed;\r\n");
      out.write("		top:0;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.input {\r\n");
      out.write("		margin-top: 50px;\r\n");
      out.write("		display: inline-block;\r\n");
      out.write("		display: flex;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.sinhvien {\r\n");
      out.write("		margin-top: 50px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.sv-item {\r\n");
      out.write("		width: 350px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.desc {\r\n");
      out.write("		width: 200px;\r\n");
      out.write("		margin-left: 8px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	span {\r\n");
      out.write("		color: #000;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<table class=\"table\">\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("      <td width=\"160\" align=\"top\"><div class=\"title fixed\"><p >Môn học</p></div>\r\n");
      out.write("      <table class=\"monhoc-box\">\r\n");
      out.write("      ");

      	monhocbo mhbo=new monhocbo();
      	sinhvienbo svbo=new sinhvienbo();
      	
      	ArrayList<monhocbean> dsmonhoc=mhbo.getmonhoc();
      	ArrayList<sinhvienbean> dssinhvien=svbo.getsinhvien();
      	
        for(monhocbean l: dsmonhoc){
      
      out.write("\r\n");
      out.write("          <tr class=\"list-group\">\r\n");
      out.write("           <td class=\"list-group-item\">\r\n");
      out.write("            <a href=\"SinhVien.jsp?mmh=");
      out.print(l.getMamonhoc());
      out.write("\"> \r\n");
      out.write("              ");
      out.print(l.getTenmonhoc() );
      out.write("\r\n");
      out.write("             </a>\r\n");
      out.write("          	</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("       	");
} 
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("    </td>\r\n");
      out.write("      <td width=\"500\" valign=\"top\"> <div class=\"title fixed\"><p >Sinh viên</p></div>\r\n");
      out.write("     	<table class=\"table sinhvien\">\r\n");
      out.write("      ");

      
	      request.setCharacterEncoding("utf-8");
	      response.setCharacterEncoding("utf-8");
    
	      String mmh=request.getParameter("mmh");
	      String key=request.getParameter("txttk");
	      
        if(mmh!=null)
        	dssinhvien = svbo.TimMonHoc(mmh);
        else
        	if(key!=null)
        		dssinhvien=svbo.Tim(key);
        
        int n=dssinhvien.size();
        for(int i=0;i<n;i++){
        	sinhvienbean s = dssinhvien.get(i);
       
      out.write("\r\n");
      out.write("         <tr>\r\n");
      out.write("	         <td>\r\n");
      out.write("	            <div class = \"text flex sv-item\">\r\n");
      out.write("		         	<img src=\"");
      out.print(s.getAnh() );
      out.write("\" class=\"image rounded\"> <br>\r\n");
      out.write("		           <div class=\"desc\">\r\n");
      out.write("		           	<p> Mã sinh viên: <span>");
      out.print(s.getMasv() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Họ tên: <span>");
      out.print(s.getHoten() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Địa chỉ: <span>");
      out.print(s.getDiachi() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Email: <span>");
      out.print(s.getEmail() );
      out.write("</span></p>\r\n");
      out.write("		           </div>\r\n");
      out.write("         	</td>\r\n");
      out.write("         ");
i++;
         if(i<n){
         	s=dssinhvien.get(i);
      out.write("\r\n");
      out.write("	         <td>\r\n");
      out.write("		         <div class = \"text flex sv-item\">\r\n");
      out.write("		         	<img src=\"");
      out.print(s.getAnh() );
      out.write("\" class=\"image rounded\"> <br>\r\n");
      out.write("		           <div class=\"desc\">\r\n");
      out.write("		           	<p> Mã sinh viên: <span>");
      out.print(s.getMasv() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Họ tên: <span>");
      out.print(s.getHoten() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Địa chỉ: <span>");
      out.print(s.getDiachi() );
      out.write("</span></p>\r\n");
      out.write("		           	<p>Email: <span>");
      out.print(s.getEmail() );
      out.write("</span></p>\r\n");
      out.write("		           </div>\r\n");
      out.write("		         </div>\r\n");
      out.write("	         </td>\r\n");
      out.write("         ");
} 
      out.write("\r\n");
      out.write("         </tr>\r\n");
      out.write("       ");
} 
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"250\" valign=\"top\"> <div class=\"title fixed\"><p >Tìm kiếm sinh viên</p></div>\r\n");
      out.write("      	<form action=\"SinhVien.jsp\" method=\"post\" class=\"form-inline input fixed\">\r\n");
      out.write(" 		 <input  name=\"txttk\" type=\"text\" value=\"\" placeholder=\"Nhập thông tin\" class=\"form-control\"> <br>\r\n");
      out.write("  		 <input name=\"butt\" type=\"submit\" value=\"Search\" class=\"btn btn-primary\">\r\n");
      out.write("		</form>\r\n");
      out.write("      	\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
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
