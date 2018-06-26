package aeropuerto;

import java.util.Random;
import javax.swing.JOptionPane;

public class Pasajero {

    static int nopasajero;
    static int contador;
    private int maletas;
    private int documentos;
    //int nomaletas,nodoc;
    Pasajero siguiente;
    Pasajero anterior;
    String area="";
    
    //Avion a = new Avion();
    Cola c = new Cola();
   
    public Pasajero(){}
    
    public Pasajero(int nopasajero,int maletas, int documentos){
    
        this.nopasajero=nopasajero;
        this.maletas=maletas;
        this.documentos=documentos;
    }
    
    //**************************************************

    
    public Pasajero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pasajero siguiente) {
        this.siguiente = siguiente;
    }

    public Pasajero getAnterior() {
        return anterior;
    }

    public void setAnterior(Pasajero anterior) {
        this.anterior = anterior;
    }
    
    
    
    //**************************************************

    

    public void setNopasajero(int nopasajero) {
       
        this.nopasajero = nopasajero;
//        JOptionPane.showMessageDialog(null,"1-"+this.nopasajero);
//        JOptionPane.showMessageDialog(null,"2-"+nopasajero);
    }
public int getNopasajero() {
        //JOptionPane.showMessageDialog(null,"gtr-"+nopasajero);
        return nopasajero;
        
    }
    public int getMaletas() {
        return maletas;
    }

    public int getDocumentos() {
        return documentos;
    }
    
    
    //**************************************************
    public void crear(){
       //JOptionPane.showMessageDialog(null,"entra 1");
        //c.encolar(nopasajero,nomaletas,nodoc);
        
        while(contador<=nopasajero){
           contador++; 
           //JOptionPane.showMessageDialog(null,contador);
              Random r1 = new Random();
            Random r2 = new Random();

            maletas=r1.nextInt(4)+1;
            documentos=r2.nextInt(10)+1;
            //JOptionPane.showMessageDialog(null,"e3-"+this.nopasajero);
            c.encolar(nopasajero, maletas, documentos);
            //JOptionPane.showMessageDialog(null,"e4-"+this.nopasajero);
             //JOptionPane.showMessageDialog(null,nopasajero+"-"+ maletas+"-"+ documentos);
            
            //JOptionPane.showMessageDialog(null,"e5-"+this.nopasajero);
            
        }
        

        c.imprimir();
        area=c.regresotexto();
        
       
        
       
        
    }
}
