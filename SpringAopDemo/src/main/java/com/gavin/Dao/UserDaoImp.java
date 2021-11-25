package com.gavin.Dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;


public class UserDaoImp implements UserDao, Serializable {
    @Override
    public void addUser() {
        System.out.println("新增成功");
    }

    @Override
    public void DelUser() {
        System.out.println("删除成功");

    }
}
