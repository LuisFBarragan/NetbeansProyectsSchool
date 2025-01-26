
package backpack;
import javax.swing.JOptionPane;

public class Backpack {
    String marca;
    
    String color;
    
    void arrancarFull(String marca, String color){
        JOptionPane.showMessageDialog(null, "arrancar "+marca+" color "+color);
    }
    void detenerFrenar(String marca, String color){
         JOptionPane.showMessageDialog(null, "detener "+marca+" color "+color);
    }
  
    public static void main(String[] args) {
        String marca;
        String color;

        marca=JOptionPane.showInputDialog("capturar marca");
        color=JOptionPane.showInputDialog("captura el color");
    
        Backpack obj=new Backpack();
        obj.arrancarFull(marca, color);
        obj.detenerFrenar(marca, color);
        
    }
    
}
