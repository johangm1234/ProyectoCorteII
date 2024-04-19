import java.util.Date;
class Prestamo {
    private String tituloLibro;
    private String nombreUsuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(String tituloLibro, String nombreUsuario) {
        this.tituloLibro = tituloLibro;
        this.nombreUsuario = nombreUsuario;
        this.fechaPrestamo = new Date();
        this.fechaDevolucion = null;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean estaDevuelto() {
        return fechaDevolucion != null;
    }

    @Override
    public String toString() {
        return "Préstamo de '" + tituloLibro + "' a '" + nombreUsuario + "'. Fecha de préstamo: " + fechaPrestamo + ". Fecha de devolución: " + (fechaDevolucion != null ? fechaDevolucion : "Pendiente");
    }
}

