<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 

<table align="center" border="0" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
	<tr>
        <td bgcolor="#336699">
            <p align="center">
            <font color="white"><b><span style="font-size:9pt;">�� ȣ</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">�� ��</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">�� �� ��</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">�� �� ��</span></b></font></p>
        </td>
        <td bgcolor="#336699">
            <p align="center"><font color="white"><b><span style="font-size:9pt;">�� ȸ ��</span></b></font></p>
        </td>
    </tr>
    
	 <%--? �����Ͱ� ���� ��� ��� �κ� --%>
	<c:if test="${empty requestScope.list}">
		<tr>
	        <td colspan="5">
	            <p align="center"><b><span style="font-size:9pt;">��ϵ� ������ �����ϴ�.</span></b></p>
	        </td>
	    </tr>
	</c:if>


	<%-- ArrayList��  GuestBookBean �� ������ ��� ��� ���� --%>
	<c:forEach items="${requestScope.list}" var="data">
		    <tr>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">${data.num}</span></p>
		        </td>
		        <td bgcolor="">
					<p><span style="font-size:9pt;">
					<a href="guestbook.do?command=read&num=${data.num}">${data.title}</a></span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
						<a href="mailto: ${data.email}">
						 ${data.author}</a>
					</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
		             ${data.writeday}</span></p>
		        </td>
		        <td bgcolor="">
		            <p align="center"><span style="font-size:9pt;">
		             ${data.readnum}</span></p>
		        </td>
		    </tr>
	</c:forEach>
 	
    <tr>
        <td bgcolor="">
            <p align="center"><span style="font-size:9pt;"></span></p>
        </td>
        <td bgcolor="">
			<p><span style="font-size:9pt;"><a href="ReadAContent.jsp?num= "></a></span></p>
        </td>
        <td bgcolor="">
            <p align="center"><span style="font-size:9pt;">
				<a href="mailto:"></a>
			</span></p>
        </td>
        <td bgcolor="">
            <p align="center"><span style="font-size:9pt;"></span></p>
        </td>
        <td bgcolor="">
            <p align="center"><span style="font-size:9pt;"></span></p>
        </td>
    </tr>

</table>
<hr>
<div align=right>
<span style="font-size:9pt;">&lt;<a href="write.html">�۾���</a>&gt;</span></div>

