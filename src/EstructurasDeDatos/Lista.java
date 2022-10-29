package EstructurasDeDatos;


import EstructurasDeDatos.Nodo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class Lista {
    public Nodo pInicio;
    public Nodo pFinal;
    public int size;
    
    
    
    
    
    //Método para agregar primer elemento a la lista
    public void insertarPrimero(char info) {
        Nodo nuevo = new Nodo();
        nuevo.pNext = pInicio;
        pInicio = nuevo;
        size++;
    }

    //Método para insertar de ultimo
    public void insertarUltimo(char info) {
        Nodo nuevo = new Nodo(info);
        if (pInicio == null) {
            pInicio = nuevo;
        } else {
            Nodo temp = pInicio;
            while (temp.pNext != null) {
                temp = temp.pNext;
            }
            temp.pNext = nuevo;
        }
        size++;
    }
    
    //Método para eliminar el primer elemento
    public void borrarFirst() {
        if (pInicio != null) {
            Nodo aux = pInicio;
            pInicio = pInicio.pNext;
            aux.pNext = null;
            size--;
        }
    }
   
    
    //Método para eliminar el ultimo
    public void borrarLast() {
        if (pInicio != null) {
            if (pInicio.pNext == null) {
                pInicio = null;
            } else {
                Nodo temp = pInicio;
                while (temp.pNext.pNext != null) {
                    temp = temp.pNext;
                }
                temp.pNext = null;
            }
        }
    }
    
    
    //Método para eliminar un elemento cualquiera
    public void eliminarElemen(int n) {
        if (pInicio != null) {
            if (n == 0) {
                this.borrarFirst();
                size--;
            } else if (n < size) {
                Nodo temp = pInicio;
                int cont = 0;
                while (cont < (n - 1)) {
                    temp = temp.pNext;
                    cont++;
                }
                Nodo deleter = temp.pNext;
                temp.pNext = deleter.pNext;
                deleter.pNext = null;
                size--;
            }
        }
        
        
    }
    
    public void printlista(){
        
        for (int i=0; i<size; i++){
            System.out.println("nodo");
        }
    }
    
    
            
            

    
    
    
}