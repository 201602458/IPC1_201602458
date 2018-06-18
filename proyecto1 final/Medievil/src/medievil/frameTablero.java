
package medievil;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.GridLayout;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;


public class frameTablero extends javax.swing.JFrame {
    
    Jugador j;
    //Movimiento mo = new Movimiento();
    Tablero[][] tablero = new Tablero[Jugador.getNumero()][j.getNumero()];
   Logico matrizlo=new Logico();
    Random numero = new Random();
    hilo tiempo = new hilo();
    static int dado;
    int tiempov=j.Tiempo;
//     int a=3;
//     int b=2;
     static int a,b,c,d,e,f,g,h,i,k,l,m;
     static int p,q;
    //String c;
    int posx,posy,pisx,pisy;
    //Jugador j = new Jugador();
    
    static String personaje;
    public frameTablero() {
        initComponents();
         label();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lj1 = new javax.swing.JLabel();
        Lj2 = new javax.swing.JLabel();
        Pj1 = new javax.swing.JLabel();
        Pj2 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        botonDado = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        noJugador = new javax.swing.JLabel();
        turnoP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jlTiempo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Lj1.setText("jLabel1");

        Lj2.setText("jLabel2");

        Pj1.setText("jLabel3");

        Pj2.setText("jLabel4");

        panel.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        botonDado.setText("0");
        botonDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDadoActionPerformed(evt);
            }
        });

        jButton1.setText("^");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("v");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Jugador:");

        noJugador.setText("0");

        turnoP.setText("jLabel5");

        jLabel1.setText("Ataque");

        jButton5.setText("^");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("v");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(">");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tiempo:");

        jlTiempo.setText("0");

        jMenu1.setText("Juego");

        jMenuItem1.setText("Nuevo Juego");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(Lj2)
                                .addGap(62, 62, 62)
                                .addComponent(Pj2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lj1)
                                .addGap(61, 61, 61)
                                .addComponent(Pj1)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnoP)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(241, 241, 241))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(108, 108, 108)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7))
                                    .addComponent(jButton5))))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lj2)
                    .addComponent(Pj2)
                    .addComponent(Lj1)
                    .addComponent(Pj1))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlTiempo))
                .addGap(51, 51, 51)
                .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(noJugador)
                    .addComponent(turnoP)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // ingreso
        Jugador j = new Jugador();
        
       //JOptionPane.showMessageDialog(null,j.getJugador1());
      Lj1.setText(j.getJugador1());
      Lj2.setText(j.getJugador2());
      jlTiempo.setText(String.valueOf(j.getTiempo()));
      
      Pj1.setText(String.valueOf(j.vida1));
      Pj2.setText(String.valueOf(j.vida2));
      tiempo.start();
      
      
       
    }//GEN-LAST:event_formWindowActivated

    private void botonDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDadoActionPerformed
        // dado 
        
        dado=1+numero.nextInt(6);
        botonDado.setText(String.valueOf(dado));
        
        p++;
        
        if (p>2){p=1;}
        noJugador.setText(String.valueOf(p));
        
        if (q>5){q=0;}
       personaje=j.orden[q];
        turnoP.setText(personaje);
        
        q++;
        
    }//GEN-LAST:event_botonDadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // >
        //JOptionPane.showMessageDialog(null,t);
        if(p==1&&personaje.equals("Caballero")){caballero1(0,dado);}
        if(p==2&&personaje.equals("Caballero")){caballero2(0, dado);}
        if(p==1&&personaje.equals("Mago")){mago1(0,dado);}
        if(p==2&&personaje.equals("Mago")){mago2(0,dado);}
        if(p==1&&personaje.equals("Princesa")){princesa1(0,dado);}
        if(p==2&&personaje.equals("Princesa")){princesa2(0, dado);}
        //
