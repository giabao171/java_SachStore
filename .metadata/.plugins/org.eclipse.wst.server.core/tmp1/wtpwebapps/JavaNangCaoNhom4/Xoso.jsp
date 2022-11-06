<%@page import="java.util.Calendar"%>
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
	Calendar c = Calendar.getInstance(); 
	int ngay = c.get(Calendar.DATE);
	int thang = c.get(Calendar.MONTH) + 1;
	int nam = c.get(Calendar.YEAR);
%>
	Hom nay, ngay <%=ngay %> thang <%= thang%> nam <%=nam%> Chon ngay:
	<form action="kqsx.jsp">
		Chon ngay: <select name="sngay">
			<%
			for (int i = 1; i <= 30; i++) {
				int k = i;
			%>
				<option <%=(ngay==i?"selected":"") %> value= <%=i*2 %>><%=k%></option>
			<%
			}
			%>
		</select> Chon thang: <select name="sthang">
			<%
			for (int i = 1; i <= 12; i++) {
				int k = i;
			%>
				<option <%=(thang==i?"selected":"") %> ><%=k%></option>
			<%
			}
			%>
		</select> Chon nam: <select name="snam">
			<%
			for (int i = nam - 10; i <= nam; i++) {
				int k = i;
			%>
				<option <%=(nam==i?"selected":"") %> ><%=k%></option>
			<%
			}
			%>
		</select>
		<input name="but1" type="submit" value="xem ket qua">
	</form>
</body>
</html>

