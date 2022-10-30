/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberinto;
import EstructurasDeDatos.Grafo;
//
// *
// * @author valeriazampetti
// */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Grafo grafo = new Grafo(10);
         //nodo1.insertaArista(7, '5');
         grafo.insertaVertice(5);
         grafo.insertaArista(0, 1);
         grafo.insertaArista(0, 2);
         grafo.insertaArista(0, 3);
         grafo.insertaArista(1, 4);
         grafo.insertaArista(2, 5);
         grafo.insertaArista(3, 6);
         grafo.insertaArista(4, 7);
         grafo.insertaArista(4, 8);
         grafo.insertaArista(4, 9);
         grafo.imprimirGrafo();
         
    }
    
}
