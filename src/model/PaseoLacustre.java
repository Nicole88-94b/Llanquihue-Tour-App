package model;
/**
 * Representa un paseo lacustre ofrecido por la agencia.
 */
public class PaseoLacustre extends ServicioTuristico {
    private String tipoEmbarcacion;

    /**
     * Crea un paseo lacustre con sus datos principales y el guía asignado.
     *
     * @param codigo        código del servicio
     * @param nombre        nombre del tour
     * @param destino       destino del recorrido
     * @param precio        precio por persona
     * @param duracionHoras número de horas que dura el tour
     * @param guia          guía responsable del recorrido
     * @param tipoEmbarcacion tipo de embarcación usada para el recorrido
     */
    public PaseoLacustre(String codigo, String nombre, String destino, double precio, double duracionHoras, Guia guia, String tipoEmbarcacion) {
        super(codigo, nombre, destino, precio, duracionHoras, guia);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTipo de embarcación a usar: " + tipoEmbarcacion + ".";
    }
}
