package com.rupp.news.model;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
public class Categories extends Audit {
    @Id
    private Long id;
    private String name;
    private String slug;
}
