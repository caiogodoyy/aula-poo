package aulaPoo.aula9;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPag = totalPag;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPag() {
		return totalPag;
	}
	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPag=" + totalPag + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor.getNome() + ", " + leitor.getIdade() + " anos]";
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int pag) {
		if(aberto) {
			if(this.totalPag >= pag)
				this.setPagAtual(pag);
		}
		else
			System.out.println("Não foi possivel fazer está ação");
	}

	@Override
	public void avancarPag() {
		if(aberto) {
			if(this.totalPag > this.getPagAtual())
				this.setPagAtual(this.getPagAtual()+1);
		}
		else
			System.out.println("Não foi possivel fazer está ação");
	}

	@Override
	public void voltarPag() {
		if(aberto) {
			if(0 < this.getPagAtual())
				this.setPagAtual(this.getPagAtual()-1);
		}
		else
			System.out.println("Não foi possivel fazer está ação");
	}
	
}