package medievil;


public class Top10 {
    
    private String[][] listado = new String[50][4];
    private int i ;
    public Top10(){}
    
    public Top10(String p1,String p2,String pn1, String pn2){
        listado[i][0]=p1;
        listado[i][1]=pn1;
        listado[i][2]=p2;
        listado[i][3]=pn2;
        i++;
    }

    public String[][] getListado() {
        return listado;
    }

    public int getI() {
        return i;
    }
    
}
