<%@ page language="java" 
contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page import="model.CustomerVo,java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>모든 고객 보기</title>
</head>
<body>
<center>  
<h3>모든 고객 보기</h3>

<table border="1"  width="70%">
	<tr>
		<td width="20%">id</td>
		<td width="20%">이름</td>
		<td width="40%">이메일 주소</td>
		<td width="20%">탈퇴</td>
	</tr>	

	<c:choose>
	<c:when test="${not empty requestScope.allList || fn:length(allList)!=0}">
		<c:forEach items="${requestScope.allList}" var="data">
		<tr>
	 	<td>${data.id}</td>
	 	<td>${data.name}</td>
	 	<td>${data.email}</td> 
	 	<td><a href="CustomerServlet?command=delete&id=${data.id}"><button>탈퇴하기</button></a>
	 	</tr>
	 </c:forEach>
	 </c:when>
	 
	 <c:otherwise>
	 	<tr>
	 	<td colspan="4"> 데이터가 없습니다.
	 	</tr>
	 </c:otherwise>
	 </c:choose>
	 
	
</table>
<p>
<a href="index.html">메인으로 이동</a>
</center>
</body>
</html>
