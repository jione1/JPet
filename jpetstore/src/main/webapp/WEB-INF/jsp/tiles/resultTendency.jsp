<%@ page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<section class="bgwhite p-t-66 p-b-60">
<div class="container" style="margin-left: 500px">
<h1>당신의 성향은</h1>
<c:choose>
	<c:when test="${resultPage=='dog'}"><br/>
		 <img border="0" src="../images/Tendency_dog.png" width=500 height=400 /><br/><br/>
		 <a href="<c:url value="/shop/viewCategory.do?categoryId=DOGS"/>">강아지 보러가기</a>
	</c:when>
	<c:when test="${resultPage=='cat'}"><br/>
		<img border="0" src="../images/Tendency_cat.jpg" width=500 height=400/><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=CATS"/>">고양이 보러가기</a>
	</c:when>
	<c:when test="${resultPage=='bird'}"><br/>
		<img border="0" src="../images/Tendency_bird.jpg" width=600 height=300/><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=BIRDS"/>">새 보러가기</a>
	</c:when>
	<c:when test="${resultPage=='fish'}"><br/><!-- 물고기와 도마뱀의 성향은 비슷함 -->
		<img border="0" src="../images/Tendency_fish&rep.PNG" width=600 height=300 /><br/><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=REPTILES"/>">도마뱀 보러가기</a><br/>
		<a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>">물고기 보러가기</a>
	</c:when>
</c:choose>

 <br>
</div>
</section>