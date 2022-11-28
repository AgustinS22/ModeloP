package Logica;

public class Pasajero {
	private String nombre;
	private String apellido;
	private int DNI;
	private int edad;
	private Sube sube;
	public Pasajero(String nombre, String apellido, int dNI, int edad, Sube sube) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.edad = edad;
		this.sube = sube;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Sube getSube() {
		return sube;
	}
	public void setSube(Sube sube) {
		this.sube = sube;
	}
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", edad=" + edad + ", sube="
				+ sube + "]";
	}
	
}
