package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class View2 extends HttpServlet {
	
	//client ½Ã½ºÅÛÀ¸·ÎºÎÅÍ cookie Á¤º¸¸¦ È¹µæ - ÇØ´ç domain °Í¸¸ È¹µæ
	//ÄíÅ° È¹µæ -> º°ÄªÀ¸·Î °ªÀ» È¹µæ ¹× È°¿ë
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html;charset=euc-kr");
	PrintWriter out = response.getWriter();
	
	Cookie [] all = request.getCookies(); //¿©·¯°³ °¡Á®¿Ã°Å´Ï±î ¹è¿­·Î ¹ÞÀ½
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
