package com.jollyryu.springwebservice.config;

import com.jollyryu.springwebservice.SpringWebserviceApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ThymeleafConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringWebserviceApplication.class);
    }

}