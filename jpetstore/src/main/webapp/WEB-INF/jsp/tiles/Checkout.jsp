
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<table>
  <tr>
    <td style="text-align: center; vertical-align: top; width: 35%">
      <table>
        <tr>
          <td><a href='<c:url value="/shop/viewCart.do"/>'>
            &nbsp;&nbsp;<i class="fa fa-rotate-left" style="font-size:40px;color:black"></i>
        </tr>
      </table>
    </td>

    <td style="text-align: center; vertical-align: top">
      <h2>Checkout Summary</h2>
      <table class="n25">
        <tr bgcolor="#CCCCCC">
          <td><b>Item ID</b></td>
          <td><b>Product ID</b></td>
          <td><b>Description</b></td>
          <td><b>In Stock?</b></td>
          <td><b>Quantity</b></td>
          <td><b>List Price</b></td>
          <td><b>Total Cost</b></td>
        </tr>
        <c:forEach var="cartItem" items="${cart.cartItemList.pageList}">
          <tr bgcolor="white">
            <td><b> 
              <a href='<c:url value="/shop/viewItem.do">
                <c:param name="itemId" value="${cartItem.item.itemId}"/></c:url>'>
                  <font color="black" size="2"><c:out value="${cartItem.item.itemId}" /></font>
              </a></b>
            </td>
            <td><c:out value="${cartItem.item.productId}" /></td>
            <td>
              <c:out value="${cartItem.item.attribute1}" /> 
              <c:out value="${cartItem.item.attribute2}" /> 
              <c:out value="${cartItem.item.attribute3}" /> 
              <c:out value="${cartItem.item.attribute4}" /> 
              <c:out value="${cartItem.item.attribute5}" /> 
              <c:out value="${cartItem.item.product.name}" />
            </td>
            <td align="center"><c:out value="${cartItem.inStock}" /></td>
            <td align="center"><c:out value="${cartItem.quantity}" /></td>
            <td align="right"><fmt:formatNumber
                value="${cartItem.item.listPrice}" pattern="$#,##0.00" /></td>
            <td align="right"><fmt:formatNumber
                value="${cartItem.totalPrice}" pattern="$#,##0.00" /></td>
          </tr>
        </c:forEach>
        <tr bgcolor="white">
          <td colspan="7" align="right"><b>Sub Total: <fmt:formatNumber
                value="${cart.subTotal}" pattern="$#,##0.00" /></b><br /></td>
        </tr>
      </table>

      <c:if test="${!cart.cartItemList.firstPage}">
        <a href="checkout.do?page=previousCart"><font color="green">
          <B>&lt;&lt; Prev</B></font></a>
      </c:if>
      <c:if test="${!cart.cartItemList.lastPage}">
        <a href="checkout.do?page=nextCart"><font color="green">
          <B>Next &gt;&gt;</B></font></a>
      </c:if>
      <br> 
	<center>
      <a href='<c:url value="/shop/newOrder.do"/>'>
        <button class="flex-c-m  bg1 bo-rad-23 hov1 s-text1 trans-0-4" >Continue</button>
        </a></center><p>
			<form method="post"
			action="https://kapi.kakao.com/v1/payment/ready" 
			-H "Authorization: KakaoAK eb8c19bbcb9d4176ff28f3a8a2f55174" 
			--data-urlencode "cid=TC0ONETIME" 
			--data-urlencode "partner_order_id=partner_order_id" 
			--data-urlencode "partner_user_id=partner_user_id" 
			--data-urlencode "item_name=ì»¤í¼" 
			--data-urlencode "quantity=1" 
			--data-urlencode "total_amount=4100" 
			--data-urlencode "vat_amount=200" 
			--data-urlencode "tax_free_amount=0" 
			--data-urlencode "approval_url=https://developers.kakao.com/success" 
			--data-urlencode "fail_url=https://developers.kakao.com/fail" 
			--data-urlencode "cancel_url=https://developers.kakao.com/cancel" >
				
				<!--Â°Ã¡ÃÂ¦ÃÂ¤ÂºÂ¸Â¼ÃÃÃ-->
				
				<form action="/kakao/kakaoPay">
					<input type="hidden" name="partner_order_id" value="${ordernum}"> <!-- ÃÃÂ¹Â®Â¹Ã¸ÃÂ£ -->
					<input type="hidden" name="partner_user_id" value="${session.userid}"> <!-- Â»Ã§ÃÃÃÂ® ÃÃÂ¹Â®ÃÂ¯ÃÃºid -->
					<input type="hidden" name="item_name" value="${cartItem.item.product.name}"> <!-- Â»Ã³ÃÂ°Â¸Ã­ -->
					<input type="hidden" name="quantity" value="${cartItem.quantity}"> <!-- Â¼Ã¶Â·Â® -->
					<input type="hidden" name="total_amount" value="${cart.subTotal}"> <!-- Â»Ã³ÃÂ°ÃÃÂ¾Ã -->
					<input type="hidden" name="tax_free_amount" value="0"> <!-- ÂºÃ±Â°ÃºÂ¼Â¼Â±ÃÂ¾Ã -->
	
					<input type="image" src="../images/kakaopay.png" height="30" width="100">
				</form>
			</form>
			</p>
    </td>
    <td style="text-align: right; vertical-align: top; width: 20%">&nbsp;</td>
  </tr>
</table>


