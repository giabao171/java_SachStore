<%@page import="bean.khachhangbean"%>
<%@page import="bean.sachbean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
<%@page import="bo.sachbo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="sachserverlet">Trang chủ</a></li>
      
      <li><a href="giohangcontroler">Giỏ hàng</a></li>
      <li><a href="xacnhanmuaController">Thanh toán</a></li>
      <li><a href="#">Lịch sử mua hàng</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="DangKyServerlet"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li>
      <%if(session.getAttribute("dn")==null){ %>
      <a href="ktdn">
      <span class="glyphicon glyphicon-log-in"></span>
       Login
       </a>
       <%}else{
    		khachhangbean khbean = (khachhangbean) session.getAttribute("dn"); 
    	%>
       <a href="ktdn">
	      <span class="glyphicon glyphicon-log-out"></span>
	       <%-- Log out: <%=session.getAttribute("dn") %> --%>
	       Log out: <%=khbean.getTendn()%>
	       </a>
	       <%} %>
       </li>
    </ul>
  </div>
</nav>



<table align="center" class="table">
   <tr>
      <td width="200" align="top" > Loai sach
      <table >
      <c:forEach var="l" items="${dsloai}">
      	<tr class="list-group">
      		<td class="list-group-item">
      			<a href="sachserverlet?ml=${l.getMaloai()}"> 
	              ${l.getTenloai()}
	             </a>
      		</td>
      	</tr>
      </c:forEach>
      <%loaibo lbo=new loaibo();
      	sachbo sbo=new sachbo();
      	%>
       </table>
    </td>
      <td width="600" valign="top"> Hien thi sach 
     	<table class="table">
     	<%-- <%ArrayList<sachbean> dssach = (ArrayList<sachbean>) request.getAttribute("dssach");%>
     	 <c:if test="${dssach != null}">
	     		<c:forEach var="i" items="${dssach}">
	     			<%sachbean s=dssach.get(i); %>
	     		</c:forEach>
     	</c:if> --%> 
      <%
      ArrayList<sachbean> dssach = (ArrayList<sachbean>) request.getAttribute("dssach");
    	if(dssach != null){
         	int n=dssach.size();
        	for(int i=0;i<n;i++){
        	sachbean s=dssach.get(i);  
       %>
          <tr >
         <td >
            <img src="<%=s.getAnh() %>"> <br>
            <%=s.getTensach() %> <br>
            <%=s.getTacgia() %> <br>
            <%=s.getGia() %> <br>
            <a href="htgioControler?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
               <img src="buynow.jpg">
            </a>
         </td>
         <%i++;
         if(i<n){
         s=dssach.get(i);%>
         <td>
            <img src="<%=s.getAnh() %>"> <br>
            <%=s.getTensach() %> <br>
            <%=s.getTacgia() %> <br>
            <%=s.getGia() %> <br>
            <a href="htgioControler?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
               <img src="buynow.jpg">
            </a>
         </td> 
          <%
          	}
         	} 
         	%>
         </tr>
       <%} %> 
       </table>

      	</td>
      <td width="200" valign="top"> Tim Kiem 
      	<form action="sachserverlet" method="post" class="form-inline" style="display: flex">
 		 <input  name="txttk" type="text" value="" placeholder="Nhap tt" class="form-control"> <br>
  		 <input name="butt" type="submit" value="Search" class="btn btn-primary">
		</form>
      	
      </td>
   </tr>

</table>
</body>

</html>