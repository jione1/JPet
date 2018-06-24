<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>QAList</title>
</head>
<body>
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<h1>질문 게시판</h1>
			<hr>
			<table cellpading="5px" style="border: 1px solid gray">
				<tr>
					<th style="width: 800px; border: 1px solid gray; text-align:center;">글 제목</th>
					<th style="width: 300px; border: 1px solid gray; text-align:center;">ID</th>
				</tr>
				
				<c:forEach var="QA" items="${QAList}">
					<tr>
						<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><a href="<c:url value="/qa/qaDetail.do"><c:param name="qnum" value="${QA.qnum }"/></c:url>">${QA.title}</td>
						<td style="border: 1px solid gray; padding: 5px; padding-left: 20px">${QA.userId}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<p>&nbsp;</p>
		<div class="w-size25 container">
		<!-- Button -->
			<a href="<c:url value="/qa/qawriteform.do"/>" class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">글 작성</a>
		</div>
		
	</section>
	
</body>
</html>