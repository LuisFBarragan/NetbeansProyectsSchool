package avion;
import java.util.Scanner;
interface  Avion2{
    void metodo();
    Scanner read=new Scanner(System.in);
    String [] aciento=new String[5];
    String [] pais=new String[5];
    String[] clase=new String[5];
    double[] precio=new double[5];
     double[] precio2=new double[5];

}
class Lol1 implements Avion2{
public void metodo(){
int comp,a=0, vas, persona,x; double cost, se, pagar; 
String tipo;   
    for (int i = 0; i < 5; i++) {
        aciento[i]="v";
      }
    System.out.println("cuantos asientos");
    x=read.nextInt();
    for (int i = 0; i < x; i++) {
        if(aciento[i].equals("v")){
           aciento[i]="o";   
        System.out.println("paris=1, brasil=2, italia=3, korea=4");
        System.out.println("a donde vas?");
        vas=read.nextInt();    
        if(vas==1){
            cost=5000;
            System.out.println("el precio del boleto es: "+cost);
            pais[i]="Paris"; precio[i]=cost;
        }
            if(vas==2){
                cost=7500; System.out.println("el precio del boleto es: "+cost); 
                pais[i]="Brasil";  precio[i]=cost;
            }   
                if(vas==3){
                    cost=7000;  System.out.println("el precio del boleto es: "+cost); 
                    pais[i]="Italia";  precio[i]=cost;
                }
                if(vas==4){
                    cost=10000; 
                    System.out.println("el precio del boleto es: "+cost); 
                    pais[i]="Korea";  precio[i]=cost;
                }
          
           
                System.out.println("tipo de persona que compra");
            System.out.println("adulto=1, adulto_mayor(30%)=2, niño(50%)=3");
            persona=read.nextInt();
            if (persona==1) {      
                System.out.println("total "+precio[i]); 
                clase[i]="adulto-normal";
                precio2[i]=precio[i];
            }
           
                if (persona==2) {
                    
                    System.out.println("total "+precio[i]); 
                     clase[i]="adulto_mayor";
                     pagar=precio[i]*0.30;
                        se=precio[i]-pagar;
                        precio2[i]=pagar;
                
                    } 
                    if (persona==3) {
                        pagar=precio[i]*0.50;
                        se=precio[i]-pagar;
                        precio2[i]=pagar;
                        System.out.println("total "+precio2[i]);
                         clase[i]="Niño";
                    }
            
            }
        
    }
    for (int i = 0; i < x; i++) {
    System.out.println("Destino: "+pais[i]);
    System.out.println("Precio del paseje: "+precio[i]);
    System.out.println("Tipo: "+clase[i]);
    System.out.println("Total a pagar: "+precio2[i]);
    }    
}
}
       
class Lol2  implements Avion2{
public void metodo(){
    int ocu=0, vaci=0;
    for (int i = 0; i <5; i++) {
        if (aciento[i].equals("o")) {
                ocu++;
            }
            if (aciento[i].equals("v")) {
                vaci++;
            }
    }
    System.out.println( "luagres ocupados: "+ocu);
        System.out.println( "lugares disponibles: "+vaci);
}
}
class Lol3  implements Avion2{
public void metodo(){
for (int i = 0; i < 5; i++) {
            if (aciento[i].equals("o")) {
                aciento[i]="v";
                pais[i]=" ";
                precio[i]=0;
                clase[i]=" ";
                
            }
        }
}
}
public class Avion {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Lol1 obj1=new Lol1();
        Lol2 obj2=new Lol2();
        Lol3 obj3=new Lol3();
        int op=0;
        do{
            System.out.println("1.- reservacion");
            System.out.println("2.- consulta");
            System.out.println("3.- reset");
            System.out.println("4.- salir");
            System.out.println("elije opcion");
            op=read.nextInt();
            switch(op){
                case 1:
                    obj1.metodo();
                    break;
                case 2:
                    obj2.metodo();
                    break;
                case 3:
                    obj3.metodo();
                    break;
            }
        }while(op!=4);
    }
    
}