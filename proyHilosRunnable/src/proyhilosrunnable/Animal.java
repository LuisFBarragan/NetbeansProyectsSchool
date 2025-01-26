package proyhilosrunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal implements Runnable {
    String Nombre;
    int velocidad;
    public Animal(String nombre,int Velocidad){
        Nombre=nombre;
        velocidad=Velocidad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+Nombre);
            try{
                Thread.sleep(5000/velocidad);
            }catch(InterruptedException ex){
                Logger.getLogger(Animal.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        System.out.println(" [ "+Nombre+" ha cruzado la meta ] ");
    }
}
