package labo.ui;

import java.util.Scanner;
import labo.classes.Book;
import labo.classes.Manga;
import labo.classes.Newspaper;
import labo.classes.BookConventional;

public class BookForm {

    public static Book insertNewBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Inserción de Nuevo Libro ===");
        System.out.println("Seleccione el tipo de libro:");
        System.out.println("1. Manga");
        System.out.println("2. Periódico");
        System.out.println("3. Libro Convencional");
        System.out.print("Ingrese opción (1-3): ");

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el título: ");
        String title = scanner.nextLine();

        System.out.print("Ingrese el autor: ");
        String author = scanner.nextLine();

        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el género: ");
        String genre = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Book newBook = null;

        switch(option) {
            case 1: // Manga
                System.out.print("Ingrese el conjunto del manga (Book Set): ");
                String bookSet = scanner.nextLine();

                System.out.print("Ingrese el estilo artístico: ");
                String artStyle = scanner.nextLine();

                newBook = new Manga(title, author, year, genre, quantity, bookSet, artStyle);
                System.out.println("Manga creado con ID: " + newBook.getId());
                break;
            case 2: // Periódico
                System.out.print("Ingrese el tipo de papel: ");
                String paperType = scanner.nextLine();

                System.out.print("Ingrese el número de páginas: ");
                int numberOfPages = scanner.nextInt();
                scanner.nextLine(); // Consumir salto de línea

                newBook = new Newspaper(title, author, year, genre, quantity, paperType, numberOfPages);
                System.out.println("Periódico creado con ID: " + newBook.getId());
                break;
            case 3: // Libro Convencional
                newBook = new BookConventional(title, author, year, genre, quantity);
                System.out.println("Libro Convencional creado con ID: " + newBook.getId());
                break;
            default:
                System.out.println("Opción no válida. No se ha creado ningún libro.");
                break;
        }

        return newBook;
    }

    public static void main(String[] args) {
        Book book = insertNewBook();
        if(book != null){
            System.out.println("Libro registrado: " + book.toString());
        }
    }
}
