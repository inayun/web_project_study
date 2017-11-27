package step01.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Fail extends HttpServlet {
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Fail doGet()");
			process(request,response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("Fail doPost()");
			process(request,response);
		}
		
		protected void process(HttpServletRequest request, 
				HttpServletResponse response) throws ServletException, IOException {
			
			
			//client�� web query string ������ �ѱ� ������ ȹ��
			String id = request.getParameter("idValue");
			String pw = request.getParameter("pwValue");
			
			System.out.println(id+ "" + pw);
			
			//������ ���� �� servlet ���� setAttribute() �� ������ ������ ȹ��
			String msg = (String)request.getAttribute("msg");
			String name = (String)request.getAttribute("name");
			
			
			response.setContentType("text/html;charset=euc-kr");
			PrintWriter out = response.getWriter();
			
			out.println("�� ������?" + id + " ��" + name);
		
			
		}

}
