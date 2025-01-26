//Luis Francisco Barragan Flores
//18460194
package elsuperdelastresna;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Cajera implements Runnable {
    //Datos de la clase
    private String nombre;
    
    //Constructor de la clase
    public Cajera(String nom){
        nombre=nom;
    }
    Cliente cliente;
    long tiempo;
    
    
     @Override
    public void run() {
        System.out.println("La cajera "+ this.nombre+" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "+cliente.getNombre()
        +" EN EL TIEMPO: "+(System.currentTimeMillis()-tiempo)/1000+ " seg");
         for(int i=0; i<cliente.getcarroCompra().length;i++){
             try {
            Thread.sleep(cliente.getcarroCompra()[i]*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("La cajera "+this.nombre+" esta procesando el producto "+(i+1)+"-> Tiempo: "+ 
                 (System.currentTimeMillis()-tiempo)/1000+ " seg");    
         }
         System.out.println("La cajera "+this.nombre+" hA TERMINADO DE PROCESAR "
                 +cliente.getNombre()+" EN EL TIEMPO:"
        +(System.currentTimeMillis()-tiempo)/1000+ " seg");
            
    }

    public void procesarCompra(Cliente client, long time){
        cliente=client;
        tiempo=time;
    }

}
