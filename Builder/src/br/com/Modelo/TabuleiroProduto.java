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
public class TabuleiroProduto {
    
    private String Room;
    private String wall;
    private String Door;

    public TabuleiroProduto(String Room, String wall, String Door) {
        this.Room = Room;
        this.wall = wall;
        this.Door = Door;
    }
    
    TabuleiroProduto(){
        
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getDoor() {
        return Door;
    }

    public void setDoor(String Door) {
        this.Door = Door;
    }
    
    
    
}
