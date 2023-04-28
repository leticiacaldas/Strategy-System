package aplicacao;

import strategy.StrategyPeca;

public class UI {

	public static void printTabuleiro(StrategyPeca[][] pecas) {
		for (int i=0; i<pecas.length; i++){
		System.out.print((5 - i) + " ");
		
		for (int j=0; j<pecas.length; j++) {
		printPecas(pecas[i][j]);
	}
	   System.out.println();
}

	System.out.println("  a b c d e f g h");
}
	private static void printPecas(StrategyPeca peca) {
		if (peca == null) {
			System.out.print("-");
		}
		else{
			System.out.print(peca);
		}
		System.out.print(" ");
	}
		
	}