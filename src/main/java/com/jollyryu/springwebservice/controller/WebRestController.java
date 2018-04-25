package com.jollyryu.springwebservice.controller;


import com.jollyryu.springwebservice.dto.PostsSaveRequestDto;
import com.jollyryu.springwebservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "dddd";
    }

    @GetMapping("/")
    public String main(Model model) {
//        test1
//        test2
        model.addAttribute("posts", postsService.findAllDesc());

        return "test";
    }

    @PostMapping("/posts")
    public String savePosts(@RequestBody PostsSaveRequestDto dto) {
        System.out.println(dto.getAuthor());
        postsService.save(dto.toEntity());

        return "test";
    }
}
