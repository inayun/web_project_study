<%@ page language="java" contentType="text/html; charset=EUC-KR"  pageEncoding="EUC-KR" import="model.*"%>

<html> 
<head>
<title>ȸ������ ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>

<body>

<center>
	<h3>���� ȸ�� ���� ����</h3>
	<br>
	  <!-- view Form  -->
	 <form action="CustomerServlet" method="post">
	 	<!-- ���� ���� �����ϴ� update.jsp���� Ȱ��� ����Ÿ�� hidden tag�� ���� -->
	  
	  <table border="1" cellspacing="1" width="60%">
		  <tr>
			<td width=30%>����� ���̵�</td>
			<td width=70%>
				${cvo.id}</td>
		  </tr>
		  <tr>
			<td width="30%">��й�ȣ</td>
			<td width="70%">
			  ${cvo.password}				
			</td>
		  </tr>
		  <tr>
			<td width="30%">�̸�</td>
			<td width="70%">
			 ${cvo.name}
			</td>
		  </tr>
		  <tr>
			<td width="30%">�̸��� �ּ�</td>
			<td width="70%">
			  ${cvo.email}
			</td>
		  </tr>		  
	  </table>	
	  <br><br>	  

		<input type="button" value="update" Onclick="location.href='update.jsp'">&nbsp;
		<input type="submit" value="allView">
		<input type="hidden" name="command" value="allView">
	 </form>
</center>	  


</body>
</html>
