package step01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idValue");
		String pw = request.getParameter("pwValue");

		response.setContentType("text/html;charset=euc-kr");
		
		if(id.equals("boss")&& pw.equals("1111")){
			request.setAttribute("name", "À±ÀÎ¾Æ");
			RequestDispatcher rd = request.getRequestDispatcher("Boss.jsp");
			rd.forward(request, response);
		} else if(id.equals("employee")){
			RequestDispatcher rd = request.getRequestDispatcher("Boss.jsp");
			request.setAttribute("name", "Á÷¿ø");
			rd.forward(request, response);
		} else {
			response.sendRedirect("fail");
		}

	}

}
