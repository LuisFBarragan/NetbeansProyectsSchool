package palidromo;

import java.util.Scanner;

public class Palidromo {
   static Scanner read=new Scanner(System.in);
  
    public static void main(String[] args) {
  Palidromo obj=new Palidromo();   
        String pa[]=new String[5];
    System.out.println("Escribe la pabra");
     String palabra=read.next();     
    int j=palabra.length()-1;
     obj.recursivo(palabra);
    }
    int cont=0; int conta=-1; int f;
    boolean recursivo(String palabra){
        cont--;
        conta++;
            if (palabra.charAt(conta)==palabra.length()-cont) {
             f++;       
                if (palabra.length()-1==f) {
                    return true;
                }
                else {return false;
        }
            }
}

