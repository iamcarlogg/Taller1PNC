package labo.classes;
import labo.utils.Utils;

public class Manga extends Book{
    private String bookSet;
    private String artStyle;

    public Manga(String title, String author, int year, String genre, int quantity, String bookSet, String artStyle) {
        super(title, author, year, genre, quantity);
        this.setId("MG" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
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

    @Override
    public String toString() {
        return "Manga{" +
                "id='" + getId() + '\'' +
                ", title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", genre='" + getGenre() + '\'' +
                ", quantity=" + getQuantity() +
                ", available=" + isAvailable() +
                ", bookSet='" + bookSet + '\'' +
                ", artStyle='" + artStyle + '\'' +
                '}';
    }

}
