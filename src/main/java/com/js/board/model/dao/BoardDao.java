package com.js.board.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;

import com.js.board.model.vo.Board;

public interface BoardDao {

	ArrayList<Board> selectBoard(SqlSessionTemplate sqlSession);

	int boardRegi(SqlSessionTemplate sqlSession, Board b);

	Board boardDetail(SqlSessionTemplate sqlSession, int boardNo);
	
	Board boardUpdateView(SqlSessionTemplate sqlSession, int boardNo);
	
	int boardUpdate(SqlSessionTemplate sqlSession, Board b);

	int boardDelete(SqlSessionTemplate sqlSession, int boardNo);



}
