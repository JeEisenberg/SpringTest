package com.gavin.AutoWired.Controller;

import org.springframework.stereotype.Controller;

@Controller("userController")//标识控制层
public class UserControllerImp implements UserController {
    @Override
    public void findByName() {
        System.out.println("搜狗搜到了你");
    }
}
