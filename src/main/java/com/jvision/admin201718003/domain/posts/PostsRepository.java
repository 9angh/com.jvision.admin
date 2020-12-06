package com.jvision.admin201718003.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<com.jvision.admin201718003.domain.posts.Posts, Long> {

    @Query("SELECT p from Posts p ORDER BY p.id DESC")
    List<com.jvision.admin201718003.domain.posts.Posts> findAllDesc();
}
