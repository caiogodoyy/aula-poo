package aulaPoo.aula12;

public class Vaca extends Mamifero {
	@Override
	public void locomover() {
		System.out.println("Andando");
	}
	@Override
	public void alimentar() {
		System.err.println("Leite");
	}
	@Override
	public void emitirSom() {
		System.out.println("MOO");
	}
}
