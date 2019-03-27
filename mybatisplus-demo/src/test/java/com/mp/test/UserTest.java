package com.mp.test;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.mp.model.User;
import com.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUsersTest(){
        Page<User> id = userService.selectPage(new Page<>(1, 2), new EntityWrapper<>(new User()).eq("id", "1"));
        System.out.println(id.getRecords().get(0).getUserName());
    }

    @Test
    public void getUsersTest1(){
    }
}
