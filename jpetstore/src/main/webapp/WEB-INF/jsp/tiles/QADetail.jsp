<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<table cellpading="5px" style="border: 1px solid gray; width: 1100;">
				<tr>
					<th style="width: 200px; border: 1px solid gray; text-align:center;">No</th>
					<td style="border: 1px solid gray; padding: 10px; ">${QADetail.qnum}</a></td>
				</tr>
				<tr>
					<th style="width: 200px; border: 1px solid gray; text-align:center;">�� ����</th>
					<td style="border: 1px solid gray; padding: 10px;">${QADetail.title}</td>
				</tr>
				<tr>
					<th style="width: 200px; border: 1px solid gray; text-align:center;">�� ����</th>
					<td style="border: 1px solid gray; padding: 10px;">${QADetail.content}</td>
				</tr>
				<tr>
					<th style="width: 200px; border: 1px solid gray; text-align:center;">ID</th>
					<td style="border: 1px solid gray; padding: 10px;">${QADetail.userId}</td>
				</tr>

				<c:choose>
					<c:when test="${QADetail.isAnswered != null}">
						<tr>
							<th style="width: 200px; border: 1px solid gray; text-align:center;">�亯</th>
							<td style="border: 1px solid gray; padding: 10px;">${QADetail.isAnswered}</td>
						</tr>
					</c:when>
				</c:choose>
				
				
				<tr id="deleteQA">
					<td style="border: 1px solid gray; padding: 10px;" colspan="2"><a href="<c:url value="/qa/qaDelete.do"><c:param name="qnum" value="${QADetail.qnum}"/></c:url>">����</a> </td>
				<tr>
				

			</table>
		</div>
		<p>&nbsp;</p>
		<div class="w-size25 container">
			<a href="<c:url value="/qa/qalist.do"/>" class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">��ϰ���</a>
			<p>&nbsp;</p>
			<a href="<c:url value="/qa/qaReply.do"><c:param name="qnum" value="${QADetail.qnum}"/></c:url>" class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4" id="replyBtn">��� �ۼ�</a>
		
		</div>
	</section>
	<script>
	$(document).ready(function() {
		var sellerId =  '<c:out value = "${QADetail.sellerId}"/>';
		var sessionId = '<c:out value = "${userSession.getAccount().getUsername()}"/>';
		
		if (sellerId == sessionId || sessionId == "admin") {
			document.getElementById('replyBtn').style.display = "";
		} else {
			document.getElementById('replyBtn').style.display = "none";
		}

	});
	

	</script>
	
</body>
</html>