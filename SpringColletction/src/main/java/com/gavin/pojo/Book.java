package com.gavin.pojo;

public class Book {
    private String b_id;
    private String b_name;



    public Book() {
    }

    public Book(String b_id, String b_name) {
        this.b_id = b_id;
        this.b_name = b_name;

    }

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id='" + b_id + '\'' +
                ", b_name='" + b_name + '\'' +
                '}';
    }
}
