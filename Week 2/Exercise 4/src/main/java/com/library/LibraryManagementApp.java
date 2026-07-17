package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");

        System.out.println("\n=== Verifying Dependency Injection ===");
        System.out.println("BookRepository injected: " + (bookService.getBookRepository() != null));
        System.out.println("BookRepository class: " + bookService.getBookRepository().getClass().getName());

        System.out.println("\n=== Library Management System ===");
        System.out.println("Books in library:");
        for (String book : bookService.getAllBooks()) {
            System.out.println(" - " + book);
        }

        bookService.addBook("Clean Code");

        System.out.println("\nUpdated book list:");
        for (String book : bookService.getAllBooks()) {
            System.out.println(" - " + book);
        }

        ((ClassPathXmlApplicationContext) context).close();
    }
}
