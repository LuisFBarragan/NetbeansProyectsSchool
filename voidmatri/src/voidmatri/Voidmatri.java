
package voidmatri;

import java.util.Scanner;


public class Voidmatri {
    static   Scanner leer=new Scanner (System.in);
    int [][] juan=new int [10][10];
   static int nip=1024;
           int num;
           int [][] m1=new int [3][3];
int [][] m2=new int [3][3];
int [][] m3=new int [3][3];
int [][] m4=new int [3][3];
      void juan(){
           for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.println("ingresa un numero diferente a -99 para el casillero "+x+","+y); 
                num=leer.nextInt();
                if(num!=-99){
                    juan[x][y]=num;
                }
                else{
                    break;
                }
            }
            if (num==-99){
                break;
            }
        }
        System.out.println("los valores diferentes -99 son:");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(juan[x][y]+"  ");
            }
            System.out.println("");
            }
          
      }
      void two(){
          int [][] multfive=new int [3][3];
          int m=0;
         
          for (int x = 0; x < 3; x++) {
              for (int y = 0; y < 3; y++) {
                  m=m+5;
               multfive[x][y]=m;
              }
              
          }
          for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(multfive[x][y]+"  ");
            }
            System.out.println("  ");
            }
      }
      void thrre(){
          for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                m3[x][y]=m1[x][y]*m2[x][y];
            }
            }
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(m3[x][y]+"   ");
            }
            System.out.println("  ");
            }
    }
    public static void main(String[] args) {
       Voidmatri objeto=new Voidmatri();
     
    int op=0;
    
        
for (int x=0;x<1;x++){
    System.out.println(" da nip");
        nip=leer.nextInt();
    if(nip==1024){
        System.out.println("es correcto");
    do{
        System.out.println("1.- almacenar");
        System.out.println("2.- multiplos a 5");
        System.out.println("3.- multiplicacion de las matriz");
        System.out.println("4.- salir");
        System.out.println("elije una opcion");
        op=leer.nextInt();
        switch(op){
            case 1:
                objeto.juan();
                        break;
            case 2:
                objeto.two();
                break;
            case 3:
                objeto.thrre();
                break;
                
        }
        
    }while(op!=4);
    }
    else{
        System.out.println("error intentalo de new");
        x--;
        

            }
}
}
}