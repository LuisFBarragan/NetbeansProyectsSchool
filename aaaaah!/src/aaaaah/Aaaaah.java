
package aaaaah;

import java.util.Scanner;
public class Aaaaah {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int x;
        System.out.println("Da la cantidad de datos a ingresar");
        x=read.nextInt(); 
        int y;
        int vector[]=new int [x];
        for (int i = 0; i <x; i++) {
            y=1;
            System.out.println("Da el valor "+y);
            vector[i]=read.nextInt();
            y++;
        }
        for (int i = 0; i < x; i++) {
            System.out.print(" "+vector[i]);
        }
        System.out.println("");
    }
    
}
