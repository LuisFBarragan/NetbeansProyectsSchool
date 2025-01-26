//Luis Francisco Barragan Flores
//18460194
package elsuperdelastresna;

public class ElSuperDeLasTresNa {

    public static void main(String[] args) {
         Cliente cliente1 = new Cliente("Cliente1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente2", new int[] {1,3,5,1,1});
        Cliente cliente3 = new Cliente("Cliente3", new int[] {5,4,6,5,1,4,7});
        Cajera cajera1   = new Cajera("Cajera Juana");
        Cajera cajera2   = new Cajera("Cajera Chana");
        Cajera cajera3   = new Cajera("Cajera Lana");
        
        Thread hilo1=new Thread(cajera1);
        Thread hilo2=new Thread(cajera3);
        Thread hilo3=new Thread(cajera2);
        
        //Tiempo de referencia
        long tiempoInicial= System.currentTimeMillis();
        cajera1.procesarCompra(cliente3, tiempoInicial);
        cajera2.procesarCompra(cliente1, tiempoInicial);
        cajera3.procesarCompra(cliente2, tiempoInicial);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
    
}
