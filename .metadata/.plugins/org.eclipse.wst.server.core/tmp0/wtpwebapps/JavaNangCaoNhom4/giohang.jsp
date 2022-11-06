<%@page import="bo.giohangbo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String masach = request.getParameter("ms"); 
	String tensach = request.getParameter("ts"); 
	long giasach = Long.parseLong(request.getParameter("gia")) ; 
	giohangbo gh=null;
	
	//neu mua hang lan dau
	if(session.getAttribute("gio") == null){
		
		gh=new giohangbo();//cap vung nho
		session.setAttribute("gio", gh);
		
	}
	//b1: Luu session ra bien
		gh=(giohangbo)session.getAttribute("gio");
		//b2: Thao tac tren bien
		gh.Them(masach, tensach, giasach, (long)1);
		//b3: Luu bien vao session
		session.setAttribute("gio", gh);
		
		//Hien thi hang
		response.sendRedirect("htgio.jsp");
		
		

%>
</body>
</html>