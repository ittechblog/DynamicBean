package com.example.demo.controller;

import com.example.demo.bean.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/6.
 */
@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return userService.getName();
    }
}
