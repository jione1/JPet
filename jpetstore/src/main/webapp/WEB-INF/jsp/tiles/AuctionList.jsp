<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section class="banner bgwhite p-t-40 p-b-40">
        <div class="container">
            <div class="row">
            	<div class="btn-group" style="width:100%; padding:20px;">
					<button style="width:45%" class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">현재 경매</button>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button style="width:45%" class="w3-button flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">지난 경매</button>
				</div>
				
                <div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <c:set var="count" value="${listnum div 3}" />
					<c:forEach var="item" items="${itemList}" begin="0" end="${first}">
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
                        </div>
                    </div>
                    </c:forEach>
				</div>
				
				<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <c:set var="count2" value="${(listnum - count) div 2}" />
					<c:set var="total" value="${count + count2}" />
					<c:forEach var="item" items="${itemList}" begin="${count+1}" end="${total}">
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
                        </div>
                    </div>
                    </c:forEach>
				</div>
				
				<div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <c:set var="count3" value="${(listnum - total)}" />
					<c:forEach var="item" items="${itemList}" begin="${total+1}" end="${listnum}">
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images-theme/banner-03.jpg" alt="IMG-BENNER">

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">자세히 보기</a>
                        </div>
                    </div>
                    </c:forEach>
				</div>
            </div>
        </div>
    </section>
</body>
</html>