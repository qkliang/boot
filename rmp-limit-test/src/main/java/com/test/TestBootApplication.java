package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liangqiankun
 * @date 2021/1/22 1:00 下午
 */
@MapperScan("com.test.mapper")
@SpringBootApplication
public class TestBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestBootApplication.class);
    }
}
