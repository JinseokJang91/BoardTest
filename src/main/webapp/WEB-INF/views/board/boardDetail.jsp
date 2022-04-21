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
	<div>
		제목 : ${b.boardTitle } 조회수 : ${b.readCount }
	</div>
	<div>
		작성자 : ${b.userName }
	</div>
	<div>
		내용 : ${b.boardContent }
	</div>
	<button type="button" onclick="location.href='boardList.bo'">목록</button>
	<button type="button" onclick="fn_boardUpdateView(${b.boardNo});">수정</button>
	<button type="button" onclick="fn_boardDelete(${b.boardNo});">삭제</button>
</body>
</html>