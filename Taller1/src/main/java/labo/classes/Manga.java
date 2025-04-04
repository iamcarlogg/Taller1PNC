package labo.classes;

public class Manga extends Book{
    private String bookSet;
    private String artStyle;

    public Manga(String title, String author, int year, String genre, int quantity, String bookSet, String artStyle) {
        super(title, author, year, genre, quantity);
        this.bookSet = bookSet;
        this.artStyle = artStyle;
    }

    public String getBookSet() {
        return bookSet;
    }

    public void setBookSet(String bookSet) {
        this.bookSet = bookSet;
    }

    public String getArtStyle() {
        return artStyle;
    }

    public void setArtStyle(String artStyle) {
        this.artStyle = artStyle;
    }
}
