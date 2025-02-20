package com.rupp.news.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
public abstract class Audit {

    @CreatedDate
    @Field("date_create")
    private LocalDateTime dateCreate;

    @LastModifiedDate
    @Field("last_update")
    private LocalDateTime dateUpdate;

    @CreatedBy
    @Field("user_create")
    private String userCreate;

    @LastModifiedBy
    @Field("user_update")
    private String userUpdate;
}