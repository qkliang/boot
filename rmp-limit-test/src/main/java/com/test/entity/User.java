package com.test.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-01-29 23:03:34
 */
public class User implements Serializable {
    private static final long serialVersionUID = -16243543071193392L;

    private Integer id;

    private String name;

    private String gender;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}