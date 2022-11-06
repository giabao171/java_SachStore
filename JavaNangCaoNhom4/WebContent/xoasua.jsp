<%@page import="bo.giohangbo"%>
<%@page import="java.util.Enumeration"%>
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
   Enumeration<String> d= request.getParameterNames();
	giohangbo gh=(giohangbo)session.getAttribute("gio");
    /* while(d.hasMoreElements()){
	   String tendk=d.nextElement();
	   if(request.getParameter(tendk)!=null){
		    String gt=request.getParameter(tendk);
	        out.println(tendk+":"+gt+"<br>");  */  
	        
	        	
	        	
	        	if(request.getParameter("butsua") != null) {
	        		String masach = request.getParameter("butsua");
	        		String tentb="t"+masach;
		        	long soluong = Long.parseLong(request.getParameter(tentb));
		        	if(soluong == 0)
		        		gh.Xoasach(masach);
		        	else
	        			gh.Soluong(masach, soluong);
	        	
	        		
	        	}
	        	else 
	        		if(request.getParameter("butxoa") != null){
	        			String masach = request.getParameter("butxoa");
	        			gh.Xoasach(masach);
	        			
	        		}
	        		else 
	        			if(request.getParameter("xoaall") != null) {
	        				String[] gtcheck=request.getParameterValues("check");
	        				if (gtcheck != null) {
	        					for(String ss: gtcheck)
		        		   			   gh.Xoasach(ss);
	        				}
		        		   	else {
		        		   		gh.Xoaall();
		        		   	}
	        			}
	        			
	        
	        	session.setAttribute("gio", gh);
	        	if(gh.ds.size() == 0)
	        		response.sendRedirect("sach.jsp");
	        	else
	        		response.sendRedirect("htgio.jsp");  
	        	
	        	
	  			
	/*    }
   }  */
    /* out.println("<hr>"); 
    String[] gtcheck=request.getParameterValues("check");
   	for(String ss: gtcheck)
	   gh.Xoasach(ss);  */
 %>

</body>
</html>
