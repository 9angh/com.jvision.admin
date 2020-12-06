package com.jvision.admin201718003.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String di;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String tel;
    @Column(nullable = false)
    private String address;

    @Column(length = 300 ,nullable = false)
    private String intro;

    @Builder
    public Posts(String name, String tel, String address ,String intro )
    {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.intro = intro;
    }

}
