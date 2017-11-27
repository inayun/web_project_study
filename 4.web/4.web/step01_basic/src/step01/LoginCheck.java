package step01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginCheck doGet()");
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginCheck doPost()");
		process(request, response);
	}

	/*
	 * 1. client 가 입력한 데이터 착출 -id/pw 구분해서 착출 2. master라면 유효 3. 유효한 경우 - 안녕하세요
	 * 누구님 무효한 경우 - 누구야? (한글을 client 브라우저에 출력)
	 * 
	 */
	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("idValue");
		String pw = request.getParameter("pwValue");

		System.out.println(id + "" + pw);
		response.setContentType("text/html;charset=euc-kr");

		// 상황별 servlet API를 활용해서 servlet간 이동(page 이동)
		if (id.equals("master")) {
			// 포워드 방식으로 Success.java 이동
			// 데이터 새로 저장해서 활용 가능

			// 데이터 저장 - key와 value 구조로 저장
			request.setAttribute("idValue", "식후");
			request.setAttribute("name", "인아");


			// 이동 가능한 API : 객체 생성 -> 메소드로 이동
			// LoginCheck와 success는 하나의 서블릿으로 간주
			// client에게 응답시점? success가 로직 처리 완료시
			RequestDispatcher rd = request.getRequestDispatcher("succ");
			rd.forward(request, response);
		} else {
			// 리다이렉트라는 방식으로 Fail.java 이동
			// 이동 URL 경로만 client에게 응답하고 loginCheck는 종료
			// http://ip:port/project명:port/fail 요청 
			response.sendRedirect("fail");
		}

	}

}
