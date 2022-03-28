package aulaPoo.aula11;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		Bolsista b1 = new Bolsista();
		
		a1.setNome("Caio");
		p1.setNome("Jaime");
		b1.setNome("Bel");
		a1.setIdade(19);
		p1.setIdade(48);
		b1.setIdade(19);
		a1.setSexo('M');
		p1.setSexo('M');
		b1.setSexo('F');
		a1.setSaldo(10000);
		p1.setSaldo(9000);
		b1.setSaldo(8000);
		
		a1.setCurso("CC");
		a1.setMatricula(123);
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		System.out.println("---");
		b1.setCurso("Design");
		b1.setMatricula(321);
		b1.setDesconto(500);
		b1.pagarMensalidade();
		System.out.println(b1.toString());
	}
}
