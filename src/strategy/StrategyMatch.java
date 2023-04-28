package strategy;


import tabuleirojogo.Tabuleiro;

public class StrategyMatch {
	
	private Tabuleiro tabuleiro;
	
	public StrategyMatch () {
		tabuleiro = new Tabuleiro (5,5);
		
	}
	
	public StrategyPeca[][] getPecas(){
		   StrategyPeca [][] mat = new StrategyPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		   for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			 for(int j= 0; j < tabuleiro.getColunas(); j++) {
				 mat [i][j] = (StrategyPeca) tabuleiro.peca(i, j);
	
			 }
    }
		   return mat;
}
        }