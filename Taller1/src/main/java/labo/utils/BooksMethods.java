package labo.utils;

import labo.classes.Book;

import java.util.ArrayList;

public class BooksMethods {
    public void ListBooks(ArrayList<Book> books){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
}
