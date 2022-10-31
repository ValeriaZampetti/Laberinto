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
    public Grafo genLaberinto(int height, int width){
        Grafo gf = new Grafo(height * width);
        
        Nodo[][] matrizNodos = new Nodo[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrizNodos[i][j] = gf.adyacencia[i].buscarCount(width); 
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
                rand = (int) Math.floor(Math.random() * width);
                inicio = matrizNodos[rand][0];
                
                break;
            case 2: //Agarramos aleatoriamente de derecha
                rand = (int) Math.floor(Math.random() * width);
                inicio = matrizNodos[rand][-1];               
                
                break;
            case 3: //Agarramos aleatoriamente de abajo
                rand = (int) Math.floor(Math.random() * width);
                inicio = matrizNodos[-1][rand];
                
                break;
            default:
                throw new AssertionError();
        }
        
        inicio.bloqueado = false;
        Nodo[] bloqueados = Distancia2(matrizNodos, inicio, height, width);
        Nodo[] desbloqueados;
        while (bloqueados.length != 0) {            
            Nodo azarBloq = bloqueados[(int) Math.floor(Math.random() * bloqueados.length)];
            
            desbloqueados = Distancia2(matrizNodos, azarBloq, height, width);
            Nodo azarDesbl = desbloqueados[(int) Math.floor(Math.random() * desbloqueados.length)];
            
            //Busco el nodo en medio de azarBloq y azarDesbl
            matrizNodos[(azarBloq.posicion[0] + azarDesbl.posicion[0])/ 2];

            
        }
        
        return gf;
    }
    
        public Nodo[] Distancia2(Nodo[][] matriz, Nodo centro, int height, int width){
            Nodo[] distancia2 = new Nodo[4];
            int count = 0;
            
            int[] arriba = {centro.posicion[0] -2, centro.posicion[1]};
            int[] abajo = {centro.posicion[0] +2, centro.posicion[1]};
            int[] izquierda = {centro.posicion[0], centro.posicion[1] - 2};
            int[] derecha = {centro.posicion[0], centro.posicion[1] + 2};
            
            if (arriba[0] >= 0) {
                distancia2[count] = matriz[arriba[0]][arriba[1]];
                count++;
            }
            
            if (abajo[0] < height) {
                distancia2[count] = matriz[abajo[0]][abajo[1]];
                count++;
            }
            
            if (izquierda[0] >= 0) {
                distancia2[count] = matriz[izquierda[0]][izquierda[1]];
                count++;
            }
            
            if (derecha[0] < width) {
                distancia2[count] = matriz[derecha[0]][derecha[1]];
                count++;
            }
            
            return distancia2;
        }
    
}

        
//    public Grafo<T> arbolExpMinPrim(Grafo<T> g, T inicio) {
//        // Obtengo la cantidad total de vértices
//        int verticesTotales = g.cantvertices;
//        Nodo<T> vOrigen = g.buscar(inicio);
//        if (vOrigen != null) {
//            Grafo<T> gNuevo = new Grafo<T>();
//            
//            var vertices = g.getVertices();
//            
//            for (int i = 0; i < vertices.length; i++) {
//                gNuevo.insertaVertice(vertices[i]);
//            }
//                  
//            // Para esta implementación, los pesos son números enteros.
//            Cola cola = new Cola((Arco a1, Arco a2) -> Integer.compare(a1.getPeso(), a2.getPeso()));
//
//            int cont = 0;
//            
//            while (cont < verticesTotales) {
//                for (Iterator<Arco> it = vOrigen.getArcos().iterator(); it.hasNext();) {
//                    Arco<T> arc = it.next();
//                    if (!arc.getDestino().isVisitado()) {
//                        cola.offer(arc);
//                    }
//                }
//                
//                Arco<T> arco = cola.poll();
//                if (!arco.getDestino().isVisitado()) {
//                    arco.getDestino().setVisitado(true);
//                    gNuevo.agregarArco(arco.getPrevio().getContenido(), arco.getDestino().getContenido(), arco.getPeso());
//                    cont ++;
//                    vOrigen = arco.getDestino();
//                }
//            }
//            return gNuevo;
//            
//        }
//        return null;
//    }    
    
}

        
//    public Grafo<T> arbolExpMinPrim(Grafo<T> g, T inicio) {
//        // Obtengo la cantidad total de vértices
//        int verticesTotales = g.cantvertices;
//        Nodo<T> vOrigen = g.buscar(inicio);
//        if (vOrigen != null) {
//            Grafo<T> gNuevo = new Grafo<T>();
//            
//            var vertices = g.getVertices();
//            
//            for (int i = 0; i < vertices.length; i++) {
//                gNuevo.insertaVertice(vertices[i]);
//            }
//                  
//            // Para esta implementación, los pesos son números enteros.
//            Cola cola = new Cola((Arco a1, Arco a2) -> Integer.compare(a1.getPeso(), a2.getPeso()));
//
//            int cont = 0;
//            
//            while (cont < verticesTotales) {
//                for (Iterator<Arco> it = vOrigen.getArcos().iterator(); it.hasNext();) {
//                    Arco<T> arc = it.next();
//                    if (!arc.getDestino().isVisitado()) {
//                        cola.offer(arc);
//                    }
//                }
//                
//                Arco<T> arco = cola.poll();
//                if (!arco.getDestino().isVisitado()) {
//                    arco.getDestino().setVisitado(true);
//                    gNuevo.agregarArco(arco.getPrevio().getContenido(), arco.getDestino().getContenido(), arco.getPeso());
//                    cont ++;
//                    vOrigen = arco.getDestino();
//                }
//            }
//            return gNuevo;
//            
//        }
//        return null;
//    }
//}
