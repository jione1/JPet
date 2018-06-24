<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="header1">
        <!-- Header desktop -->
        <div class="container-menu-header">
            
            <div class="wrap_header">
                <!-- Logo -->
                <a href="<c:url value="/shop/index.do"/>" class="logo">
                    <img src="../images-theme/icons/jpetlogo.png" style="heigth:100%">
                </a>

                <!-- Menu -->
                <div class="wrap_menu">
                    <nav class="menu">
                        <ul class="main_menu">
                            <li>
                                <a a href="<c:url value="/shop/index.do"/>">Home</a>
                            </li>
                            <li>
                                <a href="<c:url value="/shop/viewCategory.do"><c:param name="categoryId" value="FISH"/></c:url>">Shop</a>
                            </li>
                         
                            <li>
                                <a href="<c:url value="/p2p/writeP2PPost.do"/>">New Post</a>
                            </li>
                            <li>
                                <a href="<c:url value="/qa/qalist.do"/>">Contact</a>
                            </li>

                            <li>
                                <a href="<c:url value="/auction/aucTemplist.do"/>">Auction</a>
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
                        <a href="<c:url value="/shop/viewCart.do"/>"><img src="../images-theme/icons/icon-header-02.png" class="header-icon1 js-show-header-dropdown" alt="ICON"></a>
                    </div>
                </div>
            </div>
        </div>
</header>



