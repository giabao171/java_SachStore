package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
import bean.loaibean;
import bo.chitiethoadonbo;
import bo.giohangbo;
import bo.hoadonbo;
import bo.loaibo;
import dao.chitiethoadondao;

/**
 * Servlet implementation class xoasuaControler
 */
@WebServlet("/xoasuaControler")
public class xoasuaControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public xoasuaControler() {
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

		HttpSession session = request.getSession();
		giohangbo gh = (giohangbo) session.getAttribute("gio");
		/*
		 * while(d.hasMoreElements()){ String tendk=d.nextElement();
		 * if(request.getParameter(tendk)!=null){ String gt=request.getParameter(tendk);
		 * out.println(tendk+":"+gt+"<br>");
		 */

		if (request.getParameter("xnmua") != null) {
//			RequestDispatcher rd = request.getRequestDispatcher("xacnhanmuaController");
//			rd.forward(request,response);
			response.sendRedirect("xacnhanmuaController");
		} else {
			if (request.getParameter("butsua") != null) {
				String masach = request.getParameter("butsua");
				String tentb = "t" + masach;
				long soluong = Long.parseLong(request.getParameter(tentb));
				if (soluong == 0)
					gh.Xoasach(masach);
				else
					gh.Soluong(masach, soluong);

			} else if (request.getParameter("butxoa") != null) {
				String masach = request.getParameter("butxoa");
				gh.Xoasach(masach);

			} else if (request.getParameter("xoaall") != null) {
				String[] gtcheck = request.getParameterValues("check");
				if (gtcheck != null) {
					for (String ss : gtcheck)
						gh.Xoasach(ss);
				} else {
					gh.Xoaall();
				}
			}

			session.setAttribute("gio", gh);
			if (gh.ds.size() == 0)
				response.sendRedirect("sachserverlet");
			else
				response.sendRedirect("giohangcontroler");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
