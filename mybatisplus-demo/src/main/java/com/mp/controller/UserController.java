package com.mp.controller;


import com.alibaba.fastjson.JSON;
import com.mp.model.User;
import com.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wj
 * @since 2019-03-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public String getUsers(){
        System.out.println(userService);
        List<User> users = userService.selectList(null);
        System.out.println(users);
        return JSON.toJSONString(users);

    }
}

