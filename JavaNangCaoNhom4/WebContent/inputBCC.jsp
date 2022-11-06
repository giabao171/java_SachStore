
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% String numString = request.getParameter("but1");%>	
	<form action="inputBCC.jsp">
		<input name="but1" type="number" value=<%=numString %>>
		<input type="submit" value="Show ra de">
	</form>
	
	<% 
		if(numString == null) 
				out.print("Ban chay dau tien");
			else if(numString == "") 
				out.print("Rong");
		else {%>
			
		<table>
			<%for(int i=1;i<=10;i++){ %>
				<tr><td>
					<%=Integer.parseInt(numString) %>x<%=i %>=<%=i*Integer.parseInt(numString) %>
				<td></tr>
			<%} %>
		</table>
		<%} %>
		
		
		
 	
 	
 	
 	
 	

</body>
</html>