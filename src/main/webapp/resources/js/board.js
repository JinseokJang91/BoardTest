function fn_boardRegi(){
	console.log("fn_boardRegi 확인");
	var boardTitle = $("#boardTitle").val();
	var userName = $("#userName").val();
	var boardContent = $("#boardContent").val();
	
	$.ajax({
		type : "POST",
		url : "boardRegi.bo",
		data : {
			boardTitle : boardTitle,
			userName : userName,
			boardContent : boardContent
		},
		success : function(data){
			if(data == 'Y'){
				alert("글 등록이 완료되었습니다.");
				location.href = "boardList.bo";
			}
		},
		error : function(data){
			alert("글 등록 실패!!!");
			console.log(data);
		}
	});
};

function fn_boardDetail(boardNo){
	console.log("boardNo : " + boardNo);
	
	location.href="boardDetail.bo?boardNo="+boardNo;
	
};

function fn_boardUpdateView(boardNo){
	
	console.log("boardNo : " + boardNo);
	
	location.href="boardUpdateView.bo?boardNo="+boardNo;
}

function fn_boardUpdate(){
	console.log("fn_boardUpdate 확인");
	var boardNo = $("#boardNo").val();
	var boardTitle = $("#boardTitle").val();
	var userName = $("#userName").val();
	var boardContent = $("#boardContent").val();
;
	$.ajax({
		type : "POST",
		url : "boardUpdate.bo",
		data : {
			boardNo : boardNo,
			boardTitle : boardTitle,
			userName : userName,
			boardContent : boardContent
		},
		success : function(data){
			if(data == 'Y'){
				alert("글 수정이 완료되었습니다.");
				fn_boardDetail(boardNo);
			}else{
				alert("글 수정이 실패되었습니다.");
			}
		},
		error : function(data){
			alert("에러 발생!!!");
			console.log(data);
		}
	});
};

function fn_boardDelete(boardNo){
	console.log("boardNo : " + boardNo);
	
	$.ajax({
		type: "POST",
		url: "boardDelete.bo",
		data: {boardNo : boardNo},
		success: function(data){
			if(data == 'Y'){
				alert("글 삭제가 완료되었습니다.");
				location.href = "boardList.bo";
			}else{
				alert("글 삭제가 실패되었습니다.");
			}
		},
		error : function(data){
			alert("에러 발생!!!");
			console.log(data);
		}
	});
};