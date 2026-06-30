package model;
/**
 * Representa una ruta gastronómica ofrecida por la agencia.
 */
public class RutaGastronomica extends ServicioTuristico {
    private String numeroDeParadas;

    /**
     * Crea una ruta gastronómica con sus datos principales y el guía asignado.
     *
     * @param codigo        código del servicio
     * @param nombre        nombre del tour
     * @param destino       destino del recorrido
     * @param precio        precio por persona
     * @param duracionHoras número de horas que dura el tour
     * @param guia          guía responsable del recorrido
     * @param numeroDeParadas número de paradas que tendrá el tour
     */
    public RutaGastronomica(String codigo, String nombre, String destino, double precio, double duracionHoras, Guia guia, String numeroDeParadas) {
        super(codigo, nombre, destino, precio, duracionHoras, guia);
        this.numeroDeParadas = numeroDeParadas;
    }

    public String getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(String numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
    @Override
    public String toString() {
        return super.toString() + "\nNumero de Paradas planificadas: " + numeroDeParadas + ".";
    }
}
