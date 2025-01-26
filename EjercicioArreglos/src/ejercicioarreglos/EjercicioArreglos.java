package ejercicioarreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioArreglos {
    int[][] matriz =new int[3][3];
    Scanner input = new Scanner(System.in);
    void llenar(){
        try{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese un numero");
                    matriz[i][j]=input.nextInt();   
                    if(matriz[i][j]<100){
                    throw new Exception("NUMERO INVALIDO menor a 100");
                    }
                }
                }
            }
        catch(Exception e){
            System.out.println("numero invalido   "+e);
        }
        
        }
    
    void mostrar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(""+matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    void mayor(){
        int may=0,pos1=0,pos2=0; 
        may=matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]>may){
                may=matriz[i][j];
                pos1=i;
                pos2=j;
                }
            }
        }
        System.out.println("El mayor es: "+may+" en la posicion ["+pos1+","+pos2+"]");
    }
    public static void main(String[] args) {
       BufferedReader inBuff=new BufferedReader(new InputStreamReader(System.in));
       Scanner input = new Scanner(System.in);
       EjercicioArreglos obj = new EjercicioArreglos();
       int op;
        do{
        System.out.println("MATRIZ");
        System.out.println("1.-Llenar");
        System.out.println("2.-Mostrar");
        System.out.println("3.-Valor mayor y su pos.");
        System.out.println("4.-Salir");
        System.out.println("Seleccione una opcion:");
        op=input.nextInt();
        switch(op){
            case 1:
                obj.llenar();
                break;
            case 2:
                obj.mostrar();
                break;
            case 3:
                obj.mayor();
                break;
        }
        }while(op!=4);
    }
    
}
