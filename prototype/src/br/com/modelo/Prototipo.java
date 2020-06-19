/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author Paulinho
 */
public abstract class Prototipo {
    //atributos
    protected String nome;
    protected String marca;
    protected double preco;
    protected String peso;
    
    //construtor
    public Prototipo(){
        
    }
    
    public abstract Prototipo clone();
    public abstract String infoPeriferico();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
        
        
}
