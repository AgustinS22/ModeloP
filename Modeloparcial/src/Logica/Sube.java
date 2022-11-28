package Logica;

public class Sube {
	private int nro;
	private double saldo;
	public Sube(int nro, double saldo) {
		super();
		this.nro = nro;
		this.saldo = saldo;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Sube [nro=" + nro + ", saldo=" + saldo + "]";
	}
	
}
