package medievil;

import javax.swing.JOptionPane;

public class Jugador {

    static String jugador1;
    static String jugador2;
    static String[] orden1 =new String[3];
    static String[] orden2 =new String[3];
    
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
//*************************************************************************************
   public void setOrden1(String o1,String o2,String o3){
       orden1[0]=o1;
       orden1[1]=o2;
       orden1[2]=o3;
   }
    
   public void setOrden2(String o1,String o2,String o3){
       orden2[0]=o1;
       orden2[1]=o2;
       orden2[2]=o3;
   }
     
    
}
