package avion2;
import java.util.Scanner;

interface Avion{
    void metodo(); 
      String[] asiento=new String[5]; 
      String[] pais=new String[5];
      String[] tipo=new String[5];
      double[] pre=new double[5];
      double[] pagar=new double[5];
}
class Reser implements Avion{
    public void metodo(){
      Scanner leer=new Scanner(System.in);
      double boleto;
      asiento[0]="Vac";
      asiento[1]="Vac";
      asiento[2]="Vací";
      asiento[3]="Vac";
      asiento[4]="Vac";
      
      
        for (int i = 0; i < 5; i++) {
            if(asiento[i].equals("Vac")){
            asiento[i]="Ocu";
            System.out.println("Elije el pais de destino (Paris/Brasil/Italia/Corea)"); 
            pais[i]=leer.next();
            if (pais[i].equals("Paris")) {
                pre[i]=5000;
        }
                if(pais[i].equals("Brasil")){
                pre[i]=7500;
            }
                if (pais[i].equals("Italia")) {
                    pre[i]=7000;
                }
                    if (pais[i].equals("Corea")) {
                        pre[i]=10000;
            }
                    System.out.println("Tipo de persona que compra");
                    System.out.println("Adulto-normal/Adulto-mayor/Niño");
                    tipo[i]=leer.next();
            }
            break;
        }
            for (int i = 0; i < 10; i++) {
                if(tipo[i].equalsIgnoreCase("Adulto")){
                    pagar[i]=pre[i];
                }
                    if (tipo[i].equals("Adulto-mayor")) {
                    boleto=pre[i]*0.30;
                        pagar[i]=boleto;
            }
                    if (tipo[i].equals("Niño")) {
                    boleto=pre[i]*0.50;
                        pagar[i]=boleto;
            }
                    break;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Destino: "+pais[i]);
            System.out.println("Total a pagar: $"+pagar[i]);
            System.out.println("Tipo de boleto: "+tipo[i]);
            
            
            break;
        }
}
}
class Mostrar implements Avion{
    public void metodo(){
        int Nohay=0, Sihay=0;
        for (int i = 0; i < 10; i++) {
            if (asiento[i].equals("Ocu")) {
                Nohay++;
            }
            else{
            
                Sihay++;
            }
        }
        System.out.println("Hay "+Sihay+" luagres disponibles");
        System.out.println("Hay "+Nohay+" lugares ocupados");
    }
}
class Reset implements Avion{
    public void metodo(){
        for (int i = 0; i < 10; i++) {
            if (asiento[i].equals("Ocu")) {
                asiento[i]="Vac";
                pais[i]=" ";
                pagar[i]=0;
                tipo[i]=" ";
               pre[i]=0;
            }
        }
    }
}
public class Avion2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Reser obj1=new Reser();
        Mostrar obj2=new Mostrar();
        Reset obj3=new Reset();
        int op=0;
        do{
            System.out.println("1. Reservación");
            System.out.println("2. Mostrar");
            System.out.println("3. Reset");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción");
            op=leer.nextInt();
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
        } while (op!=4);
    }
}