<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<section class="cart bgwhite p-t-70 p-b-100">
	<div class="container">
		<!-- Cart item -->
		<div class="container-table-cart pos-relative">
			<div class="wrap-table-shopping-cart bgwhite">
				<table class="table-shopping-cart">
					<tr class="table-head">
						<th class="column-1"></th>
						<th class="column-2">Product</th>
						<th class="column-3">Price</th>
						<th class="column-4 p-l-70">Quantity</th>
						<th class="column-5">Total</th>
						<th class="column-5"></th>
					</tr>
					<c:if test="${cart.numberOfItems == 0}">

						<tr bgcolor="white">

							<td colspan="8"><b>Your cart is empty.</b></td>
						</tr>
					</c:if>
					<form name="f" method="POST">
					<c:forEach var="cartItem" items="${cart.cartItemList.pageList}">
						<tr class="table-row">
							<td class="column-1">
								<div class="cart-img-product b-rad-4 o-f-hidden">
									<img src="../images-theme/item-10.jpg" alt="IMG-PRODUCT">
								</div>
							</td>
							<td class="column-2">
							<a href="<c:url value="/shop/viewItem.do"><c:param name="itemId" value="${cartItem.item.itemId}"/></c:url>">

									<c:out value="${cartItem.item.itemId}" /></a>
							</td>
							<td class="column-3"><fmt:formatNumber
									value="${cartItem.item.getListPrice()}" pattern="$#,##0.00" /></td>
							<td class="column-4">
								<div class="flex-w bo5 of-hidden w-size17">
									<button
										class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-minus" aria-hidden="true"></i>
									</button>

									<input class="size8 m-text18 t-center num-product"
										type="number" name='<c:out value="${cartItem.item.itemId}"/>' id="number"
										value='<c:out value="${cartItem.quantity}"/>'>

									<button
										class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
										<i class="fs-12 fa fa-plus" aria-hidden="true"></i>
									</button>
								</div>
							</td>

							<td class="column-5"><fmt:formatNumber
									value="${cartItem.totalPrice}" pattern="$#,##0.00" /></td>
							<td><a
								href='<c:url value="/shop/removeItemFromCart.do">
                    <c:param name="workingItemId" value="${cartItem.item.itemId}"/></c:url>'>
									<i class="fa fa-close" style="font-size:20px;color:black"></i>


							</a></td>
						</tr>
					</c:forEach>
					</form>
				</table>
			</div>
		</div>

		<div
			class="flex-w flex-sb-m p-t-25 p-b-25 bo8 p-l-35 p-r-60 p-lr-15-sm">
			<div class="flex-w flex-m w-full-sm">
				<div class="size11  m-r-10"></div>

				<div class="size12 trans-0-4 m-t-10 m-b-10 m-r-10">
					<!-- Button -->

				</div>
			</div>


			<div class="size10 trans-0-4 m-t-10 m-b-10">
				<!-- Button -->
				<c:if test="${!cart.cartItemList.firstPage}">
            <a href='<c:url value="viewCart.do?page=previousCart"/>'>
              <font color="green"><B>&lt;&lt; Prev</B></font></a>
          </c:if>
          <c:if test="${!cart.cartItemList.lastPage}">
            <a href='<c:url value="viewCart.do?page=nextCart"/>'>
              <font color="green"><B>Next &gt;&gt;</B></font></a>
          </c:if> <button class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4" onClick="btnSubmit()">
					Update Cart</button>
			</div>
		</div>

		<!-- Total -->
		<div
			class="bo9 w-size18 p-l-40 p-r-40 p-t-30 p-b-38 m-t-30 m-r-0 m-l-auto p-lr-15-sm">
			<h5 class="m-text20 p-b-24">Cart Totals</h5>



			<div class="flex-w flex-sb-m p-t-26 p-b-30">
				<span class="m-text22 w-size19 w-full-sm"> Total: </span> <span
					class="m-text21 w-size20 w-full-sm"><fmt:formatNumber
						value="${cart.subTotal}" pattern="$#,##0.00" /></span>
			</div>

			<div class="size15 trans-0-4">
				<!-- Button -->
				<a href='<c:url value="/shop/checkout.do"/>'><button
					class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">

					Proceed to Checkout</button></a>
			</div>
		</div>
	</div>
</section>
<script>
function btnSubmit() {
	<c:url var="post_url" value="/shop/updateCartQuantities.do"/>
	document.forms[0].action='<c:out value="${post_url}"/>';
	document.forms[0].submit(); 
}

</script>

