<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>W3.CSS</title>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1">
 -->
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style type="text/css">
.footer {
	position: relative;
	text-align: center;
	width: 100%;
	height: 50px;
	bottom: 0;
	left: 0;
	line-height: 50px;
}
</style>

</head>
<body>


<%-- ��� web page���� ���������� ���Ǵ� �޴��� ���� ��� �ش� �޴� ������θ� ������ jsp 
	header.jsp �� �и��ؼ� ����
	�ʿ��� ��ġ(jsp�� ���ؼ�)���� ������ ����
	<jsp:include page="�����ϰ��� �ϴ� jsp"/>
	- �ǽð� header.jsp�� ������ ��� ���� �� ���������ʰ� �ǽð�
	 ���� ������ client���� ���� ����
	 
	 <%@ include file="���Խ�ų html or jsp" %>
	 - ���ԵǴ� ���� �ǽð� �����ص� �ݿ��� �ȵ�
	 - ���� jsp�� ��û�� ��� servlet���� ��ȯ�ÿ��� �����ϴ� tag
	
	--%>
<div>
  <jsp:include page="header.jsp"/>
</div>


<div class="w3-container" style="height: 80%">
  homeȭ���Դϴ�.<br><br><Br><br><br><Br>
 
</div>




<%-- class �Ӽ��� ������ 
class = "footer"
class = "w3-container"
class = "w3-red"
--%>


<div  class="footer w3-container w3-red " style="height: 10%;">
	<%@ include file="footer.html" %>
</div>



</body>
</html>

