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
	<form action="./list" method="get"></form>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
				<c:forEach items="${list}" var="talk">
					<tr>
						<td>${talk.num}</a></td>
						<td><a href="./detail?num=${talk.num}">${talk.title}</td>
						<td>${talk.writer}</td>
						<td>${talk.regDate}</td>
						<td>${talk.hit}</td>
					</tr>
				
				</c:forEach>
		</tbody>
		
	</table>
	
	<div>
		<c:if test="${pager.pre}">
			<a href="./list?page=${pager.startNum-1}">Preview </a>
		</c:if>
		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" step="1" var="i">
			<a href="./list?page=${i}">${i}</a>
		</c:forEach>
		<c:if test="${pager.next}"> 
			<a href="./list?page=${pager.lastNum+1}">Next</a>
		</c:if>
	</div>
	<a href="./add">ADD</a>
</body>
</html>