package strategy;

import tabuleirojogo.Pecas;
import tabuleirojogo.Tabuleiro;

public class StrategyPeca extends Pecas {

	private Cor cor;

	public StrategyPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
	
	
}
