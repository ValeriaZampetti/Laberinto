/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class ArbolExpansionMinimo {
    private int [][] Pesos;
    private int n; //vertice origen y numero de vertices 
    public ArbolExpansionMinimo(GrafMatPeso gp) // constructor
{
    n = gp.numeroDeVertices();
    Pesos = gp.matPeso;
    
    
    
}
