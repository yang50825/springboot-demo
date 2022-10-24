package com.jk.service;

import com.jk.entity.UserEntity;

import java.util.List;

/**
 * @BelongsProject: springboot-demo
 * @BelongsPackage: com.jk.service
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  11:28
 * @Description: TODO
 * @Version: 1.0
 */
public interface UserService {
    List<UserEntity> getUserList();

    void addUser(UserEntity user);

    void deleteUserById(Integer id);

    UserEntity getUserById(Integer id);
}
