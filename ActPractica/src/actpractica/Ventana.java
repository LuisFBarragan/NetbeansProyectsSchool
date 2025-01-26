package actpractica;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Ventana  extends JFrame implements ActionListener {
    private JButton btMod,btedad,btAntiguedad,BtPrestacion,btEmp,btop1,btop2;
    private JLabel datos,Nom,Ape,Genero,Fnacio,Fingreso,Salario,calculo,op,et1N,et2A,etG,etFn,etFi,etS;
    private JPanel  pCalculos, pOpcion;

    public Ventana(){
       ventana();
       Controles();
        
    }
    
     String nom[]={"Marcelo","Francisco","Antonio","Enrique","Esmeralda"};
     String ape[]={"Salazar","Vejar","Basan","Castillo","Carrisales"};
     String gen[]={"Masculino","Masculino","Masculino","Masculino","Femenino"};
     //int fnaci[]={2000,1999,1998,1997,1996};
     String fnaci[]={"10/09/2000","02/02/1999","05/05/1998","09/09/1997","12/12/1996"};
     //int ingre[]={2010,2011,2010,2020,2020};
     String ingre[]={"01/01/2010","12/09/2017","09/09/2017","10/11/2019","12/12/2020"};
     int salario[]={2000,2001,2500,2007,10000};
     int i=0;
    
    private void ventana(){
        this.setSize(700, 700);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sistema de Empleados");
        this.setMinimumSize(new Dimension(500,500));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.lightGray);  
    }
    
    private void Controles(){
        datos=new JLabel("Datos");
        datos.setBounds(0, 0, 50, 30);
        this.add(datos);
        
        Nom =new JLabel("Nombre");
        Nom.setBounds(30, 30, 50, 15);
        this.add(Nom);    
        et1N =new JLabel(nom[i]);
        et1N.setOpaque(true);
        et1N.setBounds(250, 30, 200, 15);
        et1N.setBackground(Color.white);
        this.add(et1N);
        
        Ape=new JLabel("Apellido");
        Ape.setBounds(30, 50, 50, 15);
        this.add(Ape);    
        et2A=new JLabel(ape[i]);
        et2A.setOpaque(true);
        et2A.setBounds(250, 50, 200, 15);
        et2A.setBackground(Color.white);
        this.add(et2A);
        
        Genero=new JLabel("Genero");
        Genero.setBounds(30, 70, 200, 15);
        this.add(Genero);    
        etG=new JLabel(gen[i]);
        etG.setBackground(Color.white);
        etG.setOpaque(true);
        etG.setBounds(250, 70, 200, 15);
        this.add(etG);
        
        Fnacio=new JLabel("Fecha de nacimiento");
        Fnacio.setBounds(30, 90, 150, 15);
        this.add(Fnacio);    
        etFi=new JLabel(fnaci[i]);
        etFi.setBackground(Color.white);
        etFi.setOpaque(true);
        etFi.setBounds(250, 90, 200, 15);
        this.add(etFi);
        
        Fingreso=new JLabel("Fecha de ingreso");
        Fingreso.setBounds(30, 110, 150, 15);
        this.add(Fingreso);    
        etFn=new JLabel(ingre[i]);
        etFn.setBackground(Color.white);
        etFn.setOpaque(true);
        etFn.setBounds(250, 110, 200, 15);
        this.add(etFn); 
        
        Salario=new JLabel("Salario");
        Salario.setBounds(30, 130, 50, 15);
        this.add(Salario);    
        etS=new JLabel(Integer.toString(salario[i]));
        etS.setBackground(Color.white);
        etS.setOpaque(true);
        etS.setBounds(250, 130, 200, 15);
        this.add(etS);    
       
        btMod=new JButton("Modificar Salario");
        btMod.setBounds(170, 170, 200, 30);
        this.add(btMod);
        btMod.addActionListener(this);
        
        calculo=new JLabel("Cálculos");
        calculo.setBounds(0, 200, 50, 30);
        this.add(calculo);
        pCalculos=new JPanel();
        pCalculos.setBounds(150, 230, 250, 100);
        this.add(pCalculos);
        btedad=new JButton("Calcular Edad");
        btedad.addActionListener(this);
        btAntiguedad=new JButton("Calcular Antiguedad");
        btAntiguedad.addActionListener(this);
        BtPrestacion=new JButton("Calcular Prestaciones");
        pCalculos.add(btedad);
        pCalculos.add(btAntiguedad);
        pCalculos.add(BtPrestacion);
        pCalculos.setLayout(new GridLayout(3,3,4,3));
        
        op=new JLabel("Opciones");
        op.setBounds(0, 350, 100, 30);
        this.add(op);
        pOpcion=new JPanel();
        pOpcion.setBounds(150, 400, 310, 30);
        this.add(pOpcion);
        btEmp=new JButton("Cambiar Empleado");
        btEmp.addActionListener(this);
        btop1=new JButton("Opción 1");
        btop2=new JButton("Opción 2");
        pOpcion.add(btEmp);
        pOpcion.add(btop1);
        pOpcion.add(btop2);
        pOpcion.setLayout(new BoxLayout(pOpcion,BoxLayout.X_AXIS));
}
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        int Mod=0,Edad,Viejo;
        String EdaD;
        try{
            if (ae.getSource()==btMod) {
                Mod=Integer.parseInt(JOptionPane.showInputDialog("Da el nuevo salario"));
                salario[i]=Mod;
                etS.setText(Integer.toString(salario[i]));
            }
            else if (ae.getSource()==btedad) {
               Edad=Integer.parseInt(fnaci[i].substring(6,10));
               JOptionPane.showMessageDialog(null, "Edad: "+(2019-Edad));
               
            }
            else if (ae.getSource()==btAntiguedad) {
                Viejo=Integer.parseInt(ingre[i].substring(6,10));
               JOptionPane.showMessageDialog(null, "Antiguedad: "+(2020-Viejo));
            }
            if (ae.getSource()==btEmp) {
                if (i<=4) {
                i++;
                et1N.setText(nom[i]);
                et2A.setText(ape[i]);
                etG.setText(gen[i]);
                etFn.setText(fnaci[i]);
                etFn.setText(ingre[i]);
                etS.setText(Integer.toString(salario[i]));    
                }
                else{
                    i=0;
                et1N.setText(nom[i]);
                et2A.setText(ape[i]);
                etG.setText(gen[i]);
                etFn.setText(fnaci[i]);
                etFn.setText(ingre[i]);
                etS.setText(Integer.toString(salario[i]));
                }
            }
            
        }catch(Exception e){
            
        }
        
    }
    
}
