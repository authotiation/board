package com.human.board.mapper;

import com.human.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> selectAll();
    BoardVo selectOne(Long id);
    int insert(BoardVo vo);
    int update(BoardVo vo);
    int delete(Long id);
}
