package aulaPoo.aula11;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	private boolean estado;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
		this.estado = true;
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
	public void pagarMensalidade() {
		this.setSaldo(getSaldo()-2000);
		System.out.println("Pago com sucesso!");
	}
}
