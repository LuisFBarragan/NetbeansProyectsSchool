
package validacion2;

import java.util.Scanner;

public class Validacion2 {
    Scanner leer=new Scanner (System.in);
void validar (){
    String nom;
        String correo;
        int edad, y=0, t=0, fofa=0;
        double x=0;
        String num;
    
    
}
    
String validar (String nom, int y){
    //nom   
    y=0;
    for (int i = 0; i < nom.length(); i++) {
        if (nom.charAt(i)=='0'|| nom.charAt(i)=='1'||nom.charAt(i)=='2'||nom.charAt(i)=='3'||nom.charAt(i)=='4'||nom.charAt(i)=='5'||nom.charAt(i)=='6'||nom.charAt(i)=='7'||nom.charAt(i)=='8'||nom.charAt(i)=='9'){
          
                System.out.println("NO ACEPTO EL NOMBRE, APRENDE ESCRIBIR PRRO");
            
        } 
    } 
return nom;
}
        
  int validar(int edad){
      double x=0;
      if (edad>=100){
          x=x+1;
          
          System.out.println("No se acepto la edad: ");
      }
      else{
          System.out.println("se acepto la edad: ");
      }
  return edad;
  }

  String validar (String correo, double t){
    
      double  prro=0;
      
        System.out.println("da correo");
        correo=leer.next();
      for (int i = 0; i <correo.length(); i++) {  
      if(correo.charAt(i)=='@'){
         System.out.println("correo valido: "+correo);
          
              
                  
              
              
          }
      else{
          System.out.println("no valido ");
      }
          
         
      
      
  }
 return " "; 
 }//validar
  
  String validar (String num, float fofa){
      for (int i = 3; i <num.length(); i=i+4) {
          int pp=0;  
          if(num.charAt(i)=='-'){
              pp=pp+1;
          if (pp==3){System.out.println(" es valido ");
          }
          else{System.out.println("NO ES VAIDO ");}
      }//If
          else{
              System.out.println("no es valido ");
          }
      }//for
  return num;
      }//validar
  
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        Validacion2 obj=new Validacion2();
       
        String nom;
        String correo;
        int edad;
        String num;
        //registro
        System.out.println("da nombre: ");    
        nom=leer.next();
        System.out.println("da edad: ");
        edad=leer.nextInt();
        System.out.println("da correo: ");
        correo=leer.next(); 
       // System.out.println("da cel ");
        //num=leer.next();
        //impresion
        System.out.println("name: "+obj.validar(nom, edad));
        System.out.println("Edad: "+obj.validar(edad));
        System.out.println("Email: "+obj.validar(correo, edad));
        //System.out.println("numero: "+obj.validar(num, edad));
}           
}