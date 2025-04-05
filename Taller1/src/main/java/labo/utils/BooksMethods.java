package labo.utils;

import labo.classes.*;

import java.util.ArrayList;

public class BooksMethods {
    public static <T extends Book> void listBooks(ArrayList<T> books) {
        System.out.println("All books:");
        System.out.println("--------------------------------------------");
        for (Book book : books) {
            String type = book.getClass().getSimpleName();
            String status = book.isAvailable() ? "Available" : "Is loaned";

            if(book.isAvailable()){
                System.out.println("Title " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Type: " + type);
                System.out.println("Status: " + status);
                System.out.println("--------------------------------------------");
            }
        }
    }
    public static <T extends Book> void listMangas(ArrayList<T> books) {
        for (Book book : books) {
            if(book instanceof Manga) {
                System.out.println(book.toString());
            }

        }
    }
    public static <T extends Book> void listBooksConventional(ArrayList<T> books) {
        for (Book book : books) {
            if(book instanceof BookConventional) {
                System.out.println(book.toString());
            }
        }
    }
    public static <T extends Book> void listNewspapers(ArrayList<T> books) {
        for (Book book : books) {
            if(book instanceof Newspaper) {
                System.out.println(book.toString());
            }
        }
    }
    public static <T extends Book> void listAvailableBooks(ArrayList<T> books) {
        System.out.println("Available books:");
        System.out.println("--------------------------------------------");
        for (Book book : books) {
            String type = book.getClass().getSimpleName();
            String status = book.isAvailable() ? "Available" : "Is loaned";

            if(book.isAvailable()){
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Type: " + type);
                System.out.println("Status: " + status);
                System.out.println("--------------------------------------------");
            }
        }
    }

    public static void loanersList(ArrayList<Person> loaners) {
        System.out.println("List of loaners and their loaned books:");
        System.out.println("--------------------------------------------------");

        for (Person person : loaners) {
            // Retrieve the loaned book
            Book book = person.getBook();  // Assuming `getBook()` returns the book that the person loaned

            // Check if the book is not null
            if (book != null) {
                String loanStartDate = person.getLoanDate().toString(); // Loan start date
                String loanEndDate = person.getLimitDate().toString(); // Loan end date
                String loanerName = person.getName();
                String loanerId = person.getAge() < 18 ? "00000000-0" : person.getDui(); // If minor, fill with "00000000-0"

                System.out.println("Book ID: " + book.getId());
                System.out.println("Loan start date: " + loanStartDate);
                System.out.println("Loan end date: " + loanEndDate);
                System.out.println("Person's name: " + loanerName);
                System.out.println("Person's ID number: " + loanerId);
                System.out.println("--------------------------------------------------");
            } else {
                System.out.println("No book loaned by " + person.getName());
            }
        }
    }

    public static void showBookDetails(ArrayList<Book> books, String id) {
        boolean found = false;
        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                System.out.println("Detalles del libro:");
                System.out.println("ID: " + book.getId());
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Año: " + book.getYear());
                System.out.println("Género: " + book.getGenre());
                System.out.println("Cantidad: " + book.getQuantity());
                System.out.println("Estado: " + (book.isAvailable() ? "Disponible" : "Prestado"));
                // Si cada subclase tiene más detalles, se puede llamar a toString(), o imprimir campos específicos
                System.out.println("Detalles adicionales: " + book.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No se encontró un libro con el ID: " + id);
        }
    }

}
