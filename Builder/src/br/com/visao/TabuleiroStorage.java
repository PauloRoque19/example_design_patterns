/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao;

import br.com.Modelo.DiretorTabuleiro;
import br.com.Modelo.TabuleiroComum;
import br.com.Modelo.TabuleiroEncantado;
import br.com.Modelo.TabuleiroProduto;
import java.util.Scanner;

/**
 *
 * @author Paulinho
 */
public class TabuleiroStorage {
    
    public static void main(String[] args) {
        //Construindo Tabueiro Encantado
        Scanner teclado = new Scanner(System.in);
        System.out.println("QUAL TIPO DE TABULEIRO DESEJA CONSTRUIR?(tabuleiroencantado | tabuleirocomum)");
        String pergunta = teclado.next();
        
        if(pergunta.equalsIgnoreCase("tabuleiroencantado")){
        
        DiretorTabuleiro construtora = new DiretorTabuleiro(new TabuleiroEncantado());
        construtora.construirTabuleiro();
        TabuleiroProduto tabuleiro = construtora.getTabuleiro();
        
        
         System.out.println("Porta: " + tabuleiro.getDoor() + "\n" +"Quarto: " +tabuleiro.getRoom()
	            + "\nParede: " + tabuleiro.getWall());
         System.out.println("");
        }else if(pergunta.equalsIgnoreCase("tabuleirocomum")){
         
         
         //Construindo Tabuleiro Comum
         
         DiretorTabuleiro construtora = new DiretorTabuleiro(new TabuleiroComum());
         construtora.construirTabuleiro();
         TabuleiroProduto tabuleiro = construtora.getTabuleiro();
         
         System.out.println("Porta: " + tabuleiro.getDoor() + "\n" +"Quarto: " +tabuleiro.getRoom()
	            + "\nParede: " + tabuleiro.getWall());
        }else{
            System.out.println("Nenhum Produto Encontrado");
        }

        
    }
    
}
