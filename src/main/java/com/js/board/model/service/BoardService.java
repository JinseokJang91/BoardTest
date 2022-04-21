package com.js.board.model.service;

import java.util.ArrayList;

import com.js.board.model.vo.Board;

public interface BoardService {

	ArrayList<Board> selectBoard();

	int boardRegi(Board b);

	Board boardDetail(int boardNo);
	
	Board boardUpdateView(int boardNo);
	
	int boardUpdate(Board b);

	int boardDelete(int boardNo);



}
