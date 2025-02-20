package com.rupp.news.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Builder
public class Notifications {
    @Id
    private Long id;
    private Users userId;
    private String message;
    private boolean isRead;
    private LocalDateTime createdAt;
}
