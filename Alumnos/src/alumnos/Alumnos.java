package alumnos;

import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double prom, suma=0;
        String[] nombre=new String[3];
        double[] calificacion=new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa nombre "+i);
            nombre[i]=leer.next();
            System.out.println("Ingresa calificación");
            calificacion[i]=leer.nextDouble();
        }
        System.out.println("IMPRESIÓN");
        for (int i = 0; i < 3; i++) {
        System.out.println("Nombre: "+nombre[i]);
         System.out.println("Calificación: "+calificacion[i]);
            System.out.println(" ");
         suma=(suma+calificacion[i]);
    }
        prom=suma/3;
        System.out.println("El promedio es: "+prom);
    }
}
