package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class View2 extends HttpServlet {
	
	//client �ý������κ��� cookie ������ ȹ�� - �ش� domain �͸� ȹ��
	//��Ű ȹ�� -> ��Ī���� ���� ȹ�� �� Ȱ��
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html;charset=euc-kr");
	PrintWriter out = response.getWriter();
	
	Cookie [] all = request.getCookies(); //������ �����ðŴϱ� �迭�� ����
	for(int i = 0; i<all.length; i++){
		if(all[i].getName().equals("id")){
			out.println("id = " + all[i].getValue());
		} else if(all[i].getName().equals("pw")){
			out.println("<br> pw = " + all[i].getValue());

		}
	}
	for(int i = 0; i<all.length; i++){
		all[i].setValue("");
		all[i].setMaxAge(0);
		response.addCookie(all[i]);
	}
	
	
	}

}
