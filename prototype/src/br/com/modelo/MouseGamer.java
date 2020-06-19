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
public class MouseGamer extends Prototipo{

    protected MouseGamer(MouseGamer modeloMouse) {
        this.marca = modeloMouse.getMarca();
        this.nome = modeloMouse.getNome();
        this.peso = modeloMouse.getPeso();
        this.preco = modeloMouse.getPreco();
    }
    public MouseGamer(){
        preco = 70.0;
        nome = "Mouse";
        peso = "0.0";
        marca = "vazio";
    }

    
    
    
    @Override
    public Prototipo clone() {
        return new MouseGamer(this);
    }

    @Override
    public String infoPeriferico() {
        return "Nome:"+getNome()+ " Peso:"+getPeso()+"\n"+
                "Marca: "+getMarca()+" Preco: "+getPreco();
                
    
}

}