package labo.classes;
import labo.utils.Utils;

public class Manga extends Book{
    private String bookVolume;
    private String originCountry;

    public Manga(String title, String author, int year, String genre, int quantity, String bookVolume, String originCountry) {
        super(title, author, year, genre, quantity);
        this.setId("MG" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
        this.bookVolume = bookVolume;
        this.originCountry = originCountry;
    }

    public String getBookSet() {
        return bookVolume;
    }

    public void setBookVolume(String bookVolume) {
        this.bookVolume = bookVolume;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setArtStyle(String originCountry) {
        this.originCountry = originCountry;
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
                ", bookVolume='" + bookVolume + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }

}
