package model;

/**
 * Representa al guía responsable de un tour y sus datos de contacto.
 */
public class Guia {
    private String nombre;
    private String telefono;

    /**
     * Crea un guía con sus datos de contacto.
     *
     * @param nombre nombre del guía
     * @param telefono teléfono de contacto
     */
    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve una representación textual del guía.
     *
     * @return nombre y teléfono de contacto
     */
    @Override
    public String toString() {
        return nombre + " (contacto: " + telefono + ")";
    }
}