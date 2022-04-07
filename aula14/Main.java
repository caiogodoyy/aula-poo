package aulaPoo.aula14;

public class Main {
	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Aula 1");
		v[1] = new Video("Aula 2");
		v[2] = new Video("Aula 3");
		
		Espectador[] e = new Espectador[2];
		e[0] = new Espectador("Caio", 19, 'M', "caiogodoy");
		e[1] = new Espectador("João", 14, 'M', "joaogalvao");
		
		v[0].play();
		v[0].like();
		System.out.println(v[0].toString());
		v[0].pause();
		System.out.println(v[0].toString());
		
		e[0].ganharXp();
		System.out.println(e[0].toString());
		
		for(int i = 0; i < 10; i++) {
			e[1].ganharXp();
		}
		e[1].assistir();
		System.out.println(e[1].toString());
	}
}
