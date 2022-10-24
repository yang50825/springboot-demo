package com.jk.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jk.entity.UserEntity;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: springboot-demo
 * @BelongsPackage: com.jk.dao
 * @Author: 杨帅
 * @CreateTime: 2022-10-24  11:32
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
@CacheNamespace
public interface UserDao extends BaseMapper<UserEntity> {
}
