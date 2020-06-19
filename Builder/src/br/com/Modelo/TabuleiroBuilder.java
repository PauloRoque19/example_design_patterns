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
public abstract class  TabuleiroBuilder{
    
    protected TabuleiroProduto tabuleiro;
    
    public TabuleiroBuilder(){
        tabuleiro = new TabuleiroProduto();
    }
    
    public abstract void makeWall();
    public abstract void makeRoom();
    public abstract void makeDoor();
    
    public TabuleiroProduto getTabuleiro(){
        return tabuleiro;
    }
    
}
