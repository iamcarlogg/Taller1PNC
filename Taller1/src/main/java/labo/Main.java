package labo;

import labo.classes.*;
import labo.ui.BookForm;
import labo.utils.BooksMethods;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Lista global para almacenar todos los libros
    static ArrayList<Book> allBooks = new ArrayList<>();
    // Lista global para almacenar las personas que han tomado un libro en préstamo
    static ArrayList<Person> loaners = new ArrayList<>();

    public static void main(String[] args) {
        Newspaper newspaper1 = new Newspaper(
                "El Diario de Hoy",
                "Redacción EDH",
                2024,
                "Noticias",
                10,
                "2024-04-04",
                32
        );

//        Newspaper newspaper2 = new Newspaper(
//                "La Prensa Gráfica",
//                "Redacción LPG",
//                2024,
//                "Noticias",
//                15,
//                "2024-04-03",
//                28
//        );
//
//        // 2 libros convencionales
//        BookConventional book1 = new BookConventional(
//                "Cien años de soledad",
//                "Gabriel García Márquez",
//                1967,
//                "Realismo mágico",
//                5
//        );
//
//        BookConventional book2 = new BookConventional(
//                "1984",
//                "George Orwell",
//                1949,
//                "Distopía",
//                7
//        );
//
//        // 2 mangas
//        Manga manga1 = new Manga(
//                "Naruto Vol. 1",
//                "Masashi Kishimoto",
//                1999,
//                "Shonen",
//                12,
//                "Volumen 1",
//                "Japón"
//        );
//
//        Manga manga2 = new Manga(
//                "Attack on Titan Vol. 5",
//                "Hajime Isayama",
//                2010,
//                "Seinen",
//                8,
//                "Volumen 5",
//                "Japón"
//        );
//        allBooks.add(book1);
//        allBooks.add(book2);
//        allBooks.add(manga1);
//        allBooks.add(manga2);
        allBooks.add(newspaper1);
//        allBooks.add(newspaper2);
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Insertar un nuevo libro");
            System.out.println("2. Listar todos los libros");
            System.out.println("3. Listar libros en préstamo");
            System.out.println("4. Listar libros disponibles");
            System.out.println("5. Prestar un libro");
            System.out.println("6. Ver detalles de un libro");
            System.out.println("7. Listar personas con préstamos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    Book newBook = BookForm.insertNewBook();
                    if (newBook != null) {
                        allBooks.add(newBook);
                        System.out.println("Libro insertado exitosamente.");
                    }
                    break;
                case 2:
                    // Listar todos los libros
                    BooksMethods.listBooks(allBooks);
                    break;
                case 3:
                    // Listar libros en préstamo (filtrados de la lista de libros)
                    BooksMethods.loanersList(loaners);
                    break;
                case 4:
                    // Listar libros disponibles
                    BooksMethods.listAvailableBooks(allBooks);
                    break;
                case 5:
                    System.out.print("Ingrese el ID del libro a prestar: ");
                    String bookId = scanner.nextLine();
                    Book bookToLoan = null;
                    for (Book b : allBooks) {
                        if (b.getId().equalsIgnoreCase(bookId)) {
                            bookToLoan = b;
                            break;
                        }
                    }
                    if (bookToLoan == null) {
                        System.out.println("Libro no encontrado.");
                    } else if (!bookToLoan.isAvailable()) {
                        System.out.println("El libro ya está prestado.");
                    } else {
                        System.out.print("Ingrese el nombre de la persona: ");
                        String personName = scanner.nextLine();
                        System.out.print("Ingrese la edad: ");
                        int age = Integer.parseInt(scanner.nextLine());
                        String dui = "";
                        if (age >= 18) {
                            System.out.print("Ingrese el DUI: ");
                            dui = scanner.nextLine();
                        } else {
                            dui = "00000000-0";
                        }
                        Person p = new Person(bookToLoan, personName, age, dui);
                        bookToLoan.setAvailable();
                        loaners.add(p);
                        System.out.println("Libro prestado exitosamente a " + personName);
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el ID del libro para ver detalles: ");
                    String id = scanner.nextLine();
                    BooksMethods.showBookDetails(allBooks, id);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }
        } while (option != 7);

        scanner.close();
    }
}
