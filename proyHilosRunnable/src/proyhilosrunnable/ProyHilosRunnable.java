//Barragan Flores Luis Francisco
//18460194
package proyhilosrunnable;

public class ProyHilosRunnable {

    public static void main(String[] args) {
        Animal liebre=new Animal("L", 5);
        Animal tortuga=new Animal("T", 2);
        
        Thread Hilo1=new Thread(liebre);
        Thread Hilo2=new Thread(tortuga);   
        
        Hilo1.start();
        Hilo2.start();
    }
}
