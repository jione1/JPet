<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="banner bgwhite p-t-40 p-b-40">
<form name = "f">
	<div class="container">
		<div class="row">
			<div class="btn-group" style="width: 100%; padding: 20px;">
				<button style="width: 45%"
					class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4" value = "curAuction" onClick="buttonSubmit(this.value)" >현재
					경매</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button style="width: 45%"
					class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4" value = "lastAuction" onClick="buttonSubmit(this.value)">지난
					경매</button>
			</div>
			<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
				<c:set var="count" value="${listnum div 3}" />
				<c:forEach var="item" items="${itemList}" begin="0" end="${first}">
					<div class="block1 hov-img-zoom pos-relative m-b-30">
						<img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">
						<div class="block1-wrapbtn w-size2">
							<!-- Button -->
							<a href='<c:url value="/auction/viewAuctionDetail.do?auction_Num=${item.getAuction_num()}"/>'
								class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
						</div>
					</div>
				</c:forEach>
			</div>

			<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
				<c:set var="count2" value="${(listnum - count) div 2}" />
				<c:set var="total" value="${count + count2}" />
				<c:forEach var="item" items="${itemList}" begin="${count+1}"
					end="${total}">
					<div class="block1 hov-img-zoom pos-relative m-b-30">
						<img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">

						<div class="block1-wrapbtn w-size2">
							<!-- Button -->
							<a href='<c:url value="/shop/viewCategory.do?categoryId=FISH"/>'
								class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
						</div>
					</div>
				</c:forEach>
			</div>

			<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
				<c:set var="count3" value="${(listnum - total)}" />
				<c:forEach var="item" items="${itemList}" begin="${total+1}"
					end="${listnum}">
					<div class="block1 hov-img-zoom pos-relative m-b-30">
						<img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">

						<div class="block1-wrapbtn w-size2">
							<!-- Button -->
							<a href='<c:url value="/shop/viewCategory.do?categoryId=FISH"/>'
								class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	</form>
</section>
<script src="//code.jquery.com/jquery-1.11.3.min.js"
	type="text/javascript"></script>

<script type="text/javascript">
   function buttonSubmit(s) {
      if (s == "curAuction") {
         
         <c:url var="post_url" value="/auction/aucCurlist.do" />
         document.forms[0].action = '<c:out value="${post_url}"/>';
         
      }
      else if (s == "lastAuction"){
         
         <c:url var="post_url" value="/auction/auclist.do" />
         document.forms[0].action = '<c:out value="${post_url}"/>';
      }
      document.forms[0].submit(); 
   }
</script>

<!-- <script type="text/javascript">
    $(function(){
        $('#curr').click(function(){
          $.ajax({
               url : "/jpetstore/auction/aucCurlist.do",
               async : true,
               type: "GET",
               dataType:"json",
               success:function(response) {
            	   	/* var obj = JSON.parse(JSON.stringify(response));
            	   
            	   	for (var i=0;i<obj.length;++i){
            	   		document.getElementById('divhidden').innerHTML = obj[i].itemName ;
                	} */
                	windows.location.href=""
               },
               fail:function() {
                  alert("실패 !!");
               }
            });    
        });
    });
    $(function(){
        $('#last').click(function(){
          $.ajax({
               url : "/jpetstore/auction/auclist.do",
               async : true,
               type: "GET",
               dataType:"json",
               success:function(response) {
            	   		var obj = JSON.parse(JSON.stringify(response));
	           	   	for (var i=0;i<obj.length;++i){
	                  document.getElementById('divhidden').innerHTML = obj[i].itemName ;
	               	}
	            	   
               },
               fail:function() {
                  alert("실패 !!");
               }
            });    
        });
    });
</script> -->