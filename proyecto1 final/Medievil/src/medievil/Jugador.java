package medievil;

import javax.swing.JOptionPane;

public class Jugador {

    static String jugador1;
    static String jugador2;
    static String[] orden =new String[6];
    static int Tiempo;
    static int vida1;
    static int vida2;
    
    //static String[] orden2 =new String[3];
    static int numero;
    
     public Jugador(){}
     
//     public Jugador(String j1, String j2){
//     
//         jugador1=j1;
//         jugador2=j2;
//         
//        
//     }

    public String getJugador1() {
        //JOptionPane.showMessageDialog(null,jugador1+" entra get");
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Jugador.numero = numero;
    }
    
    
//*************************************************************************************
    
   public void setOrden(String o1,String o2,String o3,String o4,String o5,String o6){
       orden[0]=o1;
       orden[1]=o2;
       orden[2]=o3;
       orden[3]=o4;
       orden[4]=o5;
       orden[5]=o6;
   }
    
 

    public static int getVida1() {
        return vida1;
    }

    public static void setVida1(int vida1) {
        Jugador.vida1 = vida1;
    }

    public static int getVida2() {
        return vida2;
    }

    public static void setVida2(int vida2) {
        Jugador.vida2 = vida2;
    }

   
   
    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }
   
   
     
    
}
