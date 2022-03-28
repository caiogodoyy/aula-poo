package aulaPoo.aula11;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private float saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void fazerAniv() {
		this.setIdade(this.getIdade()+1);
	}
	
	@Override
	public String toString() {
		return "Pessoa [Nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", saldo atual: " + saldo + "]";
	}
}
