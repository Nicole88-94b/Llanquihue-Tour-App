package model;

/**
 * Clase base que contiene los datos comunes de los servicios turísticos.
 */
public class Servicio {
    private String codigo;
    private String nombre;
    private String destino;
    private double precio;

    /**
     * Crea un servicio con sus datos principales.
     *
     * @param codigo código utilizado para identificar y filtrar el servicio
     * @param nombre nombre del recorrido o ruta
     * @param destino lugar donde se realizarán las actividades
     * @param precio valor total del servicio por persona
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
     * Devuelve una representación textual del servicio.
     *
     * @return datos principales del servicio
     */
    @Override
    public String toString() {
        return "Servicio " +
                "\nCódigo: " + codigo +
                ", \nNombre: " + nombre +
                ", \nDestino: " + destino +
                ", \nPrecio: $" + precio;
    }
}