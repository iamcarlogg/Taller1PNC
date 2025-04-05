package labo.classes;

import labo.utils.Utils;

public class BookConventional extends Book {

    public BookConventional(String title, String author, int year, String genre, int quantity) {
        super(title, author, year, genre, quantity);
        this.setId("LC" + Integer.toString(new java.util.Random().nextInt(10000)) + Utils.generateTwoLetterCode());
    }

    // Quita o ajusta este método para que no repita información
    // Aquí lo simplificamos para que devuelva solo el título original
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    // Sobrescribe toString() para mostrar la información en varias líneas
    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
                "Título: " + super.getTitle() + "\n" +
                "Autor: " + getAuthor() + "\n" +
                "Tipo: " + this.getClass().getSimpleName() + "\n" +
                "Estado: " + (isAvailable() ? "Disponible" : "Prestado");
    }
}