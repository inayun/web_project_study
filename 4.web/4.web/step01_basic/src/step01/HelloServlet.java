/* 학습내용
 * 1. client 가 요청하는 url?
 * 	- http://localhost:80/step01_basic/HelloServlet
 * 	- http://ip:port/ptoject명/경로/파일명
 * 
 * 2. test단계
 * 	1단계 : 서버에 해당 프로젝트 등록
 * 	2단계 : 서버 실행 (서버의 안정성 확인)
 * 	3단계 : client 브라우저 오픈
 * 	4단계 : 브러우저에 url 입력
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
       
	//최초의 client가 호출됬을때 단 한번
    public HelloServlet() {
    	System.out.println("생성자");
    }
    //client 요청 수만큼 자동 호출
    //get 방식 요청 처리 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet()----");
    	
    	/* 1. 응답  데이터의 한글 인코딩 설정
    	 * 2. 2byte씩 출력하는 출력 객체 생성 (PrintWriter)
    	 * 3. 브라우저로 출력  */

    	// 응답 기능의 객체가 html/한글 응답 구조로 변경
    	response.setContentType("text/html;charset=euc-kr");
    	//브라우저에 출력을 위한 응답 객체로부터 출력객체 생성해서 받음
    	PrintWriter out = response.getWriter();
    	out.println("<font color='green'>집중</font>");    			
    	
	}
	//post 방식 요청 처리 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost()");

	}

}



