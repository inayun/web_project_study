package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idValue");
		String pw = request.getParameter("pwValue");
		
		response.setContentType("text/html;charset=euc-kr");
    	PrintWriter out = response.getWriter();
    	out.println(id + "<font color='green'> Á÷¿ø´Ô, ¾È³çÇÏ¼¼¿ë</font>");    			
    	
	
	}

}
