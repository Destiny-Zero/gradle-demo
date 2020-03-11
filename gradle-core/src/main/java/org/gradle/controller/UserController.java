package org.gradle.controller;

import lombok.extern.slf4j.Slf4j;
import org.gradle.model.User;
import org.gradle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * getUserList()
     * @author Leo
     * @date 18:49 2019/5/22
     * @return java.lang.String
     **/
    @GetMapping("/list")
    public List<User> toList(){
        List<User> users = userService.getUserList();
        return users;
    }
}