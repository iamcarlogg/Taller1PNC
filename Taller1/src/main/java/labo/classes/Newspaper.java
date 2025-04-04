package labo.classes;

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
        this.paperType = paperType;
        this.numberOfPages = numberOfPages;

    }
}
