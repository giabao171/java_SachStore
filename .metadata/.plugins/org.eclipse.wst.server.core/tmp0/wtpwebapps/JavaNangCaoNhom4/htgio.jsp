<%@page import="bean.khachhangbean"%>
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

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="sachserverlet">Trang chủ</a></li>
      
      <li><a href="giohangcontroler">Giỏ hàng</a></li>
      <li><a href="xacnhanmuaController">Thanh toán</a></li>
      <li><a href="#">Lịch sử mua hàng</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li>
      <%if(session.getAttribute("dn")==null){ %>
      <a href="dangNhap.jsp">
      <span class="glyphicon glyphicon-log-in"></span>
       Login
       </a>
       <%}else{ 
       khachhangbean khbean = (khachhangbean)session.getAttribute("dn");
       %>
       <a href="#">
	      <span class="glyphicon glyphicon-log-in"></span>
	       Hi: <%=khbean.getTendn() %>
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
      <%
      ArrayList<loaibean> dsloai = (ArrayList<loaibean>) request.getAttribute("dsloai");
        for(loaibean l: dsloai){
      %>
          <tr class="list-group">
           <td class="list-group-item">
            <a href="sachserverlet?ml=<%=l.getMaloai()%>"> 
              <%=l.getTenloai() %>
             </a>
          </td>
          </tr>
          <%} %>
       </table>
    </td>
      <td width="600" valign="top"> Hien thi sach 
      <form method="post" action="xoasuaControler">
     	<table class="table">
     	<thead>
      <tr>
      	<th></th>
        <th>Mã sách</th>
        <th>Tên sách</th>
        <th>Giá</th>
        <th>Số lượng</th>
      </tr>
    </thead>
      <%
      	giohangbo gh = (giohangbo)session.getAttribute("gio");
      	if(gh!= null) {
      		for(giohangbean s : gh.ds){%>
      		
      			<tr>
      		<td>  
      			
      		<input type="checkbox" class="form-check-input" name="check" value="<%=s.getMasach() %>">
      			
      		</td>
          	<td>  <%=s.getMasach() %>  </td>
           <td> <%=s.getTensach() %>  </td>
           <td> <%=s.getGia() %>     </td>
           <%-- <td>  <%=s.getSoluong()%>  </td> --%>
           <td> 
           <% String msach = request.getParameter("masach"); 
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
           	
           	
           %>
           		
           			<input type="number" name="t<%=s.getMasach()%>" value= <%=s.getSoluong() %> min="0" style="width: 100px; margin-right: 10px"> 
           			
           			
           			<button type="submit" name="butsua" value="<%=s.getMasach() %>" class="btn btn-info">Xác nhận</button>
           	</td>
           <td>  Thành tiền: <%=s.getThanhtien() %></td>
           <td> 
           			<button type="submit" class="btn btn-warning" name="butxoa"  value="<%=s.getMasach() %>"> Xóa</button>
           		 
           </td>
      	<%}} %>
			<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>Tổng tiền: <%=gh.Tongtien() %></td>
			<td></td>
			</tr>
			
			<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>
				<div style="display: flex;">
					<button type="submit" class="btn btn-danger" name="xoaall">Xóa hết</button>
					<button type="submit" class="btn btn-primary" name="xnmua" style="margin-left: 20px;">Xác nhận mua</button>
				</div>
			</td>
			<td></td>
			</tr>
       </table>
       
       
       
       
	</form>
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