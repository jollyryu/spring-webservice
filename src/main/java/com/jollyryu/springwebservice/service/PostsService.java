package com.jollyryu.springwebservice.service;

import com.jollyryu.springwebservice.domain.Posts;
import com.jollyryu.springwebservice.domain.PostsRepository;
import com.jollyryu.springwebservice.dto.PostsResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public void save(Posts entity) {
        postsRepository.save(entity);

        System.out.println("success");
        System.out.println("commit and merge");
        System.out.println("aaa");

        System.out.println("last message");
    }


    @Transactional(readOnly = true)
    public List<PostsResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().map(PostsResponseDto::new).collect(Collectors.toList());
    }


}