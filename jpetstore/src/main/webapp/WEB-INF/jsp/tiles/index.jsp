<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!-- Banner -->
    <section class="banner bgwhite p-t-40 p-b-40">
        <div class="container">
            <div class="row">
                <div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <!-- block1 -->

                    <!-- block1 -->
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images/dog_main.jpg" alt="IMG-BENNER" width=350 height=320>

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=DOGS"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                DOGS
                            </a>
                        </div>
                    </div>
                    
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images/fish_main.jpg" alt="IMG-BENNER" width=350 height=320>

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                FISHES
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <!-- block1 -->
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images/cat_main.jpg" alt="IMG-BENNER" width=350 height=320>

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=CATS"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                CATS
                            </a>
                        </div>
                    </div>

                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images/reptile_main.png" alt="IMG-BENNER" width=350 height=320>

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=REPTILES"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                REPTILES
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-sm-10 col-md-8 col-lg-4 m-l-r-auto">
                    <div class="block1 hov-img-zoom pos-relative m-b-30">
                        <img src="../images/bird_main.jpg" alt="IMG-BENNER" width=350 height=320>

                        <div class="block1-wrapbtn w-size2">
                            <!-- Button -->
                            <a href="<c:url value="/shop/viewCategory.do?categoryId=BIRDS"/>" class="flex-c-m size2 m-text2 bg3 hov1 trans-0-4">
                                BIRD
                            </a>
                        </div>
                    </div>

                    <!-- block2 -->
                    <div class="block2 wrap-pic-w pos-relative m-b-30">
                        <img src="../images-theme/icons/bg-01.jpg" alt="IMG">

                        <div class="block2-content sizefull ab-t-l flex-col-c-m">
                            <h4 class="m-text4 t-center w-size3 p-b-8">
                               성향 분석하기
                            </h4>

                            <p class="t-center w-size4">
                                당신과 맞는 동물을 추천해 드립니다.
                            </p>

                            <div class="w-size2 p-t-25">
                                <a href="#" class="flex-c-m size2 bg4 bo-rad-23 hov1 m-text3 trans-0-4">
                                    분석하기
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
