package EstructurasDeDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class Nodo<T> {

   

    public Nodo pNext;
    public Nodo pLast;
    public T info;
    public int[] posicion;
    public boolean bloqueado;
    
    public Nodo() {
        this.pNext = null;
        this.pLast = null;
    }
    
     public Nodo(T info) {
        this.pNext = null;
        this.pLast = null;
        this.info = info;
        this.bloqueado = true;
    }
     
    public Nodo(int[] posicion, T info) {
        this.pNext = null;
        this.pLast = null;
        this.posicion = posicion;
        this.info = info;
        this.bloqueado = true;
    }
    
    
    
}




