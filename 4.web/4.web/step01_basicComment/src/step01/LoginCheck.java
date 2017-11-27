package step01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginCheck doGet()");
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginCheck doPost()");
		process(request, response);
	}
	
	/* 1. client �� �Է��� ������ ����
	 * 		- id/pw �����ؼ� ����
	 * 2. master��� ��ȿ
	 * 3. ��ȿ�� ��� - �ȳ��ϼ��� ������
	 * 	    ��ȿ�� ��� - ������?
	 * 	  (�ѱ��� client �������� ���)-�ѱ� ���ڵ�,���� ��ü	 */
	protected void process(HttpServletRequest request, 
										   HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("idValue");
		String pw = request.getParameter("pwValue");
		
		System.out.println(id + " " + pw);
		
		//��Ȳ�� Servlet API�� Ȱ���ؼ� servlet�� �̵�(page�̵�)
		if(id.equals("master")){
			//�������� ������� Success.java �̵�
			//������ ���� �����ؼ� Ȱ��
			
			//������ ���� - key�� value ������ ����
			request.setAttribute("msg", "����");
			request.setAttribute("name", "����");
			
			//�̵� ������ API : ��ü ���� -> �޼ҵ�� �̵�
			//LoginCheck�� Success�� �ϳ��� �������� ����
			/* client���� ���� ����? Success�� ���� ó�� �Ϸ�� */
			RequestDispatcher rd = request.getRequestDispatcher("succ");
			rd.forward(request, response);
			
		}else{
			//�����̷�Ʈ��� ������� Fail.java
			/* �̵� URL ��θ� client���� �����ϰ� LoginCheck�� ����
			 * client �������� fail ������ �� ��û
			 * http://ip:port/project��:port/fail ��û	 */
			response.sendRedirect("fail");
		}
	}
}









