package com.gavin.Test;

import com.gavin.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void Test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("UserDao");
        userDao.findPer();
    }
}
