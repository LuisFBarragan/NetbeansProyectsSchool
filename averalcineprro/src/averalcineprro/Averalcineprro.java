package averalcineprro;

import java.util.Scanner;

public class Averalcineprro {
static Scanner leer=new Scanner (System.in);
 static int op=0,x,y;   
static char [][] cine=new char [x][y];
         
void mostrar(){
    for(int x=0; x<2; x++){
        System.out.println("  ");
        for (int y=0; y<2; y++){
            System.out.println(" "+cine[x][y]);
        }
    }
}
void reservar(){
   System.out.println("ingresa el numero de columna");
                    x=leer.nextInt();
                    System.out.println("ingresa el numero de fila");
                    y=leer.nextInt();
                    cine[x][y]='♥';
    
}
void mostrarac(){
     for(x=0;x<5;x++){
            for(y=0;y<5;y++){
                System.out.print(cine[x][y]+"  ");
            }
                        System.out.println(" ");
            }
}
void report(){
    int c=0;
                    for(x=0;x<5;x++){
            for(y=0;y<5;y++){
                if(cine[x][y]=='♥'){
                    c++;
                }
            }
                      
            }
                    System.out.println(c+" asientos vacios");
                    
}
void reporttwo(){
    int co=0;
                        for(x=0;x<5;x++){
            for(y=0;y<5;y++){
                if(cine[x][y]=='o'){
                  co++;
                }
            }
                      
            }
                         System.out.println(co+" asientos ocupados");
}
    public static void main(String[] args) {
Averalcineprro objeto=new Averalcineprro();
        while(op!=6){
            System.out.println("1.- reservar asientos");
            System.out.println("2.- cancelar asiento");
            System.out.println("3.- mostrar estado de asientos");
            System.out.println("4.- reporte de asientos vacios");
            System.out.println("5.- reporte de asietos ocupados");
            System.out.println("6.-salir");
            op=leer.nextInt();
            switch(op){
                case 1:
                   objeto.mostrar();
                    break;
                case 2:
                    objeto.reservar();
                    break;
                case 3:
                   objeto.mostrarac();
                    break;
                case 4:
                    objeto.report();
                case 5:
                    objeto.reporttwo();
                        break;
            }
    }
    
}
}
