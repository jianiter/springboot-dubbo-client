package com.zdd.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zdd.dubbo.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("check")
    public String check(String name){
        return userService.check(name);
    }
}
