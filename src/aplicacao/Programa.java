package aplicacao;

import strategy.StrategyMatch;

public class Programa {

	
	public static void main(String[] args) {
		StrategyMatch strategyMatch = new StrategyMatch();
		UI.printTabuleiro(strategyMatch.getPecas());
		

	}
}
 