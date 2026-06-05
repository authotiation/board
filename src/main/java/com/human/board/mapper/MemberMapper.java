package com.human.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.human.board.vo.MemberVO;

@Mapper
public interface MemberMapper {
    void insertMember(MemberVO membervo);
    MemberVO findById(String id);
    int countById(String id);
}
