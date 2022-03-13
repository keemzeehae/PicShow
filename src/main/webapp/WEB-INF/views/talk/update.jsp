<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Again talk</h1>
	<form action="./update" method="POST">
		<input type="hidden" readonly="readonly" name="num" value="${dto.num}">
		title <input type="text" name="title" value="${dto.title}">
		<div>
			small talk!
			<textarea name="contents" rows="10" cols="30">${dto.contents}</textarea>
		</div>
		<input type="submit" value="Update">
	</form>
</body>
</html>