<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section class="bgwhite p-t-66 p-b-60">
<div class="container">
	<c:set var="targetUrl"><c:url value="/tendency/sendResult.do" /></c:set>
	<form:form commandName="testTendency" action="${targetUrl}" method="post">
		<table cellpading="5px" style="border: 1px solid gray">
			<tr>
				<th style="width: 200px; border: 1px solid gray; text-align:center;">NO</th>
				<th style="width: 1200px; border: 1px solid gray; text-align:center;">QUESTION</th>
				<th style="width: 300px; border: 1px solid gray; text-align:center;">VALUE</th>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">1</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[0]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[0]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">2</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[1]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[1]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">3</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[2]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[2]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">4</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[3]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[3]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">5</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[4]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[4]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">6</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[5]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[5]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">7</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[6]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[6]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">8</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[7]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[7]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">9</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[8]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[8]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">10</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[9]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[9]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">11</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[10]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[10]" value="true"/></td>
			</tr>
			
			<tr>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">12</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;">${quest[11]}</td>
				<td style="border: 1px solid gray; padding: 8px; padding-left: 20px;"><form:checkbox path="testResult[11]" value="true"/></td>
			</tr>
		</table>
		<p>&nbsp;</p>
		<input type="submit" value="분석하기" class ="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4"/>
	</form:form>
</div>
</section>