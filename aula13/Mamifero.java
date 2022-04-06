package aulaPoo.aula13;

public class Mamifero extends Animal {
	private String corPelo;
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.err.println("Mamando");
	}
	@Override
	public void emitirSom() {
		System.out.println("Mamífero");
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
