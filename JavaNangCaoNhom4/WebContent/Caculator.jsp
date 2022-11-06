<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

	.wrapper {
		position: fixed;
		left: 0;
		top:0;
		bottom:0;
		right:0;
		display: flex;
		align-items: center;
		justify-content:center;
		background-color: #2484c3;
	}
	
	.caculator {
		width: 290px;
		border-radius: 9px;
		box-shadow: 0 0 3px #000;
		background-color: #fff;
		display: flex;
		flex-direction: column;
		padding: 10px;
	}
	
	.input {
		display: flex;
		justify-content: space-between;
		margin-bottom: 10px;
	}
	
	input[type=number] {
		width: 130px;
		height: 20px;
	    border-radius: 4px;
	    border: 2px solid #2484c3;
	}
	
	.operator {
		display: flex;
		justify-content: space-between;
		margin-bottom: 10px;
	}
	
	input[type=submit] {
		width: 70px;
	    height: 30px;
	    border: 1px solid #2484c3;
	    border-radius: 4px;
	}
	
	input[type=text] {
		width: 100%;
	    height: 30px;
	    border: 1px solid #2484c3;
	    border-radius: 4px;
	}
	
	
</style>
<body>
<% 
long a=0, b=0,kq=0;
	if(request.getAttribute("aa") != null) {
		a =(long)request.getAttribute("aa");
		b =(long)request.getAttribute("bb");
		kq =(long)request.getAttribute("kq");
	}
%>
	<div class="wrapper">
		<form class="caculator" method="post" action="Text">
			<div class="input">
				<input type="number" name="ipValue1" value=<%= a%>>
				<input type="number" name="ipValue2" value=<%= b%>>
			</div>
			<div class="operator">
				<input type = "submit" value="+" name="ope">
				<input type = "submit" value="-" name="ope">
				<input type = "submit" value="*" name="ope">
				<input type = "submit" value="/" name="ope">
			</div>
			<input type="number" name="result" value= <%=kq %>>
		</form>
		
		
		
		
	</div>
</body>
</html>