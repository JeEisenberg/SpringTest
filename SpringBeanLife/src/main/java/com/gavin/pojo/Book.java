package com.gavin.pojo;

public class Book {
    private String b_id;
    private String b_name;
    public Book(String b_id, String b_name) {
        this.b_id = b_id;
        this.b_name = b_name;
    }
    @Override
    public String toString() {
        return "Book{" +
                "b_id='" + b_id + '\'' +
                ", b_name='" + b_name + '\'' +
                '}';
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
public void initBook(){
    System.out.println("第三步----Book初始化");
}
public void destroyBean(){
    System.out.println("第五步----Book销毁");
}
    public void setB_name(String b_name) {
        System.out.println("第二步---通过set方法设值");
        this.b_name = b_name;
    }
    public Book() {
        System.out.println("第一步---通过反射获取无参构造器,创建bean实例");
    }
}
