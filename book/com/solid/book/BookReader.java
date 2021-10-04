package com.solid.book;


import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        Book book = new PrintToScreen("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
