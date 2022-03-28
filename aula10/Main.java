package aulaPoo.aula10;

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Caio", 19, 'M', 123, "CC", true);
		Professor p1 = new Professor("Jaime", 48, 'M', 100.00f, "Programação");
		
		System.out.println(a1.toString());
		a1.fazerAniv();
		a1.cancelarMatricula();
		System.out.println(a1.toString());
		
		System.out.println(p1.toString());
		p1.fazerAniv();
		p1.fazerAniv();
		p1.receberAumento(50);
		System.out.println(p1.toString());
	}
}
