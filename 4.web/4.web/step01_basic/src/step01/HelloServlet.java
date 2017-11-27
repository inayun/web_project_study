/* �н�����
 * 1. client �� ��û�ϴ� url?
 * 	- http://localhost:80/step01_basic/HelloServlet
 * 	- http://ip:port/ptoject��/���/���ϸ�
 * 
 * 2. test�ܰ�
 * 	1�ܰ� : ������ �ش� ������Ʈ ���
 * 	2�ܰ� : ���� ���� (������ ������ Ȯ��)
 * 	3�ܰ� : client ������ ����
 * 	4�ܰ� : �귯������ url �Է�
 * 
 */

package step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
       
	//������ client�� ȣ������� �� �ѹ�
    public HelloServlet() {
    	System.out.println("������");
    }
    //client ��û ����ŭ �ڵ� ȣ��
    //get ��� ��û ó�� �޼ҵ�
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet()----");
    	
    	/* 1. ����  �������� �ѱ� ���ڵ� ����
    	 * 2. 2byte�� ����ϴ� ��� ��ü ���� (PrintWriter)
    	 * 3. �������� ���  */

    	// ���� ����� ��ü�� html/�ѱ� ���� ������ ����
    	response.setContentType("text/html;charset=euc-kr");
    	//�������� ����� ���� ���� ��ü�κ��� ��°�ü �����ؼ� ����
    	PrintWriter out = response.getWriter();
    	out.println("<font color='green'>����</font>");    			
    	
	}
	//post ��� ��û ó�� �޼ҵ�
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost()");

	}

}



