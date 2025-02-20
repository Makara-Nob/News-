package com.rupp.news.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum PermissionEnum {
    ARTICLE_WRITE("article:write"),
    ARTICLE_READ("article:read"),
    COMMENT_WRITE("comment:write"),
    COMMENT_READ("comment:read"),
    USER_READ("user:read"),
    USER_WRITE("user:write");


    private final String description;
}
