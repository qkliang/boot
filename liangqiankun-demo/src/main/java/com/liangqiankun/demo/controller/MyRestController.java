package com.liangqiankun.demo.controller;


import com.liangqiankun.demo.dto.Person;
import com.liangqiankun.demo.dto.RMP114Dto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {

    @PostMapping("/rmp112")
    public void rmp112(@RequestBody Person person){
        System.out.println(person.toString());
    }

    @PostMapping("/rmp114")
    public void rmp114(@RequestBody RMP114Dto dto){
        System.out.println(dto);
        System.out.println(dto.getRuleId());
    }

    @PostMapping("/rmp113")
    public void rmp113(String s){
        System.out.println(s);
    }

}
