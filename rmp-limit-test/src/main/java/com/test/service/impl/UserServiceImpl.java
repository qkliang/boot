package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-01-29 23:03:38
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userMapper.queryById(id);
    }


}