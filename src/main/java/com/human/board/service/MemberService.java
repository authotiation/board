package com.human.board.service;

import com.human.board.vo.MemberVO;

public interface MemberService {
    void join(MemberVO membervo);
    MemberVO findById(String id);
    boolean existsById(String id);
}
