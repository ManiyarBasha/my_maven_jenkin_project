package com;

import com.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        // Setting values using setter methods
        book.setTitle("Complete docker course");
        book.setAuthor("Aplha man");

        // Printing book details using toString()
        System.out.println(book);
    }
}
