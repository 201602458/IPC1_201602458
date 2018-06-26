package aeropuerto;

//import static aeropuerto.jfCentral.area;

public class Doble {
        
    private Avion inicio;
    private Avion fin;
    String texarea=""; 
    int t;
    int turnos;
    //jfCentral j =  new jfCentral();
    public Doble(){
        
        inicio = null; 
        fin = null;
    
    }
    
     public void insertarFin(int contador,int pasajeros,int turnos,int tipo,int turnomantm){
        
        if(inicio==null){
            fin = new Avion(contador,pasajeros,turnos,tipo,turnomantm,null, null);
            inicio = fin;
        }
        else{
        
            Avion nuevo = new Avion(contador,pasajeros,turnos,tipo,turnomantm,fin,null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    
    }
     
public void mostrarAdelante(){
           Avion temporal = inicio;
           String tip="";
           turnos=temporal.getTurnos();
           
           while(temporal!=null){
              if(temporal.getTipo()==1){tip="Prequenio";}
              if(temporal.getTipo()==2){tip="Mediano";}
              if(temporal.getTipo()==3){tip="Grande";}         
                           
              texarea=texarea+"\n"+"No. Avion: "+temporal.getContador()+"\n"+"Tipo Avion: "+tip+"\n"+"Pasajero "+temporal.getPasajeros()+"\n"+"Turnos: "+turnos+"\n"+"Mantenimiento: "+temporal.getTurnomant()+"\n";
             turnos--;
               System.out.println("No. Avion "+temporal.getContador()+"\n"+"Tipo Avion "+tip+"\n"+"Pasajero "+temporal.getPasajeros()+"\n"+"Mantenimiento "+temporal.getTurnomant()+"\n");
               
               
               
               temporal=temporal.getSiguiente();
               
         
           }
           //for(int i = 0; ){}
              
       }
       
    public String regresotexto(){return texarea;}
  
}
