package org.springframework.boot.springbootstarterweb;

public class Book {

    private final int id;
    private final String name;
    private final String isbn;
    private final String author;

    public Book(int id, String name, String isbn, String author) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
}
