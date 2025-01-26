
package cine;

import java.util.Scanner;

public class Cine {

        
    public static void main(String[] args) {
  


Scanner leer=new Scanner(System.in);
        System.out.println("dacrreo");
        String correo;
        correo=leer.next();
int  prro=0, baka=0;
      for (int i = 0; i <correo.length(); i++) {  
      if(correo.charAt(i)!='@'){
          prro++;
          if(prro==correo.length())
                  {
              System.out.println("correo no valido: "+correo);
          }
      }
          else{
              
                  System.out.println("correo  valido: "+correo);
              }
              
          }
    }
    
}
