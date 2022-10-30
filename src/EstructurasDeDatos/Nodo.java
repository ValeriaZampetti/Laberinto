package EstructurasDeDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class Nodo {

   

    public Nodo pNext;
    public Nodo pLast;
    public char info;
    
    public Nodo() {
        this.pNext = null;
        this.pLast = null;
    }
    
     public Nodo(char info) {
        this.pNext = null;
        this.pLast = null;
        this.info = info;
    }
     
    public char retornarinfo(){
        return this.info;
    }
    
    
}




