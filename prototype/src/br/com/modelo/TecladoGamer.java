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
public class TecladoGamer extends Prototipo{
      protected TecladoGamer(TecladoGamer modeloTeclado) {
        this.marca = modeloTeclado.getMarca();
        this.nome = modeloTeclado.getNome();
        this.peso = modeloTeclado.getPeso();
        this.preco = modeloTeclado.getPreco();
    }
    public TecladoGamer(){
        preco = 100.0;
        nome = "Teclado";
        peso = "0.0";
        marca = "vazio";
    }

    
    
    
    @Override
    public Prototipo clone() {
        return new TecladoGamer(this);
    }

    @Override
    public String infoPeriferico() {
        return "Nome:"+getNome()+ " Peso:"+getPeso()+"\n"+
                "Marca: "+getMarca()+" Preco: "+getPreco();
                
    
}
}
