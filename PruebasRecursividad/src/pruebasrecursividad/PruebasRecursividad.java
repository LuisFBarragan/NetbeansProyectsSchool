/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasrecursividad;

import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class PruebasRecursividad {

    public static String invertirPalabra(String palabra, int longitud){
        if (longitud == 0) {
            return palabra.charAt(longitud) + "";
        }
        else{
        return palabra.charAt(longitud) + invertirPalabra(palabra,longitud-1);
        }
    }
    
     public static String Potencia(String cadena, int n){
         if (n == 1) {
             return cadena;
         }
         else if(n == 0){
         return "0"; 
         }
         else {
             return cadena+Potencia(cadena,n-1);
         }
     }
    
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String cadena;
        int longi;
        int n;
        System.out.println("Digite una palabra");
        cadena= read.next();
        longi=cadena.length();
        
        String prueba = invertirPalabra(cadena,longi-1);
        System.out.println(" "+prueba);
    }
    
}
