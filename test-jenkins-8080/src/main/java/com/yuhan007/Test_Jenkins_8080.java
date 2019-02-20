package com.yuhan007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Test_Jenkins_8080 extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Test_Jenkins_8080.class, args);
        System.out.println("a");
        System.out.println("a");
    }

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
