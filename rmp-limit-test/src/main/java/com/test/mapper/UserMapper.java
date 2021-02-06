package com.test.mapper;

import com.test.entity.User;
import org.springframework.stereotype.Repository;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-29 23:03:37
 */
@Repository
public interface UserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    User queryById(Integer id);



}