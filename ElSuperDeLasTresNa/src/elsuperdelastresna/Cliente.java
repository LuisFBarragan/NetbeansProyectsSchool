//Luis Francisco Barragan Flores
//18460194
package elsuperdelastresna;

public class Cliente { 
 private String nombre;
    private int[] carroCompra;
    
    public Cliente(String nom, int[] carroC){
        nombre=nom;
        carroCompra=carroC;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int[] getcarroCompra(){
        return carroCompra;
    }
    
}

