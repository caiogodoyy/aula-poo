package aulaPoo;

public class aulaPoo {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jorge");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Claudio");
		p2.abrirConta("CP");
		
		p1.deposito(100);
		p2.deposito(500);
		
		p2.sacar(100);
		p1.sacar(150);
		
		p1.fecharConta();
		
		p1.dados();
		p2.dados();
	}
}