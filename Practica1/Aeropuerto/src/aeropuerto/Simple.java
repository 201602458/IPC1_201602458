package aeropuerto;

public class Simple {

    Estacion inicio;
    Estacion fin;
    
    public Simple(){
        inicio=null;
        fin=null;
    }
    
    public void insertarFinal(int noestacion,int noavion,boolean vacio){
    
        Estacion nuevo = new Estacion(noestacion,noavion,vacio,null);
        if(inicio==null){
            fin=nuevo;
            inicio=fin;
        }
        else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
}
