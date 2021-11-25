package com.gavin.Dao;

import com.gavin.Pojo.Book;
import com.gavin.Pojo.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void delUserById(Integer ID);
    public void upDateUser(User user);
    public List<Book> queryAllBook();
    public  Book queryBookById(Integer id);
public void transfer(String out, String in, Integer jf);
}
