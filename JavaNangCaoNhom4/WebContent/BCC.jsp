<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
   <%for(int i=1;i<=9;i++){
	   
	   %>
   		<tr>
   		 <%for(int j=1; j<=9;j++){ %>
	   		<td>
	   		    <%=j %>x<%=i %>=<%=i*j %>
	   		    
	   		</td>
	   	<%} %>	
   		</tr>
          
    <%} %>
    </table>
</body>
</html>