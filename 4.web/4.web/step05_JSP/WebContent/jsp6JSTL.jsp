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
	jstl 반복 tag로 자바 데이터 출력 <br>
	
	<%
	Person p1 = new Person("윤진","111");
	Person p2 = new Person("인아","111");
	String s1 = "문자열1";
	String s2 = "문자열2";
	
	ArrayList list1 = new ArrayList();
	HashMap map1 = new HashMap();
		
	%>
	
	1. ArrayList에 데이터 저장해서 EL 로 출력 <br>
		1-1.EL tag로 변수명 호출																																																																																																																																																																																																																																																																																																																																																																																																																																																				444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444시 getXxx() 자동 호출, 따라서 getXxx()는 필요<br>
	<%
	list1.add(s1);
	list1.add(s2);
	list1.add(p1);
	list1.add(p2);
	session.setAttribute("list", list1);
	%>
	
	${sessionScope.list[2].id}
	
	<br><hr><br>
	2. HashMap에 데이터 저장해서 EL 로 출력<br>
	 	2-1. key 로 데이터 관리하는 구조<br>
	 	
	 	<%
	 	map1.put("k1",p1);
	 	map1.put("k2",p2);
	 	map1.put("k3",s1);
	 	map1.put("k4",s2);
	 	
	 	request.setAttribute("map", map1);
	 	%>
	 	 
	 	k1과 매핑된 person 객체의 id 값  - ${requestScope.map.k1.id}<br>
	 	k2에 매핑된 person 객체의 id 값 - ${requestScope.map.k2.id}<br>
	 	k2에 매핑된 person 객체의 pw 값 - ${requestScope.map.k2.pw}<br>
	 	k3에 매핑된 문자열 값 - ${requestScope.map.k3}<br>
	 	
	 	<br><hr><br>
	 	
	 	3. session에 단순 Person 객체 저장해서 각 멤버값 출력 <br>
	 	
	 	<%
	 	session.setAttribute("p", p1);
	 		%>
	 	${sessionScope.p.id} - ${sessionScope.p.pw}
	 	
	 	<br><hr><br>
	 
	 	4. forEach 를 활용한 데이터값 출력 <br>
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
	 
	 	//모든 유저가 공유하는 survletcontext 객체
	 	application.setAttribute("allData3", list3);

	 	%>

		<c:forEach items="${applicationScope.allData3}" var="data">
			${data.id} - ${data.pw}<br>
		</c:forEach>

</body>

</html>