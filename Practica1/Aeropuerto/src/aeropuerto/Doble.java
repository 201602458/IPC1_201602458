package aeropuerto;

//import static aeropuerto.jfCentral.area;

public class Doble {
        
    private Avion inicio;
    private Avion fin;
    //jfCentral j =  new jfCentral();
    public Doble(){
        
        inicio = null; 
        fin = null;
    
    }
    
     public void insertarFin(int noavion,int pasajeros,int turnos,int tipo,int turnomantm){
        
        if(inicio==null){
            fin = new Avion(noavion,pasajeros,turnos,tipo,turnomantm,null, null);
            inicio = fin;
        }
        else{
        
            Avion nuevo = new Avion(noavion,pasajeros,turnos,tipo,turnomantm,fin,null);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    
    }
//     public String texto(){
//         Avion temporal = inicio;
//         String t="";
//         t="Avion "+String.valueOf(temporal.getAvion())+"\n"+"Pasajeros "+/*String.valueOf(temporal.getPasajeros)+*/"\n"+"Desaboedaje "+
//                 String.valueOf(temporal.getTurnos())+"\n";
//         return t;
//     }
    
//    public void insertarInicio(int noavion,int pasajeros,int turnos,int tipo,int turnomantm,Avion ant,Avion sig){
//        
//        if(inicio==null){
//            inicio = new Avion(noavion,pasajeros,turnos,tipo,turnomantm,null, null);
//            fin = inicio;
//        }
//        else{
//        
//            Avion nuevo = new Avion(noavion,pasajeros,turnos,tipo,turnomantm,null, inicio);
//            inicio.setAnterior(nuevo);
//            inicio = nuevo;
//        }
//    
//    }
    
      
       
//       public String extraerInicio(){
//           
//           //String dato = inicio.getDato();
//           inicio = inicio.getSiguiente();
//           
//           if(inicio!=null){
//               inicio.setAnterior(null);
//           }
//           else{
//               fin=null;
//           }
//           
//           return "a1";
//       }
       
//       public String extraerFin(){
//           
//           //String dato = fin.getDato();
//           fin = fin.getSiguiente();
//           
//           if(fin!=null){
//               fin.setSiguiente(null);
//           }
//           else{
//               inicio=null;
//           }
//           
//           return "a2";
//       }
              
       public void mostrarAdelante(){
           Avion temporal = inicio;
           
           while(temporal!=null){
//           j.area.append("Avion "+String.valueOf(temporal.getAvion())+"\n");
//           j.area.append("Pasajeros "+String.valueOf(temporal.getPasajeros())+"\n");
//           
               
               System.out.println(temporal.getAvion()+" "+temporal.getPasajeros()+" "+temporal.getTurnos());
               temporal=temporal.getSiguiente();
           }
           //for(int i = 0; ){}
       
       }
//       
//       public Object obtenerId(int index){
//        
//       int c=0;
//       Avion temp = inicio;
//       while (c<index){
//       
//           temp = temp.getSiguiente();
//           c++;
//       }
//       
//       return temp.getId();
//    }
       
//         public Object obtenerNombre(int index){
//        
//       int c=0;
//       Avion temp = inicio;
//       while (c<index){
//       
//           temp = temp.getSiguiente();
//           c++;
//       }
//       
//       return temp.getNombre();
//    }
   
}
