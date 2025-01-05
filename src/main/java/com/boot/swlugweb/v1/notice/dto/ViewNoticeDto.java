package com.boot.swlugweb.v1.notice.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ViewNoticeDto {
    private Integer noticeId;
    private String title;
    private String content;
    private String imageUrl;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private String roleType;
    private Long id;
}
