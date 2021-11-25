package com.gavin.ioc.Dao;

import java.util.List;

public class Person implements PersonDao {
    private String name;
    private  int age;
    private String genger;
    private List<String> hobbies;
//通过无参构造

    public Person() {
    }

    public Person(String name, int age, String genger, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.genger = genger;
        this.hobbies = hobbies;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenger() {
        return genger;
    }

    public void setGenger(String genger) {
        this.genger = genger;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }



    //人有一本书
   private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void BookInfo() {
        System.out.print("大叫好,我是"+this.name+"我的爱好是"+this.hobbies);
        this.bookDao.PrintInfo();
    }

}
