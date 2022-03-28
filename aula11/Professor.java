package aulaPoo.aula11;

public class Professor extends Pessoa {
	private float salario;
	private String materia;

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
