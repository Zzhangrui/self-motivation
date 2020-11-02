package com.yangq.selfmotivation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.yangq.selfmotivation.dao.mapper")
@SpringBootApplication
@EnableScheduling
public class SelfMotivationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfMotivationApplication.class, args);
    }

}
