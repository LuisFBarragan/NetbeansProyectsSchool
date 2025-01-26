/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaautomta;

import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class PruebaAutomta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] MONEY =
       //1  2  5  v  N                                       
       {{1, 2, 5, 0, 0},//E0 
        {2, 3, 6, 1, 1},//E1
        {3, 4, 7, 2, 2},//E2
        {4, 5, 7, 3, 3},//E3
        {5, 6, 7, 4, 4},//E4
        {6, 7, 7, 5, 5},//E5
        {7, 7, 7, 6, 6},//E6
        {7, 7, 7, 0, 0}};//E7
       
        String[][] Cambio =
        //1    2    5    v    N   
       {{"N", "N", "N", "N", "N"},//E0 
        {"N", "N", "N", "N", "N"},//E1 
        {"N", "N", "N", "N", "N"},//E2 
        {"N", "N", "1", "N", "N"},//E3 
        {"N", "N", "2", "N", "N"},//E4 
        {"N", "N", "3", "N", "N"},//E5 
        {"N", "1", "4", "N", "N"},//E6 
        {"1", "2", "5", "C", "O"}};//E7
        
        int fila=0, columna=0, cant = 0;
        String cambio2="", Vendido ="";
        boolean e = true;
        
        while(e){
            
            System.out.println("Ingresa una moneda");
            int moneda =read.nextInt();
            cant = cant + moneda; 
           // if (cant <7) {
                if (moneda == 1) {
                columna = 0;
                System.out.println("Estados "+MONEY[fila][columna]);
                System.out.println("Estados2 "+Cambio[fila][columna]);
                if (cant>=7) {
                       cambio2 = Cambio[fila][columna];
                    }
            }else if (moneda == 2) {
                columna = 1;
                System.out.println("Estados "+MONEY[fila][columna]);
                System.out.println("Estados2 "+Cambio[fila][columna]);
                if (cant>=7) {
                       cambio2 = Cambio[fila][columna];
                    }
            }else if(moneda == 5){
                columna = 2;
                System.out.println("Estados "+MONEY[fila][columna]);
                System.out.println("Estados2 "+Cambio[fila][columna]);
                if (cant>=7) {
                       cambio2 = Cambio[fila][columna];
                    }
            }else if (moneda == 6) {
                columna = 3;
                cant = cant - moneda;
                System.out.println("venta de clara aceptada");
                System.out.println("Cambio "+Cambio[fila][columna]);
                if (cant>=7) {
                        e = false;
                        Vendido = Cambio[fila][columna];
                    }

            }else {
                columna = 4;
                cant = cant - moneda;
                System.out.println("Venta de oscura aceptada");   
                System.out.println("Cambio "+Cambio[fila][columna]);
                
                    if (cant>=7) {
                        e = false;
                        Vendido = Cambio[fila][columna];
                    }
            }
            fila = MONEY[fila][columna];
            
            System.out.println("Cantidad"+ cant);
            
            
                
            }// while
            System.out.println("Ticket:");
            System.out.println("Vendido "+Vendido);
            System.out.println("Cantidad"+ cant);
            System.out.println("Cambio: "+cambio2);
        }//main
        
        
    }//class
