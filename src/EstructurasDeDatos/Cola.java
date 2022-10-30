package EstructurasDeDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danieldangelo
 */
public class Cola {
    public int size;
    public Nodo cabeza;
    public Nodo cola;
    
    public Cola(){
        this.size = 0;
        this.cabeza = this.cola = null;
    }

    public Cola(int size, Nodo cabeza, Nodo cola) {
        this.size = size;
        this.cabeza = cabeza;
        this.cola = cola;
    }
    
    public boolean EsVacia(){
        return cabeza == null;
    }
    
    public void VaciarCola(){
        this.size = 0;
        this.cabeza = this.cola = null;
    }
    
    public void Encolar(Nodo nodo){
        if (this.EsVacia()) {
            
            cabeza = cola = nodo; 
            
        }else{
            
            cola.pNext = nodo;
            cola = nodo; 
        }
        size++; 
    }
    
    public Nodo Desencolar(){
        Nodo aux = null;
        if (this.EsVacia()) {
            
            System.out.println("La cola esta vacia."); 
            
        }else if(size == 1){
             aux = cabeza;
            this.VaciarCola();
            
        }else{
             aux = cabeza;
            cabeza = cabeza.pNext;
            size--; 
        }
        
        return aux;

    }
    
}
