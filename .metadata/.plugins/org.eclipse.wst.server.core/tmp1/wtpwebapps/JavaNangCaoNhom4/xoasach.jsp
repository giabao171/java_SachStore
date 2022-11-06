<%@page import="bean.giohangbean"%>
<%@page import="bo.giohangbo"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.sachbo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<% 
String masach = request.getParameter("masach"); 
String xoasach = request.getParameter("xoasach"); 
	/* String tensach = request.getParameter("ts");  */
	/* long giasach = Long.parseLong(request.getParameter("gia")) ;  */
	/* giohangbo gh=null; */
	
	/* //neu mua hang lan dau
	if(session.getAttribute("gio") == null){
		
		gh=new giohangbo();//cap vung nho
		session.setAttribute("gio", gh);
		
	} */
	//b1: Luu session ra bien
		
		String xoaall = request.getParameter("xoaall");
		//b2: Thao tac tren bien
			giohangbo gh=(giohangbo)session.getAttribute("gio");
		if (masach != null) {
			if(xoasach != null) {
				gh.Xoasach(masach);
				
			}
			
			//b3: Luu bien vao session
			session.setAttribute("gio", gh);
			//Hien thi hang
			response.sendRedirect("htgio.jsp");		
		}
		else {	
			if(xoaall != null) {
	       		gh.Xoaall();
	       		//b3: Luu bien vao session
				session.setAttribute("gio", gh);
				//Hien thi hang
				response.sendRedirect("sach.jsp");	
	       	}
		}
		
		
		
		
		
	 %>	
</body>

</html>