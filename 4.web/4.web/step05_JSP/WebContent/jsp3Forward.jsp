<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
     <%
    System.out.println("jsp3Forward.jsp");
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jsp3Forward.jsp</title>
</head>
<body>

	������ �Է�(web query string ����)�ؼ�
	jsp4Forward.jsp �� �������ϱ�
	
	
	<%-- jsp tag �� forward ������� ȭ�� �̵� 
	http://ip:port/project��/view/jsp4Forward.jsp?msg=master
	--%>
	
	<jsp:forward page="./view/jsp4Forward.jsp">
		<jsp:param value="master" name="msg"/>
	</jsp:forward>
	
	
</body>
</html>