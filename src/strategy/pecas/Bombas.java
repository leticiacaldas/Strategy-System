/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy.pecas;

import strategy.Cor;
import strategy.StrategyPeca;
import tabuleirojogo.Tabuleiro;


public class Bombas extends StrategyPeca{
    
    public Bombas(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }
    
    
    @Override
    public String toString (){
        return "B";
    }
    
}
