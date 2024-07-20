package com.example.snowflakeinserttkmybatisdemo.controller;

import com.example.snowflakeinserttkmybatisdemo.bean.User;
import com.example.snowflakeinserttkmybatisdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnowFlakeTestController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/snow")
    public void test(){
        User user = new User();
        userMapper.insert(user);
        System.out.println(user.getId());
    }
}
