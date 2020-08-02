package com.chen.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootDemo5Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo5Application.class, args);
    }

}
