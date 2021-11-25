package com.gavin.AutoWired.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private int userId;
    private String userName;
    private String userPwd;
    private Date registerDate;

    public User() {
    }
//@Autowired//将构造自动注入
    public User(int userId, String userName, String userPwd, Date registerDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPwd = userPwd;
        this.registerDate = registerDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
