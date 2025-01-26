package fabulathread;

public class Animal extends Thread {
    private String Nombre;
    private int miVelocidad;
    
    public Animal(int MiVelocidad,String nombre){
        Nombre=nombre;
        miVelocidad=MiVelocidad;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print(Nombre);
            try{
                Thread.sleep(5000/miVelocidad);
            }catch(InterruptedException ex){
                System.out.println("Error  en el manejo de hilos: "+ex);
            }
        }
        System.out.print("[ "+Nombre+" ha llegado ] ");
    }
    
}
 