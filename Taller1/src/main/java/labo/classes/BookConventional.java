package labo.classes;

import labo.utils.Utils;

public class BookConventional extends Book {

    public BookConventional(String title, String author, int year, String genre, int quantity) {
        super(title, author, year, genre, quantity);
        this.setId("LC" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
    }
    @Override
    public String getTitle() {
        return "Book: " + super.getTitle() + " - Author: " + getAuthor() + " - Is available: " + isAvailable();
    }

}
