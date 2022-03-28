package aulaPoo.aula10;

public class Professor extends Pessoa {
	private float salario;
	private String materia;
	
	public Professor(String nome, int idade, char sexo, float salario, String materia) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.salario = salario;
		this.materia = materia;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void receberAumento(float valor) {
		this.setSalario(getSalario()+valor);
		System.out.println("Novo salário: " + this.getSalario());
	}
}
