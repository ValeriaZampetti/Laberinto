/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author valeriazampetti
 */
public class Grafo {
    public int pEntrada;//Entrada
    public int pExist; //Salida
    
    
    
//     public boolean EsVaciaEntrada(){
//        if (pEntrada != null){
//            
//            return 1;
//        }
    
    
    
    //metodos del grafo validar si la entrada tiene algo
    //metodos para validar si la salida tiene algo como booleans if pEntrada
    
//    public void esquina(Nodo aux){
//        if aux.pLeft == null && aux.pRight == null || aux.pUp == null && aux.pDown
    
//        
//    }
    
    
//    
    //esquina Esquina(Nodo aux) if aux.pLeft== null & & aux.right == null ó(dos rayitas) se hace lo mimso con pUp y pdown  hacerlo con todas las condiciones posibles, son 4 
    //return true else false
    
    public boolean EsAdyacente(Nodo aux){
        if (aux.left == pEntrada || aux.right == pEntrada || aux.down == pEntrada || aux.up == pEntrada){
            return true;
        
                    
    }else{
            return false;
        }
    
    
    //para la salida, esADyacente(Nodo aux) if aux.left ==pentrada o aux.right==pentrada o aux.up==pentrada, con down igual si es verdad return true else false
    
    
    //metodo generar(m,n) nodo aux g nos sirve para delimitar inicializar i y j=0 arriba for i<m y for j<n i++ y j++ if(j=0) {aux.gpup== null aux.gpleft==null y lo demas apuntaria al siguiente aux2=Nodo al nodo que creamos auxG, en la siguiente corrida aumentara el i; auxg.pright==aux2 if(i=n)pright==null; i=0
    //if(j>0){auxg pLetf==null pFila1==pFirst y la lista 2 la cremaos en el metodo de generar que se tomara en cuenta la primitiva de la lista se debe hacer la lista HACER CLASE DE LISTA DOBLEMENTE ENLAZADA que tendra lista1 y lista2
    
    //otro metodo Generar entrada y salida i=0 o n  j=0 ó m genere numero random con libreria map random o random y alli llamaremos otro metodo llamado generar borde Generar borde() i=0; i=n o j=m if(hayentrada metodo nodo n=0 creamos arriba del for el nodo auxiliar else if(hay salida) n=1 suponiendo que n no es un objeto MODIFICAR EN STATE else n=2 si no es entrada ni salida 
    
    //INTERFAZ SE RECORRE LA MATRIZ Y YA
    
    
    
    
    
    
    
    
    

//    
//    private int[][] Adyacentes;
//    private Object[]Informacion;
//    private int nodos;
//    private boolean vacio= true;
//    
//    public Grafo(int[][] Adyacentes, Object[] Informacion, int nodos) {
//        this.Adyacentes = Adyacentes;
//        this.Informacion = Informacion;
//        this.nodos = nodos;
//    
//    public Grafo(int numeroNodos){
//        Adyacentes = new int[numeroNodos][numeroNodos];
//        Informacion= new Object[numeroNodos];
//        for(int i=0; i<numeroNodos; i++)
//            for (int j=0; j<numeroNodos; j++)
//                Adyacentes[i][j]=0;
//            nodos= numeroNodos;
//    }
//    public boolean EsVacio(){return isVacio();}
//
//    /**
//     * @return the Adyacentes
//     */
//    public int[][] getAdyacentes() {
//        return Adyacentes;
//    }
//
//    /**
//     * @param Adyacentes the Adyacentes to set
//     */
//    public void setAdyacentes(int[][] Adyacentes) {
//        this.Adyacentes = Adyacentes;
//    }
//
//    /**
//     * @return the Informacion
//     */
//    public Object[] getInformacion() {
//        return Informacion;
//    }
//
//    /**
//     * @param Informacion the Informacion to set
//     */
//    public void setInformacion(Object[] Informacion) {
//        this.Informacion = Informacion;
//    }
//
//    /**
//     * @return the nodos
//     */
//    public int getNodos() {
//        return nodos;
//    }
//
//    /**
//     * @param nodos the nodos to set
//     */
//    public void setNodos(int nodos) {
//        this.nodos = nodos;
//    }
//
//    /**
//     * @return the vacio
//     */
//    public boolean isVacio() {
//        return vacio;
//    }
//
//    /**
//     * @param vacio the vacio to set
//     */
//    public void setVacio(boolean vacio) {
//        this.vacio = vacio;
//    }
//        
//    }
//}
    
}


    
    

    
    
