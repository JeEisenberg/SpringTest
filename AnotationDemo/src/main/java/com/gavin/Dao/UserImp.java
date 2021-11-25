package com.gavin.Dao;

import com.gavin.Controller.UserController;
import com.gavin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("UserDao")//标识Dao层
public class UserImp  implements UserDao{
    @Resource(name="UserService")
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void findPer() {
        this.userService.findPer();
    }
}
