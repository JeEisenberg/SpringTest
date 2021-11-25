package com.gavin.Controller;

import org.springframework.stereotype.Controller;

@Controller("UserController")//标识控制层
public class UserControllerImp implements UserController {
    @Override
    public void findByName() {
        System.out.println("搜狗搜到了你");
    }
}
