package com.mycompany.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.webapp.dto.Board;
import com.mycompany.webapp.dto.Pager;

@Mapper
public interface BoardDao {
	public int insert(Board board);
	public int count();
	public List<Board> selectAll(Pager pager);
	public Board selectByBno(int bno);
	public int deleteByBno(int bno);
}
