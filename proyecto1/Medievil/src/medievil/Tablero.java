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
//    
//    public ImageIcon obtenerImagen(int tamx){
//        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
//        Image per1 = per.getImage();
//        Image imgtam = per1.getScaledInstance(tamx, 150,Image.SCALE_SMOOTH );
//        per= new ImageIcon(imgtam);
//        return per;
//    }//??
    
    public void nada(){
      setIcon(null);
  }
    //**********************************************************
//imagenes****************************************************
    public void bomba (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/bomba.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void vida (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/vida.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void c1 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/c1.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void c2 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/c2.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    
    public void h1 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/h1.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void h2 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/h2.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void p1 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/p1.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    public void p2 (){
      ImageIcon imv =new ImageIcon(getClass().getResource("/Imagenes/p2.png/"));
        Image conv = imv.getImage();
        Image tamañov = conv.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        p1= new ImageIcon(tamañov);
        //Se coloca el boton en un lugar y se le da un tamanio
        //setBounds(pos_x, pos_y, ancho, alto);
        //setBackground(Color.LIGHT_GRAY);
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
        setIcon(p1);
    }
    //************************************************
    public void setNombre( int f, int c ){
        //setText( f + " , " + c );
        //JOptionPane.showMessageDialog(null, setIcon(nave));
        //setIcon(nave);
    }
    
    
}
