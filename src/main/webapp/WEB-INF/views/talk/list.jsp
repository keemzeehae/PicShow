<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Small Talk! Show</h1>
	<table>
		<thead>
			<tr>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일자</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
				<c:forEach items="${list}" var="talk">
					<tr>
						<td><a href="./detail?num=${talk.num}">${talk.title}</a></td>
						<td>${talk.contents}</td>
						<td>${talk.writer}</td>
						<td>${talk.regDate}</td>
						<td>${talk.hit}</td>
					</tr>
				
				</c:forEach>
		</tbody>
		
	</table>
	<a href="./add">ADD</a>
</body>
</html>