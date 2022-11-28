package Logica;

public class Motor {
	private String modelo;
	private boolean encendido;
	public Motor(String modelo, boolean encendido) {
		super();
		this.modelo = modelo;
		this.encendido = encendido;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", encendido=" + encendido + "]";
	}
	
}
