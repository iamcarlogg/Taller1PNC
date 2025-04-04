package labo;

import labo.classes.*;
import labo.utils.BooksMethods;

import java.util.ArrayList;

public class Main {
    static ArrayList<Book> allBooks = new ArrayList<>();
    static ArrayList<Person> loaners;
    public static void main(String[] args) {
    Manga c = new Manga("Wea", "weon", 2002, "wea fome", 200, "wea", "weisima");
    Person p = new Person(c,"hola", 20, "dui");
    allBooks = new ArrayList<>();
    System.out.println(p.getBook());
        allBooks.add(c);
        allBooks.add(c);
    BooksMethods.listBooks(allBooks);
    }
}