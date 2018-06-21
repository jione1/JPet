<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
td{
	border: 1px solid gray;
	padding: 8px;
	padding-left: 20px;
}
</style>
</head>
<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12 p-b-30">
<c:set var="targetUrl"><c:url value="/tendency/sendResult.do" /></c:set>
<form:form commandName="testTendency" action="${targetUrl}" method="post">

<table cellpading="5px" style="border: 1px solid gray">
	<tr>
		<th style="width: 200px; border: 1px solid gray; text-align:center;">No.</th>
		<th style="width: 800px; border: 1px solid gray; text-align:center;">질문</th>
		<th style="width: 200px; border: 1px solid gray; text-align:center;">답변</th>
	</tr>

	<tr><td>1</td>
	 	<td>${quest[0]}</td>
	 <td> <form:checkbox path="testResult[0]" value="true"/></tr>
	 <tr><td>2</td>
		<td>${quest[1]}</td>
		<td><form:checkbox path="testResult[1]" value="true"/></tr>
	<tr><td>3</td>
		<td>${quest[2]}</td>
		<td><form:checkbox path="testResult[2]" value="true"/></tr>
	<tr><td>4</td>
		<td>${quest[3]}</td>
		<td><form:checkbox path="testResult[3]" value="true"/></tr>
	<tr><td>5</td>
		<td>${quest[4]}</td>
		<td><form:checkbox path="testResult[4]" value="true"/></tr>
	<tr><td>5</td>
		<td>${quest[5]}</td>
		<td><form:checkbox path="testResult[5]" value="true"/></tr>
	<tr><td>6</td>
		<td>${quest[6]}</td>
		<td><form:checkbox path="testResult[6]" value="true"/></tr>
	<tr><td>7</td>
		<td>${quest[7]}</td>
		<td><form:checkbox path="testResult[7]" value="true"/></tr>
	<tr><td>8</td>
		<td>${quest[8]}</td>
		<td><form:checkbox path="testResult[8]" value="true"/></tr>
	<tr><td>9</td>
		<td>${quest[9]}</td>
		<td><form:checkbox path="testResult[9]" value="true"/></tr>
	<tr><td>10</td>
		<td>${quest[10]}</td>
		<td><form:checkbox path="testResult[10]" value="true"/></tr>		
	<tr><td>11</td>
		<td>${quest[11]}</td>
		<td><form:checkbox path="testResult[11]" value="true"/></tr>		
</table>

<p> &nbsp;</p>
<button class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">
								분석하기
							</button>
</form:form>
</div>
</div>
</div>
</body>
</html>