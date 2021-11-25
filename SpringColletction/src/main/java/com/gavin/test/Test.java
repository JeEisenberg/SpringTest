package com.gavin.test;

import com.gavin.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = ac.getBean("student", Student.class);
        System.out.println(student.getBook());
        System.out.println(Arrays.toString(student.getBookArray()));
        System.out.println(student.getBookList());
        System.out.println(student.getBookSet());
        System.out.println(student.getBookMap());
    }
}
