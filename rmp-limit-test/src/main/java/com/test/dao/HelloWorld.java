package com.test.dao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangqiankun
 * @date 2021/1/22 12:59 下午
 */
@RestController
public class HelloWorld {

    @GetMapping("/test")
    public String myTest(){
        return "test";
    }
}
