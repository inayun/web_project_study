<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String url = application.getContextPath() + "/"; %>
 

<center>
<h3>��� ��� ������Ʈ list</h3>
<hr><p>

<table border="1">
	<tr>
		<th>������Ʈ id</th><th>������Ʈ��</th><th>��ɱ���� id</th>
		<th>��� ������  id</th><th>��ɱ�� ����</th>
	</tr>
	<c:forEach items="${requestScope.probonoProjectAll}" var="dataAll"> 
 		<tr>
 			<td>${dataAll.probonoProjectId}</td>
 			<td>${dataAll.probonoProjectName}</td>
 			<td><a href='probono?command=activist&activistId=${dataAll.activistId}'>${dataAll.activistId}</a></td>
 			<td><a href='${pageContext.request.contextPath}/probono?command=activist&activistId=${dataAll.receiveId}'>${dataAll.receiveId}</a></td>
 			<%-- http://ip:port/project��/probono?c~~ �� --%>
 			
 			<td>${dataAll.projectContent}</td>
 		</tr>
 	</c:forEach> 
</table>

<br><br><br>
<font color="blue">��� ����� id �� ��� ������ id�� Ŭ���ϸ� �� ���� Ȯ���� �����մϴ�</font>

</center>
</body>
</html>