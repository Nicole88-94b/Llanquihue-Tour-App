package data;

import model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Lee y valida un archivo de tours, crea los objetos y los almacena en una colección.
 */
public class GestorServicios {
    private final String archivoLectura;

    /**
     * Crea un gestor asociado a un archivo de datos.
     *
     * @param archivoLectura ruta del archivo que contiene los tours
     */
    public GestorServicios(String archivoLectura) {
        this.archivoLectura = archivoLectura;
    }

    /**
     * Lee el archivo, valida sus líneas y crea servicios turísticos según su código.
     *
     * @return lista de servicios turísticos cargados y validados
     */
    public ArrayList<ServicioTuristico> listaTours() {
        ArrayList<ServicioTuristico> listaTours = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLectura))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                String[] datos = linea.split(";", -1);

                if (datos.length != 8) {
                    System.out.println("Línea " + numeroLinea + " omitida: debe contener 8 campos.");
                    continue;
                }

                String codigo = datos[0].trim();
                String nombre = datos[1].trim();
                String destino = datos[2].trim();
                String precioTexto = datos[3].trim();
                String duracionHorasTexto = datos[4].trim();
                String nombreGuia = datos[5].trim();
                String telefonoGuia = datos[6].trim();
                String atributoEspecial = datos[7].trim();

                if (nombre.isEmpty() || destino.isEmpty() || nombreGuia.isEmpty()
                        || telefonoGuia.isEmpty() || duracionHorasTexto.isEmpty()
                        || atributoEspecial.isEmpty()) {
                    System.out.println("Línea " + numeroLinea + " omitida: contiene campos vacíos.");
                    continue;
                }

                try {
                    double precio = Double.parseDouble(precioTexto);
                    double duracionHoras = Double.parseDouble(duracionHorasTexto);

                    Guia guia = new Guia(nombreGuia, telefonoGuia);
                    ServicioTuristico tour;

                    switch (codigo) {
                        case "01GA":
                            tour = new RutaGastronomica(codigo, nombre, destino, precio, duracionHoras, guia, atributoEspecial);
                            break;
                        case "02LA":
                            tour = new PaseoLacustre(codigo, nombre, destino, precio, duracionHoras, guia, atributoEspecial);
                            break;
                        case "03CU":
                            tour = new ExcursionCultural(codigo, nombre, destino, precio, duracionHoras, guia, atributoEspecial);
                            break;
                        default:
                            System.out.println("Línea " + numeroLinea + " omitida: código desconocido.");
                            continue;
                    }

                    listaTours.add(tour);
                } catch (IllegalArgumentException e) {
                    System.out.println("Línea " + numeroLinea + " omitida: datos numéricos no válidos.");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return listaTours;
    }
}
