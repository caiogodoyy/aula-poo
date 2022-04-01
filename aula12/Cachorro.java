package aulaPoo.aula12;

public class Cachorro extends Mamifero {
	@Override
	public void alimentar() {
		System.err.println("Carne");
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}
}
