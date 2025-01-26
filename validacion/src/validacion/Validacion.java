
package validacion;

import java.util.Scanner;

public class Validacion {
    Scanner leer=new Scanner (System.in);

    
String validar (String nom, int y){
    //nom   
    y=0;
    for (int i = 0; i < nom.length(); i++) {
        if (nom.charAt(i)=='0'|| nom.charAt(i)=='1'||nom.charAt(i)=='2'||nom.charAt(i)=='3'||nom.charAt(i)=='4'||nom.charAt(i)=='5'||nom.charAt(i)=='6'||nom.charAt(i)=='7'||nom.charAt(i)=='8'||nom.charAt(i)=='9'){
          nom="NO SE ACEPTO";
            
        } 
    } 
return nom;
}
        
  int validar(int edad){
      double x=0;
      if (edad>=100){
          x=x+1;
          
          System.out.println("No se acepto la edad: "+edad);
      }
      else{
          System.out.println("se acepto la edad: "+edad);
      }
  return edad;
  }

  String validar (String correo){
    
     int  prro=0, baka=0;
      for (int i = 0; i <correo.length(); i++) {  
      if(correo.charAt(i)=='@'){
          prro++;
     }
              
          }
      if(prro==1) {
              correo= "correo  valido";
          }
          else{
              correo= "correo no valido";
}
      
 return correo; 
 }
  
  String validar (String numero, String num){
      int pp=0;
      for (int i = 3; i <num.length(); i=i+4) {
            
          if(num.charAt(i)=='-'){
              pp=pp+1;
          
      }//If
          
          
      }//for
      if (pp==3){
              numero= " es valido ";
          }
          else
          {
              numero= "  no es valido ";
          }
  return numero;
      }//validar
  
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        Validacion obj=new Validacion();
       
        String nom;
        String correo;
        int edad;
        String num;
        double t;
        //registro
        System.out.println("da nombre: ");    
        nom=leer.next();
        System.out.println("da edad: ");
        edad=leer.nextInt();
        System.out.println("da correo: ");
        correo=leer.next(); 
       System.out.println("da cel ");
        num=leer.next();
        //impresion
        System.out.println("name: "+obj.validar(nom, edad));
        System.out.println("Edad: "+obj.validar(edad));
        System.out.println("Email: "+obj.validar(correo));
        System.out.println("numero: "+obj.validar(num, num));
}           
}