<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="resources/js/board.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form id="board_update_form" method="post">
		<input type="hidden" id="boardNo" name="boardNo" value="${b.boardNo }"/>
		<label for="boardTitle">제목</label><input type="text" id="boardTitle" name="boardTitle" value="${b.boardTitle }"/>
		<label for="userName">작성자</label><input type="text" id="userName" name="userName" value="${b.userName }"/>
		<label for="boardContent">내용</label><input type="text" id="boardContent" name="boardContent" value="${b.boardContent }"/>
		<button type="button" onclick="fn_boardUpdate();">등록</button>
	</form>
</body>
</html>