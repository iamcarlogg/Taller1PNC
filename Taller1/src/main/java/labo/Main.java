package labo;

import labo.classes.BookConventional;
import labo.classes.Manga;
import labo.classes.Newspaper;
import labo.classes.Person;

import java.util.ArrayList;

public class Main {
    ArrayList<Newspaper> news;
    ArrayList<BookConventional> books;
    ArrayList<Manga> mangas;
    ArrayList<Person> loaners;
    public static void main(String[] args) {
    Manga c = new Manga("Wea", "weon", 2002, "wea fome", 200, "wea", "weisima");
    Person p = new Person(c,"hola", 20, "dui");
    System.out.println(p.getBook());
    }
}