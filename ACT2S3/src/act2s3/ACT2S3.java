package act2s3;

import java.util.Scanner;

public class ACT2S3 {

    public static void main(String[] args) {
 Scanner read=new Scanner(System.in);
 int x;       
 System.out.println("cuantos casilleros quieres");
       x=read.nextInt();
 int vector[]=new int[x];  int op=0;
        do {
            System.out.println("1.- llenar vector");
            System.out.println("2.- insertar");
            System.out.println("3.- modificar");
            System.out.println("4.- borrar");
            System.out.println("5- imprimir");
            System.out.println("6.- salir");
            System.out.println("elije una opcion");
            op=read.nextInt();
            switch(op){
                case 1:
                    int y=1;
                    for (int i = 0; i < x; i++) {
                        System.out.println("ingresa el dato del casillero "+y);
                        vector[i]=read.nextInt();
                        y++;
                    }
                    for (int i = 0; i < x; i++) {
                        System.out.print(" "+vector[i]);
                    }
                    System.out.println("");
                    break;
                case 2:
                    int w,u,v=x+1;
                    System.out.println("ingresa la nueva cantidad de espacios ");
                    w=read.nextInt();
                    int vector2[]=new int[w];
                    u=w-x;
                    int conta=0;
                    for (int i = 0; i < x; i++) {
                        vector2[i]=vector[i];  
                    }
                    System.out.println(" ");
                    if (u>0) {
                        System.out.println("has aumentado "+u+" casilleros al vector");  
                        for (int i = x; i < w; i++) {
                            System.out.println("da el casillero "+v);
                            vector2[i]=read.nextInt();
                            v++;
                        }
                        }
                    else{
                        System.out.println("has diminuido "+u+" casilleros al vector");
                    }for (int i = 0; i < w; i++) {
                        System.out.print(" "+vector2[i]);
                    }
                    break;
                case 3:
                   int mod, modi, cont=0;
                       System.out.println("que casillero quieres modificar");
                       mod=read.nextInt();
                       modi=mod-1;
                       for (int i = 0; i <x; i++) {
                           if (modi==i) {
                               System.out.println("da el nuevo dato");
                               vector[i]=read.nextInt();
                           }
                           else{
                               cont++;
                               if (cont==x) {
                                   System.out.println("no se encontro el dato");
                               }
                           }
                    }
                case 4:
                    int borrar;
                       System.out.println("que casillero quieres borrar");
                       borrar=read.nextInt();
                       for (int i = 0; i <x; i++) {
                           if (borrar-1==i) {
                               vector[i]=0;
                           }
                           else{
                               System.out.println("no se encontro el casillero");
                           }
                    }
                       break;
                case 5:
                    for (int i = 0; i < x; i++) {
                        System.out.print(" "+vector[i]);
                    }
                    System.out.println(" ");
                    break;
            }
        } while (op!=6);   
    }
}