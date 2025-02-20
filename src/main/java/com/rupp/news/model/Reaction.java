package com.rupp.news.model;

import com.rupp.news.enums.Type;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Builder
public class Reaction {
    @Id
    private Long id;
    private Articles articleId;
    private Users userId;
    private Type type;
    private LocalDateTime createdAt;
}
