package com.mycompany.webapp.service;

import java.util.List;

import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.dto.Pager;

public interface BoardService {
	public void write(Board board);
	public int getTotalRows();
	public List<Board> getBoards(Pager pager);
	public Board getBoard(int bno);
	public void delete(int bno);
}
