package labo.utils;

import labo.classes.*;
import java.util.ArrayList;

public class BooksMethods {

    public static <T extends Book> void listBooks(ArrayList<T> books) {
        System.out.println("Todos los libros:");
        System.out.println("--------------------------------------------");
        for (Book book : books) {
            String tipo = book.getClass().getSimpleName();
            String estado = book.isAvailable() ? "Disponible" : "Prestado";

            System.out.println("ID: " + book.getId());
            System.out.println("Título: " + book.getTitle());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Tipo: " + tipo);
            System.out.println("Estado: " + estado);
            System.out.println("--------------------------------------------");
        }
    }

    public static <T extends Book> void listMangas(ArrayList<T> books) {
        for (Book book : books) {
            if (book instanceof Manga) {
                System.out.println(book.toString());
            }
        }
    }

    public static <T extends Book> void listBooksConventional(ArrayList<T> books) {
        for (Book book : books) {
            if (book instanceof BookConventional) {
                System.out.println(book.toString());
            }
        }
    }

    public static <T extends Book> void listNewspapers(ArrayList<T> books) {
        for (Book book : books) {
            if (book instanceof Newspaper) {
                System.out.println(book.toString());
            }
        }
    }

    public static <T extends Book> void listAvailableBooks(ArrayList<T> books) {
        System.out.println("Libros disponibles:");
        System.out.println("--------------------------------------------");

        int disponibles = 0;

        for (Book book : books) {
            String tipo = book.getClass().getSimpleName();
            String estado = book.isAvailable() ? "Disponible" : "Prestado";

            if (book.isAvailable()) {
                disponibles++;
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Tipo: " + tipo);
                System.out.println("Estado: " + estado);
                System.out.println("--------------------------------------------");
            }
        }

        if (disponibles == 0) {
            System.out.println("No hay libros disponibles.");
            System.out.println("--------------------------------------------");
        }
    }

    public static void loanersList(ArrayList<Person> loaners) {
        System.out.println("Lista de personas con libros prestados:");
        System.out.println("--------------------------------------------------");

        for (Person person : loaners) {
            Book book = person.getBook();

            if (book != null) {
                String fechaPrestamo = person.getLoanDate().toString();
                String fechaLimite = person.getLimitDate().toString();
                String nombre = person.getName();
                String documento = person.getAge() < 18 ? "00000000-0" : person.getDui();

                System.out.println("ID del libro: " + book.getId());
                System.out.println("Fecha de préstamo: " + fechaPrestamo);
                System.out.println("Fecha límite: " + fechaLimite);
                System.out.println("Nombre de la persona: " + nombre);
                System.out.println("Documento de identidad: " + documento);
                System.out.println("--------------------------------------------------");
            } else {
                System.out.println("La persona " + person.getName() + " no tiene libros prestados.");
            }
        }
    }

    public static void showBookDetails(ArrayList<Book> books, String id) {
        boolean found = false;
        for (Book b : books) {
            if (b.getId().equalsIgnoreCase(id)) {
                System.out.println("Detalles del libro:");
                System.out.println("ID: " + b.getId());
                System.out.println("Título: " + b.getTitle());
                System.out.println("Autor: " + b.getAuthor());
                System.out.println("Año: " + b.getYear());
                System.out.println("Género: " + b.getGenre());
                System.out.println("Cantidad: " + b.getQuantity());
                System.out.println("Estado: " + (b.isAvailable() ? "Disponible" : "Prestado"));

                // Si es un Manga, mostrar datos extras
                if (b instanceof Manga) {
                    Manga m = (Manga) b;
                    System.out.println("Número de tomo : " + m.getBookSet());
                    System.out.println("Lugar de creación : " + m.getOriginCountry());
                }
                // Si es un Newspaper, mostrar datos extras
                else if (b instanceof Newspaper) {
                    Newspaper n = (Newspaper) b;
                    System.out.println("Fecha de publicación : " + n.getPubDate());
                    System.out.println("Número de páginas: " + n.getNumberOfPages());
                }

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No se encontró un libro con el ID: " + id);
        }
    }
}
