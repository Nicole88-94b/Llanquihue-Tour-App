package model;

/**
 * Clase Hija de Servicio. Sirve como ejemplo de futuras hijas si se expande el negocio.
 */
public class Tour extends Servicio{
    private String tipo;
    public Tour(String codigo, String nombre, String destino, double precio, String tipo) {
        super(codigo, nombre, destino, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Manejo de la salida por consola del atributo específico de "Tour"
     * @return La impresión completa del Servicio-Tour.
     */
    @Override
    public String toString() {
        return super.toString() + "\nTipo de tour: " + tipo  + ".";
    }
}
