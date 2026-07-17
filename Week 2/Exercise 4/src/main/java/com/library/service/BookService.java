package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("DI: BookRepository injected into BookService via setter.");
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public List<String> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public void addBook(String title) {
        bookRepository.addBook(title);
        System.out.println("Book added: " + title);
    }
}
