package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase encargada de la lectura de archivo de texto, separación de datos y correcto retorno.
 */
public class GestorDatos {
    private final String ARCHIVO_LECTURA = "resources/tours.txt";

    /**
     *Función destinada a la lectura del archivo y la creación de un nuevo objeto Tour.
     * @return Objeto Tour con atributos actualizados.
     */
    public ArrayList<Tour> listaTours() {
        ArrayList<Tour> listaTours = new ArrayList<>();
        HashMap<String, String> codigosPorTipo = codigosPorTipo();
        try (BufferedReader lector = new BufferedReader(new FileReader(ARCHIVO_LECTURA))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(";");
                String nombre = datos[0];
                String destino = datos[1];
                double precio = Double.parseDouble(datos[2]);
                String tipo = datos[3];
                //Se llama a la función para asignar código.
                String codigo = codigosPorTipo.get(tipo);
                //Se actualiza el objeto Tour
                Tour tour = new Tour(codigo,nombre,destino,precio,tipo);
                listaTours.add(tour); }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } return listaTours;
    }

    /**
     *Función destinada a asignar códigos según el tipo de tour seleccionado.
     * @return Un código asociado al tour realizado.
     */
    private HashMap<String, String> codigosPorTipo() {
    HashMap<String, String> codigosPorTipo = new HashMap<>();
    codigosPorTipo.put("gastronómico", "01GA");
    codigosPorTipo.put("lacustre", "02LA");
    codigosPorTipo.put("cultural", "03CU");
    codigosPorTipo.put("patrimonial", "04PA");
    codigosPorTipo.put("personalizado", "05PE");
    return codigosPorTipo;

}
}
