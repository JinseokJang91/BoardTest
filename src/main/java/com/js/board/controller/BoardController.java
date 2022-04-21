package com.js.board.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.js.board.model.service.BoardService;
import com.js.board.model.vo.Board;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="boardList.bo")
	public String boardList(Model model) {
		
		ArrayList<Board> list = boardService.selectBoard();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@RequestMapping(value="regView.bo")
	public String regView() {
		return "board/boardRegi";
	}
	
	@ResponseBody
	@RequestMapping(value="boardRegi.bo")
	public String boardRegi(Board b) {
		
		System.out.println("b : " + b);
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		b.setBoardDate(sdf.format(date));
		
		int result = boardService.boardRegi(b);
		System.out.println("result : " + result);
		
		if(result > 0) {
			return "Y";
		}else {
			return "N";
		}
	}
	
	@RequestMapping(value="boardDetail.bo")
	public ModelAndView boardDetail(int boardNo, ModelAndView mv) {
		
		System.out.println("넘어온 boardNo : " + boardNo);
		Board b = boardService.boardDetail(boardNo);
		
		mv.addObject("b", b).setViewName("board/boardDetail");
		
		
		return mv;
	}
	
	@RequestMapping(value="boardUpdateView.bo")
	public ModelAndView boardUpdateView(int boardNo, ModelAndView mv) {
		
		System.out.println("넘어온 boardNo2 : " + boardNo);
		Board b = boardService.boardUpdateView(boardNo);
		System.out.println("수정전b : " + b);
		mv.addObject("b", b).setViewName("board/boardUpdate");
		
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="boardUpdate.bo")
	public String boardupdate(Board b) {
		
		System.out.println("수정할b : " + b);
		int result = boardService.boardUpdate(b);
		System.out.println("수정 result : " + result);
		
		if(result > 0) {
			return "Y";
		}else {
			return "N";
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value="boardDelete.bo")
	public String boardDelete(int boardNo) {
		
		int result = boardService.boardDelete(boardNo);
		
		if(result > 0) {
			return "Y";
		}else {
			return "N";
		}
		
	}
}
