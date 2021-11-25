package com.gavin.Service;

import com.gavin.Controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserServiceImp implements UserService {
 @Autowired
 private UserController userController;
 @Autowired
    //@Resource(name="UserController")
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void findPer() {
        this.userController.findByName();
    }
}
