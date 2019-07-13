package com.blogBoys.blogBoys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BlogBoysApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogBoysApplication.class, args);
	}


	@RestController
    class PostController {
        @GetMapping("/")
        String hello() {
            return ("Hello World");
        }
    }
}
