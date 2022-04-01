package aulaPoo.aula12;

public class Main {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Cachorro guiga = new Cachorro();
		Vaca v = new Vaca();
		
		m.locomover();
		r.locomover();
		
		m.emitirSom();
		r.emitirSom();
		
		guiga.emitirSom();
		v.emitirSom();
	}
}
