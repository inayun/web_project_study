<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	EL tag 학습
	<br> 1. 주목적 : view 는 view 답게 개발 권장
	<br> 2. 형식 : tag 위주의 파일
	<br>

	<br><hr><br>
	1. 단순 연산 및 비교 연산자<br>
	<table border="1">
		<tr>
			<td>2+3</td>
			<td>${2+3}</td>
		</tr>
		<tr>
			<td>a==a</td>
			<td>${'a'=='a'}</td>
		</tr>
		<tr>
			<td>3!=3</td>
			<td>${3!=3}</td>
		</tr>
	</table>

	<br><hr><br>
	2. 자바의 데이터를 EL 로 출력해보기
	혹여 데이터 미 존재시 브라우저엔 blank 출력<br>
	<%
	/** 데이터 유지 방식
		1. forward 방식 사용 사유
		- request 에 데이터 저장 및 활용
		2. session 사용 사유
		- page 이동 방식과 무관하게 데이터를 유지(상태유지)
		3. 모든 user가 공유하는 자원은 servletContext 라는 객체인 application 활용
		
		
		* jsp는 내장 객체 존재 (필수로 암기) 
			1. request
			2. session
			3. application	
			-데이터 저장 메소드 : setAttribute(Object key,Object value)
			-데이터 반환 메소드 : Object getAttribute(Object key)
			-데이터 삭제 메소드 : removeAttribute(Object key)
			
			3개가 키값이 같을때는 request -> session -> application 순으로 밸류값 나옴
			*/
			
		request.setAttribute("ff","data1");
		session.setAttribute("ff","data2");
		application.setAttribute("ff","data3");
		
	%>
		
	<%= request.getAttribute("ff") %> <br>
	<% out.println( request.getAttribute("ff")); %> <br>
	
	${requestScope.ff}	
	${ff} 
	
		
		

</body>
</html>