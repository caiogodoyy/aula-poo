package aulaPoo;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public Caneta(String modelo, String cor, float ponta, int carga) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
}