<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
<h1>Very Small Talk Plus</h1>
<form action="./add" method="post">
	제목 <input type="text" name="title">
	<div>
		토크토크
		<textarea name="contents" rows="30" cols="30"></textarea>
	</div>
	작성자 <input type="text" name="writer">
	<input type="submit"name="ADD">
</form>
</body>
</html>