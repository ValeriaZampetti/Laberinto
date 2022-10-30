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
         grafo.insertaArista(0, 'a');
         grafo.insertaArista(0, 'e');
         grafo.insertaArista(0, 'i');
         grafo.insertaArista(1, 'b');
         grafo.insertaArista(2,'c');
         grafo.insertaArista(3, 'd');
         grafo.insertaArista(4, 'z');
         grafo.insertaArista(4, 'y');
         grafo.insertaArista(4, 'x');
         grafo.imprimirGrafo();
         
    }
    
}
