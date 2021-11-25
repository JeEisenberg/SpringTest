package com.gavin;


import com.gavin.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao) ac.getBean("userDao");
        //userDao.addUser();
        UserDao userDao= (UserDao) ac.getBean("userDao");
         userDao.DelUser();
    }
}
