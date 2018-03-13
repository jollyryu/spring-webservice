package com.jollyryu.springwebservice.controller;


import com.jollyryu.springwebservice.dto.PostsSaveRequestDto;
import com.jollyryu.springwebservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/list")
    public String main(Model model) {

        model.addAttribute("posts", postsService.findAllDesc());

        return "test";
    }

    @PostMapping("/posts")
        public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        System.out.println(dto.getAuthor());
        postsService.save(dto.toEntity());
    }
}
