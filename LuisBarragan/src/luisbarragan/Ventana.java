
package luisbarragan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener{
    Ventana(){
        inicializar();
        inControles();
    }
    
    private JButton acep,clean;
    private JRadioButton admi,ope;
    private JLabel usa,clave;
    private JTextField et1,et2;
    String nombre[]={"Luis Castillo","Byron Carrisales"};
    int ClaveA[]={1234,5678};
    int ClaveU[]={12340,56789};
    int i=0;
    private void inicializar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Acceso al sistema");        
        this.setMinimumSize(new Dimension(600,300));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.lightGray);
    }
    
   private void inControles(){
       admi=new JRadioButton("Administrador");
       admi.setBounds(30, 30, 150, 30);
       this.add(admi);
       ope=new JRadioButton("Operador");
       ope.setBounds(30,60 , 150, 30);
       this.add(ope);
       
       usa=new JLabel("Usuario");
       usa.setBounds(200, 30, 150, 30);
       this.add(usa);
       clave=new JLabel("Clave");
       clave.setBounds(200, 60, 150, 30);
       this.add(clave);
       
       et1=new JTextField();
       et1.setBounds(270, 30, 100, 30);
       this.add(et1);
       et2=new JTextField();
       et2.setBounds(270, 60, 100, 30);
       this.add(et2);
       
       acep= new JButton("Aceptar");
       acep.setBounds(200, 120, 150, 30);
       acep.addActionListener(this);
       this.add(acep);
       clean= new JButton("Limpiar");
       clean.setBounds(350, 120, 200, 30);
       this.add(clean);
       clean.addActionListener(this);
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int contras=0,fails=0,f=0,correcta=0;
        String usuario=et1.getText();
        
        if (usuario=="Luis") {
            i=1;
            correcta=ClaveA[i];
        }
        else{
            if (usuario=="Byron") {
                i=2;
                correcta=ClaveA[i];
            }
            else{
                if (usuario=="Esmeralda") {
                    i=1;
                    correcta=ClaveU[i];
                }
                else{
                    if (usuario=="Francisco") {
                        i=2;
                        correcta=ClaveU[i];
                    }
                }
            }
        }
        if (ae.getSource()==acep) {
            contras=Integer.parseInt(et2.getText());
            if (admi.isSelected()) {
                if (usuario=="Luis") {
            i=1;
            correcta=ClaveA[i];
        }
        else{
            if (usuario=="Byron") {
                i=2;
                correcta=ClaveA[i];
            }
                }
                if (contras==correcta) {
                    JOptionPane.showMessageDialog(null, "Contra correcta");
                    fails=0;
                }
                else{
                    fails++;
                    JOptionPane.showMessageDialog(null, "Contra incorrecta");
                    if (fails==3) {
                        JOptionPane.showMessageDialog(null, "Has ingresado la contra correcta 3 veces, se bloqueara");
                        fails=0;
                    }
                }
            }
            else{
                if (ope.isSelected()) {
                    if (rootPaneCheckingEnabled) {
                        
                    }
                    if (contras==5678) {
                        JOptionPane.showMessageDialog(null, "Contra correcta");
                    }
                    else{
                        f++;
                        JOptionPane.showMessageDialog(null, "Contra incorrecta");
                        if (fails==3) {
                        JOptionPane.showMessageDialog(null, "Has ingresado la contra correcta 3 veces, se bloqueara");
                        fails=0;
                    }
                  }
                    
                }
            }
        }
        if (ae.getSource()==clean) {
            et1.setText("");
            et2.setText("");
        }
    }

}
