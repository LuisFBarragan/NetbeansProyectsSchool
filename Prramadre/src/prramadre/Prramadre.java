/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prramadre;

import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class Prramadre {

 public static String Inversa(String palabra, int n2){
     if (n2 == 0) {
         return palabra.charAt(n2) + "";
     }
     else{
         return palabra.charAt(n2) + Inversa(palabra,n2-1);
     }
 }
 
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
        String palabra;
        int n2;
        
        System.out.println("Da la palabra");
        palabra = red.next();
        
        n2=palabra.length();
        String palabra_invertida = Inversa(palabra,n2);       
    } 
}
