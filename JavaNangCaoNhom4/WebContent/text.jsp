<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	<form action="text.jsp" method="post">
 		<input name="txttk" type="text" value="">
 		<br><input name="butt" type="submit" value="Tong">
 		
 		<%
 			String nn = request.getParameter("txttk"); 
 			if(session.getAttribute("ss") == null) {
 				session.setAttribute("ss", (int) 0);
 			}
 			if (nn != null){
 				int n=Integer.parseInt(nn);
 				int s=(int) session.getAttribute("ss");
 				
 				s=s+n;
 				
 				session.setAttribute("ss", s);
 				
 				out.print(s);
 			}
 		%>
 	</form>
</body>
</html>