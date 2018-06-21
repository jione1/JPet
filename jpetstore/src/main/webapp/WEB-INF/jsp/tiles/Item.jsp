<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body>
<<<<<<< HEAD
	<!-- breadcrumb -->
	<div class="bread-crumb bgwhite flex-w p-l-52 p-r-15 p-t-30 p-l-15-sm">
		<a href="index.html" class="s-text16"> Home <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <a href="product.html" class="s-text16"> ${product.getCategoryId() } <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <a href="#" class="s-text16"> ${product.getName() } <i
			class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
		</a> <span class="s-text17"> ${item.getItemId() } </span>
	</div>

	<!-- Product Detail -->
	<div class="container bgwhite p-t-35 p-b-80">
		<div class="flex-w flex-sb">
			<div class="w-size13 p-t-30 respon5">
				<div class="wrap-slick3 flex-sb flex-w">
					<div class="wrap-slick3-dots"></div>

					<div class="slick3">
						<div class="item-slick3" data-thumb="images/thumb-item-01.jpg">
							<div class="wrap-pic-w">
								<img src="images/product-detail-01.jpg" alt="IMG-PRODUCT">
							</div>
						</div>

						<div class="item-slick3" data-thumb="images/thumb-item-02.jpg">
							<div class="wrap-pic-w">
								<img src="images/product-detail-02.jpg" alt="IMG-PRODUCT">
							</div>
						</div>

						<div class="item-slick3" data-thumb="images/thumb-item-03.jpg">
							<div class="wrap-pic-w">
								<img src="images/product-detail-03.jpg" alt="IMG-PRODUCT">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="w-size14 p-t-30 respon5">
				<h4 class="product-detail-name m-text16 p-b-13">${product.getName()}</h4>

				<span class="m-text17"> ₩ ${item.getListPrice()} </span>

				<!-- <p class="s-text8 p-t-10">Nulla eget sem vitae eros pharetra
					viverra. Nam vitae luctus ligula. Mauris consequat ornare feugiat.
				</p> -->

				<!--  -->
				<div class="p-t-33 p-b-60">
					<!-- <div class="flex-m flex-w p-b-10">
						<div class="s-text15 w-size15 t-center">
							Size
						</div>

						<div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
							<select class="selection-2" name="size">
								<option>Choose an option</option>
								<option>Size S</option>
								<option>Size M</option>
								<option>Size L</option>
								<option>Size XL</option>
							</select>
						</div>
					</div> -->

					<div class="flex-m flex-w">
						<div class="s-text15 w-size15 t-center">성별</div>

						<div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
							<select class="selection-2 size15" name="color">
								<option>Choose an option</option>
								<option>Female</option>
								<option>Male</option>
							</select>
						</div>
					</div>

					<div class="flex-r-m flex-w p-t-10">
						<div class="w-size16 flex-m flex-w">
							<div class="flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10">
								<button
									class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
									<i class="fs-12 fa fa-minus" aria-hidden="true"></i>
								</button>

								<input class="size8 m-text18 t-center num-product" type="number"
									name="num-product" value="1">

								<button
									class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
									<i class="fs-12 fa fa-plus" aria-hidden="true"></i>
								</button>
							</div>

							<div
								class="btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10">
								<!-- Button -->
								<button
									class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
									Add to Cart</button>
							</div>
						</div>
					</div>
				</div>

				<div class="p-b-45">
					<span class="s-text8 m-r-35">SKU: ${item.getItemId() }</span> <span
						class="s-text8">Categories: ${product.getCategoryId() }, Pet</span>
				</div>

				<!--  -->
				<div
					class="wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content">
					<h5
						class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
						Description <i class="down-mark fs-12 color1 fa fa-minus dis-none"
							aria-hidden="true"></i> <i
							class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
					</h5>

					<div class="dropdown-content dis-none p-t-15 p-b-23">
						<p class="s-text8">${product.getDescription()}</p>
					</div>
				</div>

				<div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
					<h5
						class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
						<a style="text-decoration:none;color:black;"  href="<c:url value="/p2p/viewSellerPage.do"><c:param name="userId" value="${userId}"/></c:url>">
						판매자 페이지[${userId}]</a></h5>
				</div>

				<div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
					<h5
						class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
						Q&A (0)</h5>
				</div>
				<div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
						<!-- Button -->
						<a href="<c:url value="/qa/qawriteToSeller.do"><c:param name="sellerId" value="${userId}"/><c:param name="itemId" value="${item.getItemId()}"/></c:url>" class="w3-button flex-c-m size11 bg1 bo-rad-23 hov1 m-text3 trans-0-4">판매자에게 질문하기</a>
					</div>
					<div class="wrap-dropdown-content bo7 p-t-15 p-b-14" id = "hiddenBtn">
					<button class="size9 bg4 bo-rad-23 hov1 s-text1" id="deleteBtn" style="display:none">
							삭제 </button>&nbsp;&nbsp;<button class="size9 bg4 bo-rad-23 hov1 s-text1"  id="updateBtn" style="display:none">수정 </button>
					</div>
			</div>
		</div>
	</div>


	<!-- Relate Product -->
	<section class="relateproduct bgwhite p-t-45 p-b-138">
	<div class="container">
		<div class="sec-title p-b-60">
			<h3 class="m-text5 t-center">Related Products</h3>
		</div>

		<!-- Slide2 -->
		<div class="wrap-slick2">
			<div class="slick2">

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div
							class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
							<img src="images/item-02.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Herschel supply
								co 25l </a> <span class="block2-price m-text6 p-r-5"> $75.00
							</span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-img wrap-pic-w of-hidden pos-relative">
							<img src="images/item-03.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Denim jacket
								blue </a> <span class="block2-price m-text6 p-r-5"> $92.50 </span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-img wrap-pic-w of-hidden pos-relative">
							<img src="images/item-05.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Coach slim
								easton black </a> <span class="block2-price m-text6 p-r-5">
								$165.90 </span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div
							class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
							<img src="images/item-07.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Frayed denim
								shorts </a> <span class="block2-oldprice m-text7 p-r-5">
								$29.50 </span> <span class="block2-newprice m-text8 p-r-5">
								$15.90 </span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div
							class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
							<img src="images/item-02.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Herschel supply
								co 25l </a> <span class="block2-price m-text6 p-r-5"> $75.00
							</span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-img wrap-pic-w of-hidden pos-relative">
							<img src="images/item-03.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Denim jacket
								blue </a> <span class="block2-price m-text6 p-r-5"> $92.50 </span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div class="block2-img wrap-pic-w of-hidden pos-relative">
							<img src="images/item-05.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Coach slim
								easton black </a> <span class="block2-price m-text6 p-r-5">
								$165.90 </span>
						</div>
					</div>
				</div>

				<div class="item-slick2 p-l-15 p-r-15">
					<!-- Block2 -->
					<div class="block2">
						<div
							class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
							<img src="images/item-07.jpg" alt="IMG-PRODUCT">

							<div class="block2-overlay trans-0-4">
								<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
									<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
									<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
							<a href="product-detail.html"
								class="block2-name dis-block s-text3 p-b-5"> Frayed denim
								shorts </a> <span class="block2-oldprice m-text7 p-r-5">
								$29.50 </span> <span class="block2-newprice m-text8 p-r-5">
								$15.90 </span>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	</section>
