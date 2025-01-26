package intercambio;

import java.util.Scanner;

public class Intercambio {

    public static void main(String[] args) {
         Scanner read=new Scanner(System.in);
       int f;
        System.out.println("LLena ");
        int intercambio[]=new int [5];
        for (int w = 0; w < 5; w++) {
            intercambio[w]=read.nextInt();
        }
        
        int a=0;
        System.out.println("Se hacen weas ");
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j <5; j++) {
                if (intercambio[i]>intercambio[j]) {
                 f=intercambio[i];   
                 intercambio[i]=intercambio[j];
                 intercambio[j]=f;
                }
            }
        }
        for (int k = 0; k < 5; k++) {
            System.out.print(" "+intercambio[k]);
        }
    }
    
}
