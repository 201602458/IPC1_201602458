package aeropuerto;

import java.util.Random;
import javax.swing.JOptionPane;

public class Avion {

    private int noavion;
    private int pasajeros;
    private int turnos;
    private int tipo;
    private int contador;
    private int turnomant;
    
    private Avion anterior;
    private Avion siguiente;
    
    Random r = new Random();
    Doble d = new Doble();

    //*****************************************************
    public Avion(){}
    public Avion(int noavion,int pasajeros,int turnos,int tipo,int turnomantm,Avion ant,Avion sig){
        siguiente=sig;
        anterior=ant;
        this.noavion=noavion; 
        this.pasajeros=pasajeros;
        this.turnos=turnos;
        this.tipo=tipo;
        this.turnomant=turnomantm;
    
    }
    
    
    public int getAvion() {
        return noavion;
    }

    public void setAvion(int avion) {
        this.noavion = avion;
    }


    public int getTurnos() {
        return turnos;
    }

    public int getTipo() {
        return tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }
    
    //*****************************************************
    public void crear(){
        
        contador++;
        if(contador<=noavion){        
            tipo=r.nextInt(3)+1;
            if(tipo==1){
                pasajeros=r.nextInt(10-5+1)+5;
                turnos=1;
                turnomant=r.nextInt(3)+1;
            }
            if(tipo==2){
                pasajeros=r.nextInt(25-15+1)+15;
                turnos=2;
                turnomant=r.nextInt(4-2+1)+2;
            }
            if(tipo==3){
                pasajeros=r.nextInt(40-30+1)+30;
                turnos=3;
                turnomant=r.nextInt(6-3+1)+3;
            }
        }
        else{JOptionPane.showMessageDialog(null,"final");}
        JOptionPane.showMessageDialog(null,noavion+"-"+contador+"-"+tipo+"-"+pasajeros+"-"+turnos+"-"+turnomant);
        d.insertarFin(noavion, pasajeros, turnos, tipo, turnomant);
        d.mostrarAdelante();
    }

    
    
    
    //*****************************************************

    public Avion getAnterior() {
        return anterior;
    }

    public void setAnterior(Avion anterior) {
        this.anterior = anterior;
    }

    public Avion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Avion siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
