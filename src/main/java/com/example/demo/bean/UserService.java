package com.example.demo.bean;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/6.
 */
@Service(value = "userService")
public class UserService {
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public void cleanUp(){

    }
}
