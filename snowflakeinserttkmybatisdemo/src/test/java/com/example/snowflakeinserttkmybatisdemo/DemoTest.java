package com.example.snowflakeinserttkmybatisdemo;

import com.example.snowflakeinserttkmybatisdemo.bean.User;
import com.example.snowflakeinserttkmybatisdemo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class DemoTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        for(int i=0;i<10000;i++){
            User user = new User();
            userMapper.insert(user);
            System.out.println("id:"+user.getId());
        }
    }
}
