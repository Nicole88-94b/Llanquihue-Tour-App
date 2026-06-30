package model;
/**
 * Representa una excursión cultural ofrecida por la agencia.
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarTuristico;
    /**
     * Crea una excursión cultural con sus datos principales y el guía asignado.
     *
     * @param codigo        código del servicio
     * @param nombre        nombre del tour
     * @param destino       destino del recorrido
     * @param precio        precio por persona
     * @param duracionHoras número de horas que dura el tour
     * @param guia          guía responsable del recorrido
     * @param lugarTuristico lugar en donde se llevará a cabo el tour
     */
    public ExcursionCultural(String codigo, String nombre, String destino, double precio, double duracionHoras, Guia guia, String lugarTuristico) {
        super(codigo, nombre, destino, precio, duracionHoras, guia);
        this.lugarTuristico = lugarTuristico;
    }
    public String getLugarTuristico() {
        return lugarTuristico;
    }
    public void setLugarTuristico(String lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }
    @Override
    public String toString() {
        return super.toString() + "\nLugar del tour: " + lugarTuristico + ".";
    }
}
