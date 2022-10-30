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
         Grafo nodo1 = new Grafo(10,5);
         nodo1.insertaArista(7, '5');
         nodo1.insertaVertice(15);
         nodo1.imprimirGrafo();
         
    }
    
}
