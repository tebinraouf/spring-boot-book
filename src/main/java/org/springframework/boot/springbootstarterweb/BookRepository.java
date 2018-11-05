package org.springframework.boot.springbootstarterweb;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {


    private ArrayList<Book> books = new ArrayList<Book>(){
        {
            add(new Book(1,"Book 1", "123456789-1", "Author 1"));
            add(new Book(2,"Book 2", "123456789-2", "Author 2"));
            add(new Book(3,"Book 3", "123456789-3", "Author 3"));
            add(new Book(4,"Book 4", "123456789-4", "Author 4"));
        }
    };

    public BookRepository() {

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
