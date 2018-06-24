<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<h2>경매 참여하기기</h2>
	<div class="p-t-22 p-b-50 bo3"></div>
	
	<form:form commandName="auctionForm" method="post">
		
		<h1>경매에 참여하려면 입찰 가격을 입력해주세요!</h1>
		<div class="form-group">
			<label for="price">Input Price</label>
			<form:input path="price" cssClass="form-control"
				placeholder="가격을 입력해주세요" />
			<form:errors path="price" />
		</div>
			<div class="p-t-22 p-b-30 bo3"></div>

			
			<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
				onClick="buttonSubmit()">가격 제출하기</button>
	</form:form>
</div>
<script type="text/javascript">
	function buttonSubmit() {
		<c:url var="post_url" value="/auction/aucInputPrice.do" />
		document.forms[0].action = '<c:out value="${post_url}"/>';

		document.forms[0].submit(); 
	}
</script>