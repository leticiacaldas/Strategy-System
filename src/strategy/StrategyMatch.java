package strategy;


import static strategy.Cor.RED;
import strategy.pecas.Bandeira;
import strategy.pecas.Bombas;
import strategy.pecas.CaboArmeiro;
import strategy.pecas.Espiao;
import strategy.pecas.Marechal;
import strategy.pecas.Soldados;
import tabuleirojogo.Posicao;
import tabuleirojogo.Tabuleiro;

public class StrategyMatch {
	
	private Tabuleiro tabuleiro;
	
	public StrategyMatch () {
		tabuleiro = new Tabuleiro (5,5);
		initialSetup();
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
        private void initialSetup(){
            tabuleiro.PlacePeca( new Bombas (tabuleiro, Cor.RED), new Posicao (0,0));
            tabuleiro.PlacePeca( new Bombas (tabuleiro, Cor.BLUE), new Posicao (4,0));
            tabuleiro.PlacePeca( new Bombas (tabuleiro, Cor.RED), new Posicao (1,3));
            tabuleiro.PlacePeca( new Bombas (tabuleiro, Cor.BLUE), new Posicao (3,1));
            tabuleiro.PlacePeca( new Espiao (tabuleiro, Cor.RED), new Posicao (1,1));
            tabuleiro.PlacePeca( new Espiao (tabuleiro, Cor.BLUE), new Posicao (4,2));
            tabuleiro.PlacePeca( new Bandeira (tabuleiro, Cor.RED), new Posicao (0,2));
            tabuleiro.PlacePeca( new Bandeira (tabuleiro, Cor.BLUE), new Posicao (4,4));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.RED), new Posicao (1,0));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.RED), new Posicao (0,1));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.RED), new Posicao (0,4));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.BLUE), new Posicao (3,3));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.BLUE), new Posicao (3,0));
            tabuleiro.PlacePeca( new Soldados (tabuleiro, Cor.BLUE), new Posicao (4,3));
            tabuleiro.PlacePeca( new CaboArmeiro (tabuleiro, Cor.RED), new Posicao (1,2));
            tabuleiro.PlacePeca( new CaboArmeiro (tabuleiro, Cor.RED), new Posicao (1,4));
            tabuleiro.PlacePeca( new CaboArmeiro (tabuleiro, Cor.BLUE), new Posicao (3,2));
            tabuleiro.PlacePeca( new CaboArmeiro (tabuleiro, Cor.BLUE), new Posicao (4,1));
            tabuleiro.PlacePeca( new Marechal (tabuleiro, Cor.RED), new Posicao (0,3));
            tabuleiro.PlacePeca( new Marechal (tabuleiro, Cor.BLUE), new Posicao (3,4));
        } 
        
        }