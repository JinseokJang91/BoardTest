<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="resources/js/board.js"></script>
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="boardList">
				<tr>
					<td>${boardList.boardNo }</td>
					<td><a href="#" onclick="fn_boardDetail(${boardList.boardNo});">${boardList.boardTitle }</a></td>
					<td>${boardList.userName }</td>
					<fmt:parseDate value="${boardList.boardDate }" var="dateValue" pattern="yyyyMMddHHmmss"/>
					<td><fmt:formatDate value="${dateValue }" pattern="yyyy-MM-dd"/></td>
					<td>${boardList.readCount }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button type="button" onclick="location.href='regView.bo'">등록하기</button>
</body>
</html>