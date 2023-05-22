package com.hi.board.mapper;

import com.hi.board.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // List<BoardDTO> selectList(int startNum, int count);

    List<BoardDTO> selectList(PageOption option);
    // selectList(0,5) #{param1} => 0, #{param2} => 5

    int selectTotalCount(BoardSearchOption searchOption);

    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);


    int insertBoard(RequestRegBoard regBoard);

    int updateBoard(RequestModifyRequest modifyRequest);

    int deleteBoard(int bno);
}
