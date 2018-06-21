<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
   <h2>ITEM POSTING</h2>
   <div class="p-t-22 p-b-50 bo3"></div>
   <c:url var="post_url" value="/p2p/sendP2PPost.do" />
   <form:form commandName="P2PForm" method="post"
      enctype="multipart/form-data">

      <div class="form-group">
         <label for="title">TITLE</label>
         <form:input path="title" cssClass="form-control"
            placeholder="제목을 입력해주세요" />
         <form:errors path="title" />
         <!-- <input type="email" class="form-control" id="Email1" placeholder="Enter email"> -->
      </div>
      <div class="p-t-22 p-b-30 bo3"></div>
      <div class="form-group">
         <label for="itemName">ITEM NAME</label>
         <form:input path="itemName" cssClass="form-control"
            placeholder="이름을 입력해주세요" />
         <form:errors path="itemName" />
         <!-- <input type="email" class="form-control" id="Email1" placeholder="Enter email"> -->
      </div>
      <div class="p-t-22 p-b-30 bo3"></div>
      <div class="form-group">
         <label for="sort">SORT</label>
         <div></div>
         <form:radiobutton path="sort" name = "sort" value="P2P" label="P2P"
            checked="checked" onClick="div_show(this.value, 'divshow');" />
         <div></div>
         <form:radiobutton path="sort" name = "sort" value="AUCTION" label="AUCTION"
            onClick="div_show(this.value, 'divshow');" />
         <%-- <form:errors path="sort" /> --%>

         <div id="divshow" style="display: none;">
            <div class='input-group'>
               <span>END-TO-DATE</span>&nbsp;&nbsp;<input type='text'
                  name="aucEnd" id="datepicker" />
               <script type="text/javascript">
                  $("#datepicker").datepicker({
                     dateFormat : 'yy-mm-dd'
                  });
               </script>
            </div>
         </div>
         <div class="p-t-22 p-b-30 bo3"></div>
         <div id = "divhidden">
            <div class="form-group">
               <label for="category">CATEGORY</label>
               <form:select path="category" items="${categories }" cssClass="size10"/>
               <%-- <form:errors path="category" /> --%>
               <!-- <input type="password" class="form-control" id="Password1" placeholder="Password"> -->
            </div>
            <div class="p-t-22 p-b-30 bo3"></div>
            <div class="form-group">
               <label for="quantity">QUANTITY</label>
               <form:input path="quantity" type="number" />
               <form:errors path="quantity" />
            </div>
         
         <div class="p-t-22 p-b-30 bo3"></div>
         </div>
         <div class="form-group">
            <label for="price">PRICE</label>
            <form:input path="price" placeholder="가격을 입력해주세요" />
            <form:errors path="price" />
         </div>
         <div class="p-t-22 p-b-30 bo3"></div>
         <div class="form-group">
            <label for="file">PICTURE</label>
            <div></div>
            <input type="file" id="file">
         </div>
         <div class="p-t-22 p-b-30 bo3"></div>
         <div class="form-group">
            <label for="discription">DISCRIPTION</label>
            <div></div>
            <form:textarea path="discription" placeholder="동물의 매력을 뽐내주세요 " />
         </div>
         <div class="p-t-22 p-b-30 bo3"></div>
         <form:hidden path="supplier" value="2" />
         <button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
            onClick="buttonSubmit()">등록</button>
      </div>
   </form:form>
</div>

<script type="text/javascript"></script>
<script type="text/javascript">
   function div_show(s, ss) {
      if (s == "AUCTION") {
         document.getElementById(ss).style.display = "";
         document.getElementById('divhidden').style.display="none";
      } else {
         document.getElementById(ss).style.display = "none";
         document.getElementById('divhidden').style.display="";
      }
   }
</script>

<script type="text/javascript">
   function buttonSubmit() {
      
       var size = document.getElementsByName("sort").length;
        var checkvalue;
        for(var i = 0; i < size; i++) {
             if(document.getElementsByName("sort")[i].checked) {
                 checkvalue=document.getElementsByName("sort")[i].value;
                 break;
             }
        }
        
      if (checkvalue == "P2P") {
         
         <c:url var="post_url" value="/p2p/sendP2PPost.do" />
         document.forms[0].action = '<c:out value="${post_url}"/>';
         
      }
      else if (checkvalue == "AUCTION"){
         
         <c:url var="post_url" value="/auction/sendAuctionPost.do" />
         document.forms[0].action = '<c:out value="${post_url}"/>';
      }
      document.forms[0].submit(); 
   }
</script>