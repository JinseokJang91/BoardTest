package com.js.board.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.board.model.dao.BoardDao;
import com.js.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public ArrayList<Board> selectBoard() {
		return boardDao.selectBoard(sqlSession);
	}

	@Override
	public int boardRegi(Board b) {
		return boardDao.boardRegi(sqlSession, b);
	}

	@Override
	public Board boardDetail(int boardNo) {
		return boardDao.boardDetail(sqlSession, boardNo);
	}
	
	@Override
	public Board boardUpdateView(int boardNo) {
		return boardDao.boardUpdateView(sqlSession, boardNo);
	}
	
	@Override
	public int boardUpdate(Board b) {
		return boardDao.boardUpdate(sqlSession, b);
	}

	@Override
	public int boardDelete(int boardNo) {
		return boardDao.boardDelete(sqlSession, boardNo);
	}



}
