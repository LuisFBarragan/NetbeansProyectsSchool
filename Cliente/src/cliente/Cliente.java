
package cliente;

import java.util.Scanner;

public class Cliente {
     int cuenta;
     String name;
     String cel;
    Cliente (int cta, String nom, String cell){
        this.cuenta=cta;
        this.name=nom;
        this.cel=cell;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getName() {
        return name;
    }

    public String getCel() {
        return cel;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
    void nombrec(String nom, int y){
         y=0;
    for (int i = 0; i < nom.length(); i++) {
        if (nom.charAt(i)=='0'|| nom.charAt(i)=='1'||nom.charAt(i)=='2'||nom.charAt(i)=='3'||nom.charAt(i)=='4'||nom.charAt(i)=='5'||nom.charAt(i)=='6'||nom.charAt(i)=='7'||nom.charAt(i)=='8'||nom.charAt(i)=='9'){
          nom="NO SE ACEPTO";
            
        } 
    } 
    }
    
    void edadc(int edad){
         double x=0;
      if (edad>=100){
          x=x+1;
          
          System.out.println("No se acepto la edad: "+edad);
      }
      else{
          System.out.println("se acepto la edad: "+edad);
      }
    }
    
    void correoc(String correo){
        int  prro=0, baka=0;
      for (int i = 0; i <correo.length(); i++) {  
      if(correo.charAt(i)=='@'){
          prro++;
     }
              
          }
      if(prro==1) {
              System.out.println("correo  valido");
          }
          else{
              System.out.println("correo no valido");
}
    }
    
    public static void main(String[] args) {
       Cliente objeto=new Cliente(0, " "," "); 
       Scanner read=new Scanner (System.in);
        
        
        String name; String num; String correo; int edad;
        System.out.println("da name ");
        name=read.next();
        System.out.println("da num");
        num=read.next();
        System.out.println("da correo");
        correo=read.next();
        edad=read.nextInt();
        
        
        
        
    }
    
}
