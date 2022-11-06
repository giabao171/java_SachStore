<%@page import="bean.sinhvienbean"%>
<%@page import="bo.monhocbo"%>
<%@page import="bo.sinhvienbo"%>
<%@page import="bean.monhocbean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Sinh Viên</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  	<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
	
	.title {
		font-weight:600;
		font-size: 20px;
		color:#fff;
		background-color: #007bff;
		width: 100%;
		display: flex;
		align-item:center;
	}
	
	.image {
		width: 150px;
		height:150px;
	}
	
	.flex {
		display: flex;
		flex-direction: row;
		justify-content:center;
		align-item:center;
	}
	
	.text {
		font-size: 15px;
		color:#007bff
	}
	
	.monhoc-box {
		top: 50px;
		height: 600px;
		border: 0.5px solid #007bff;
		position:fixed;
	}
	
	.fixed {
		position:fixed;
		top:0;
	}
	
	.input {
		margin-top: 50px;
		display: inline-block;
		display: flex;
	}
	
	.sinhvien {
		margin-top: 50px;
	}
	
	.sv-item {
		width: 350px;
	}
	
	.desc {
		width: 200px;
		margin-left: 8px;
	}
	
	span {
		color: #000;
	}
</style>
<body>
	<table class="table">
	
	<tr>
      <td width="160" align="top"><div class="title fixed"><p >Môn học</p></div>
      <table class="monhoc-box">
      <%
      	monhocbo mhbo=new monhocbo();
      	sinhvienbo svbo=new sinhvienbo();
      	
      	ArrayList<monhocbean> dsmonhoc=mhbo.getmonhoc();
      	ArrayList<sinhvienbean> dssinhvien=svbo.getsinhvien();
      	
        for(monhocbean l: dsmonhoc){
      %>
          <tr class="list-group">
           <td class="list-group-item">
            <a href="SinhVien.jsp?mmh=<%=l.getMamonhoc()%>"> 
              <%=l.getTenmonhoc() %>
             </a>
          	</td>
          </tr>
       	<%} %>
       </table>
    </td>
      <td width="500" valign="top"> <div class="title fixed"><p >Sinh viên</p></div>
     	<table class="table sinhvien">
      <%
      
	      request.setCharacterEncoding("utf-8");
	      response.setCharacterEncoding("utf-8");
    
	      String mmh=request.getParameter("mmh");
	      String key=request.getParameter("txttk");
	      
        if(mmh!=null)
        	dssinhvien = svbo.TimMonHoc(mmh);
        else
        	if(key!=null)
        		dssinhvien=svbo.Tim(key);
        
        int n=dssinhvien.size();
        for(int i=0;i<n;i++){
        	sinhvienbean s = dssinhvien.get(i);
       %>
         <tr>
	         <td>
	            <div class = "text flex sv-item">
		         	<img src="<%=s.getAnh() %>" class="image rounded"> <br>
		           <div class="desc">
		           	<p> Mã sinh viên: <span><%=s.getMasv() %></span></p>
		           	<p>Họ tên: <span><%=s.getHoten() %></span></p>
		           	<p>Địa chỉ: <span><%=s.getDiachi() %></span></p>
		           	<p>Email: <span><%=s.getEmail() %></span></p>
		           </div>
         	</td>
         <%i++;
         if(i<n){
         	s=dssinhvien.get(i);%>
	         <td>
		         <div class = "text flex sv-item">
		         	<img src="<%=s.getAnh() %>" class="image rounded"> <br>
		           <div class="desc">
		           	<p> Mã sinh viên: <span><%=s.getMasv() %></span></p>
		           	<p>Họ tên: <span><%=s.getHoten() %></span></p>
		           	<p>Địa chỉ: <span><%=s.getDiachi() %></span></p>
		           	<p>Email: <span><%=s.getEmail() %></span></p>
		           </div>
		         </div>
	         </td>
         <%} %>
         </tr>
       <%} %>
       </table>

      </td>
      <td width="250" valign="top"> <div class="title fixed"><p >Tìm kiếm sinh viên</p></div>
      	<form action="SinhVien.jsp" method="post" class="form-inline input fixed">
 		 <input  name="txttk" type="text" value="" placeholder="Nhập thông tin" class="form-control"> <br>
  		 <input name="butt" type="submit" value="Search" class="btn btn-primary">
		</form>
      	
      </td>
   </tr>
</table>
</body>
</html>