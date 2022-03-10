package aulaPoo;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	// metodo construtor
	public Caneta(String m, String co, float p, int ca) {
		this.setModelo(m);
		this.cor = co;
		this.setPonta(p);
		this.carga = ca;
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		ponta = p;
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO");
		}
		else if(this.tampada == false) {
			System.out.println("Rabisco");
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("Modelo: " + getModelo());
		System.out.println("Caneta: " + this.cor);
		System.out.println("Ponta: " + getPonta());
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
}