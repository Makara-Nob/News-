package com.rupp.news.model;

import com.rupp.news.enums.Status;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Set;

@Document
@Builder
public class Articles extends Audit {
    @Id
    private Long id;
    private String title;
    private String slug;
    private String content;
    private Users authorId;
    private Categories categoryId;
    private Set<String> tags;
    private String thumbnail;
    private LocalDateTime publishedAt;
    private int views;
    private Status status;
}
