package com.hi.board.mapper;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> selectAll();

    int insertBoard(RequestRegBoard regBoard);
}
