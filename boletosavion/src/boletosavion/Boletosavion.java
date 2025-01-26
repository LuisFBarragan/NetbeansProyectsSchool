package boletosavion;

import java.util.Scanner;

interface Base{
    void metodo();
    String [] persona=new String[10];
    String [] pais=new String [10];
    double [] precio=new double[10];
    String [] tipo=new String[10];
    double [] importe=new double[10];
    Scanner leer=new Scanner(System.in);
}//
class llenado implements Base{
    public void metodo(){
        for (int i = 0; i < 10; i++) {
            persona[i]="";
            pais[i]="";
            precio[i]=0;
            tipo[i]="";
            importe[i]=0;
        }
    }
}
    class registrar implements Base{
        public void metodo(){
           int cont=0;
            for (int i = 0; i < 10; i++) {
                 
                if(persona[i].equals("")){
                    
                System.out.println("ingrese nombre del cliente");
                persona[i]=leer.next();
                System.out.println("ingrese el destino del vuelo: Paris,Brasil,Italia,Korea");
                pais[i]=leer.next();
                if (pais[i].equals("paris")||pais[i].equals("Paris")) {
                    precio[i]=5000;
                }
                if (pais[i].equals("brasil")||pais[i].equals("Brasil")) {
                    precio[i]=7500;
                }
                if (pais[i].equals("italia")||pais[i].equals("Italia")) {
                    precio[i]=7000;
                }
                if (pais[i].equals("korea")||pais[i].equals("Korea")) {
                    precio[i]=10000;
                }
                    System.out.println("ingrese el tipo de boleto: adulto, mayor,niño");
                    tipo[i]=leer.next();
                    if(tipo[i].equals("adulto")){
                        importe[i]=precio[i];
                    }
                    if(tipo[i].equals("mayor")){
                        importe[i]=precio[i]*0.7;
                    }
                    if(tipo[i].equals("nino")){
                        importe[i]=precio[i]*0.5;
                    }
                    cont=1;
            }
                if(cont==1)
                break;
            }
        }
    }//registrar
class consulta implements Base{
    public void metodo(){
        System.out.println("precios de vuelos");
        System.out.println("paris: $5000     brasil: $7500    italia: $7000   korea: $10000");
        System.out.println("decuentos");
        System.out.println("mayores: 30%    niños:50%");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+persona[i]+"  "+pais[i]+"  $"+precio[i]+"   "+tipo[i]+"  $"+importe[i]);
        }
    }
}//consulta
class reiniciar implements Base{
    public void metodo(){
        for (int i = 0; i < 10; i++) {
            persona[i]="";
            pais[i]="";
            precio[i]=0;
            tipo[i]="";
            importe[i]=0;
        }
    }
}

public class Boletosavion {
    public static void main(String[] args) {
       llenado objeto0=new llenado();
       registrar objeto1=new registrar();
       consulta objeto2=new consulta();
       reiniciar objeto3=new reiniciar();
       Scanner leer=new Scanner(System.in);
       int opcion=0;
       objeto0.metodo();
       do{
           System.out.println("1.-reservacion de boleto");
           System.out.println("2.-consulta sobre la venta de boletos");
           System.out.println("3.-reiniciar venta de boletos");
           System.out.println("4.-salir");
           System.out.println("elige una opcion");
           opcion=leer.nextInt();
           switch(opcion){
               case 1:
                   objeto1.metodo();
                   break;
               case 2:
                   objeto2.metodo();
                   break;
               case 3:
                   objeto3.metodo();
                   break;
           }
       }while(opcion!=4);
           
    }
    
}
