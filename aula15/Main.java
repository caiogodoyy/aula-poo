package aulaPoo.aula15;

public class Main {
	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Aula 1");
		v[1] = new Video("Aula 2");
		v[2] = new Video("Aula 3");
		
		Espectador[] e = new Espectador[2];
		e[0] = new Espectador("Caio", 19, 'M', "caiogodoy");
		e[1] = new Espectador("João", 14, 'M', "joaogalvao");
		
		Visualizacao vis = new Visualizacao(e[0], v[2]);
		vis.avaliar(75.00);
		System.out.println(vis.toString());
		vis.avaliar(5);
		System.out.println(vis.toString());
	}
}
