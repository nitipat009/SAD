package com.solid.book;


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new PrintToFile("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
