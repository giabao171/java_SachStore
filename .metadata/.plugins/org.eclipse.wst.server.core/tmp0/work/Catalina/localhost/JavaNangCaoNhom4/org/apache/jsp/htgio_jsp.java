/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.70
 * Generated at: 2022-11-05 09:51:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.khachhangbean;
import bean.giohangbean;
import bo.giohangbo;
import bean.sachbean;
import bean.loaibean;
import java.util.ArrayList;
import bo.loaibo;
import bo.sachbo;

public final class htgio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bo.loaibo");
    _jspx_imports_classes.add("bean.loaibean");
    _jspx_imports_classes.add("bo.sachbo");
    _jspx_imports_classes.add("bo.giohangbo");
    _jspx_imports_classes.add("bean.sachbean");
    _jspx_imports_classes.add("bean.khachhangbean");
    _jspx_imports_classes.add("bean.giohangbean");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Bootstrap Example</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"sachserverlet\">Trang ch???</a></li>\r\n");
      out.write("      \r\n");
      out.write("      <li><a href=\"giohangcontroler\">Gi??? h??ng</a></li>\r\n");
      out.write("      <li><a href=\"xacnhanmuaController\">Thanh to??n</a></li>\r\n");
      out.write("      <li><a href=\"#\">L???ch s??? mua h??ng</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("      <li>\r\n");
      out.write("      ");
if(session.getAttribute("dn")==null){ 
      out.write("\r\n");
      out.write("      <a href=\"dangNhap.jsp\">\r\n");
      out.write("      <span class=\"glyphicon glyphicon-log-in\"></span>\r\n");
      out.write("       Login\r\n");
      out.write("       </a>\r\n");
      out.write("       ");
}else{ 
       khachhangbean khbean = (khachhangbean)session.getAttribute("dn");
       
      out.write("\r\n");
      out.write("       <a href=\"#\">\r\n");
      out.write("	      <span class=\"glyphicon glyphicon-log-in\"></span>\r\n");
      out.write("	       Hi: ");
      out.print(khbean.getTendn() );
      out.write("\r\n");
      out.write("	       </a>\r\n");
      out.write("	       ");
} 
      out.write("\r\n");
      out.write("       </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\" class=\"table\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td width=\"200\" align=\"top\" > Loai sach\r\n");
      out.write("      <table >\r\n");
      out.write("      ");

      ArrayList<loaibean> dsloai = (ArrayList<loaibean>) request.getAttribute("dsloai");
        for(loaibean l: dsloai){
      
      out.write("\r\n");
      out.write("          <tr class=\"list-group\">\r\n");
      out.write("           <td class=\"list-group-item\">\r\n");
      out.write("            <a href=\"sachserverlet?ml=");
      out.print(l.getMaloai());
      out.write("\"> \r\n");
      out.write("              ");
      out.print(l.getTenloai() );
      out.write("\r\n");
      out.write("             </a>\r\n");
      out.write("          </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("       </table>\r\n");
      out.write("    </td>\r\n");
      out.write("      <td width=\"600\" valign=\"top\"> Hien thi sach \r\n");
      out.write("      <form method=\"post\" action=\"xoasuaControler\">\r\n");
      out.write("     	<table class=\"table\">\r\n");
      out.write("     	<thead>\r\n");
      out.write("      <tr>\r\n");
      out.write("      	<th></th>\r\n");
      out.write("        <th>M?? s??ch</th>\r\n");
      out.write("        <th>T??n s??ch</th>\r\n");
      out.write("        <th>Gi??</th>\r\n");
      out.write("        <th>S??? l?????ng</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("      ");

      	giohangbo gh = (giohangbo)session.getAttribute("gio");
      	if(gh!= null) {
      		for(giohangbean s : gh.ds){
      out.write("\r\n");
      out.write("      		\r\n");
      out.write("      			<tr>\r\n");
      out.write("      		<td>  \r\n");
      out.write("      			\r\n");
      out.write("      		<input type=\"checkbox\" class=\"form-check-input\" name=\"check\" value=\"");
      out.print(s.getMasach() );
      out.write("\">\r\n");
      out.write("      			\r\n");
      out.write("      		</td>\r\n");
      out.write("          	<td>  ");
      out.print(s.getMasach() );
      out.write("  </td>\r\n");
      out.write("           <td> ");
      out.print(s.getTensach() );
      out.write("  </td>\r\n");
      out.write("           <td> ");
      out.print(s.getGia() );
      out.write("     </td>\r\n");
      out.write("           ");
      out.write("\r\n");
      out.write("           <td> \r\n");
      out.write("           ");
 String msach = request.getParameter("masach"); 
           	String sluong = (request.getParameter("slsach"));
           	String snsls = request.getParameter("xacnhanslsach");
           	
           	String xsach = request.getParameter("xoasach");
           	
         
           	
           	if(msach != null) {
           		if(snsls != null){
           			if(sluong != null){
           				gh.Soluong(msach, Long.parseLong(sluong));
           			}
           			
           		}
           	}
           	
           	if(msach != null) {
           		if(xsach != null) {
           			gh.Xoasach(msach);
           		}
           	}
           	
           	
           
      out.write("\r\n");
      out.write("           		\r\n");
      out.write("           			<input type=\"number\" name=\"t");
      out.print(s.getMasach());
      out.write("\" value= ");
      out.print(s.getSoluong() );
      out.write(" min=\"0\" style=\"width: 100px; margin-right: 10px\"> \r\n");
      out.write("           			\r\n");
      out.write("           			\r\n");
      out.write("           			<button type=\"submit\" name=\"butsua\" value=\"");
      out.print(s.getMasach() );
      out.write("\" class=\"btn btn-info\">X??c nh???n</button>\r\n");
      out.write("           	</td>\r\n");
      out.write("           <td>  Th??nh ti???n: ");
      out.print(s.getThanhtien() );
      out.write("</td>\r\n");
      out.write("           <td> \r\n");
      out.write("           			<button type=\"submit\" class=\"btn btn-warning\" name=\"butxoa\"  value=\"");
      out.print(s.getMasach() );
      out.write("\"> X??a</button>\r\n");
      out.write("           		 \r\n");
      out.write("           </td>\r\n");
      out.write("      	");
}} 
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td>T???ng ti???n: ");
      out.print(gh.Tongtien() );
      out.write("</td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			<td>\r\n");
      out.write("				<div style=\"display: flex;\">\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-danger\" name=\"xoaall\">X??a h???t</button>\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-primary\" name=\"xnmua\" style=\"margin-left: 20px;\">X??c nh???n mua</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("       </table>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("	</form>\r\n");
      out.write("      	</td>\r\n");
      out.write("      <td width=\"200\" valign=\"top\"> Tim Kiem \r\n");
      out.write("      	<form action=\"sachserverlet\" method=\"post\" class=\"form-inline\" style=\"display: flex\">\r\n");
      out.write(" 		 <input  name=\"txttk\" type=\"text\" value=\"\" placeholder=\"Nhap tt\" class=\"form-control\"> <br>\r\n");
      out.write("  		 <input name=\"butt\" type=\"submit\" value=\"Search\" class=\"btn btn-primary\">\r\n");
      out.write("		</form>\r\n");
      out.write("      	\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
