package com.jk.controller;

import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @BelongsProject: springboot-demo
 * @BelongsPackage: com.jk.controller
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  11:26
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    // test123
    @RequestMapping("/getUserList")
    @ResponseBody
    public List<UserEntity> getUserList() {
        return userService.getUserList();
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser(UserEntity user) {
        userService.addUser(user);
    }

    @RequestMapping("/deleteUserById")
    @ResponseBody
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id) {
        return userService.getUserById(id);
    }
}


