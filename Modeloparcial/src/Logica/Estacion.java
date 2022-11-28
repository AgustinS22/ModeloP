package Logica;

public class Estacion {
	private String nombre;
	private String tarifa;
	public Estacion(String nombre, String tarifa) {
		super();
		this.nombre = nombre;
		this.tarifa = tarifa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTarifa() {
		return tarifa;
	}
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return "Estacion [nombre=" + nombre + ", tarifa=" + tarifa + "]";
	}
	
}
