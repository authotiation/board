package com.human.board.mapper;

import com.human.board.vo.BoardFileVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardFileMapper {
    List<BoardFileVo> selectByBoardId(Long boardId);
    BoardFileVo selectOne(Long id);
    int insert(BoardFileVo vo);
    int delete(Long id);
    int deleteByBoardId(Long boardId);
}
