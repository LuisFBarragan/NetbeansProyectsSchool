
package revector;

import java.util.Scanner;

interface Base {
    void metodoVector();
        int[] estatura=new int[5];
       Scanner read=new Scanner(System.in);
    }
class Vector1 implements Base{
    public void metodoVector(){
        int e=1;
        for (int i = 0; i < 5; i++) {
            System.out.println(" da la estatura de casillero"+e);
            estatura[i]=read.nextInt();
        }
    }
}
class Vector2 implements Base{
    public void metodoVector(){
        for (int i = 0; i < 5; i++) {
         System.out.println("["+i+"]"+estatura[i]);
        }
    }
}
class Vector3 implements Base{
    public void metodoVector(){
        int sum=0; double prom;
        for (int y = 0; y < 5; y++) {
    sum=sum+estatura[y];       
    }
    prom=sum/5;
     System.out.println("La media es "+prom);
    for (int x = 0; x < 5; x++) {
        if(estatura[x]>prom){      
         System.out.println("Los mayores a la media son: "+x+"]"+estatura[x]);  
    }
    }
    for (int z = 0; z < 10; z++) {
        if(estatura[z]<prom){        
         System.out.println("Los menores a la media son:  "+z+" "+ estatura[z]);
    }
}
    }}
class Vector4 implements Base{
    public void metodoVector(){
        int busc;
        System.out.println("ingresa edad a buscar");
        busc=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if(estatura[i]==busc){
                System.out.println("se encontro en el casillero "+i+" "+estatura[i]);
            }//if
            else{
                System.out.println("no se encontro");
            }
        }
    }
}
class Vector5 implements Base{
    public void metodoVector(){
        int rep, c=0;
        System.out.println("ingresa edad");
        rep=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if(estatura[i]==rep){
                c++;
            }
        }
        System.out.println("se encontro "+c+" veces");
    }    
}
class Vector6 implements Base{
    public void metodoVector(){
        int elim;
        System.out.println("ingresa edad a eliminar");
        elim=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if (estatura[i]==elim) {
               estatura[i]=0;
            }
        }
    }
}
class Vector7 implements Base{
    public void metodoVector(){
        int bus;
        System.out.println("ingresa dato a modificar");
        bus=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if(estatura[i]==bus){
                System.out.println("ingresa edad nueva");
                estatura[i]=read.nextInt();
            }
        }
    }//metodo
}//derivada6
class Vector8 implements Base{
    public void metodoVector(){
        for (int i = 4; i >= 0; i--) {
            System.out.println(""+estatura[i]);
        }
    }
}

public class Revector {
    public static void main(String[] args) {
 Scanner read=new Scanner(System.in);    
        int op;
        Vector1 objeto1=new Vector1();
        Vector2 objeto2=new Vector2();
        Vector3 objeto3=new Vector3();
        Vector4 objeto4=new Vector4();
        Vector5 objeto5=new Vector5();
        Vector6 objeto6=new Vector6();
        Vector7 objeto7=new Vector7();
        Vector8 objeto8=new Vector8();
         do{
            System.out.println("1.- llena - prom < y >");   
            System.out.println("2.- mostrar");
            System.out.println("3.-  prom < y >");
            System.out.println("4.- buscar");
            System.out.println("5.- repetido");
            System.out.println("6.- eliminar"); 
            System.out.println("7.- modificar");
            System.out.println("8.- inversa");
            System.out.println("9.- salir");
            System.out.println("elije");
            op=read.nextInt();
            switch(op){
                case 1:
       objeto1.metodoVector();
        break;
                case 2:
        objeto2.metodoVector();
        break;
                case 3:
        objeto3.metodoVector();
        break;
                case 4:
        objeto4.metodoVector();
        break;
                case 5:
        objeto5.metodoVector();
        break;
                case 6:
        objeto6.metodoVector();
                    break;
                case 7:
                    objeto7.metodoVector();
                    break;
                case 8:
                    objeto8.metodoVector();
                    break;
        }
    }while(op!=8);
    }
}