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
	/* 요청 객체의 한글 인코딩 설정
	 * 1. get 방식 : 벤더사별 서버 설정 정보 상이함
	 * 	-server.xml 의 63line
	 * 2. post 방식: servlet api 메소드로 처리
	 */
	protected void process(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			System.out.println(request.getParameter("data"));
	}

}
