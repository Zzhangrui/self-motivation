package com.yangq.selfmotivation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.yangq.selfmotivation.dao.mapper")
@SpringBootApplication
public class SelfMotivationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfMotivationApplication.class, args);
    }

}
