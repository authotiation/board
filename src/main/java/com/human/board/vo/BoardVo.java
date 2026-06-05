package com.human.board.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardVo {
    private Long id;           // 게시글 번호
    private String writer;     // 작성자 (member.id 참조)
    private String title;      // 제목
    private String content;    // 내용
    private LocalDateTime createdAt;  // 작성일시
    private LocalDateTime updatedAt;  // 수정일시
    private int deleted;       // 활성 여부 (1: 활성, 0: 삭제)
}
