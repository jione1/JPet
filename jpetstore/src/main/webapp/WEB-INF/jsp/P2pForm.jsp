<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"
	type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="container">
		<h2>ITEM POSTING</h2>
		<form:form commandName="p2pForm" method="post">
			<div class="form-group">
				<label for="title">TITLE</label>
				<form:input path="title" cssClass="form-control"
					placeholder="제목을 입력해주세요" />
				<form:errors path="title" />
				<!-- <input type="email" class="form-control" id="Email1" placeholder="Enter email"> -->
			</div>
			<div class="form-group">
				<label for="itemName">ITEM NAME</label>
				<form:input path="itemName" cssClass="form-control"
					placeholder="이름을 입력해주세요" />
				<form:errors path="itemName" />
				<!-- <input type="email" class="form-control" id="Email1" placeholder="Enter email"> -->
			</div>
			<div class="form-group">
				<label for="sort">SORT</label>
				<form:radiobutton path="sort" value="P2P" label="P2P"
					checked="checked" />
				<form:radiobutton path="sort" value="AUCTION" label="AUCTION" />
				<form:errors path="sort" />
			</div>
			<div class="form-group">
				<label for="category">CATEGORY</label>
				<form:select path="category" items="${categories }" />
				<form:errors path="category" />
				<!-- <input type="password" class="form-control" id="Password1" placeholder="Password"> -->
			</div>
			<div class="form-group">
				<label for="quantity">QUANTITY</label>
				<form:input path="quantity" type="number" />
				<form:errors path="quantity" />
			</div>
			<div class="form-group">
				<label for="price">PRICE</label>
				<form:input path="price" placeholder="가격을 입력해주세요" />
				<form:errors path="quantity" />
			</div>
			<div class="form-group">
				<label for="File">PICTURE</label> 
				<input type="file" id="File">
			</div>
			<div class="form-group">
				<label for="discription">DISCRIPTION</label>
				<form:textarea path="discription" placeholder="동물의 매력을 뽐내주세요 " />
			</div>
			<form:hidden path="supplier" value="2" />
			<input type="submit" value="등록하기" />
		</form:form>
	</div>
</body>
</html>