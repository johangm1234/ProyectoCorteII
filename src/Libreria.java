import java.util.HashMap;

class Libreria {
    private HashMap<String, Libro> inventario;

    public Libreria() {
        inventario = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        if (!inventario.containsKey(libro.getTitulo())) {
            inventario.put(libro.getTitulo(), libro);
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("El libro ya existe en el inventario.");
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return inventario.get(titulo);
    }

    public void buscarLibroPorAutor(String autor) {
        for (Libro libro : inventario.values()) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarInventario() {
        for (Libro libro : inventario.values()) {
            System.out.println(libro);
        }
    }

    public void realizarPrestamo(String tituloLibro, String nombreUsuario) {
        Libro libro = inventario.get(tituloLibro);
        if (libro != null) {
            // Implementa la lógica para realizar el préstamo
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("El libro no está disponible en el inventario.");
        }
    }

    public void devolverLibro(String tituloLibro) {
        Libro libro = inventario.get(tituloLibro);
        if (libro != null) {
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("El libro no está en préstamo.");
        }
    }
}
