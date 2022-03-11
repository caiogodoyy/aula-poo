package aulaPoo;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//construct
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, 
			int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inv�lido";
		}
		else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}
		else if (this.getPeso() <= 83.9) {
			this.categoria = "M�dio";
		}
		else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inv�lido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar() {
		if (this.getCategoria() != "Inv�lido") {
			System.out.println("--------------------------");
			System.out.println("Lutador: " + this.getNome());
			System.out.println("Origem: " + this.getNacionalidade());
			System.out.println(this.getIdade() + " anos");
			System.out.println(this.getAltura() + "m");
			System.out.println("Peso : " + this.getPeso() + "kg");
			System.out.println("Vit�rias: " + this.getVitorias());
			System.out.println("Derrotas: " + this.getDerrotas());
			System.out.println("Empates: " + this.getEmpates());
		}
		else {
			System.out.println("Inv�lido");
		}
	}
	public void status() {
		if (this.getCategoria() != "Inv�lido") {
			System.out.println("--------------------------");
			System.out.println(this.getNome());
			System.out.println("Peso: " + this.getCategoria());
			System.out.println(this.getVitorias() + " vit�rias");
			System.out.println(this.getDerrotas() + " derrotas");
			System.out.println(this.getEmpates() + " empates");
		}
		else {
			System.out.println("Inv�lido");
		}
	}
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}
}
