package com.human.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardFileVo {
    private Long id;
    private Long boardId;
    private String originalName;
    private String savedName;
    private String filePath;
    private Long fileSize;
    private LocalDateTime createdAt;
    private int deleted;
}
