package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.loaibean;
import bean.sachbean;
import bo.giohangbo;
import bo.loaibo;
import bo.sachbo;

/**
 * Servlet implementation class htgioControler
 */
@WebServlet("/htgioControler")
public class htgioControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public htgioControler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		HttpSession session = request.getSession();

		String masach = request.getParameter("ms");
		String tensach = request.getParameter("ts");
		long giasach = Long.parseLong(request.getParameter("gia"));
		
		loaibo lbo = new loaibo();
		ArrayList<loaibean> dsloai = lbo.getloai();
		request.setAttribute("dsloai", dsloai);

		if (masach != null) {

			giohangbo gh = null;
			// neu mua hang lan dau
			if (session.getAttribute("gio") == null) {

				gh = new giohangbo();// cap vung nho
				session.setAttribute("gio", gh);

			}
			// b1: Luu session ra bien
			gh = (giohangbo) session.getAttribute("gio");
			// b2: Thao tac tren bien
			gh.Them(masach, tensach, giasach, (long) 1);
			// b3: Luu bien vao session
			session.setAttribute("gio", gh);

		}
		
		response.sendRedirect("giohangcontroler");

//		if (masach != null) {
//			giohangbo gh = (giohangbo) session.getAttribute("gio");

//			giohangbo gh=(giohangbo)session.getAttribute("gio");

//			if (request.getParameter("butsua") != null) {
//
//				String tentb = "t" + masach;
//				long soluong = Long.parseLong(request.getParameter(tentb));
//				if (soluong == 0)
//					gh.Xoasach(masach);
//				else
//					gh.Soluong(masach, soluong);
//
//			} else if (request.getParameter("butxoa") != null) {
//				gh.Xoasach(masach);
//
//			} else if (request.getParameter("xoaall") != null) {
//				String[] gtcheck = request.getParameterValues("check");
//				if (gtcheck != null) {
//					for (String ss : gtcheck)
//						gh.Xoasach(ss);
//				} else {
//					gh.Xoaall();
//				}
//			}
//
//			if (gh.ds.size() == 0)
//				session.removeAttribute("gh");
//			else
//				session.setAttribute("gh", gh);
			
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
