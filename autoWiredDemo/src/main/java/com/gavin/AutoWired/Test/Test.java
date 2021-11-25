package com.gavin.AutoWired.Test;


import com.gavin.AutoWired.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void Test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.findPer();
    }
}