//        if(a>=t||b>=t||c>=t||d>=t||e>=t||f>=t||g>=t||h>=t||i>=t||k>=t||l>=t||m>=t){
//            //a=t;b=t;c=t;d=t;e=t;f=t;g=t;h=t;i=t;k=t;l=t;m=t;
//            JOptionPane.showMessageDialog(null,"1");
//            
//        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // v
        int t = matrizlo.tamanio-1;
        if(p==1&&personaje.equals("Caballero")){caballero1(dado,0);}
        if(p==2&&personaje.equals("Caballero")){caballero2(dado,0);}
        if(p==1&&personaje.equals("Mago")){mago1(dado,0);}
        if(p==2&&personaje.equals("Mago")){mago2(dado,0);}
        if(p==1&&personaje.equals("Princesa")){princesa1(dado,0);}
        if(p==2&&personaje.equals("Princesa")){princesa2(dado,0);}
        if(a>=t||b>=t||c>=t||d>=t||e>=t||f>=t||g>=t||h>=t||i>=t||k>=t||l>=t||m>=t){
            a=t;b=t;c=t;d=t;e=t;f=t;g=t;h=t;i=t;k=t;l=t;m=t;
            JOptionPane.showMessageDialog(null,"1");
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // <
        if(p==1&&personaje.equals("Caballero")){caballero1(0,-dado);}
        if(p==2&&personaje.equals("Caballero")){caballero2(0, -dado);}
        if(p==1&&personaje.equals("Mago")){mago1(0,-dado);}
        if(p==2&&personaje.equals("Mago")){mago2(0,-dado);}
        if(p==1&&personaje.equals("Princesa")){princesa1(0,-dado);}
        if(p==2&&personaje.equals("Princesa")){princesa2(0, -dado);}
        //JOptionPane.showMessageDialog(null,a+"<0");
        
//        if(a<=0||b<=0||c<=0||d<=0||e<=0||f<=0||g<=0||h<=0||i<=0||k<=0||l<=0||m<=0){
//            //a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;k=0;l=0;m=0;
//            JOptionPane.showMessageDialog(null,"2");
//            if(p==1&&personaje.equals("Caballero")){caballero1(0,-dado+1);}
//        if(p==2&&personaje.equals("Caballero")){caballero2(0, -dado+1);}
//        if(p==1&&personaje.equals("Mago")){mago1(0,-dado+1);}
//        if(p==2&&personaje.equals("Mago")){mago2(0,-dado+1);}
//        if(p==1&&personaje.equals("Princesa")){princesa1(0,-dado+1);}
//        if(p==2&&personaje.equals("Princesa")){princesa2(0, -dado+1);}
//        
//        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ^
       
        if(p==1&&personaje.equals("Caballero")){caballero1(-dado,0);}
        if(p==2&&personaje.equals("Caballero")){caballero2(-dado,0);}
        if(p==1&&personaje.equals("Mago")){mago1(-dado,0);}
        if(p==2&&personaje.equals("Mago")){mago2(-dado,0);}
        if(p==1&&personaje.equals("Princesa")){princesa1(-dado,0);}
        if(p==2&&personaje.equals("Princesa")){princesa2(-dado,0);}
        
        if(p==1&&personaje.equals("Caballero")&&a<0){caballero1(0,0);}
        if(p==2&&personaje.equals("Caballero")&&c<0){caballero2(0,0);}
        if(p==1&&personaje.equals("Mago")&&e<0){mago1(0,0);}
        if(p==2&&personaje.equals("Mago")&&g<0){mago2(0,0);}
        if(p==1&&personaje.equals("Princesa")&&i<0){princesa1(0,0);}
        if(p==2&&personaje.equals("Princesa")&&l<0){princesa2(-dado,0);}
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // ^ataque
        if(p==1&&personaje.equals("Caballero")){ataque("^",2,1,a,b);}
        if(p==2&&personaje.equals("Caballero")){ataque("^",2,2,c,d);}
        if(p==1&&personaje.equals("Mago")){ataque("^",4,1,e,f);}
        if(p==2&&personaje.equals("Mago")){ataque("^",4,2,g,h);}
        if(p==1&&personaje.equals("Princesa")){ataque("p",1,1,i,k);}
        if(p==2&&personaje.equals("Princesa")){ataque("p",1,2,l,m);}
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // vataque
        if(p==1&&personaje.equals("Caballero")){ataque("v",2,1,a,b);}
        if(p==2&&personaje.equals("Caballero")){ataque("v",2,2,c,d);}
        if(p==1&&personaje.equals("Mago")){ataque("v",4,1,e,f);}
        if(p==2&&personaje.equals("Mago")){ataque("v",4,2,g,h);}
        if(p==1&&personaje.equals("Princesa")){ataque("p",1,1,i,k);}
        if(p==2&&personaje.equals("Princesa")){ataque("p",1,2,l,m);}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // >ataque
         if(p==1&&personaje.equals("Caballero")){ataque(">",2,1,a,b);}
        if(p==2&&personaje.equals("Caballero")){ataque(">",2,2,c,d);}
        if(p==1&&personaje.equals("Mago")){ataque(">",4,1,e,f);}
        if(p==2&&personaje.equals("Mago")){ataque(">",4,2,g,h);}
        if(p==1&&personaje.equals("Princesa")){ataque("p",1,1,i,k);}
        if(p==2&&personaje.equals("Princesa")){ataque("p",1,2,l,m);}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // <ataque
        if(p==1&&personaje.equals("Caballero")){ataque("<",2,1,a,b);}
        if(p==2&&personaje.equals("Caballero")){ataque("<",2,2,c,d);}
        if(p==1&&personaje.equals("Mago")){ataque("<",4,1,e,f);}
        if(p==2&&personaje.equals("Mago")){ataque("<",4,2,g,h);}
        if(p==1&&personaje.equals("Princesa")){ataque("p",1,1,i,k);}
        if(p==2&&personaje.equals("Princesa")){ataque("p",1,2,l,m);}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Nuevo juego
        Dato da = new Dato();
        da.guardarTop(Lj1.getText(), Pj1.getText());
        da.contadorI();
        da.guardarTop(Lj2.getText(), Pj2.getText());
        da.contadorI();
        a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;k=0;l=0;m=0;
        frameInicio fi = new frameInicio();
        fi.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // salir
        try{
            a=0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;k=0;l=0;m=0;
           Dato da = new Dato();
        da.guardarTop(Lj1.getText(), Pj1.getText());
        da.contadorI();
        da.guardarTop(Lj2.getText(), Pj2.getText());
        da.contadorI();
        
        frameInicio fi = new frameInicio();
        fi.show();
        
        }
        catch(Exception e){}
        
        
        
        
        frameInicio fi = new frameInicio();
        fi.show();
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // guardar
        try{
            Dato da = new Dato();
            //**********************************
           
        da.guardarTop(Lj1.getText(), Pj1.getText());
        da.contadorI();
        da.guardarTop(Lj2.getText(), Pj2.getText());
        da.contadorI();
            //**********************************
            //JOptionPane.showMessageDialog(null,"/*-"+String.valueOf(j.getTiempo()));
        da.guardarDatos(Lj1.getText(),Pj1.getText(),j.orden[0],j.orden[2],j.orden[4]);
        da.contadorJ();
        da.guardarDatos(Lj2.getText(),Pj2.getText(),j.orden[1],j.orden[3],j.orden[5]);
        da.contadorJ();
        }
        catch(Exception e){}
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTablero().setVisible(true);
            }
        });
    }
    
     public void label(){
    //JOptionPane.showMessageDialog(null,j.getNumero());
        panel.setLayout(new GridLayout(j.getNumero(),j.getNumero()));
        for(int i=0;i<j.getNumero();i++){
            for(int k=0;k<j.getNumero();k++){
            
               tablero[i][k]=new Tablero(i, k, 100, 100);
               tablero[i][k].setNombre(i, k);
               panel.add(tablero[i][k]); 
               panel.setOpaque(false);
                
            }
        }
//       Item();
       //pmalo();
        //matriz[5][5].imagen();
        pintar();
         panel.updateUI();
         
    }

         public void pintar(){

            
             for(int i1=0;i1<j.getNumero();i1++){
            for(int k1=0;k1<j.getNumero();k1++){
                //************************************************
                if(matrizlo.matrizlogica[i1][k1]==1){
                    tablero[i1][k1].vida();
               }else if(matrizlo.matrizlogica[i1][k1]==2){
               tablero[i1][k1].bomba();
               }
               //**********************************************
                else if(matrizlo.matrizlogica[i1][k1]==3){
               //tablero[i][k].c1();
                    caballero1(i1, k1);
               }else if(matrizlo.matrizlogica[i1][k1]==4){
               //tablero[i][k].h1();
                    mago1(i1,k1);
               }else if(matrizlo.matrizlogica[i1][k1]==5){
               //tablero[i][k].p1();
                    princesa1(i1, k1);
               }else if(matrizlo.matrizlogica[i1][k1]==6){
               //tablero[i][k].c2();
                    caballero2(i1, k1);
               }else if(matrizlo.matrizlogica[i1][k1]==7){
               //tablero[i][k].h2();
                    mago2(i1, k1);
               }else if(matrizlo.matrizlogica[i1][k1]==8){
               tablero[i1][k1].p2();
                    princesa2(i1, k1);
               }
                
            }}
         
         }
         
         public void caballero1(int n1,int n2){
            
             tablero[a][b].nada();
             a=a+n1;
             b=b+n2;
             tablero[a][b].c1();
             
             
         }
         public void caballero2(int n1,int n2){
             
             tablero[c][d].nada();
             c=c+n1;
             d=d+n2;
             tablero[c][d].c2();
             
         }
         public void mago1(int n1,int n2){
             
             tablero[e][f].nada();
             e=e+n1;
             f=f+n2;
             tablero[e][f].h1();
             
         }
         public void mago2(int n1,int n2){
             
             tablero[g][h].nada();
             g=g+n1;
             h=h+n2;
             tablero[g][h].h2();
             
         }
         public void princesa1(int n1,int n2){
             
             tablero[i][k].nada();
             i=i+n1;
             k=k+n2;
             tablero[i][k].p1();
             
         }
         
         public void princesa2(int n1,int n2){
            
             tablero[l][m].nada();
             l=l+n1;
             m=m+n2;
             tablero[l][m].p2();
             
         }
         
         public void ataque(String que,int espacios, int lado, int fila,int col){
             //Jugador ju= new Jugador();
             int v1=Integer.parseInt(Pj1.getText());
             int v2=Integer.parseInt(Pj2.getText());
             //arriba
            if(lado==1&&que.equals("^")){// jugador 1
                if(matrizlo.matrizlogica[fila-espacios][col]>=6){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila-espacios][col]<6){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila-espacios][col]==1){v2=v2+1;Pj2.setText(String.valueOf(v2));}
                if(matrizlo.matrizlogica[fila-espacios][col]==2){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //JOptionPane.showMessageDialog(null,matrizlo.matrizlogica[a-espacios][b]);
                
            }
            if(lado==2&&que.equals("^")){// jugador 2
                if(matrizlo.matrizlogica[fila-espacios][col]>=3&&matrizlo.matrizlogica[a-espacios][col]<6){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                //if(matrizlo.matrizlogica[fila-espacios][col]<3){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila-espacios][col]==1){v1=v1+1;Pj1.setText(String.valueOf(v1));}
                if(matrizlo.matrizlogica[fila-espacios][col]==2){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                //JOptionPane.showMessageDialog(null,matrizlo.matrizlogica[fila-espacios][col]);
            }
            
            //abajo
            if(lado==1&&que.equals("v")){// jugador 1
                if(matrizlo.matrizlogica[fila+espacios][col]>=6){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila+espacios][col]<6){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila+espacios][col]==1){v2=v2+1;Pj2.setText(String.valueOf(v2));}
                if(matrizlo.matrizlogica[fila+espacios][col]==2){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //JOptionPane.showMessageDialog(null,matrizlo.matrizlogica[fila+espacios][col]);
                
            }
            if(lado==2&&que.equals("v")){// jugador 2
                if(matrizlo.matrizlogica[fila+espacios][col]>=3&&matrizlo.matrizlogica[a-espacios][col]<6){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                //if(matrizlo.matrizlogica[fila+espacios][col]<3){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila+espacios][col]==1){v1=v1+1;Pj1.setText(String.valueOf(v1));}
                if(matrizlo.matrizlogica[fila+espacios][col]==2){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                
                //JOptionPane.showMessageDialog(null,matrizlo.matrizlogica[fila+espacios][col]);
                
            }
            
            //--->
            if(lado==1&&que.equals(">")){// jugador 1
                if(matrizlo.matrizlogica[fila][col+espacios]>=6){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila][col+espacios]<6){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col+espacios]==1){v2=v2+1;Pj2.setText(String.valueOf(v2));}
                if(matrizlo.matrizlogica[fila][col+espacios]==2){v2=v2-1;Pj2.setText(String.valueOf(v2));}
            }
            if(lado==2&&que.equals(">")){// jugador 2
                if(matrizlo.matrizlogica[fila][col+espacios]>=3&&matrizlo.matrizlogica[a-espacios][col]<6){v1=v1-1;Pj1.setText(String.valueOf(v1));}
               // if(matrizlo.matrizlogica[fila][col+espacios]<3){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col+espacios]==1){v1=v1+1;Pj1.setText(String.valueOf(v1));}
                if(matrizlo.matrizlogica[fila][col+espacios]==2){v1=v1-1;Pj1.setText(String.valueOf(v1));}
            }
            //<----
             if(lado==1&&que.equals("<")){// jugador 1
                if(matrizlo.matrizlogica[fila][col-espacios]>=6){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila][col-espacios]<6){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col-espacios]==1){v2=v2+1;Pj2.setText(String.valueOf(v2));}
                if(matrizlo.matrizlogica[fila][col-espacios]==2){v2=v2-1;Pj2.setText(String.valueOf(v2));}
            }
            if(lado==2&&que.equals("<")){// jugador 2
                if(matrizlo.matrizlogica[fila][col-espacios]>=3&&matrizlo.matrizlogica[a-espacios][col]<6){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                //if(matrizlo.matrizlogica[fila][col-espacios]<3){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col-espacios]==1){v1=v1+1;Pj1.setText(String.valueOf(v1));}
                if(matrizlo.matrizlogica[fila][col-espacios]==2){v1=v1-1;Pj1.setText(String.valueOf(v1));}
            }
             
            //princesa
             if(lado==1&&que.equals("p")){// jugador 1
                if(matrizlo.matrizlogica[fila][col-espacios]>=6||(matrizlo.matrizlogica[fila][col+espacios]>=6)||(matrizlo.matrizlogica[fila-espacios][col]>=6)||(matrizlo.matrizlogica[fila+espacios][col]>=6)){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila][col-espacios]<6){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col-espacios]==1){v2=v2+1;Pj2.setText(String.valueOf(v2));}
                if(matrizlo.matrizlogica[fila][col-espacios]==2){v2=v2-1;Pj2.setText(String.valueOf(v2));}
                //if(matrizlo.matrizlogica[fila][col-espacios]<6){JOptionPane.showMessageDialog(null,"nada");}
                
                
            }
            if(lado==2&&que.equals("p")){// jugador 2
                if((matrizlo.matrizlogica[fila][col-espacios]>=3&&matrizlo.matrizlogica[fila-espacios][col]<6)){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                else if((matrizlo.matrizlogica[fila][col+espacios]>=3&&matrizlo.matrizlogica[fila-+espacios][col]<6)){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                else if((matrizlo.matrizlogica[fila-espacios][col]>=3&&matrizlo.matrizlogica[fila-+espacios][col]<6)){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                else if((matrizlo.matrizlogica[fila-espacios][col+espacios]>=3&&matrizlo.matrizlogica[fila-+espacios][col]<6)){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                //if(matrizlo.matrizlogica[fila][col-espacios]<3){JOptionPane.showMessageDialog(null,"nada");}
                if(matrizlo.matrizlogica[fila][col-espacios]==1){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                if(matrizlo.matrizlogica[fila][col-espacios]==2){v1=v1-1;Pj1.setText(String.valueOf(v1));}
                
            }
         }
         
         private class hilo extends Thread{
         
             public void run(){
                 while(true){
                     for(int i =0;i<(tiempov+1);i++){
                         jlTiempo.setText(Integer.toString(i));
//                         JOptionPane.showMessageDialog(null,jlTiempo.getText());
//                         JOptionPane.showMessageDialog(null,j.Tiempo);
                            //System.out.println("*"+jlTiempo.getText()+j.Tiempo+"*");
                         if(Integer.parseInt(jlTiempo.getText())==j.Tiempo){
                                JOptionPane.showMessageDialog(null,"Fin del Juego");
                              Dato da = new Dato();
                                  //**********************************

                              da.guardarTop(Lj1.getText(), Pj1.getText());
                              da.contadorI();
                              da.guardarTop(Lj2.getText(), Pj2.getText());
                              da.contadorI();
                                frameInicio fi = new frameInicio();
                                fi.show();

                                    }
      
                         
                         try{Thread.sleep(1000);}
                         catch(InterruptedException ex){
                             Logger.getLogger(hilo.class.getName()).log(Level.SEVERE,null,ex);
                         }
                     }
                     this.suspend();
                 }
             }
         }
    
//     public void pdis(){
//        pisx=a;
//        pisy=b+1;
//         tablero[pisx][pisy].idis();
//                
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lj1;
    private javax.swing.JLabel Lj2;
    private javax.swing.JLabel Pj1;
    private javax.swing.JLabel Pj2;
    private javax.swing.JButton botonDado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel jlTiempo;
    private javax.swing.JLabel noJugador;
    public static javax.swing.JPanel panel;
    private javax.swing.JLabel turnoP;
    // End of variables declaration//GEN-END:variables
}
