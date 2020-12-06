package com.jvision.admin201718003.web.dto;

import com.jvision.admin201718003.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String name;
    private String tel;
    private String address;
    private String intro;

    @Builder
    public PostsSaveRequestDto(String id, String name, String tel ,String address, String intro)
    {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.intro = intro;
    }

    public Posts toEntity()
    {
        return Posts.builder()

                .name(name)
                .tel(tel)
                .address(address)
                .intro(intro)
                .build();
    }
}
