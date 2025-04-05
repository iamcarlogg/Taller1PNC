package labo.classes;

import labo.utils.Utils;

public class Newspaper extends Book {
    private String pubDate;
    private int numberOfPages;

    public String getPubDate() {
        return pubDate;
    }

    public void setPaperType(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Newspaper(String title, String author, int year, String genre, int quantity, String pubDate, int numberOfPages) {
        super(title, author, year, genre, quantity);
        this.setId("PR" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
        this.pubDate = pubDate;
        this.numberOfPages = numberOfPages;

    }
    @Override
    public String toString() {
        return "Newspaper{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", genre='" + getGenre() + '\'' +
                ", quantity=" + getQuantity() +
                ", available=" + isAvailable() +
                ", pubDate='" + pubDate + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

}
