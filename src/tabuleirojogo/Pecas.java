package tabuleirojogo;

public class Pecas {

	protected Posicao posicao;
	protected Tabuleiro tabuleiro;
	
	
	public Pecas(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		posicao = null;
		
	}




	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	
	
}
