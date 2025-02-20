package com.rupp.news.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Builder
public class Comments {
    @Id
    private Long id;
    private Articles articlesId;
    private Users userId;
    private String content;
    private LocalDateTime createAt;
}
