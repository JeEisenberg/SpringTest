package com.gavin;

import com.gavin.pojo.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testGetBean(){
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println("第四步:User对象从容器中获取"+book);
        // 关闭容器
        context.close();
    }


}
