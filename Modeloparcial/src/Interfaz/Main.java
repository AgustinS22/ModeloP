package Interfaz;
import java.util.LinkedList;

import Logica.*;


public class Main {

	public static void main(String[] args) {
		
		Estacion estacion1 = new Estacion("Corrientes", "12.5");
		Estacion estacion2 = new Estacion("Palermo", "15");
		Estacion estacion3 = new Estacion("Pueyrredon", "17.5");
		Estacion estacion4 = new Estacion("Puerto Madero", "20");
		Estacion estacion5 = new Estacion("Lujan", "22.5");
		Estacion estacion6 = new Estacion("La Boca", "25");
		Estacion estacion7 = new Estacion("Chacarita", "27.5");
		
		LinkedList<Estacion> estaciones = new LinkedList<>();
		estaciones.add(estacion1);
		estaciones.add(estacion2);
		estaciones.add(estacion3);
		estaciones.add(estacion4);
		estaciones.add(estacion5);
		estaciones.add(estacion6);
		estaciones.add(estacion7);
		
		Motor motor = new Motor("B4", false);
		LinkedList<Pasajero> pasajeros = new LinkedList<>();
		Colectivo colectivo1 = new Colectivo(50, 0 ,pasajeros, 0, motor, estaciones);
		

	}

}
