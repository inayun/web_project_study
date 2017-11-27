<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>모든 Activist list 화면</title>
</head>
<body>
<br><br><br>
<center>
<h3>재능 기부자 list</h3>
<hr><p>

<table border="1">
	<thead>
		<tr>
			<th>기부자 id</th><th>기부자 이름</th><th>주요 분야</th>
		</tr>
	</thead>
	 <c:if test="${not empty requestScope.activistAll || fn:length(activistAll)!=0}">
	<c:forEach items="${requestScope.activistAll}" var="dataAll"> 
 		<tr>
 			<td><a href="probono?command=activist&activistId=${dataAll.id}">${dataAll.id}</a></td>
 			<td>${dataAll.name}</td>
 			<td>${dataAll.major}</td>
 		</tr>
 	</c:forEach> 
 	 </c:if>
</table>

<br><br><br>
<font color="blue">재능 기부자 id를 클릭하면 상세 정보 확인이 가능합니다</font>

</center>
</body>
</html>