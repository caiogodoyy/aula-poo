package aulaPoo;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void abrirConta(String tipo) {
		setStatus(true);
		setTipo(tipo);
		if (getTipo() == "CC") {
			setSaldo(getSaldo() + 50);
		}
		else if (getTipo() == "CP") {
			setSaldo(getSaldo() + 150);
		}
	}
	public void fecharConta() {
		if (getSaldo() == 0) {
			setStatus(false);
		}
	}
	public void deposito(float valor) {
		if (getStatus() == true) {
			setSaldo(getSaldo() + valor);
		}
	}
	public void sacar(float valor) {
		if (getStatus() == true) {
			if (getSaldo() >= valor) {
				setSaldo(getSaldo() - valor);
			}
		}
	}
	public void pagarMensal() {
		if (getStatus() == true) {
			if (getTipo() == "CC") {
				if (getSaldo() >= 12) {
					setSaldo(getSaldo() - 12);
				}
			}
			else if (getTipo() == "CP") {
				if (getSaldo() >= 20) {
					setSaldo(getSaldo() - 20);
				}
			}
		}
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public ContaBanco() {
		super();
		this.saldo = 0;
		this.status = false;
	}
	
	public void dados() {
		System.out.println("Numero: " + this.numConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Dono: " + this.dono);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
	}
}
