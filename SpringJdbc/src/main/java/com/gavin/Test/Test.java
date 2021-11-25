package com.gavin.Test;

import com.gavin.Dao.UserDao;
import com.gavin.Pojo.Book;
import com.gavin.Pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Test {
    @org.junit.Test
    public void Test(){
/*        String sql= "create table test (id int ,name varchar(8),age int);";
//        加载配置文件
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
//     得到数据库操做类的实例
      JdbcTemplate jdbcTemplate = (JdbcTemplate)ac.getBean("jdbcTemplate");
jdbcTemplate.execute(sql);*/
/*        User user= new User(1,"2",3);
        User user1= new User(4,"5",6);
        User user2= new User(7,"8",9);
ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
      UserDao userDao = (UserDao)ac.getBean("userDao");
      userDao.addUser(user);*/

ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        List<Book> books = userDao.queryAllBook();
        for (Book book :
                books) {
            System.out.println(book);
        }

      /*  ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
userDao.transfer("张三","李四",200);*/
    }

}
