<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div align="center">
<form:form commandName="orderForm" method="post">
  <form:errors cssClass="error" /><br><br>

  <table>
    <tr>
      <td colspan="2">
        <font color="GREEN" size="4"><b>Shipping Address</b></font></td>
    </tr>
    <tr>
      <td>First name:</td>
      <td><form:input path="order.shipToFirstName" />
        <form:errors path="order.shipToFirstName" /></td>
    </tr>
    <tr>
      <td>Last name:</td>
      <td><form:input path="order.shipToLastName" />
        <form:errors path="order.shipToLastName" /></td>
    </tr>
    <tr>
      <td>Address 1:</td>
      <td><form:input path="order.shipAddress1" /> 
         <form:errors path="order.shipAddress1" /></td>
    </tr>
    <tr>
      <td>Address 2:</td>
      <td><form:input path="order.shipAddress2" /> 
         <form:errors path="order.shipAddress2" /></td>
    </tr>
    <tr>
      <td>City:</td>
      <td><form:input path="order.shipCity" /> 
        <form:errors path="order.shipCity" /></td>
    </tr>
    <tr>
      <td>State:</td>
      <td><form:input path="order.shipState" /> 
        <form:errors path="order.shipState" /></td>
    </tr>
    <tr>
      <td>Zip:</td>
      <td><form:input path="order.shipZip" /> 
        <form:errors path="order.shipZip" /></td>
    </tr>
    <tr>
      <td>Country:</td>
      <td><form:input path="order.shipCountry" /> 
        <form:errors path="order.shipCountry" /></td>
    </tr>
  </table>
  <p>
    <button class="flex-c-m bg1 bo-rad-23 hov1 s-text1 trans-0-4"  onclick="btnSubmit()">SUBMIT</button>
  </p>
</form:form>
</div>
<script>
function btnSubmit() {
	<c:url var="targetUrl" value="/shop/newOrderSubmitted.do"/>
	document.forms[0].action='<c:out value="${targetUrl}"/>';
	document.forms[0].submit(); 
}
</script>