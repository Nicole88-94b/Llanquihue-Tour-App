package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase Principal del proyecto. Se encarga de revisar los tours realizados y filtrarlos según necesidad.
 */
public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> tours = gestor.listaTours();

        System.out.println("----------------------------Todos los tours realizados en el mes----------------------------");
        for (Tour tour : tours) {
            System.out.println(tour);
            System.out.println("------------------------------------------------------------------------------------------");
        }

        System.out.println();
        System.out.println("------------------------------------Tours filtrados---------------------------------------");
        for (Tour tour : tours) {
        if (tour.getCodigo().equals("03CU")) {

            System.out.println("Servicio: " + tour.getNombre());
            System.out.println("Precio: $" + tour.getPrecio());
        } }

    }
}
