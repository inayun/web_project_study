package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nameValue");
		String position = request.getParameter("position");

		response.setContentType("text/html;charset=euc-kr");
    	PrintWriter out = response.getWriter();
    	out.println("<font color='green'>" + name + " 직원님, " + position + " 부서에 오신걸 환영합니다 !</font>");    
		
    	
	
	}

}
