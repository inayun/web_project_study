<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
   <!-- html �ּ�, client �� �ҽ��� ���� ����, jsp ������ �Ͻ�, ���� ���� ����, import ���� ���� -->
   
   <%-- 
   1. jsp���� �ּ� : client �������� ���� ����, client�� �ҽ��ε� �� �� ����, ������ ����� �ּ��� ����
   1 line tag : page ������ 
   --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	jsp Scripting tag jsp �н�<br>
	1. 5����
	2. ���� <br>
		1.�������/��� �޼ҵ� ���� ������ tag <br> <%! %>
		2.import/���� ���� ���� tag<br> <!--  -->
		3.���� �ڹ� �ڵ� ���� ������ tag<br>  <% %>
		4.�������� ��� ���� tag<br> <%= %>
		5.jsp���� �ּ�<br> <%-- --%>
		
	<%!
		//��� ������ �޼ҵ� ���� tag
		String msg = "�� ���";
		String getMsg(){
			return msg;
		}
	%>
	
	<%
		//client �� 1:1 ����Ǵ� ��� ����, �޼ҵ� ���� tag, ���� �ڹ� �ڵ� ���� ����
		// *** jsp ���� : ���� ��ü�� �̹� ���� / suvlet�� printWriter ��ü�� �����߾����
		out.println(getMsg());
	
	%>
	<br>
	<%-- ��� ���� tag --%>
	<%= msg%>

</body>
</html>