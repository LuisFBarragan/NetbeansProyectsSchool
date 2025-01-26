package cinecitlali;

import java.util.Scanner;

public class CineCitlali {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int option, i, j, cont1=0, cont2=0;
       char[][] asientos=new char[3][3];
       for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                asientos[i][j]='☺';
            }
       }        
       do{
           System.out.println("1. Reservar");
           System.out.println("2. Cancelar");
           System.out.println("3. Mostrar estado de asientos");
           System.out.println("4. Reporte de asientos vacios");
           System.out.println("5. Reporte de asientos ocupados");
           System.out.println("6. Salir");
           System.out.println("Selecciona una opción");
           option=leer.nextInt();
           switch(option){
               case 1:
                       System.out.println("Fila a reservar"); 
                       i=leer.nextInt();
                       System.out.println("Columna a reservar");
                       j=leer.nextInt();
                     if(asientos[i][j]=='☻'){
                         System.out.println("Ya está reservado"); 
                   }else{
                         asientos[i][j]='☻';
                     }
                     break;
               case 2:
                   System.out.println("Fila a cancelar"); 
                       i=leer.nextInt();
                       System.out.println("Columna a cancelar");
                       j=leer.nextInt();
                     if(asientos[i][j]=='☻'){
                         asientos[i][j]='☺';
                   }else{
                        System.out.println("No está reservado"); 
                     }
                     break;
               case 3:
                   for (i = 0; i < 3; i++) {
                       for (j = 0; j < 3; j++) { 
                           System.out.print(asientos[i][j]);   
                       }
                       System.out.println(" ");
                   }
                   break;
               case 4:
                  for (i = 0; i < 3; i++) {
                       for (j = 0; j < 3; j++) {  
                           if(asientos[i][j]=='☺'){
                               cont1++;
                           }
           }
           }
                   System.out.println("Hay "+cont1+" asientos vacíos");
                   System.out.println(" ");
           break;
           case 5:
           for (i = 0; i < 3; i++) {
                       for (j = 0; j < 3; j++) {  
                           if(asientos[i][j]=='☻'){
                               cont2++;
                           }
           }
           }
                   System.out.println("Hay "+cont2+" asientos reservados");
                   System.out.println(" ");
                   break;
           }
       } while(option!=6);
       }
}
