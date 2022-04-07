package aulaPoo.aula15;

public class Visualizacao {
	private Espectador usuario;
	private Video filme;
	
	public Visualizacao(Espectador usuario, Video filme) {
		super();
		this.usuario = usuario;
		this.filme = filme;
		this.usuario.setTotAssistido(this.usuario.getTotAssistido()+1);
		this.filme.setViews(this.filme.getViews()+1);
	}

	public Espectador getUsuario() {
		return usuario;
	}

	public void setUsuario(Espectador usuario) {
		this.usuario = usuario;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		if(nota >= 5)
			this.filme.setAvaliacao(5);
		else if(nota > 0)
			this.filme.setAvaliacao(nota);
	}
	public void avaliar(double porcentagem) {
		if(porcentagem <= 20)
			this.filme.setAvaliacao(1);
		if(porcentagem <= 40)
			this.filme.setAvaliacao(2);
		if(porcentagem <= 60)
			this.filme.setAvaliacao(3);
		if(porcentagem <= 80)
			this.filme.setAvaliacao(4);
		if(porcentagem <= 100)
			this.filme.setAvaliacao(5);
	}

	@Override
	public String toString() {
		return "Visualizacao [usuario=" + usuario + ", filme=" + filme + "]";
	}
}
