/*
 *  �������� �߻��ϴ� �پ��� ����� ���� ó��
 *  
 *  1�ܰ� : ���û���� ����
 *  ����� �� 1: �α��� ��û
 *  ����� �� 2: ȸ������ ��û
 *  2�ܰ�: ��û ������ ���� ����
 *  3�ܰ�: ����� ����� ���� view ����
 *  	�α��� �� ���
 *  		����� �� 1 : ��ȿ
 *  		����� �� 2 : ��ȿ
 *  	ȸ�������� ���
 *  		����� �� 1 : ��ȿ
 *  		����� �� 2 : ��ȿ
 *  			-��� : id �ߺ�
 *  	
 */

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
	// get/post ��� ��δ� ó��
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String command = request.getParameter("command");
		
		if(command != null){ //���� ������� �����û, ������ null�� �Ѿ��
			if(command.equals("login")){
				//DAO�� �Ϲ� �޼ҵ� ȣ������� ���� �Ϸ� ����
				if(true){
					String id = request.getParameter("id");
					String pw = request.getParameter("pw");
					HttpSession session = request.getSession(); //���ǻ���
					System.out.println("������ ������ id��"+session.getId());
					session.setAttribute("id", id);
					session.setAttribute("pw", pw);
					session.setAttribute("name", "�ξ�");
					response.sendRedirect("nameSave");
					
					/* page�̵� ��İ� �����ϰ� �ش� client���� �������� ���� ���� ���
					 * 	- ���� �޸� Ȱ��
					 * 	- ����
					 * 		: ���� ���� -> ���� ������ ����
					 * 	- ���� ���
					 * 		������ ���� new ���� �Ұ�
					 * 		��? ���� ������ app~�� ���� �Ҽ� �ְ� �����ϴ� controller�� ���
					 * 		container���� ��û�ؼ� �޾Ƽ� ����ϴ� ����
					 */
					
					
					
				}else{
					request.setAttribute("ErrorMsg","�α��� ����");
					request.getRequestDispatcher("fail").forward(request,response);
				}
				
			}else if(command.equals("insert")){
				//DAO�� insert ���� ȣ���̶� ����
				
				if(true){
					
					// id/pw���� ��Ű�� ������ client �ý��ۿ� ���� �����ϱ�
					Cookie c1 = new Cookie("id",request.getParameter("id"));
					Cookie c2 = new Cookie("pw",request.getParameter("pw"));
					
					//��Ű ���� �ð�
					c1.setMaxAge(60*60*24*365); //1������ ����
					c2.setMaxAge(60*60*24*365);
					response.addCookie(c1);
					response.addCookie(c2);

					
					response.sendRedirect("cookieView.jsp");
				}else{
					request.setAttribute("ErrorMsg","���� ����");
					request.getRequestDispatcher("fail").forward(request,response);
				}
				
			} else{
				//���� ������ ���� ��û�� �ƴ� ��� ���
				response.sendRedirect("login.html");
			}
		}
		
		
	}

}
