class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String editorial;
    private int anoPublicacion;
    private double precio;

    // Constructor
    public Libro(String titulo, String autor, String ISBN, String editorial, int anoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Libro: " + titulo + " - Autor: " + autor + " - ISBN: " + ISBN + " - Editorial: " + editorial + " - Año de publicación: " + anoPublicacion + " - Precio: " + precio;
    }
}
