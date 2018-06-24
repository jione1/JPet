<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AucitonDetail</title>
</head>
<body>
	<!-- breadcrumb -->
	<div class="bread-crumb bgwhite flex-w p-l-52 p-r-15 p-t-30 p-l-15-sm">
		<a href="index.html" class="s-text16"> Home <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <a href="aucTemplist.do" class="s-text16"> Auction <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <a href="#" class="s-text16"> ${auction.getAucName()} <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <span class="s-text17"> AUC-${auction.getAuction_num() } </span>
	</div>

	<!-- Auction Detail -->
	<div class="container bgwhite p-t-35 p-b-80">
		<div class="flex-w flex-sb">

			<div class="w-size13 p-t-30 respon5">
				<div class="wrap-slick3 flex-sb flex-w">

					<div class="slick3">
						<div class="item-slick3" data-thumb="images/thumb-auction-01.jpg">
							<div class="wrap-pic-w">
								<img src="images/auction-detail-01.jpg" alt="IMG-AUCTION">
							</div>
						</div>

						<div class="item-slick3" data-thumb="images/thumb-auction-02.jpg">
							<div class="wrap-pic-w">
								<img src="images/auction-detail-02.jpg" alt="IMG-AUCTION">
							</div>
						</div>

						<div class="item-slick3" data-thumb="images/thumb-auction-03.jpg">
							<div class="wrap-pic-w">
								<img src="images/auction-detail-03.jpg" alt="IMG-AUCTION">
							</div>
						</div>
					</div>

				</div>
			</div>

			<div class="w-size14 p-t-30 respon5">
				<h3 class="product-detail-name m-text16 p-b-13">${auction.getItemName()}</h3>

				<span class="m-text17">경매 시작가 : ₩ ${auction.getAuctionCost()}
				</span><br> <span class="m-text17">현재 최고가 : ₩
					${auction.getMaxPrice()} </span>

				<div class="p-t-33 p-b-60">
					<div class="flex-m flex-w">
						<span class="m-text17"> EndDate : ${auction.getAucEnd()} </span>
					</div>

					<p id="demo" style="font-size:36px;"></p>

					<script type="text/javascript">
						// Set the date we're counting down to
						var countDownDate = new Date("<c:out value="${auction.getAucEnd()}"/>").getTime();

						// Update the count down every 1 second
						var x = setInterval(function() {

    					// Get todays date and time
  						var now = new Date().getTime();
    
    // Find the distance between now an the count down date
    var distance = countDownDate - now;
    
    // Time calculations for days, hours, minutes and seconds
    var days = Math.floor(distance / (1000 * 60 * 60 * 24));
    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
    // Output the result in an element with id="demo"
    document.getElementById("demo").innerHTML = days + "d " + hours + "h "
    + minutes + "m " + seconds + "s ";
    
    // If the count down is over, write some text 
    if (distance < 0) {
        clearInterval(x);
        document.getElementById("demo").innerHTML = "EXPIRED";
    }
}, 1000);
</script>

					<div class="p-t-33 p-b-60" id="auctionExpired">
						<div class="flex-m flex-w">경매에 참여하려면 입찰 가격을 입력해주세요!</div>

						<div class="flex-r-m flex-w p-t-10">
							<div class="w-size16 flex-m flex-w">
								<form action="aucInputPrice.do" method="post">
									<div class="form-group">
										<label for="price">Input Price : </label> <input type="text"
											name="price" placeholder="가격을 입력해주세요" />
									</div>
									<input type="hidden" name="auction_Num"
										value="${auction.getAuction_num()}" />
									<button
										class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4">가격
										등록</button>
								</form>
							</div>
						</div>
					</div>
					
					<script>
	$(document).ready(function() {
		var aucstatus = '<c:out value="${auction.getAucStatus()}"/>';
		
		if(aucstatus=="0"){
			document.getElementById('auctionExpired').style.display="";
		}else{
			document.getElementById('auctionExpired').style.display="none";
		}
		
	});  
	</script>

					<div class="p-b-45">
						<span class="s-text8 m-r-35">SKU:
							AUC-${auction.getAuction_num()}</span> <span class="s-text8">Categories:
							Auction </span>
					</div>

					<!--  -->
					<div
						class="wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content">
						<h5
							class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
							Description <i
								class="down-mark fs-12 color1 fa fa-minus dis-none"
								aria-hidden="true"></i> <i
								class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
						</h5>

						<div class="dropdown-content dis-none p-t-15 p-b-23">
							<p class="s-text8">${aucion.getAucDiscription()}</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

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
         minimumResultsForSearch: 20,
         dropdownParent: $('#dropDownSelect1')
      });
      $(".selection-2").select2({
         minimumResultsForSearch: 20,
         dropdownParent: $('#dropDownSelect2')
      });
   </script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="js/slick-custom.js"></script>
	<!--===============================================================================================-->

	<script src="js/main.js" type="text/javascript"></script>

	<script type="text/javascript">
			function buttonSubmit() {
				<c:url var="post_url" value="/auction/aucInputPrice.do" />
				document.forms[0].action = '<c:out value="${post_url}"/>';
		
				document.forms[0].submit(); 
		
				document.frm.submit();
			}
</script>
</body>
</html>