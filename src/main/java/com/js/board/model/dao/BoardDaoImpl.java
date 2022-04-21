package com.js.board.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.js.board.model.vo.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Override
	public ArrayList<Board> selectBoard(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("boardMapper.selectBoardList");
	}

	@Override
	public int boardRegi(SqlSessionTemplate sqlSession, Board b) {
		return sqlSession.insert("boardMapper.boardRegi", b);
	}

	@Override
	public Board boardDetail(SqlSessionTemplate sqlSession, int boardNo) {
		return sqlSession.selectOne("boardMapper.boardDetail", boardNo);
	}
	
	@Override
	public Board boardUpdateView(SqlSessionTemplate sqlSession, int boardNo) {
		return sqlSession.selectOne("boardMapper.boardUpdateView", boardNo);
	}
	
	@Override
	public int boardUpdate(SqlSessionTemplate sqlSession, Board b) {
		return sqlSession.update("boardMapper.boardUpdate", b);
	}

	@Override
	public int boardDelete(SqlSessionTemplate sqlSession, int boardNo) {
		return sqlSession.delete("boardMapper.boardDelete", boardNo);
	}



}
