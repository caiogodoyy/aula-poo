package aulaPoo.aula13;

public class Cachorro extends Mamifero {
	@Override
	public void alimentar() {
		System.err.println("Carne");
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU");
	}
	
	public void reagir(String fala) {
		if(fala == "Deita")
			System.out.println("Deitar");
		else if(fala == "Senta")
			System.out.println("Sentar");
		else if(fala == "Pata")
			System.out.println("Dar a pata");
		else
			System.out.println("Latir");
	}
	public void reagir(boolean dono) {
		if(dono)
			System.out.println("Abanar o rabo");
		else
			System.out.println("Rosnar");
	}
	public void reagir(int idade) {
		if(idade > 10)
			System.out.println("Ração senior");
		else
			System.out.println("Ração medium");
	}
}