=======
   <!-- breadcrumb -->
   <div class="bread-crumb bgwhite flex-w p-l-52 p-r-15 p-t-30 p-l-15-sm">
      <a href="index.html" class="s-text16"> Home <i
         class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
      </a> <a href="product.html" class="s-text16"> ${product.getCategoryId() } <i
         class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
      </a> <a href="#" class="s-text16"> ${product.getName() } <i
         class="fa fa-angle-right m-l-8 m-r-9" aria-hidden="true"></i>
      </a> <span class="s-text17"> ${item.getItemId() } </span>
   </div>

   <!-- Product Detail -->
   <div class="container bgwhite p-t-35 p-b-80">
      <div class="flex-w flex-sb">
         <div class="w-size13 p-t-30 respon5">
            <div class="wrap-slick3 flex-sb flex-w">
               <div class="wrap-slick3-dots"></div>

               <div class="slick3">
                  <div class="item-slick3" data-thumb="images/thumb-item-01.jpg">
                     <div class="wrap-pic-w">
                        <img src="images/product-detail-01.jpg" alt="IMG-PRODUCT">
                     </div>
                  </div>

                  <div class="item-slick3" data-thumb="images/thumb-item-02.jpg">
                     <div class="wrap-pic-w">
                        <img src="images/product-detail-02.jpg" alt="IMG-PRODUCT">
                     </div>
                  </div>

                  <div class="item-slick3" data-thumb="images/thumb-item-03.jpg">
                     <div class="wrap-pic-w">
                        <img src="images/product-detail-03.jpg" alt="IMG-PRODUCT">
                     </div>
                  </div>
               </div>
            </div>
         </div>

         <div class="w-size14 p-t-30 respon5">
            <h4 class="product-detail-name m-text16 p-b-13">${product.getName()}</h4>

            <span class="m-text17"> ₩ ${item.getListPrice()} </span>

            <!-- <p class="s-text8 p-t-10">Nulla eget sem vitae eros pharetra
               viverra. Nam vitae luctus ligula. Mauris consequat ornare feugiat.
            </p> -->

            <!--  -->
            <div class="p-t-33 p-b-60">
               <!-- <div class="flex-m flex-w p-b-10">
                  <div class="s-text15 w-size15 t-center">
                     Size
                  </div>

                  <div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
                     <select class="selection-2" name="size">
                        <option>Choose an option</option>
                        <option>Size S</option>
                        <option>Size M</option>
                        <option>Size L</option>
                        <option>Size XL</option>
                     </select>
                  </div>
               </div> -->

               <div class="flex-m flex-w">
                  <div class="s-text15 w-size15 t-center">성별</div>

                  <div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
                     <select class="selection-2 size15" name="color">
                        <option>Choose an option</option>
                        <option>Female</option>
                        <option>Male</option>
                     </select>
                  </div>
               </div>

               <div class="flex-r-m flex-w p-t-10">
                  <div class="w-size16 flex-m flex-w">
                     <div class="flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10">
                        <button
                           class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
                           <i class="fs-12 fa fa-minus" aria-hidden="true"></i>
                        </button>

                        <input class="size8 m-text18 t-center num-product" type="number"
                           name="num-product" value="1">

                        <button
                           class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
                           <i class="fs-12 fa fa-plus" aria-hidden="true"></i>
                        </button>
                     </div>

                     <div
                        class="btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10">
                        <!-- Button -->
                        <button
                           class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
                           Add to Cart</button>
                     </div>
                  </div>
               </div>
            </div>

            <div class="p-b-45">
               <span class="s-text8 m-r-35">SKU: ${item.getItemId() }</span> <span
                  class="s-text8">Categories: ${product.getCategoryId() }, Pet</span>
            </div>

            <!--  -->
            <div
               class="wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content">
               <h5
                  class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
                  Description <i class="down-mark fs-12 color1 fa fa-minus dis-none"
                     aria-hidden="true"></i> <i
                     class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
               </h5>

               <div class="dropdown-content dis-none p-t-15 p-b-23">
                  <p class="s-text8">${product.getDescription()}</p>
               </div>
            </div>

            <div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
               <h5
                  class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
                  <a style="text-decoration:none;color:black;"  href="<c:url value="/p2p/viewSellerPage.do"><c:param name="userId" value="${userId}"/></c:url>">
                  판매자 페이지[${userId}]</a></h5>
            </div>

            <div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
               <h5
                  class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
                  Q&A (0)</h5>
            </div>
            <div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
                  <!-- Button -->
                  <a href="<c:url value="/qa/qawriteToSeller.do"><c:param name="sellerId" value="${userId}"/><c:param name="itemId" value="${item.getItemId()}"/></c:url>" class="w3-button flex-c-m size11 bg1 bo-rad-23 hov1 m-text3 trans-0-4">판매자에게 질문하기</a>
               </div>
               <div class="wrap-dropdown-content bo7 p-t-15 p-b-14" id = "hiddenBtn">
               <button class="size9 bg4 bo-rad-23 hov1 s-text1" id="deleteBtn" style="display:none">
                     삭제 </button>&nbsp;&nbsp;<button class="size9 bg4 bo-rad-23 hov1 s-text1"  id="updateBtn" style="display:none">수정 </button>
               </div>
         </div>
      </div>
   </div>


   <!-- Relate Product -->
   <section class="relateproduct bgwhite p-t-45 p-b-138">
   <div class="container">
      <div class="sec-title p-b-60">
         <h3 class="m-text5 t-center">Related Products</h3>
      </div>

      <!-- Slide2 -->
      <div class="wrap-slick2">
         <div class="slick2">

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div
                     class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                     <img src="images/item-02.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Herschel supply
                        co 25l </a> <span class="block2-price m-text6 p-r-5"> $75.00
                     </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div class="block2-img wrap-pic-w of-hidden pos-relative">
                     <img src="images/item-03.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Denim jacket
                        blue </a> <span class="block2-price m-text6 p-r-5"> $92.50 </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div class="block2-img wrap-pic-w of-hidden pos-relative">
                     <img src="images/item-05.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Coach slim
                        easton black </a> <span class="block2-price m-text6 p-r-5">
                        $165.90 </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div
                     class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
                     <img src="images/item-07.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Frayed denim
                        shorts </a> <span class="block2-oldprice m-text7 p-r-5">
                        $29.50 </span> <span class="block2-newprice m-text8 p-r-5">
                        $15.90 </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div
                     class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
                     <img src="images/item-02.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Herschel supply
                        co 25l </a> <span class="block2-price m-text6 p-r-5"> $75.00
                     </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div class="block2-img wrap-pic-w of-hidden pos-relative">
                     <img src="images/item-03.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Denim jacket
                        blue </a> <span class="block2-price m-text6 p-r-5"> $92.50 </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div class="block2-img wrap-pic-w of-hidden pos-relative">
                     <img src="images/item-05.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Coach slim
                        easton black </a> <span class="block2-price m-text6 p-r-5">
                        $165.90 </span>
                  </div>
               </div>
            </div>

            <div class="item-slick2 p-l-15 p-r-15">
               <!-- Block2 -->
               <div class="block2">
                  <div
                     class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
                     <img src="images/item-07.jpg" alt="IMG-PRODUCT">

                     <div class="block2-overlay trans-0-4">
                        <a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
                           <i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
                           <i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
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
                     <a href="product-detail.html"
                        class="block2-name dis-block s-text3 p-b-5"> Frayed denim
                        shorts </a> <span class="block2-oldprice m-text7 p-r-5">
                        $29.50 </span> <span class="block2-newprice m-text8 p-r-5">
                        $15.90 </span>
                  </div>
               </div>
            </div>
         </div>
      </div>

   </div>
   </section>
