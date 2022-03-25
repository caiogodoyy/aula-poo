package aulaPoo.aula9;

public class Main {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Caio", 19, 'M');
		p[1] = new Pessoa("Bel", 19, 'F');
		
		l[0] = new Livro("Harry Potter", "J. K. Rowling", 264, p[1]);
		l[1] = new Livro("POO", "Eduardo", 316, p[0]);
		l[2] = new Livro("Cinquenta Tons de Cinza", "E. L. James", 514, p[1]);
		
		l[0].abrir();
		l[0].folhear(30);
		l[0].avancarPag();
		l[0].voltarPag();
		l[0].voltarPag();
		l[1].folhear(20);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
	}
}
