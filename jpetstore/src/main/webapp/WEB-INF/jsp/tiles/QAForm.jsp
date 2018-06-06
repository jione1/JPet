<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<!-- 	<section class="bgwhite p-t-66 p-b-60"> -->
		<div class="container">
			<div class="row">
				<div class="col-md-12 p-b-30">
				<c:url var="qa_url" value="qawrite.do"/>
					<form:form commandName="qaForm" cssClass="leave-comment" method="post" action="${qa_url}" enctype="multipart/form-data">
						<h4 class="m-text26 p-b-36 p-t-15">
							문의 게시판
						</h4>

						<div class="bo4 size15 m-b-20">
							<label for="qaTitle">TITLE</label>
							<form:input cssClass="sizefull s-text7 p-l-22 p-r-22" path="qaTitle" placeholder="제목을 입력해주세요"/>
							<form:errors path="qaTitle"/>
						</div>

						<div class="size15 m-b-20">
							<label for="qaType">Type</label>
							<form:select path="qaType" cssClass="size15">
								<form:option value="1">관리자에게 문의</form:option>
								<form:option value="2">판매자에게 문의</form:option>
							</form:select>
							<form:errors path="qaType"/>
						</div>
						
						<p>&nbsp;</p>
						<label for="qaContent">Content</label>
						<form:input cssClass="dis-block s-text7 size20 bo4 p-l-22 p-r-22 p-t-13 m-b-20" path="qaContent" placeholder="내용을 입력해주세요"/>
						<form:errors path="qaContent"/>
						<div class="w-size25">
							<!-- Button -->
							<button class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">
								Send
							</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
<!-- 	</section> -->
</body>
</html>