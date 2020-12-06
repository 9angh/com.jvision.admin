package com.jvision.admin201718003.service;

import com.jvision.admin201718003.domain.posts.PostsRepository;
import com.jvision.admin201718003.web.dto.PostsListResponseDto;
import com.jvision.admin201718003.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public String save(PostsSaveRequestDto requestDto)
    {
        return postsRepository.save(requestDto.toEntity()).getDi();
    }

    @Transactional
    public List<PostsListResponseDto> findAllDesc()
    {
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }
}
