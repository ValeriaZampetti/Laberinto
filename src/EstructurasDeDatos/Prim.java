/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author valeriazampetti
 */
public class Prim {
    public static Grafo genLaberinto(int height, int width){
        Grafo gf = new Grafo(height, width);
        
        Nodo[][] matrizNodos = new Nodo[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizNodos[i][j] = gf.adyacencia[i].buscarCount(j); 
            }
        }
        
        int random = (int) Math.floor(Math.random() * 4); // Para escoger de los 4 casos
        Nodo inicio = null;
        int[] posicion = new int[2];
        int rand = 0;
        
        switch (random) {
            case 0: //Agarramos aleatoriamente de arriba
                rand = (int) Math.floor(Math.random() * width);
                inicio = matrizNodos[0][rand];
                
                break;
            case 1: //Agarramos aleatoriamente de la izquierda
                rand = (int) Math.floor(Math.random() * height);
                inicio = matrizNodos[rand][0];
                
                break;
            case 2: //Agarramos aleatoriamente de derecha
                rand = (int) Math.floor(Math.random() * height);
                inicio = matrizNodos[rand][matrizNodos[1].length -1];               
                
                break;
            case 3: //Agarramos aleatoriamente de abajo
                rand = (int) Math.floor(Math.random() * width);
                inicio = matrizNodos[matrizNodos[0].length -1][rand];
                
                break;
            default:
                throw new AssertionError();
        }
        
        inicio.bloqueado = false;
        Lista bloqueados = Prim.Distancia2(matrizNodos, inicio, height, width);
        Lista desbloqueados;
        Nodo nodoMedio;
        while (bloqueados.size != 0) {            
            Nodo azarBloq = bloqueados.buscarCount((int) Math.floor(Math.random() * bloqueados.size));
            
            desbloqueados = Distancia2(matrizNodos, azarBloq, height, width);
            Nodo azarDesbl = desbloqueados.buscarCount((int) Math.floor(Math.random() * desbloqueados.size));
            
            //Busco el nodo en medio de azarBloq y azarDesbl
            nodoMedio = matrizNodos[(azarBloq.posicion[0] + azarDesbl.posicion[0])/ 2]
                    [(azarBloq.posicion[1] + azarDesbl.posicion[1])/ 2];
            nodoMedio.bloqueado = false;

            expandirBloqueados(matrizNodos, azarBloq, height, width, bloqueados);
            azarBloq.bloqueado = false;
            bloqueados.eliminarElemen(azarBloq);
            
            desbloqueados = null;
            
        }
        
        return gf;
    }
    
    public static Lista Distancia2(Nodo[][] matriz, Nodo centro, int height, int width){
        Lista distancia2 = new Lista();

        int[] arriba = {centro.posicion[0] -2, centro.posicion[1]};
        int[] abajo = {centro.posicion[0] +2, centro.posicion[1]};
        int[] izquierda = {centro.posicion[0], centro.posicion[1] - 2};
        int[] derecha = {centro.posicion[0], centro.posicion[1] + 2};

        Nodo aux;
        if (arriba[0] >= 0) {
            aux = matriz[arriba[0]][arriba[1]];
            aux.pNext = null;
            distancia2.insertarUltimo(aux);
        }

        if (abajo[0] < height) {
            aux = matriz[abajo[0]][abajo[1]];
            aux.pNext = null;
            distancia2.insertarUltimo(aux);
        }

        if (izquierda[1] >= 0) {
            aux = matriz[izquierda[0]][izquierda[1]];
            aux.pNext = null;
            distancia2.insertarUltimo(aux);
        }

        if (derecha[1] < width) {
            aux = matriz[derecha[0]][derecha[1]];
            aux.pNext = null;
            distancia2.insertarUltimo(aux);
        }

        return distancia2;
    }


    public static void expandirBloqueados(Nodo[][] matriz, Nodo centro, int height, int width, Lista bloqueados){
            Lista expandir = Distancia2(matriz, centro, height, width);
            Nodo aux = expandir.pInicio;
            
            while (aux.pNext != null) {                
                bloqueados.insertarUltimo(aux);
                aux = aux.pNext;
            }
            bloqueados.insertarUltimo(aux);
        }
}