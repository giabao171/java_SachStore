package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import bean.khachhangbean;
import bean.taikhoanbean;
import bo.khachhangbo;
import bo.taikhoanbo;
import dao.taikhoandao;

/**
 * Servlet implementation class ktdn
 */
@WebServlet("/ktdn")
public class ktdn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		try {
			String un = request.getParameter("un"); 
			String pass = request.getParameter("pass"); 
			
//			String passMd5 = taikhoanbo.maHoaMatKhau(pass);
//			taikhoanbean tkbean = new taikhoanbean();
//			taikhoanbo tkbo = new taikhoanbo(); 
//			tkbean = tkbo.DangNhap(un, passMd5);
			
//			String passMd5 = khachhangbo.ConvertPassMd5(pass);
			
			khachhangbean khbean = new khachhangbean();
			khachhangbo khbo = new khachhangbo();
			
			if(un != null && pass != null) {
				khbean = khbo.DangNhapKh(un, khachhangbo.ConvertPassMd5(pass));
//				if(tkbean != null) {
				if(khbean != null) {
					// tao Session
//					HttpSession session = request.getSession();
//					session.setAttribute("dn", khbean.getTendn());
					session.setAttribute("dn", khbean);
					RequestDispatcher rd = request.getRequestDispatcher("sachserverlet");
					rd.forward(request, response);
				}
				else {
					RequestDispatcher rd = request.getRequestDispatcher("dangNhap.jsp?kt=1");
					rd.forward(request, response);
				}
			
			}
			else { 
				session.removeAttribute("dn");
				RequestDispatcher rd = request.getRequestDispatcher("dangNhap.jsp"); 
				rd.forward(request,response); 
				}
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
