package pilav;

import java.util.Scanner;


public class PilaV {


    public static void main(String[] args) {
 Scanner read=new Scanner (System.in);
 String palabra; int op,f=0;
 System.out.println("Escribe la palabra");
                    palabra=read.next();
                   int x= palabra.length();
                    char[] palabrap=new char[x];
        do {
            System.out.println("1.- Llenar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Palidromos");
            System.out.println("4.- salir");
            System.out.println("erave");
            op=read.nextInt();
            switch(op){
                case 1:
                   
                    for (int i = 0; i < x; i++) {
                        palabrap[f]=palabra.charAt(i);
                    f++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < x; i++) {
                        System.out.println(" "+palabrap[i]);
                    }
                    break;
                case 3:
                    int y=0; int z=palabra.length()-1; int cont=1;
                    for (int i = 0; i < x; i++) {
                        if (palabra.charAt(y)==palabrap[z]) {
                        y++; z=z-1;
                        cont++;
                    }
            }
                               if (cont==x) {
                        System.out.println("no es palidromo");
                    }
                    else{
                        System.out.println("es palidromo");
                    }
                            }
                         
        } while (op!=4);
        
    }
    
}
