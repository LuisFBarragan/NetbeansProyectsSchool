
package thegame;

import java.util.Scanner;

public class TheGame {


    public static void main(String[] args) {
    Scanner read=new Scanner(System.in); 
    TheGame objeto=new TheGame();
    int d=3,n;    
    System.out.println("Cuantos discos puso Dios");
        n=read.nextInt();
       objeto.ComienzaElJuego(n,"a","b","c");
    }
    static int d=3;
    public  void ComienzaElJuego(int n, String a,String b,String c){
        void torre(int x,String a,String b, String c){
        if (x==1){
            System.out.println(a+" se mueve a "+c);
           
        }
        else{
       torre(x-1,a,c,b);
       System.out.println(a+" se mueve a "+c);
       torre(x-1,b,a,c);
        }
    }
        
        
        
    }
    
}
