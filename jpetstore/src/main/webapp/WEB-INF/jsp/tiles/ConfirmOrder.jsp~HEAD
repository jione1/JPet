
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div align="center">
  <p>
    <b>Please confirm the information below and then press continue...</b>
  </p>
  <p></p>
  <table >
    <tr>
      <td align="center" colspan="2">
        <font size="4"><b>Order</b></font><br />
        <font size="3">
          <b><fmt:formatDate value="${orderForm.order.orderDate}" 
            pattern="yyyy/MM/dd hh:mm:ss" /></b></font>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <font color="GREEN" size="4"><b>Billing Address</b></font></td>
    </tr>
    <tr>
      <td>First name:</td>
      <td>${orderForm.order.billToFirstName}</td>
    </tr>
    <tr>
      <td>Last name:</td>
      <td>${orderForm.order.billToLastName}</td>
    </tr>
    <tr>
      <td>Address 1:</td>
      <td>${orderForm.order.billAddress1}</td>
    </tr>
    <tr>
      <td>Address 2:</td>
      <td>${orderForm.order.billAddress2}</td>
    </tr>
    <tr>
      <td>City:</td>
      <td>${orderForm.order.billCity}</td>
    </tr>
    <tr>
      <td>State:</td>
      <td>${orderForm.order.billState}</td>
    </tr>
    <tr>
      <td>Zip:</td>
      <td>${orderForm.order.billZip}</td>
    </tr>
    <tr>
      <td>Country:</td>
      <td>${orderForm.order.billCountry}</td>
    </tr>
    <tr>
      <td colspan="2">
        <font color="GREEN" size="4"><b>Shipping Address</b></font></td>
    </tr>
    <tr>
      <td>First name:</td>
      <td>${orderForm.order.shipToFirstName}</td>
    </tr>
    <tr>
      <td>Last name:</td>
      <td>${orderForm.order.shipToLastName}</td>
    </tr>
    <tr>
      <td>Address 1:</td>
      <td>${orderForm.order.shipAddress1}</td>
    </tr>
    <tr>
      <td>Address 2:</td>
      <td>${orderForm.order.shipAddress2}</td>
    </tr>
    <tr>
      <td>City:</td>
      <td>${orderForm.order.shipCity}</td>
    </tr>
    <tr>
      <td>State:</td>
      <td>${orderForm.order.shipState}</td>
    </tr>
    <tr>
      <td>Zip:</td>
      <td>${orderForm.order.shipZip}</td>
    </tr>
    <tr>
      <td>Country:</td>
      <td>${orderForm.order.shipCountry}</td>
    </tr>
  </table>
  <p>
    <a href='<c:url value="/shop/confirmOrder.do"/>'>
      <button class="flex-c-m bg1 bo-rad-23 hov1 s-text1 trans-0-4" >CONTINUE</button>
  </p>
</div>

