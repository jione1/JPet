<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QAForm</title>
</head>
<body>
	<section class="bgwhite p-t-66 p-b-60">
		<div class="container">
			<div class="row">
				<div class="col-md-12 p-b-30">
					<form class="leave-comment" method="post" action="<c:url value="qalist.do"/>">
						<h4 class="m-text26 p-b-36 p-t-15">
							문의 게시판
						</h4>

						<div class="bo4 size15 m-b-20">
							<input class="sizefull s-text7 p-l-22 p-r-22" type="text" name="qaTitle" placeholder="제목을 입력해주세요">
						</div>

						<div class="size15 m-b-20">
							<p>문의 타입</p>
							<select name="qaType" class="size15">
								<option value="1">관리자에게 문의</option>
								<option value="2">판매자에게 문의</option>
							</select>
						</div>
						
						<p>&nbsp;</p>
						
						<textarea class="dis-block s-text7 size20 bo4 p-l-22 p-r-22 p-t-13 m-b-20" name="qaContent" placeholder="내용을 입력해주세요"></textarea>

						<div class="w-size25">
							<!-- Button -->
							<button class="flex-c-m size2 bg1 bo-rad-23 hov1 m-text3 trans-0-4">
								Send
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>