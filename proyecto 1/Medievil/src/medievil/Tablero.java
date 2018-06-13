package medievil;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tablero extends JLabel implements ActionListener{
     public ImageIcon p1, p2, c1,c2,h1,h2,vida,bomba;
    public Tablero(int x, int y, int ancho,int largo){
        super.setBounds(x, y, ancho, largo);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
               if(getBackground()==Color.BLUE){
         setBackground(Color.LIGHT_GRAY);
           setIcon(vida);
           
            
        //Se asigna un color de letra color blanco
        setForeground(Color.BLACK);
       }
       else if(getBackground()==Color.LIGHT_GRAY){
        setBackground(Color.BLUE);
          setIcon(bomba);
        //Se asigna un color de letra color blanco
        setForeground(Color.WHITE);
        //Se asigna el color de fondo azul
      
       }
    }
    
    public ImageIcon obtenerImagen(int tamx){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(tamx, 150,Image.SCALE_SMOOTH );
        per= new ImageIcon(imgtam);
        return per;
    }
    
    public void nada(){
      setIcon(null);
  }
    
}
