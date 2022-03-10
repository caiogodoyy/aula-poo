package aulaPoo;

public class aulaPoo {
	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		c.desligarMudo();
		c.play();
		c.desligar();
		
		c.abrirMenu();
	}
}