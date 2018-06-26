package aeropuerto;

public class Estacion {
    
    private int noestacion;
    private int noavion;
    private boolean vacio;
     private int contador;
    Estacion siguiente;
    
    public Estacion(){}
    public Estacion(int noestacion,int noavion,boolean vacio, Estacion siguiente){
        
        this.noestacion=noestacion;
        this.noavion=noavion;
        this.vacio=vacio;
        this.siguiente=siguiente;
                
    }
    
    public void enlaceSiguiente(Estacion n){
        siguiente=n;
    
    }
    
    public int getNoestacion() {
        return noestacion;
    }

    //**********************************************
    public void setNoestacion(int noestacion) {
        this.noestacion = noestacion;
    }

    public Estacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estacion siguiente) {
        this.siguiente = siguiente;
    }
    
    //*******************************************/
    
    public void crear(){
        
        contador++;
        if(contador<=noestacion){       }
    }
    
}
