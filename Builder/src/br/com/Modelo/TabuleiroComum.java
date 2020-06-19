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
public class TabuleiroComum extends TabuleiroBuilder {

    @Override
    public void makeWall() {
        tabuleiro.setWall("Parede Comum Criada");
    }

    @Override
    public void makeRoom() {
       tabuleiro.setRoom("Quarto Comum Criada");
    }

    @Override
    public void makeDoor() {
        tabuleiro.setDoor("Porta Comum Criada");
    }
    
}
