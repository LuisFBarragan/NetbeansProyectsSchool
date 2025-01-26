//Barragan Flores Luis Francisco
//18460194
package lacarreara;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Pista extends JFrame {
    private JLabel lbAuto,lbAuto2,lbAuto3,lbPista;
    private JButton btArranca;
    private int x=500,y=0,Ancho=500,Alto=700;
    
    public Pista(){
        super("Carrera --> Formula 1");
        inPista();
        Inicio();
    }
    
    private void inPista(){
        getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(x, y, Ancho, Alto);
        
        lbPista=new JLabel();
        this.getContentPane().add(lbPista);
        lbPista.setIcon(new ImageIcon(getClass().getResource("/imagenes/CarreteraAnimada.gif")));
        lbPista.setBounds(100,0,300,700);
        
        //AutoAzul
        lbAuto = new JLabel();
        lbPista.add(lbAuto);
        lbAuto.setIcon(new ImageIcon(getClass().getResource("/imagenes/AutoAzulp.png")));
        lbAuto.setBounds(30, Alto-140, 100, 100);
        
        //AutoRojo
        lbAuto2 = new JLabel();
        lbPista.add(lbAuto2);
        lbAuto2.setIcon(new ImageIcon(getClass().getResource("/imagenes/AutoRojop.png")));
        lbAuto2.setBounds(130, Alto-140, 100, 100);
        
        //AutoVerde
        lbAuto3 = new JLabel();
        lbPista.add(lbAuto3);
        lbAuto3.setIcon(new ImageIcon(getClass().getResource("/imagenes/AutoVerdep.png")));
        lbAuto3.setBounds(230, Alto-140, 100, 100);
        
        //1, 2, 3 Fuera
        btArranca = new JButton("Start");
        this.getContentPane().add(btArranca);
        btArranca.setBounds(0, 0, 100, 50);  
    }
    
      private void Inicio(){
            btArranca.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    System.out.println("Inicia la carrera");
                    int V1= (int)(Math.random()*100+10);
                    int V2= (int)(Math.random()*100+10);
                    int V3= (int)(Math.random()*100+10);
                    Arranque hiloA = new Arranque(30, Alto-140, lbAuto, V1);
                    Arranque hiloR = new Arranque(130, Alto-140, lbAuto2, V2);
                    Arranque hiloV = new Arranque(230, Alto-140, lbAuto3, V3);
                    hiloA.start();
                    hiloR.start();
                    hiloV.start();
                }
            });
        }
}
