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
	<form id="board_regi_form" method="post" >
		<input type="text" id="boardTitle" name="boardTitle" placeholder="제목"/>
		<input type="text" id="userName" name="userName" placeholder="작성자"/>
		<input type="text" id="boardContent" name="boardContent" placeholder="내용"/>
		<button type="button" onclick="fn_boardRegi();">등록</button>
	</form>
</body>
</html>