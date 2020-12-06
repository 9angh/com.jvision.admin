package com.jvision.admin201718003.web.dto;

import com.jvision.admin201718003.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsListResponseDto {
    private String di;
    private String name;
    private String tel;
    private String address;

    public PostsListResponseDto(Posts entity)
    {
        this.di = entity.getDi();
        this.name = entity.getName();
        this.tel = entity.getTel();
        this.address = entity.getAddress();
    }
}
