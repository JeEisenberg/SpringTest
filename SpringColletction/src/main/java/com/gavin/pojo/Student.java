package com.gavin.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private Book book;
    private Book[] bookArray;
    private List<Book> bookList;
    private Set<Book> bookSet;
    private Map<Book, Double> bookMap;

    public Student(String name, Book book, Book[] bookArray, List<Book> bookList, Set<Book> bookSet, Map<Book, Double> bookMap) {
        this.name = name;
        this.book = book;
        this.bookArray = bookArray;
        this.bookList = bookList;
        this.bookSet = bookSet;
        this.bookMap = bookMap;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", book=" + book +
                ", bookArray=" + Arrays.toString(bookArray) +
                ", bookList=" + bookList +
                ", bookSet=" + bookSet +
                ", bookMap=" + bookMap +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public void setBookArray(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public Map<Book, Double> getBookMap() {
        return bookMap;
    }

    public void setBookMap(Map<Book, Double> bookMap) {
        this.bookMap = bookMap;
    }
}
