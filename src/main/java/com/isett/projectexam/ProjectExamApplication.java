package com.isett.projectexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProjectExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectExamApplication.class, args);
    }

}
