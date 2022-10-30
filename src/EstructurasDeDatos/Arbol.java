package EstructurasDeDatos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
//public class Arbol {
//     public void createGraph(Grafo graph, int verxs, char adyacencia[], Lista[] lista) {
//         
//         var grafo= new Grafo(10);
//         grafo.adyacencia= lista;
//         
//    
//       
//        }
//     // Se implementa la clase Grafo en JAVA. No existe como tal en el lenguaje.
//// Implementación del Algoritmo de Prim utilizando lista de adyacencia.
//
//    public class Algoritmos {
//        public Grafo arbolExpMinPrim(Grafo g, T inicio) {
//        // Obtengo la cantidad total de vértices
//        int verticesTotales = g.cantvertices.size;
//        Vertice<T> vOrigen = g.buscarVertice(inicio);
//        if (vOrigen != null) {
//            Grafo<T> gNuevo = new Grafo<>(g.isDirigido());
//            g.getVertices().stream().forEach((v) -> {
//                gNuevo.agregarVertice(v.getContenido());
//            });
//            
//     
//     
//     
//    }

public class ArbolExpansionMinimo
{
    private int [][] Pesos;
    private int n; // vértice origen y número de vértices
    public ArbolExpansionMinimo(Grafo gp) // constructor
    {
        n = gp.cantvertices;
        Pesos = gp.matPeso;
    }
    public int arbolExpansionPrim() // implementación del algoritmo
    {
    int longMin, menor;
    int z;
    int [] coste = new int [n];
    int [] masCerca = new int [n];
    boolean [] W = new boolean [n];
    for (int i = 0; i < n; i++)
    W[i] = false; // conjunto vacío
    longMin = 0;
    W[0] = true; //se parte del vértice 0
    // inicialmente, coste[i] es la arista (0,i)
    for (int i = 1; i < n; i++)
    {
    coste[i] = Pesos[0][i];
    masCerca[i] = 0;
    }
    for (int i = 1; i < n; i++)
    { // busca vértice z de V-W mas cercano,
    // de menor longitud de arista, a algún vértice de W
    menor = coste[1];
    z = 1;
    for (int j = 2; j < n; j++)
    if (coste[j] < menor)
    {
    menor = coste[j];
    z = j;
    }
    longMin += menor;
    // se escribe el arco incorporado al árbol de expansión
    System.out.println("V" + masCerca[z] + " -> " + "V" + z);
    W[z] = true; // vértice z se añade al conjunto W
    coste[z] = GrafMatPeso.INFINITO;
    // debido a la incorporación de z,
    // se ajusta coste[] para el resto de vértices
    for (int j = 1; j < n; j++)
    if ((Pesos[z][j] < coste[j]) && !W[j])
    {
    coste[j] = Pesos[z][j];

    masCerca[j] = z;
    }
    }
    return longMin;
    }
}

    
    
  
