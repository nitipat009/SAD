package com.solid.book;

import java.util.List;

public class PrintToScreen extends Book { // SRP
    public PrintToScreen(String title, List<String> pages) {
        super(title, pages);
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

}
