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
public class Lista{
    public Nodo pInicio;
    public Nodo pFinal;
    public int size; 
    
    
    
    
    //Método para agregar primer elemento a la lista
    public void insertarPrimero(int info) {
        Nodo nuevo = new Nodo(info);       
        nuevo.pNext = pInicio;
        pInicio = nuevo;
        size++;
    }

    //Método para insertar de ultimo
    public void insertarUltimo(int info) {
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
    
    public void insertarUltimo(Nodo nodito) {
        if (pInicio == null) {
            pInicio = nodito;
        } else {
            Nodo temp = pInicio;
            while (temp.pNext != null) {
                temp = temp.pNext;
            }
            temp.pNext = nodito;
        }
        size++;
    }
    
    public void insertarUltimo(int[] posicion, int count) {
        Nodo nuevo = new Nodo(posicion, count);
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
    
    public Nodo buscar(int info){
        Nodo pAux = pInicio;
        while (pAux.pNext != null) {            
            if (pAux.info == info) {
                return pAux;
            }
            pAux = pAux.pNext;
        }
        
        return null;
    }
    
    public Nodo buscarCount(int posicion){
        Nodo pAux = pInicio;
        for (int i = 0; i < posicion; i++) {
            pAux = pAux.pNext;
        }
        
        return pAux;
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
    public void eliminarElemen(Nodo n) {
        if (pInicio != null) {
            Nodo pAux = pInicio;
            
            while(pAux.info != n.info){
                pAux = pAux.pNext;
            }
            
            pAux.pLast.pNext = pAux.pNext;
            pAux.pNext.pLast = pAux.pLast;
        }
        
        
    }
    
    public void printlista(){
        
        Nodo aux = this.pInicio;

        while (aux != null) {
            System.out.println("nodo --> "+ aux.info + ", ");
            aux = aux.pNext;
        }
        
    }
    
         
            

    
    
    
}
