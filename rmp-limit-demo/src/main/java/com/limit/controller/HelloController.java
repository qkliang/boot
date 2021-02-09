package com.limit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangqiankun
 * @date 2021/2/9 5:14 下午
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello WangShanshan";
    }
}
