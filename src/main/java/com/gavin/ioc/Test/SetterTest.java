package com.gavin.ioc.Test;
import com.gavin.ioc.Dao.BookDao;
import com.gavin.ioc.Dao.PersonDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterTest {
   @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
PersonDao personDao= (PersonDao) ac.getBean("PersonDao");
personDao.BookInfo();

   }
}
