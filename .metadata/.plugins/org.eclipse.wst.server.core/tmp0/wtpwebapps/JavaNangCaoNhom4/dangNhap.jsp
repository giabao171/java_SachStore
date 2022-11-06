<%@page import="bean.sachbean"%>
<%@page import="bo.sachbo"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bo.loaibo"%>
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
      <li class="active"><a href="#">Trang chủ</a></li>
      
      <li><a href="#">Giỏ hàng</a></li>
      <li><a href="#">Thanh toán</a></li>
      <li><a href="#">Lịch sử mua hàng</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="DangKyServerlet"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="ktdn"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  
<table width="1000" align="center">
   <tr>
      <td width="200" valign="top">
      <table class="table table-hover">
      <%loaibo lbo=new loaibo();
        ArrayList<loaibean> dsloai=lbo.getloai();
        for(loaibean l: dsloai){
      %>
          <tr>
           <td>
            <a href="sach.jsp?ml=<%=l.getMaloai()%>"> 
              <%=l.getTenloai() %>
             </a>
          </td>
          </tr>
          <%} %>
       </table>
        </td>
      <td width="600" valign="top">
	      <form action="ktdn" method="post">
	       UserName: <input name="un" type="text"> <br>
	       Password: <input name="pass" type="password"> <br>
	      <input name="but1" type="submit" value="Login">
	      <%if(request.getParameter("kt")!=null){
	    	  out.print("Dang nhap sai");
	      }
    	  %>
       </form>
       </td>
      <td width="200" valign="top">
      <form action="sach.jsp" method="post">
 		 <input class="form-control" name="txttk" type="text" value="" placeholder="Nhap tt"> <br>
  		 <input class="btn-primary" name="butt" type="submit" value="Search">
		</form>
       
       </td>
   </tr>

</table>
</body>
</html>
