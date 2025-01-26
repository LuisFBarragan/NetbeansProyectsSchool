package repaso1vector;

import java.util.Scanner;

public class Repaso1vector {

    public static void main(String[] args) {
 Scanner leer=new Scanner (System.in);
 String [] name=new String [3];
 double [] cost=new double [3];
 int [] exist=new int [3];
 int x, op, comp;
 String search;
       do{
           System.out.println("1.- Registro");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Entrada articulos");
        System.out.println("4.- Salida articulos");
        System.out.println("5.-Existencias 0");
           System.out.println("6.- may ");
        System.out.println("7.- Salir");
        System.out.println("elije una opcion");
        op=leer.nextInt();
        switch(op){
            case 1:
                    for(x=0; x<3; x++){
                        System.out.println("da la descripcion");
                        name[x]=leer.next();
                        System.out.println("$");
                        cost[x]=leer.nextDouble();
                        exist[x]=0;
                        
                    }
            break;
            case 2:
                for(int z=0; z<3; z++){
                    System.out.println(name[z]+"  "+cost[z]+" "+exist[z]);
                }
                break;
            
            case 3:
                System.out.println("Nombre de articulo: ");
                search=leer.next();
                for(int z=0;z<3;z++){
                    if(name[z].equals(search)){
                        System.out.println("cuanto compraste: ");
                        comp=leer.nextInt();
                        exist[z]=exist[z]+comp;
                        
                    }//if
                }//for
        break;
        
            case 4:
                
                int vent;
                System.out.println("SALIDA DE DATOS DEL ALMACEN");
                System.out.println("Nombre del articulo");
                search=leer.next();
                for(x=0;x<3;x++){
                     if(name[x].equals(search)){
                         System.out.println("Cuantos salen del almacen");
                         vent=leer.nextInt();
                         exist[x]=exist[x]-vent;
                     }
                }
        break;  
        case 5:
            int bext;
            System.out.println("da el numero de existencias que quieres buscar");
            bext=leer.nextInt();
            for (x=0;x<3;x++) {
                if (exist[x]>=bext) {
                    System.out.println("articulos con existencias cero: "+name[x]);
                    
                }
            
                
            }
            break;
        case 6:
            int cont=0;
            for (int i = 0; i < 3; i++) {
                cont=0;
            for (int y=0;y< 3;y++) {
                if (cost[i]>=cost[y]) {
                    cont++;
                    
                }
                if(cont==3){
                    System.out.println("el mas caro es: "+name[i]+"  "+cost[i]+"$");
                    break;
                }
            }    
            }
            break;
            default:System.out.println("Tas meco");
        }
        
        
    }while(op!=7);   
}
}