package medievil;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static medievil.Dato.*;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Top10 extends JFrame{
    
            JTable tabla;
    JButton regresar,mostrar;
    String[] header = {"Jugador","Punteo"};
    DefaultTableModel stm;
    String datos[][]={};
    
    public Top10(){
        
        tabla = new JTable();    
        regresar = new JButton();
        mostrar = new JButton();
        stm = new DefaultTableModel(datos,header);
        inicializarComponentes();
        mostrarenPantalla();
    
    }
    
     public void inicializarComponentes(){
        this.setSize(490, 500);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        
        tabla.setBounds(10, 10, 460, 400);
        tabla.setModel(stm); 
        
        regresar.setBounds(10, 420, 100, 30);
        regresar.setText("Regresar");
        //regresar.addActionListener(this); 
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 465, 400);
        add(scrollPane);
        scrollPane.setViewportView(tabla);
        
        
        //add(regresar);
        
        
    }
    public void mostrarenPantalla(){
        try{
            
            for(int p=0;p<i;p++){
            //JOptionPane.showMessageDialog(null, "1");
                 for(int j=p+1;j<i;j++){
            //JOptionPane.showMessageDialog(null, top[j][1]+">"+top[p][1]);
                     if(Integer.parseInt(top[j][1])>=Integer.parseInt(top[p][1])){
                        //JOptionPane.showMessageDialog(null, "3");
                         int aux = Integer.parseInt(top[p][1]);
                         String auxs =top[p][0];
                         top[p][1]=top[j][1];
                         top[p][0]=top[j][0];
                         top[j][1]=String.valueOf(aux);
                         top[j][0]=auxs;
                         
//                         String[] data = { top[i][0], top[i][1]};
//                    stm.addRow(data);
                     }
                 }
            }
             for(int i=0;i<10;i++){

                    String[] data = { top[i][0], top[i][1]};
                    stm.addRow(data);
                    
                
                }
//        for (int i = 0; i < 10; i++) {
//            //String[] data = {AgregarUser.vectoruser[i].getUsuario(),AgregarUser.vectoruser[i].getNombre(),AgregarUser.vectoruser[i].getApellido()};
//           
//            }
        }catch(Exception ae){
            
            
            System.out.println(ae.getMessage());
        }
    }
    
    
    
    
//    private String[][] listado = new String[50][4];
//    private int i ;
//    public Top10(){}
//    
//    public Top10(String p1,String p2,String pn1, String pn2){
//        listado[i][0]=p1;
//        listado[i][1]=pn1;
//        listado[i][2]=p2;
//        listado[i][3]=pn2;
//        i++;
//    }
//
//    public String[][] getListado() {
//        return listado;
//    }
//
//    public int getI() {
//        return i;
//    }
    
}
