package medievil;

import java.util.Random;

public class Logico {
    
    static int[][] tableroLogico;
    static int tamanio;

    
    public Logico(){}
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void matriz(int t){
    
    int uno=0,dos=0;
    boolean fin = false;
    //boolean finif = false;
    int matriz [][] = new int [t][t];
    //String matrizx [][] = new String [t][t];
    
     
     
             for(int i=0;i<t;i++){
                for(int j=0;j<t;j++){
                    //esto solo se crea mas no se imprime
                   
                     //System.out.print(matriz1[i][j]+"  ");
                     //****se imprime lo escondido
                     Random numero = new Random();
                     int pos=numero.nextInt(3);
                     
                     if(uno<(0.1*t*t)&&dos<(0.05*t*t)||pos==0){matriz[i][j]=pos;}
                     if(pos==1){uno++;}
                     if(pos==2){dos++;}
                     
                     //matriz[i][j]=pos;
                    
                      
                          
                     
                     System.out.print(matriz[i][j]+"  ");
                     
                         //resultado = matriz[t-1][t-1];
                         //matrizx[i][j]=("x");
                         //matriz[t-1][t-1]=String.valueOf(resultado);
                         
                         
                            
                         
                    
                      
                            
                    }
                    System.out.println("");
                }
          
       //return resultado;
    }
    
    
    
}
