package com.mycompany.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.webapp.dao.BoardDao;
import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.dto.Pager;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	public void write(Board board) {
		log.info("실행");
		int rows = boardDao.insert(board);
		log.info("반영된 행 수: " + rows);
	}

	@Override
	public int getTotalRows() {
		log.info("실행");
		int rows = boardDao.count();
		return rows;
	}

	@Override
	public List<Board> getBoards(Pager pager) {
		log.info("실행");
		List<Board> boards = boardDao.selectAll(pager);
		return boards;
	}

	@Override
	public Board getBoard(int bno) {
		log.info("실행");
		Board board = boardDao.selectByBno(bno);
		return board;
	}

	@Override
	public void delete(int bno) {
		log.info("실행");
		int rows = boardDao.deleteByBno(bno);
		
	}

}
