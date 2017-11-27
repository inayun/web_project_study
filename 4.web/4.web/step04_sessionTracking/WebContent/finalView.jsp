<%@ page contentType="text/html; charset=euc-kr" pageEncoding="euc-kr" %>



		<% System.out.println("finalView.jsp"); %>
		id<br>
		${id}<br>
		name<br>
		${name}<br>
		pw <br>
		${pw}<br>
		test <br>
		${test}	<br>	
		
		<%
		session.invalidate();
		session = null;
		%>

