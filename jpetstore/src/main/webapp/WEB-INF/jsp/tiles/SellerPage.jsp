<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Content page -->
	<section class="bgwhite p-t-55 p-b-65">
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-lg-3 p-b-50">
				<div class="leftbar p-r-20 p-r-0-sm">
					<div
						class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
						<img src="../images-theme/icons/person.png" alt="IMG-PRODUCT">
						<span>${userId}</span>
					</div>
				</div>
			</div>

			<div class="col-sm-6 col-md-8 col-lg-9 p-b-50">

				<!-- Product -->

				<div class="row">
					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<c:set var="count" value="${listnum div 3}" />
						<c:forEach var="item" items="${p2pList}" begin="0" end="${count}">
							<!-- Block2 -->
							<div class="block2">
								<div
									class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
									<img src="images/item-02.jpg" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#"
											class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
											class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none"
											aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											<!-- Button -->
											<button
												class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
												Add to Cart</button>
										</div>
									</div>
								</div>
								<div class="block2-txt p-t-20">
									<a
										href='<c:url value="/shop/viewItem.do"><c:param name="itemId" value="${item.getItemId()}"/></c:url>'
										class="block2-name dis-block s-text3 p-b-5"> <c:out
											value="${item.getTitle()}" />
									</a> <span class="block2-price m-text6 p-r-5"> ₩ <c:out
											value="${item.getPrice()}" />
									</span>
								</div>
							</div>
						</c:forEach>
					</div>

					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<c:set var="count2" value="${(listnum - count) div 2}" />
						<c:set var="total" value="${count + count2}" />
						<c:forEach var="item" items="${p2pList}" begin="${count+1}"
							end="${total}">
							<!-- Block2 -->
							<div class="block2">
								<div
									class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
									<img src="images/item-02.jpg" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#"
											class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
											class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none"
											aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											<!-- Button -->
											<button
												class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
												Add to Cart</button>
										</div>
									</div>
								</div>
								<div class="block2-txt p-t-20">
									<a
										href='<c:url value="/shop/viewItem.do"><c:param name="itemId" value="${item.getItemId()}"/></c:url>'
										class="block2-name dis-block s-text3 p-b-5"> <c:out
											value="${item.getTitle()}" />
									</a> <span class="block2-price m-text6 p-r-5"> ₩ <c:out
											value="${item.getPrice()}" />
									</span>
								</div>
							</div>
						</c:forEach>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<c:set var="count3" value="${(listnum - total)}" />
						<c:forEach var="item" items="${p2pList}" begin="${total+1 }"
							end="${listnum}">
							<!-- Block2 -->
							<div class="block2">
								<div
									class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
									<img src="images/item-02.jpg" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#"
											class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
											class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none"
											aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											<!-- Button -->
											<button
												class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">
												Add to Cart</button>
										</div>
									</div>
								</div>
								<div class="block2-txt p-t-20">
									<a
										href='<c:url value="/shop/viewItem.do"><c:param name="itemId" value="${item.getItemId()}"/></c:url>'
										class="block2-name dis-block s-text3 p-b-5"> <c:out
											value="${item.getTitle()}" />
									</a> <span class="block2-price m-text6 p-r-5"> ₩ <c:out
											value="${item.getPrice()}" />
									</span>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- Container Selection -->
	<div id="dropDownSelect1"></div>
	<div id="dropDownSelect2"></div>
	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript"
		src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/select2/select2.min.js"></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch : 20,
			dropdownParent : $('#dropDownSelect1')
		});

		$(".selection-2").select2({
			minimumResultsForSearch : 20,
			dropdownParent : $('#dropDownSelect2')
		});
	</script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="vendor/daterangepicker/moment.min.js"></script>
	<script type="text/javascript"
		src="vendor/daterangepicker/daterangepicker.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="js/slick-custom.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="vendor/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(
				function() {
					var nameProduct = $(this).parent().parent().parent().find(
							'.block2-name').html();
					$(this).on('click', function() {
						swal(nameProduct, "is added to cart !", "success");
					});
				});

		$('.block2-btn-addwishlist').each(
				function() {
					var nameProduct = $(this).parent().parent().parent().find(
							'.block2-name').html();
					$(this).on('click', function() {
						swal(nameProduct, "is added to wishlist !", "success");
					});
				});
	</script>

	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/noui/nouislider.min.js"></script>
	<script type="text/javascript">
		/*[ No ui ]
		===========================================================*/
		var filterBar = document.getElementById('filter-bar');

		noUiSlider.create(filterBar, {
			start : [ 50, 200 ],
			connect : true,
			range : {
				'min' : 50,
				'max' : 200
			}
		});

		var skipValues = [ document.getElementById('value-lower'),
				document.getElementById('value-upper') ];

		filterBar.noUiSlider.on('update', function(values, handle) {
			skipValues[handle].innerHTML = Math.round(values[handle]);
		});
	</script>
	<!--===============================================================================================-->
	<script src="js/main.js" type="text/javascript"></script>

</body>
</html>