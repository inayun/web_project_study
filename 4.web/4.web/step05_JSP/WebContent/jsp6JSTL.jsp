<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.domain.Person"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jsp6JSTL.jsp</title>
</head>

<body>
	jstl �ݺ� tag�� �ڹ� ������ ��� <br>
	
	<%
	Person p1 = new Person("����","111");
	Person p2 = new Person("�ξ�","111");
	String s1 = "���ڿ�1";
	String s2 = "���ڿ�2";
	
	ArrayList list1 = new ArrayList();
	HashMap map1 = new HashMap();
		
	%>
	
	1. ArrayList�� ������ �����ؼ� EL �� ��� <br>
		1-1.EL tag�� ������ ȣ��																																																																																																																																																																																																																																																																																																																																																																																																																																																				444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444�� getXxx() �ڵ� ȣ��, ���� getXxx()�� �ʿ�<br>
	<%
	list1.add(s1);
	list1.add(s2);
	list1.add(p1);
	list1.add(p2);
	session.setAttribute("list", list1);
	%>
	
	${sessionScope.list[2].id}
	
	<br><hr><br>
	2. HashMap�� ������ �����ؼ� EL �� ���<br>
	 	2-1. key �� ������ �����ϴ� ����<br>
	 	
	 	<%
	 	map1.put("k1",p1);
	 	map1.put("k2",p2);
	 	map1.put("k3",s1);
	 	map1.put("k4",s2);
	 	
	 	request.setAttribute("map", map1);
	 	%>
	 	 
	 	k1�� ���ε� person ��ü�� id ��  - ${requestScope.map.k1.id}<br>
	 	k2�� ���ε� person ��ü�� id �� - ${requestScope.map.k2.id}<br>
	 	k2�� ���ε� person ��ü�� pw �� - ${requestScope.map.k2.pw}<br>
	 	k3�� ���ε� ���ڿ� �� - ${requestScope.map.k3}<br>
	 	
	 	<br><hr><br>
	 	
	 	3. session�� �ܼ� Person ��ü �����ؼ� �� ����� ��� <br>
	 	
	 	<%
	 	session.setAttribute("p", p1);
	 		%>
	 	${sessionScope.p.id} - ${sessionScope.p.pw}
	 	
	 	<br><hr><br>
	 
	 	4. forEach �� Ȱ���� �����Ͱ� ��� <br>
	 	<%
	 	ArrayList list2 = new ArrayList();
	 	list2.add("Aa");
	 	list2.add("ddd");
	 	list2.add("Dfd");
	 	list2.add("rrrrrr");
	 	list2.add("sss");
	 	list2.add("ffffff");
	 	list2.add("?");
	 	list2.add("!");
	 	
	 	application.setAttribute("allData", list2);

	 	%>
	 	
	 	<c:forEach items="${applicationScope.allData}" var="data">
	 		${data}-
	 	</c:forEach>
	 	
	 	<br><hr><br>

	<%
	 	ArrayList list3 = new ArrayList();
	 	list3.add(new Person("1","wrr"));
	 	list3.add(new Person("2","dfs"));
	 	list3.add(new Person("3","fff"));
	 
	 	//��� ������ �����ϴ� survletcontext ��ü
	 	application.setAttribute("allData3", list3);

	 	%>

		<c:forEach items="${applicationScope.allData3}" var="data">
			${data.id} - ${data.pw}<br>
		</c:forEach>

</body>

</html>