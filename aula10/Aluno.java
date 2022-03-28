package aulaPoo.aula10;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	private boolean estado;
	
	public Aluno(String nome, int idade, char sexo, int matricula, String curso, boolean estado) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.matricula = matricula;
		this.curso = curso;
		this.estado = estado;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void cancelarMatricula() {
		this.setEstado(false);
		System.out.println(this.getNome() + ", sua matrícula cancelada com sucesso!");
	}
}
