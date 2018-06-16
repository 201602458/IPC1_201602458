
package medievil;

import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JOptionPane;


public class frameTablero extends javax.swing.JFrame {
    
    Jugador j;
    Tablero[][] tablero = new Tablero[j.getNumero()][j.getNumero()];
     int a=3;
     int b=2;
     static int p,q;
    String c;
    int posx,posy,pisx,pisy;

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
            .addGap(0, 642, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Lj1)
                        .addGap(61, 61, 61)
                        .addComponent(Pj1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Lj2)
                        .addGap(62, 62, 62)
                        .addComponent(Pj2)
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(turnoP))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(177, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(noJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lj1)
                    .addComponent(Lj2)
                    .addComponent(Pj1)
                    .addComponent(Pj2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(noJugador))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(turnoP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton3))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // ingreso
        Jugador j = new Jugador();
        
       //JOptionPane.showMessageDialog(null,j.getJugador1());
      Lj1.setText(j.getJugador1());
      Lj2.setText(j.getJugador2());
       
    }//GEN-LAST:event_formWindowActivated

    private void botonDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDadoActionPerformed
        // dado 
        Random numero = new Random();
        int dado=1+numero.nextInt(6);
        botonDado.setText(String.valueOf(dado));
        
        p++;
        
        if (p>2){p=1;}
        noJugador.setText(String.valueOf(p));
        
        if (q>5){q=0;}
        String personaje=j.orden[q];
        turnoP.setText(personaje);
        
        q++;
        
       
        
        j.Dato(p, personaje);
        
    }//GEN-LAST:event_botonDadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // >
        //tablero[0][6].c1();
        j.getRespuesta();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // v
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // <
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // ^
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameTablero().setVisible(true);
            }
        });
    }
    
     public void label(){
    JOptionPane.showMessageDialog(null,j.getNumero());
        panel.setLayout(new GridLayout(j.getNumero(),j.getNumero()));
        for(int i=0;i<j.getNumero();i++){
            for(int k=0;k<j.getNumero();k++){
            
               tablero[i][k]=new Tablero(i, k, 100, 100);
               tablero[i][k].setNombre(i, k);
               panel.add(tablero[i][k]); 
               panel.setOpaque(false);
                
            }
        }
       Item();
       //pmalo();
        //matriz[5][5].imagen();
        
         panel.updateUI();
         
    }
         public void Item(){
             //j1
             tablero[0][0].c1();
             tablero[j.getNumero()/2][0].h1();
             tablero[j.getNumero()-1][0].p1();
             
             //j2
             tablero[0][j.getNumero()-1].c2();
             tablero[j.getNumero()/2][j.getNumero()-1].h2();
             tablero[j.getNumero()-1][j.getNumero()-1].p2();
             
             for(int i=0;i<j.getNumero();i++){
            for(int k=0;k<j.getNumero();k++){
                //tablero[i][k].vida();
            }}
        
         
                
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel noJugador;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel turnoP;
    // End of variables declaration//GEN-END:variables
}
