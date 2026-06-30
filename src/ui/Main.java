package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.ArrayList;

/**
 * Clase principal que carga, muestra y filtra los servicios turísticos.
 */
public class Main {

    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios("resources/tours.txt");
        ArrayList<ServicioTuristico> tours = gestor.listaTours();

        System.out.println("--------------------- Todos los tours ----------------------------");
        for (ServicioTuristico tour : tours) {
            System.out.println(tour);
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("------------------- Todos los tours filtrados -------------------");
        for  (ServicioTuristico tour : tours) {
            if ("03CU".equals(tour.getCodigo())){
            System.out.println(tour);
            System.out.println("-----------------------------------------------------------");
        }
        }
    }
}