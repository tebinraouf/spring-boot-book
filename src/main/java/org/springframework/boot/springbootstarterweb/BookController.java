package org.springframework.boot.springbootstarterweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/book")
public class BookController {


    private ArrayList<Book> books = new BookRepository().getBooks();

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ArrayList<Book> getBooks() {
        return books;
    }

    @RequestMapping(value = "/get")
    public Book getBookById(@RequestParam(value = "id", required = true) int id) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }

    @RequestMapping(value = "/add")
    public Book addBook(@RequestParam(value = "id", required = true) int id,
                        @RequestParam(value = "name", required = true) String name,
                        @RequestParam(value = "isbn", required = true) String isbn,
                        @RequestParam(value = "author", required = true) String author) {
        Book book = new Book(id,name,isbn,author);
        books.add(book);
        return book;
    }

    @RequestMapping(value = "/delete")
    public Book deleteBookByID(@RequestParam(value = "id", required = true) int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    @RequestMapping(value = "/update")
    public Book updateBookByID(@RequestParam(value = "id", required = true) int id,
                               @RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "isbn", required = false) String isbn,
                               @RequestParam(value = "author", required = false) String author) {
        for (Book book : books) {
            if (book.getId() == id) {
                Book updated = new Book(id, name, isbn, author);
                books.remove(book);
                books.add(updated);
                return updated;
            }
        }
        return null;
    }

}
