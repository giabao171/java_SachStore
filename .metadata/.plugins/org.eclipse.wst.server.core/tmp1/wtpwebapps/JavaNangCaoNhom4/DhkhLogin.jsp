<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<style>
	.home-login {
		width: 100%;
		height: 100%;
		background-color: #006EB7;
	}
	.logo {
		display: flex;
		justify-content: center;
		margin-bottom: 50px;
	}
	.logo img {
		width: 150px;
	}
	.content {
		display: flex;
		justify-content: space-around;
		height: 350px;
		
	}
	.login-modal {
		background-color: #fff;
		width: 300px;
		height: 320px;
		border: 5px solid #6bb9f0;
	}
	.input-modal {
		padding: 0 10px;
	}
	.input-content {
		display: flex;
		justify-content: center;
		flex-direction: column;
	}
	.btn {
		margin-top: 20px;
		background-color: #337ab7;
		display: flex;
		justify-content: center;
		align-items: center;
		
	}
	.dnBtn {
		border: none;
		background-color: #337ab7;
		height: 50px;
		color: #fff;
	}
	
	input{
		width: 250px;
		height: 25px;
	}
	
	input:focus {
		border-color: #66afe9;
    	outline: 0;
    	-webkit-box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%), 0 0 8px rgb(102 175 233 / 60%);
    	box-shadow: inset 0 1px 1px rgb(0 0 0 / 8%), 0 0 8px rgb(102 175 233 / 60%);
    	background-color: #e8f0fe;
}
	}
	
	h1{
		color: #006eb7;
	}
	.footer {
		width: 100%;
		color: #fff;
		display: flex;
		justify-content: center;
		align-items: center;
		flex-direction: column;
	}
	.footer a {
		outline:none;
		color:#fff;
	}
</style>
<body>
	<div class="home-login">
		<div class="logo">
			<img src="1.png">
		</div>
  		<div class="content">  
  		<img src="image1.png">
  		<div class="login-modal">
  			<form action="ht.jsp" method="post" class="input-modal"> 
  				<div class="input-content">
  					<h1>Sinh Viên</h1>
  					<div class="input">
	  					<div align="left">
	  						Mã sinh viên:<br>
	     	  				<input name="txtun" type="text"> 
	  					</div>
	  					<br>
	     	  			<div align="left">
	     	  				Mật khẩu:<br>
	     					<input name="txtun1" type="password"> 
	     	  			</div>
	     	  			<br>
  					</div>
  					<div class="btn" >
		     	  		<button class="dnBtn">
		     	  			Đăng nhập
		     	  		</button>
	     	  		</div>
  				</div>
     		</form>
     		</div>
		</div>
		<div class="footer">
				<a href="http://husc.edu.vn/">Trường Đại học Khoa học, Đại học Huế</a>
     			<p>
     				77 Nguyễn Huệ, Thành phố Huế, Tỉnh Thừa Thiên Huế, Việt Nam
     			</p>
     			<p>
     				 Điện thoại: (+84) 0234.3823290 – Fax: (+84) 0234.3824901
     			</p>
     		</div>
     	</div>
</body>
</html>