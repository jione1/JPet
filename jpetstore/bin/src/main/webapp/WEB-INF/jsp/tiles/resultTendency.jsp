<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
����� ������!<br/>
<c:choose>
	<c:when test="${resultPage=='dog'}"><br/>
		 <img border="0" src="../images/Tendency_dog.png" width=500 height=400 /><br/><br/>
		 <a href="<c:url value="/shop/viewCategory.do?categoryId=DOGS"/>">������ ��������</a>
	</c:when>
	<c:when test="${resultPage=='cat'}"><br/>
		<img border="0" src="../images/Tendency_cat.jpg" width=500 height=400/><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=CATS"/>">����� ��������</a>
	</c:when>
	<c:when test="${resultPage=='bird'}"><br/>
		<img border="0" src="../images/Tendency_bird.jpg" width=600 height=300/><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=BIRDS"/>">�� ��������</a>
	</c:when>
	<c:when test="${resultPage=='fish'}"><br/><!-- ������ �������� ������ ����� -->
		<img border="0" src="../images/Tendency_fish&rep.PNG" width=600 height=300 /><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=REPTILES"/>">������ ��������</a><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>">����� ��������</a>
	</c:when>
</c:choose>

 <br>
</body>
</html>