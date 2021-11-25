package com.gavin.Dao;

import com.gavin.Pojo.Book;
import com.gavin.Pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

public class UserDaoImp implements UserDao {
    private JdbcTemplate jdbcTemplate;

    //用于setter注入,先尝试xml配置
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //添加数据
    @Override
    public void addUser(User user) {
        String sql = "insert into test values(" + user.getId() + "," + user.getName() + "," + user.getAge() +user.getScore()+ ")";
        int update = jdbcTemplate.update(sql);
        System.out.println("插入" + update + "条数据");

    }

    //删除数据
    @Override
    public void delUserById(Integer ID) {
        String sql = "DELETE FROM test where id=" + ID;
        int update = jdbcTemplate.update(sql);
        System.out.println("删除" + update + "条数据");
    }

    //插入数据
    @Override
    public void upDateUser(User user) {

    }

    @Override
    public List<Book> queryAllBook() {
//        sql语句
        String sql= "select * from bookstore ;";
//        获得映射
        RowMapper<Book> rowMapper= new BeanPropertyRowMapper<>(Book.class);
        //查询结果放入rowMapper
        List<Book> bookinfo = jdbcTemplate.query(sql, rowMapper);

        return bookinfo;
    }

    @Override
    public Book queryBookById(Integer id) {
        String sql= "select * from bookstore  where BookId= ?";
//        获得映射
      RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
//      将查询结果放入映射,后面是可变参数

        Book book = jdbcTemplate.queryForObject(sql, rowMapper, id);
         return book;
    }

    @Override
    public void transfer(String out, String in, Integer jf) {
        String sql="update test set score  = score - ? where name=? ";
        int update = jdbcTemplate.update(sql,jf,out);
        //int j=10/0;
        String sql2="update test set score = score + ? where name=?";
        int update2 = jdbcTemplate.update(sql2,jf,in);
        if(update!=0&update2!=0)System.out.println("赠送成功");
    }
}
