package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<String> books = new ArrayList<>();

    public BookRepository() {
        books.add("The Great Gatsby");
        books.add("To Kill a Mockingbird");
        books.add("1984");
    }

    public List<String> getAllBooks() {
        return books;
    }

    public void addBook(String title) {
        books.add(title);
    }
}
