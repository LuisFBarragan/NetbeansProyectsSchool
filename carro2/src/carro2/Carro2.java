
package carro2;

import java.util.Scanner;

public class Carro2 {
    String m;
    String c;
Carro2(String m, String c){
    this.c=c;
    this.m=m;
}

    public void setM(String m) {
        this.m = m;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    public String getM() {
        return m;
    }

    public String getC() {
        return c;
    }

    
    public static void main(String[] args) {
       Carro2 obj=new Carro2("rojo", "red");
        Scanner leer=new Scanner (System.in);
        
        int op;
        String color;
        String marca;
        do{     
    System.out.println("1.- da datos");
    System.out.println("2.- mostrar datos");
    System.out.println("3.- salir");
    op=leer.nextInt();
    switch (op){
        case 1:
        System.out.println("da color");
        color=leer.next();
        System.out.println("da marca");
         marca=leer.next();
        obj.setM(marca);
        obj.setC(color);
        
         break;
        case 2:
            System.out.println("marca: "+obj.getM());
            System.out.println("color: "+obj.getC());
            break;
            }     
    
}while (op!=3);
        
    }
    }
        
    
    

