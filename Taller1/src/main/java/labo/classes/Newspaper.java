package labo.classes;

import labo.utils.Utils;

public class Newspaper extends Book {
    private String paperType;
    private int numberOfPages;

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Newspaper(String title, String author, int year, String genre, int quantity, String paperType, int numberOfPages) {
        super(title, author, year, genre, quantity);
        this.setId("PR" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
        this.paperType = paperType;
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
                ", paperType='" + paperType + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

}
