package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 * Clase principal que carga, muestra y filtra los tours.
 */
public class Main {

    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos("resources/tours.txt");
        ArrayList<Tour> tours = gestor.listaTours();

        System.out.println("--------------------- Todos los tours ---------------------");
        for (Tour tour : tours) {
            System.out.println(tour);
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("\n---------------- Tours culturales ----------------");
        for (Tour tour : tours) {
            if ("03CU".equals(tour.getCodigo())) {
                System.out.println(tour);
            }
        }
    }
}