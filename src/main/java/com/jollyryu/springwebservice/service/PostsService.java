package com.jollyryu.springwebservice.service;

import com.jollyryu.springwebservice.domain.Posts;
import com.jollyryu.springwebservice.domain.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public void save(Posts entity){
        postsRepository.save(entity);

        System.out.println("success");
        System.out.println("commit and merge");
        System.out.println("aaa");

    }

}