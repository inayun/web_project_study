<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" import="model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>���� ���� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>
<body>
<%
   CustomerVo cvo = (CustomerVo)session.getAttribute("cvo");
%>
<br>
<center>
<h3>���� ���� �����ϱ�</h3>
<br>

<form action="CustomerServlet" method="post">

	<input type="hidden" value="update"  name="command">

	  <!-- update Form  -->	
	  <table border="1" cellspacing="1" width="60%">
		  <tr>
			<td width=30%>����� ���̵�</td>
			<td width=70%>	
				${cvo.id}
				<input type="hidden" name="id" value="${cvo.id}">
			</td>
		  </tr>
		  <tr>
			<td width="30%">�̸�</td>
			<td width="70%">	
				${cvo.name}
				<input type="hidden" name="name" value="${cvo.name}">
			</td>
		  </tr>
		  <tr>
			<td width="30%">��й�ȣ ����</td>
			<td width="70%">
				<input type="password" name="password" value="${cvo.password}">
			</td>
		  </tr>			  
		
		  <tr>
			<td width="30%">�̸��� �ּ�</td>
			<td width="70%">
				<input type="text" name="email" value="	${cvo.email}">
			</td>		  
		  <tr>				  
	</table>  
	<p/>

	<input type="submit" value="����" >&nbsp;
	<input type="reset" value="���">&nbsp;
	<input type="submit" value="��κ���" name="allList">
</form>

</body>
</html>
