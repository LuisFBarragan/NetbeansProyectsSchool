package buscbinaria;

import java.util.Scanner;

public class BuscBinaria {
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        int a[] = {2, 4, 9, 11, 16};
       int p=a.length;
       boolean jala=false;
        int in = 0;
        int fn = a.length - 1;
        System.out.println("Da dato a buscar");
        int busc = 11;
        
       while(in<fn){
            p=(in+fn)/2; 
           if (a[p]==busc) {
               jala=true;
               break;
           }
           else{
               if (busc < a[p]) {
                  fn--;
               }
               else{
                   in++;
            }
        }
    }
        if (jala==true) {
            System.out.println("se encontro"); 
        }
        else{
            System.out.println("ya valio");
        }
    } 
}
