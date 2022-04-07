package aulaPoo.aula15;

public class Espectador extends Pessoa {
	private String login;
	private int totAssistido;
	
	public Espectador(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public void assistir() {
		this.setTotAssistido(getTotAssistido()+1);
	}

	@Override
	public String toString() {
		return "Espectador [login=" + login + ", totAssistido=" + totAssistido + ", XP=" + xp + "]";
	}
}
