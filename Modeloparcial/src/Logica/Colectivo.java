package Logica;

import java.util.LinkedList;

public class Colectivo {
	private int capacidad_max;
	private int capacidad_actual;
	private LinkedList<Pasajero> Pasajeros;
	private double recaudacion;
	private Motor motor;
	private LinkedList<Estacion> estaciones;	
	public Colectivo(int capacidad_max, int capacidad_actual, LinkedList<Pasajero> pasajeros, double recaudacion,
			Motor motor, LinkedList<Estacion> estaciones) {
		super();
		this.capacidad_max = capacidad_max;
		this.capacidad_actual = capacidad_actual;
		Pasajeros = pasajeros;
		this.recaudacion = recaudacion;
		this.motor = motor;
		this.estaciones = estaciones;
	}
	
	public int getCapacidad_max() {
		return capacidad_max;
	}

	public void setCapacidad_max(int capacidad_max) {
		this.capacidad_max = capacidad_max;
	}

	public int getCapacidad_actual() {
		return capacidad_actual;
	}

	public void setCapacidad_actual(int capacidad_actual) {
		this.capacidad_actual = capacidad_actual;
	}

	public LinkedList<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(LinkedList<Estacion> estaciones) {
		this.estaciones = estaciones;
	}

	public LinkedList<Pasajero> getPasajeros() {
		return Pasajeros;
	}
	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		Pasajeros = pasajeros;
	}
	public double getRecaudacion() {
		return recaudacion;
	}
	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Colectivo [capacidad_max=" + capacidad_max + ", capacidad_actual=" + capacidad_actual + ", Pasajeros="
				+ Pasajeros + ", recaudacion=" + recaudacion + ", motor=" + motor + ", estaciones=" + estaciones + "]";
	}

	
	
	
}
