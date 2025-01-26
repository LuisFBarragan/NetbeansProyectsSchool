package act3s3matriz;

import java.util.Scanner;

public class Act3S3Matriz {

    public static void main(String[] args) {
 Scanner read=new Scanner(System.in);
 int x,y,op;
        System.out.println("De cuanto x cuanto");
        x=read.nextInt();
        y=x;
        int matriz[][]=new int[x][y];
        do {
            System.out.println("1.- llenar");
            System.out.println("2.- mostrar");
            System.out.println("3.- modificar");
            System.out.println("4.- borrar");
            System.out.println("5.- salir");
            System.out.println("elije una opcion");
            op=read.nextInt();
            switch(op){
                case 1://llenar
                    for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {                  
                System.out.println(" da el dato de la cordenada "+i+","+j);
                matriz[i][j]=read.nextInt();
        }
        }
                    break;
                case 2://mostrar
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        break;
                case 3://modificar
                    int f,c;
                    System.out.println("ingresa columna");
                    c=read.nextInt(); 
                    System.out.println("ingresa la fila");
                    f=read.nextInt();
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            if (c==i&&f==j) {
                                System.out.println("se encontro en las coordenadas "+i+","+j);
                                System.out.println("ingresa el nuevo dijito");
                                matriz[i][j]=read.nextInt();
                                System.out.println("Se ha modificado correctamente");
                            }
                        }
                    }
                    break;
                case 4://borrar
                    int d,e;
                    System.out.println("ingresa la columna");
                    d=read.nextInt();
                    System.out.println("ingresa la fila");
                    e=read.nextInt();
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            if (i==d&&j==e) {
                                matriz[i][j]=0;
                                System.out.println("Se ha eliminado correctamente");
                            }
                        }
                    }
                    break;
        }
        } while (op!=5);
    }
}
