package aulaPoo.aula12;

public class Reptil extends Animal{
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}
	@Override
	public void alimentar() {
		System.err.println("Vegetal");
	}
	@Override
	public void emitirSom() {
		System.out.println("Réptil");
	}
	
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
