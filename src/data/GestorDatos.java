package data;

import model.Guia;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Lee y valida un archivo de tours, crea los objetos y los almacena en una colección.
 */
public class GestorDatos {
    private final String archivoLectura;

    /**
     * Crea un gestor asociado a un archivo de datos.
     *
     * @param archivoLectura ruta del archivo que contiene los tours
     */
    public GestorDatos(String archivoLectura) {
        this.archivoLectura = archivoLectura;
    }

    /**
     * Lee el archivo, valida sus líneas y crea los objetos Tour.
     *
     * @return lista de tours cargados y validados
     */
    public ArrayList<Tour> listaTours() {
        ArrayList<Tour> listaTours = new ArrayList<>();
        HashMap<String, String> codigosPorTipo = codigosPorTipo();

        try (BufferedReader lector = new BufferedReader(new FileReader(archivoLectura))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = lector.readLine()) != null) {
                numeroLinea++;
                String[] datos = linea.split(";", -1);

                if (datos.length != 6) {
                    System.out.println("Línea " + numeroLinea + " omitida: debe contener 6 campos.");
                    continue;
                }

                String nombre = datos[0].trim();
                String destino = datos[1].trim();
                String precioTexto = datos[2].trim();
                String tipo = datos[3].trim().toLowerCase();
                String nombreGuia = datos[4].trim();
                String telefonoGuia = datos[5].trim();

                if (nombre.isEmpty() || destino.isEmpty() || tipo.isEmpty()
                        || nombreGuia.isEmpty() || telefonoGuia.isEmpty()) {
                    System.out.println("Línea " + numeroLinea + " omitida: contiene campos vacíos.");
                    continue;
                }

                String codigo = codigosPorTipo.get(tipo);
                if (codigo == null) {
                    System.out.println("Línea " + numeroLinea + " omitida: tipo de tour desconocido.");
                    continue;
                }

                try {
                    double precio = Double.parseDouble(precioTexto);
                    if (precio <= 0) {
                        System.out.println("Línea " + numeroLinea + " omitida: precio no válido.");
                        continue;
                    }

                    Guia guia = new Guia(nombreGuia, telefonoGuia);
                    Tour tour = new Tour(codigo, nombre, destino, precio, tipo, guia);
                    listaTours.add(tour);
                } catch (NumberFormatException e) {
                    System.out.println("Línea " + numeroLinea + " omitida: el precio no es un número válido.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }

    /**
     * Construye la relación entre cada tipo de tour y su código.
     *
     * @return mapa de códigos organizados por tipo de tour
     */
    private HashMap<String, String> codigosPorTipo() {
        HashMap<String, String> codigos = new HashMap<>();
        codigos.put("gastronómico", "01GA");
        codigos.put("lacustre", "02LA");
        codigos.put("cultural", "03CU");
        codigos.put("patrimonial", "04PA");
        codigos.put("personalizado", "05PE");
        return codigos;
    }
}