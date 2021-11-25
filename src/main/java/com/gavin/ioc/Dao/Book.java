package com.gavin.ioc.Dao;

import java.util.Set;

public class Book implements BookDao {
    private String bookKind;
    private String bookName;
    private double bookPrice;
private Set<String>set;
    public Book() {
    }

    public Book(String bookKind, String bookName, double bookPrice, Set<String> set) {
        this.bookKind = bookKind;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.set = set;
    }

    public String getBookKind() {
        return bookKind;
    }

    public void setBookKind(String bookKind) {
        this.bookKind = bookKind;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public void PrintInfo() {
        System.out.print("我最喜欢的书----"+this.bookKind+"--"+this.bookName+"这本书很贵呢---"+this.bookPrice);
    }



}
