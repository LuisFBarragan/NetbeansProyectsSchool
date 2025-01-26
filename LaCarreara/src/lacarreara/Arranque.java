//Barragan Flores Luis Francisco
//18460194
package lacarreara;

import javax.swing.JLabel;

public class Arranque extends Thread{
    private int posicionIncialx, limitePista, velocidad;
    private JLabel auto;

    public Arranque(int posicionIncialX, int LimitePista, JLabel Auto, int Velocidad) {
        this.posicionIncialx=posicionIncialX;
        this.limitePista=LimitePista;
        this.auto=Auto;
        this.velocidad=Velocidad;
    }
    
    @Override
    public void run(){
        for (int i = limitePista; i > 0; i--) {
            auto.setBounds(posicionIncialx, i, 100, 100);
            try{
                sleep(200/velocidad);
            }catch(InterruptedException e){
                System.out.println("Excepión "+e);
            }
        }
    }
    
}
