package aeropuerto;

import javax.swing.JOptionPane;



public class Cola {

//    private int nopasajero;
//    private int maletas;
//    private int documentos;
    String texarea=""; 
    public Pasajero inicio;
    public Pasajero ultimo;
    int conta=1;
    public Cola(){}
//    public Cola(int nopasajero,int maletas, int documentos){
//    
//        this.nopasajero=nopasajero;
//        this.maletas=maletas;
//        this.documentos=documentos;
//        ultimo=inicio;
//    }
    
    public void encolar(int nopasajero,int maletas, int documentos){
        Pasajero nuevo = new Pasajero(nopasajero, maletas, documentos);
        if(inicio==null){
            ultimo=nuevo;
            inicio=ultimo;
        }
        else{
            ultimo.siguiente=nuevo;

           ultimo=nuevo;
        }
        
       
        
    }
    
    
    public void imprimir(){
    //JOptionPane.showMessageDialog(null,"entra 1");
        Pasajero temporal = inicio;
        while(temporal!=null){
            
            texarea=texarea+"No. Pasajero: "+conta+"\n"+"Maletas: "+temporal.getMaletas()+"\n"+"Documentos: "+temporal.getDocumentos()+"\n";
             //JOptionPane.showMessageDialog(null,"No. Pasajero: "+temporal.getNopasajero()+"\n"+"Maletas: "+temporal.getMaletas()+"\n"+"Documentos: "+temporal.getDocumentos());
            
            temporal=temporal.getSiguiente();
            conta++;
        }
        
    }
    
        public String regresotexto(){return texarea;}
}
