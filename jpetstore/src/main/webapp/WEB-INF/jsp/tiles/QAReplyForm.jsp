<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<div class="row">
				<div class="col-md-12 p-b-30">
				<c:url var="qa_url" value="qaReplyWrite.do"/>
					<form:form commandName="qaReplyForm" cssClass="leave-comment" method="post" action="${qa_url}">
						<h4 class="m-text26 p-b-36 p-t-15">
							문의 게시판 
						</h4>
						
						<p>&nbsp;</p>
						<label for="answer" style="font-size: 20px">Reply</label>
						<form:input cssClass="dis-block s-text7 size20 bo4 p-l-22 p-r-22 p-t-13 m-b-20" path="answer" placeholder="내용을 입력해주세요"/>
						<form:errors path="answer"/>
						<form:hidden path="qaType" value="${qaReplyForm.qaType}" />
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
	</section>
</body>
</html>