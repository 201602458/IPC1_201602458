package medievil;

import java.util.Random;

public class Logico {
    
    static int[][] tableroLogico;
    static int tamanio;
    static int matrizlogica [][] ;
    Random numero = new Random();
    
    public Logico(){}
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void matriz(int t){
    
    double dos= 0.1*t*t;
    double uno=0.05*t*t;
    boolean fin = false;
    matrizlogica = new int [t][t];
            
            for(int i=0;i<t;i++){
                for(int j=0;j<t;j++){
                    //esto solo se crea mas no se imprime
                   
                     //System.out.print(1[i][j]+"  ");
                     //****se imprime lo escondido
                     
                     matrizlogica[i][j]=0;
//                     if(uno<(0.05*t*t)&&dos<(0.05*t*t)||pos==0){matrizlogica[i][j]=pos;}
//                     if(pos==1){uno++;}
//                     if(pos==2){dos++;}
                     
                     //matriz[i][j]=pos;

                         //resultado = matriz[t-1][t-1];
                         //matrizx[i][j]=("x");
                         //matriz[t-1][t-1]=String.valueOf(resultado);
     
                    }
                
                }
          
       //return resultado;
       Bombasyvidas((int)dos,(int)uno);
       Jugadores ();
       for(int i=0;i<t;i++){
                for(int j=0;j<t;j++){
                    //System.out.print(matrizlogica[i][j]+"  ");
                }
                 //System.out.println("");
       }
    }
    
   
    public void  Bombasyvidas(int bombas, int vidas){
        int v=vidas;
        int b=bombas;
        int x=0;
        int y=0;
            while(v!=0){
                x=numero.nextInt(tamanio);
                y=numero.nextInt(tamanio);
                if(v!=0){
                    if(matrizlogica[x][y]==0){
                        matrizlogica[x][y]=1;
                       
                        v--;
                    }
                    
                }
            
            }
            while(b!=0){
            
                   x=numero.nextInt(tamanio);
                y=numero.nextInt(tamanio);
                    if(matrizlogica[x][y]==0){
                       matrizlogica[x][y]=2;
                        b--;
                    }
                    
                
            }
    }
    public void Jugadores (){
    int x=0;
    int y=0;
    int jugadores =6;
    int jugador=2;
            while(jugadores!=0){
                x=numero.nextInt(tamanio);
                y=numero.nextInt(tamanio);
                    if(matrizlogica[x][y]==0){
                        matrizlogica[x][y]=jugador+1;
                       
                        jugadores--;
                        jugador++;
                }
            
            }
    
    }
}
