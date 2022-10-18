/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class Grafos {
    private Vertice vertices[];
    private int MA[] [];
    private int noVertices, totalVertices;
    
    public Grafos (int n){//Grafo no dirigido
            vertices= new Vertice[n];
            MA= new int [n] [n];
            noVertices=0; //contador de vertices
            totalVertices=n; //tope de vertices
    }

    
}
