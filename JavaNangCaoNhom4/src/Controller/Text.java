package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Text
 */
@WebServlet("/Text")
public class Text extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Text() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter out = response.getWriter();
		// lay ve gia tri a b
		String aa= request.getParameter("ipValue1");
		String bb= request.getParameter("ipValue2");
		long kq=0;
		if(aa!=null && bb!=null) {
			long a=Long.parseLong(aa);
			long b=Long.parseLong(bb);
			if(request.getParameter("ope") != null) {
				String ope = request.getParameter("ope");
				if(ope.equals("+")) kq = a+b;
				if(ope.equals("-")) kq = a-b;
				if(ope.equals("*")) kq = a*b;
				if(ope.equals("/")) kq = a/b;
			}
			request.setAttribute("aa", a);
			request.setAttribute("bb", b);
			request.setAttribute("kq", kq);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("Caculator.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
