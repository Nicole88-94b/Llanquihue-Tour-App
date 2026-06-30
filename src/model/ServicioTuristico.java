package model;

/**
 * Clase base que contiene los datos comunes de los servicios turísticos.
 */
public class ServicioTuristico {
    private String codigo;
    private String nombre;
    private String destino;
    private double precio;
    private double duracionHoras;
    private Guia guia;


    /**
     * Crea un servicio con sus datos principales.
     *
     * @param codigo código utilizado para identificar y filtrar el servicio
     * @param nombre nombre del recorrido o ruta
     * @param destino lugar donde se realizarán las actividades
     * @param precio valor total del servicio por persona
     * @param duracionHoras total de horas que durará el servicio
     * @param guia guía responsable del recorrido
     */
    public ServicioTuristico(String codigo, String nombre, String destino, double precio, double duracionHoras, Guia guia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.destino = destino;
        setPrecio(precio);
        setDuracionHoras(duracionHoras);
       this.guia = guia;
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
           if (precio <= 0) {
               throw new IllegalArgumentException("El precio debe ser mayor que cero.");
           }
        this.precio = precio;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("El número de horas debe ser mayor que cero.");
        }
        this.duracionHoras = duracionHoras;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Devuelve una representación textual del servicio.
     *
     * @return datos principales del servicio
     */
    @Override
    public String toString() {
        return "Servicio Turístico programado: " +
                "\nCódigo: " + codigo +
                " \nNombre: " + nombre +
                " \nDestino: " + destino +
                " \nPrecio: $" + precio +
                " \nDuración en horas: " + duracionHoras
                + "\nGuía responsable: " + guia + ".";

    }
}