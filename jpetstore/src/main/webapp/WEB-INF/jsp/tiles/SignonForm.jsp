<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${!empty message}">
  <b><font color="red"><c:url value="${message}" /></font></b>
</c:if>

<div align="center">
  <form action='<c:url value="/shop/signon.do"/>' method="POST">
    <c:if test="${!empty signonForwardAction}">
      <input type="hidden" name="forwardAction"
        value='<c:url value="${signonForwardAction}"/>' />
    </c:if>
    <table>
      <tr>
        <td colspan="2">Please enter your username and password. <br />&nbsp;</td>
      </tr>
      <tr style="height:80px">
        <td>Username:</td>
        <td><input type="text" name="username" size="20" placeholder="Input Username"/></td>
      </tr>
      <tr style="height:80px">
        <td>Password:</td>
        <td><input type="password" name="password" size="20" placeholder="Input Password"/></td>
      </tr>
      <tr style="height:30px">
        <td>&nbsp;</td>
        <td><input name="update" type="image" src="../images/button_submit.png" height="70"/></td>
      </tr>
    </table>
  </form>
  <a href='<c:url value="/shop/newAccount.do"/>'> 
    <img border="0" src="../images/button_register_now.jpg" alt="" height="50"/>
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href='https://kauth.kakao.com/oauth/authorize?client_id=1472597e6ed7e4b9234dd8d12f932b68&redirect_uri=http://localhost:8080/jpetstore/kakaologin.do&response_type=code'>
    <img border="0" src="../images/kakaologin.png" alt="" width="120" height="50"/>
  </a>
 
</div>