>>>>>>> origin/shineeauction

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
   <script type="text/javascript"
      src="vendor/sweetalert/sweetalert.min.js"></script>
   <script type="text/javascript">
      $('.block2-btn-addcart').each(function(){
         var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
         $(this).on('click', function(){
            swal(nameProduct, "is added to cart !", "success");
         });
      });

      $('.block2-btn-addwishlist').each(function(){
         var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
         $(this).on('click', function(){
            swal(nameProduct, "is added to wishlist !", "success");
         });
      });

      $('.btn-addcart-product-detail').each(function(){
         var nameProduct = $('.product-detail-name').html();
         $(this).on('click', function(){
            swal(nameProduct, "is added to wishlist !", "success");
         });
      });
   </script>
   
   <!--===============================================================================================-->
   <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
   <script>
   $(document).ready(function() {
      var userId =  '<c:out value = "${userId}"/>';
      var sessionId = '<c:out value = "${userSession.getAccount().getUsername()}"/>';
      
      if (userId == sessionId) {
         document.getElementById('deleteBtn').style.display = "";
         document.getElementById('updateBtn').style.display = "";
      } else {
         document.getElementById('deleteBtn').style.display = "none";
         document.getElementById('updateBtn').style.display = "none";
      }
      }
   );
   </script>
   <script>
   $(function(){
       $('#updateBtn').click(function(){
             var itemId = '<c:out value="${item.getItemId()}"/>';
             alert("수정페이지로 이동합니다~");
         $.ajax({
              url : "/jpetstore/shop/updatePost.do",
              async : true,
              type: "POST",
              data:  { "itemId": itemId },
              success:function(response) {
                 alert(response);
                 windows.location.href="http://localhost:8081/jpetstore/shop/updatePost.do";
                 
              },
              fail:function() {
                 alert("실패 !!");
              }
           });    
       });
   });
   
   $(function(){
       $('#deleteBtn').click(function(){
             var itemId = '<c:out value="${item.getItemId()}"/>'; 
             confirm("정말로 삭제하시겠습니까?");
         $.ajax({
              url : "/jpetstore/shop/deletePost.do",
              async : true,
              type: "POST",
              data:  { "itemId": itemId },
              success:function(response) {
                 alert("삭제되었습니다. ");
                 window.location.href="http://localhost:8081/jpetstore/shop/viewCategory.do?categoryId=FISH"
                 
              },
              fail:function(response) {
                 alert(response);
                 
              }
           });    
       });
   });
   
   </script>
   <!--===============================================================================================-->
   
   <script src="js/main.js" type="text/javascript"></script>