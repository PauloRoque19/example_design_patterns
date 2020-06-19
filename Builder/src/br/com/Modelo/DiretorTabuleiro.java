/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author Paulinho
 */
public class DiretorTabuleiro {
    
    protected TabuleiroBuilder construtora;
    
    public DiretorTabuleiro(TabuleiroBuilder construtora){
        this.construtora = construtora;
    }
    
    public void construirTabuleiro(){
        
        construtora.makeDoor();
        construtora.makeRoom();
        construtora.makeWall();
    }
    
    public TabuleiroProduto getTabuleiro(){
        return construtora.getTabuleiro();
    }
}
