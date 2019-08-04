package com.zdd.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zdd.dubbo.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component(value = "userController")
@RestController
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/check")
    public String check(String name){
        return userService.check(name);
    }
}
