package medievil;

import javax.swing.JOptionPane;

public class Dato {
    static String[][] top = new String[100][2];
   static String[][] datos = new String[100][6];
    static int i;
    static int j;
    
    public void guardarTop(String jugador, String punteo){
        
        top[i][0]=jugador;
        top[i][1]=punteo;
        //JOptionPane.showMessageDialog(null, top[i][0]+"-"+top[i][1]);
        
    }
    
    public void guardarDatos(String jugador, String punteo,String o1,String o2,String o3){
        
        datos[j][0]=jugador;
        datos[j][1]=punteo;
        datos[j][2]=o1;
        datos[j][3]=o2;
        datos[j][4]=o3;
        //datos[j][5]=tiempo;
        //JOptionPane.showMessageDialog(null, datos[j][2]+"-"+datos[j][3]);
        
    }
    public void contadorI(){i++;}
    public void contadorJ(){j++;}
    
}
