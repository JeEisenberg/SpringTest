package com.gavin.Pojo;

import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable {
    private  Integer BookId;
    private String BookName;
    private String BookPublish;
    private Double BookPrice ;
    private String BookKind;
    private Date PublishDate;
    private Integer BookCount;

    public Book() {
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookPublish() {
        return BookPublish;
    }

    public void setBookPublish(String bookPublish) {
        BookPublish = bookPublish;
    }

    public Double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookKind() {
        return BookKind;
    }

    public void setBookKind(String bookKind) {
        BookKind = bookKind;
    }

    public Date getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(Date publishDate) {
        PublishDate = publishDate;
    }

    public Integer getBookCount() {
        return BookCount;
    }

    public void setBookCount(Integer bookCount) {
        BookCount = bookCount;
    }

    public Book(Integer bookId, String bookName, String bookPublish, Double bookPrice, String bookKind, Date publishDate, Integer bookCount) {
        BookId = bookId;
        BookName = bookName;
        BookPublish = bookPublish;
        BookPrice = bookPrice;
        BookKind = bookKind;
        PublishDate = publishDate;
        BookCount = bookCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", BookPublish='" + BookPublish + '\'' +
                ", BookPrice=" + BookPrice +
                ", BookKind='" + BookKind + '\'' +
                ", PublishDate=" + PublishDate +
                ", BookCount=" + BookCount +
                '}';
    }
}
