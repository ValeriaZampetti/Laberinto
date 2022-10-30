/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author valeriazampetti
 */
public class Prim<T> {
    public Grafo<T> arbolExpMinPrim(Grafo<T> g, T inicio) {
        // Obtengo la cantidad total de vértices
        int verticesTotales = g.cantvertices;
        Nodo<T> vOrigen = g.buscar(inicio);
        if (vOrigen != null) {
            Grafo<T> gNuevo = new Grafo<T>();
            
            var vertices = g.getVertices();
            
            for (int i = 0; i < vertices.length; i++) {
                gNuevo.insertaVertice(vertices[i]);
            }
                  
            // Para esta implementación, los pesos son números enteros.
            Cola cola = new Cola((Arco a1, Arco a2) -> Integer.compare(a1.getPeso(), a2.getPeso()));

            int cont = 0;
            
            while (cont < verticesTotales) {
                for (Iterator<Arco> it = vOrigen.getArcos().iterator(); it.hasNext();) {
                    Arco<T> arc = it.next();
                    if (!arc.getDestino().isVisitado()) {
                        cola.offer(arc);
                    }
                }
                
                Arco<T> arco = cola.poll();
                if (!arco.getDestino().isVisitado()) {
                    arco.getDestino().setVisitado(true);
                    gNuevo.agregarArco(arco.getPrevio().getContenido(), arco.getDestino().getContenido(), arco.getPeso());
                    cont ++;
                    vOrigen = arco.getDestino();
                }
            }
            return gNuevo;
            
        }
        return null;
    }
}
