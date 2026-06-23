package model;

/**
 * Representa un tour turístico asociado a un guía responsable.
 */
public class Tour extends Servicio {
    private String tipo;
    private Guia guia;

    /**
     * Crea un tour con sus datos principales y el guía asignado.
     *
     * @param codigo código del servicio
     * @param nombre nombre del tour
     * @param destino destino del recorrido
     * @param precio precio por persona
     * @param tipo categoría del tour
     * @param guia guía responsable del recorrido
     */
    public Tour(String codigo, String nombre, String destino, double precio, String tipo, Guia guia) {
        super(codigo, nombre, destino, precio);
        this.tipo = tipo;
        this.guia = guia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Devuelve una representación textual completa del tour.
     *
     * @return datos del servicio, tipo de tour y guía responsable
     */
    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de tour: " + tipo
                + "\nGuía responsable: " + guia + ".";
    }
}