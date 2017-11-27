package step01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DataView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		process(request,response);

	}
	/* ��û ��ü�� �ѱ� ���ڵ� ����
	 * 1. get ��� : �����纰 ���� ���� ���� ������
	 * 	-server.xml �� 63line
	 * 2. post ���: servlet api �޼ҵ�� ó��
	 */
	protected void process(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			System.out.println(request.getParameter("data"));
	}

}
