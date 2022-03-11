package aulaPoo;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//getters e setters
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	//
	public void marcarLuta(Lutador lut1, Lutador lut2) {
		if (lut1.getCategoria().equals(lut2.getCategoria()) && lut1 != lut2) {
			this.setAprovada(true);
			this.setDesafiado(lut1);
			this.setDesafiante(lut2);
		}
		else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if (this.isAprovada()) {
			System.out.println("O desafiante:");
			this.desafiante.apresentar();
			System.out.println("O desafiado:");
			this.desafiado.apresentar();
			
			System.out.println("\nO resultado...");
			
			Random x = new Random();
			int result = x.nextInt(3);
			switch(result) {
			case 0:
				System.out.println("Empate!!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: //desafiado
				System.out.println("Vitória de " + this.desafiado.getNome() + "!!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: //desafiante
				System.out.println("Vitória de " + this.desafiante.getNome() + "!!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		}
		else {
			System.out.println("Luta não pode acontecer.");
		}
	}
}
