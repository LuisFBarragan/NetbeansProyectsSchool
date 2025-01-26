
package tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
double search, prom=0;
int n, i, op, c=0, m, co=0, mo ;
        System.out.println("cantidad de estaturas ");
        n=leer.nextInt();
        double [] estatura=new double [n];
        do{
            System.out.println("1.- almacenar");
            System.out.println("2.- mostrar");
            System.out.println("3.- buscar ");
            System.out.println("4.- cual es la esatura mayor");
            System.out.println("5.- cual es la estatura menor");
            System.out.println("6.- Promedio");
            System.out.println("7.- fin");
            System.out.println("selecciona una opcion");
            op=leer.nextInt();
            switch(op){
                case 1:
                    for (i=0; i<n; i++){
                    System.out.println("da las estaturas para el casillero"+i);
                    estatura [i]=leer.nextDouble();
                    }
                    break;
                case 2:
                    System.out.println("datos del vector ");
                    for(i=0; i<n; i++){
                        System.out.println(" "+estatura[i]);
                        
                    }
             break;
                case 3:
                    System.out.println("ingresa estatura a buscar");
                    search=leer.nextDouble();
                    for(i=0; i<n; i++){
                        if(estatura[i]==search){
                            System.out.println("encontrados en el casillero "+i);
                            c=c+1;
                            
                        }
                    }
                    System.out.println("se encontro "+c+" veces");
                    break;
                case 4:
                    for(int may=0; may<n; may++){
                        for(i=0; i<n; i++){
                            if(estatura [may]>=estatura[i]){
                                co=co+1;
                            }
                            else
                            {
                                break;
                            }
                        }
                       if(co==n){
                           System.out.println("el mayor es "+estatura[may]);
                           break;
                       }
                    }
                    break;
                case 5:
                    for(int men=0; men<n; men++){
                        int cont=0;
                        for(i=0;i<n;i++){
                            if(estatura [men]<=estatura [i]){
                                cont=cont+1;
                            }
                            else{
                                break;
                            }
                        }
                        if(cont==n){
                            System.out.println("el menor es "+estatura [men]);
                            break;
                        }
                    }
                    break;
                
                case 6:
                    double pro;
                    for(i=0; i<n; i++){
                        prom=prom+estatura [i];
                    }
                    double promf;
                    promf=prom/n;
                    System.out.println("el promedio es "+promf);
                    
                            break;

      
       
       }
    
            
            
            }
        while(op!=7);

    }
    
}
