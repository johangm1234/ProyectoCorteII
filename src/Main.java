import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar Nuevo Libro");
            System.out.println("2. Buscar Libro por Título");
            System.out.println("3. Buscar Libro por Autor");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Préstamo");
            System.out.println("6. Devolver Libro Prestado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del nuevo libro:");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Editorial: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anoPublicacion = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    Libro nuevoLibro = new Libro(titulo, autor, isbn, editorial, anoPublicacion, precio);
                    libreria.agregarLibro(nuevoLibro);
                    break;

                case 2:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Libro libroEncontrado = libreria.buscarLibroPorTitulo(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(libroEncontrado);
                    } else {
                        System.out.println("El libro no se encontró en el inventario.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del autor a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    System.out.println("Libros encontrados del autor " + autorBuscar + ":");
                    libreria.buscarLibroPorAutor(autorBuscar);
                    break;

                case 4:
                    System.out.println("Inventario de la biblioteca:");
                    libreria.mostrarInventario();
                    break;
                case 5:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloPrestamo = scanner.nextLine();
                    System.out.print("Ingrese el nombre del usuario que realiza el préstamo: ");
                    String nombreUsuarioPrestamo = scanner.nextLine();
                    libreria.realizarPrestamo(tituloPrestamo, nombreUsuarioPrestamo);
                    break;
                case 6:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloDevolucion = scanner.nextLine();
                    libreria.devolverLibro(tituloDevolucion);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
