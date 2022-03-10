package aulaPoo;

public class ControleRemoto implements Controle {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("-----------------");
		System.out.println("Ligado: " + this.isLigado());
		System.out.println("Tocando: " + this.isTocando());
		System.out.print("Volume: " + this.getVolume() + " ");
		for (int i = 0; i < this.getVolume(); i+=10) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu...");
	}

	@Override
	public void maisVolume() {
		if (this.isLigado() == true) {
			if (this.getVolume() >= 100) {
				System.out.println("MAX");
			}
			else {
				this.setVolume(this.getVolume() + 1);
			}
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado() == true) {
			if (this.getVolume() <= 0) {
				System.out.println("MUTE");
			}
			else {
				this.setVolume(this.getVolume() - 1);
			}
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() == true) {
			this.setVolume(0);
		}
	}
	
	@Override
	public void desligarMudo() {
		if (this.isLigado() == true) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
	}
}
