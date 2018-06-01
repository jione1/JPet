<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header1">
        <!-- Header desktop -->
        <div class="container-menu-header">
            
            <div class="wrap_header">
                <!-- Logo -->
                <a href="<c:url value="/shop/index.do"/>" class="logo">
                    <img src="../images-theme/icons/logo.png" alt="IMG-LOGO">
                </a>

                <!-- Menu -->
                <div class="wrap_menu">
                    <nav class="menu">
                        <ul class="main_menu">
                            <li>
                                <a a href="<c:url value="/shop/index.do"/>">Home</a>
                            </li>
                            <li>
                                <a href="<c:url value="/shop/viewItem.do"/>">Shop</a>
                            </li>
                            <li>
                                <a href="<c:url value="/shop/viewCart.do"/>">Cart</a>
                            </li>
                            <li>
                                <a href="<c:url value="/p2p/writeP2PPost.do"/>">Seller</a>
                            </li>
                            <li>
                                <a href="<c:url value="/qa/qalist.do"/>">Contact</a>
                            </li>
                        </ul>
                    </nav>
                </div>

                <!-- Header Icon -->
                <div class="header-icons">
                    <a href="<c:url value='/shop/signonForm.do'/>" class="header-wrapicon1 dis-block">
                        <img src="../images-theme/icons/icon-header-01.png" class="header-icon1" alt="ICON">
                    </a>

                    <span class="linedivide1"></span>

                    <div class="header-wrapicon2">
                        <img src="../images-theme/icons/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON">
                    </div>
                </div>
            </div>
        </div>
</header>



