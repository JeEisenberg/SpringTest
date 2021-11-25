package com.gavin.AutoWired.Dao;


import com.gavin.AutoWired.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userDao")//标识Dao层
public class UserDaoImp implements UserDao{
   //@Autowired
  @Resource(name="userService")
    private UserService userService;
    //  @Autowired
 @Resource(name="userService")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void findPer() {
        this.userService.findPer();
    }
}
