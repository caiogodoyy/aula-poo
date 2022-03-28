package aulaPoo.aula11;

public class Bolsista extends Aluno {
	private float desconto;
	
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		this.setSaldo(getSaldo()-2000+desconto);
		System.out.println("[bolsista] Pago com sucesso!");
	}
}
