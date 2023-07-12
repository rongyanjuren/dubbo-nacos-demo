package com.dubbo.consumer.controller;

import com.dubbo.entity.User;
import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/user")
    public User getById() {
        return userService.getById(1L);
    }

    @PostMapping("/update")
    public User update(User user) {
        return userService.updateByUser(user);
    }
}
