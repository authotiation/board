package com.human.board.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberVO {
    private String id;
    private String name;
    private String password;
    private String role;
    private String phone;
    private String email;
}