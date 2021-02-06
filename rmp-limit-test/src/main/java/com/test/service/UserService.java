package com.test.service;

import com.test.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2021-01-29 23:03:37
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    User queryById(Integer id);



}