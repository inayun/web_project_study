<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" import="model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>개인 정보 수정</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<%
   CustomerVo cvo = (CustomerVo)session.getAttribute("cvo");
%>
<br>
<center>
<h3>개인 정보 수정하기</h3>
<br>

<form action="CustomerServlet" method="post">

	<input type="hidden" value="update"  name="command">

	  <!-- update Form  -->	
	  <table border="1" cellspacing="1" width="60%">
		  <tr>
			<td width=30%>사용자 아이디</td>
			<td width=70%>	
				${cvo.id}
				<input type="hidden" name="id" value="${cvo.id}">
			</td>
		  </tr>
		  <tr>
			<td width="30%">이름</td>
			<td width="70%">	
				${cvo.name}
				<input type="hidden" name="name" value="${cvo.name}">
			</td>
		  </tr>
		  <tr>
			<td width="30%">비밀번호 수정</td>
			<td width="70%">
				<input type="password" name="password" value="${cvo.password}">
			</td>
		  </tr>			  
		
		  <tr>
			<td width="30%">이메일 주소</td>
			<td width="70%">
				<input type="text" name="email" value="	${cvo.email}">
			</td>		  
		  <tr>				  
	</table>  
	<p/>

	<input type="submit" value="수정" >&nbsp;
	<input type="reset" value="취소">&nbsp;
	<input type="submit" value="모두보기" name="allList">
</form>

</body>
</html>
