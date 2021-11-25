package com.gavin.AutoWired.Service;


import com.gavin.AutoWired.Controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImp implements UserService {
    //  @Autowired
    @Resource(name="userController")
 private UserController userController;
    //  @Autowired
    @Resource(name="userController")
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void findPer() {
        this.userController.findByName();
    }
}
