<%@ page language="java" 
contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="model.CustomerVo,java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��� �� ����</title>
</head>
<body>
<center>  
<h3>��� �� ����</h3>

<table border="1"  width="70%">
	<tr>
		<td width="20%">id</td>
		<td width="20%">�̸�</td>
		<td width="40%">�̸��� �ּ�</td>
		<td width="20%">Ż��</td>
	</tr>	

	<c:choose>
	<c:when test="${not empty requestScope.allList || fn:length(allList)!=0}">
		<c:forEach items="${requestScope.allList}" var="data">
		<tr>
	 	<td>${data.id}</td>
	 	<td>${data.name}</td>
	 	<td>${data.email}</td> 
	 	<td><a href="CustomerServlet?command=delete&id=${data.id}"><button>Ż���ϱ�</button></a>
	 	</tr>
	 </c:forEach>
	 </c:when>
	 
	 <c:otherwise>
	 	<tr>
	 	<td colspan="4"> �����Ͱ� �����ϴ�.
	 	</tr>
	 </c:otherwise>
	 </c:choose>
	 
	
</table>
<p>
<a href="index.html">�������� �̵�</a>
</center>
</body>
</html>
