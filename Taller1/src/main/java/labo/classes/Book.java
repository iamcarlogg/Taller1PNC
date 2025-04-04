package labo.classes;

import java.util.Random;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String genre;
    private int quantity;
    private boolean available;


    public Book(String title, String author, int year, String genre, int quantity) {
        Random rand = new Random();

        this.id = "BB"+ Integer.toString(rand.nextInt(10000)) +"AA" ;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.quantity = quantity;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable() {
        this.available = !this.available;
    }
    @Override
    public String toString(){
        return "Book: " + getTitle() + "- Is available: " + isAvailable();

    }
}
