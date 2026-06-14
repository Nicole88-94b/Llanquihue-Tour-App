package model;

/**
 * Clase modelo base para servicios. Podrá heredar a otras clases hijas.
 */
public class Servicio {
    private String codigo;
    private String nombre;
    private String destino;
    private double precio;

    /**
     * Constructor del objeto servicio el cual tiene los atributos asociados:
     * @param codigo para asignar un código que a futuro sirva para filtrar los servicios;
     * @param nombre nombre del recorrido o ruta;
     * @param destino lugar hacia donde se realizarán las actividades;
     * @param precio valor total del tour por persona.
     */
    public Servicio(String codigo, String nombre, String destino, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Manejo de la estructura de impresión por consola
     * @return La plantilla base del servicio.
     */
    @Override
    public String toString() {
        return "Servicio " +
                "\nCódigo: " + codigo  +
                ", \nNombre: " + nombre +
                ", \nDestino: " + destino +
                ", \nPrecio: $" + precio;
    }
}
