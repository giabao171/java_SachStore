package Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.giohangbean;
import bean.khachhangbean;
import bo.chitiethoadonbo;
import bo.giohangbo;
import bo.hoadonbo;

/**
 * Servlet implementation class xacnhanmuaController
 */
@WebServlet("/xacnhanmuaController")
public class xacnhanmuaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xacnhanmuaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		giohangbo gh=(giohangbo)session.getAttribute("gio");
		try {
			if (session.getAttribute("dn") != null ) {
				if (session.getAttribute("gio") != null) {
					khachhangbean khbean = (khachhangbean)session.getAttribute("dn");
					hoadonbo hdbo = new hoadonbo();
					Date d=new Date(); 
					int themhd = hdbo.ThemHD(khbean.getMakh(), d, true);
					
					if(themhd == 1) {
						chitiethoadonbo cthdbo = new chitiethoadonbo();
							 for(giohangbean s : gh.ds){ 
								 int themcthd =cthdbo.ThemCTHD(s.getMasach(), (int)s.getSoluong(), (long)hdbo.MaHoaDon(), false); 
							 }
							 session.setAttribute("gio", new giohangbo());
							 response.sendRedirect("giohangcontroler");
					}
					
//					response.sendRedirect("htgioControler");
				}
//				else {
//					response.sendRedirect("giohangControler");
//				}
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("ktdn");
				rd.forward(request,response);
			}
		} catch (Exception e) {
			// TODO: handle exception
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
