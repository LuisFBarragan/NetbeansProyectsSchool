
package banco;

import java.util.Scanner;

public class Banco {
    

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
      int n,op=0,buscarc;
      String buscar;
      double d;
        System.out.println("# clientes ingresara");
        n=leer.nextInt();
      int [] cuenta=new int[n];
      String [] nombre=new String[n];
      double [] saldo=new double[n];
      while(op!=9){
          System.out.println("1.-almacenar datos");
          System.out.println("2.-modificar datos");
          System.out.println("3.-mostrar los datos de un cliente");
          System.out.println("4.-eliminar datos de un cliente");
          System.out.println("5.-deposito en la cuenta");
          System.out.println("6.-retiros en la cuenta");
          System.out.println("7.-mostrar todos los datos almacenados");
          System.out.println("8.-reporte de saldos mayores de un numero leido de teclado");
          System.out.println("9.-salir");
          op=leer.nextInt();
          switch(op){
              case 1:
                  for(int x=0;x<n;x++){
                      System.out.println("dame el numero de cuenta para el casillero "+x);
                      cuenta[x]=leer.nextInt();
                      System.out.println("dame el nombre del cliente para el casillero "+x);
                      nombre[x]=leer.next();
                      System.out.println("da el saldo del cliente para el casillero "+x);
                      saldo[x]=leer.nextDouble();
                  }
                  break;
              case 2:
                  System.out.println("da el nombre del cliente");
                  buscar=leer.next();
                  for(int x=0;x<n;x++){
                      if(nombre[x].equals(buscar)){
                          System.out.println("encontrado en el casillero "+x);
                          System.out.println(cuenta[x]+"  "+nombre[x]+"   "+saldo[x]);
                          System.out.println("da nueva cuenta");
                          cuenta[x]=leer.nextInt();
                          System.out.println("da el nombre nuevo");
                          nombre[x]=leer.next();
                          System.out.println("da el saldo nuevo");
                          saldo[x]=leer.nextDouble();
                      }
                  }
                  break;
              case 3:
                  System.out.println("da el nombre del cliente");
                  buscar=leer.next();
                  for(int x=0;x<n;x++){
                      if(nombre[x].equals(buscar)){
                          System.out.println("encontrado en el casillero "+x);
                          System.out.println(cuenta[x]+"  "+nombre[x]+"   "+saldo[x]);
                      }
                  }
                  break;
              case 4:
                  System.out.println("da el nombre del cliente");
                  buscar=leer.next();
                  for(int x=0;x<n;x++){
                      if(nombre[x].equals(buscar)){
                          System.out.println("encontrado en el casillero "+x);
                          System.out.println(cuenta[x]+"  "+nombre[x]+"   "+saldo[x]+"$");
                          cuenta[x]=0;
                          nombre[x]="         ";
                          saldo[x]=0;
                      }
                  }
                  break;
              case 5:
                  System.out.println("introduce el numero de cuenta");
                  buscarc=leer.nextInt();
                   for(int x=0;x<n;x++){
                       if(cuenta[x]==buscarc){
                           System.out.println("su saldo es de "+saldo[x]+"$");
                           System.out.println("introduce cantidad a depositar");
                  d=leer.nextDouble();
                  saldo[x]=saldo[x]+d;
                           System.out.println("el saldo es de "+saldo[x]);
                       }
                   }
                   break;
              case 6:
                  System.out.println("introduce el numero de cuenta");
                  buscarc=leer.nextInt();
                   for(int x=0;x<n;x++){
                       if(cuenta[x]==buscarc){
                          System.out.println("el saldo es de "+saldo[x]+"$");
                           System.out.println("introduce cantidad a retirar"); 
                           d=leer.nextDouble();
                           saldo[x]=saldo[x]-d;
                           System.out.println("le saldo actual es de "+saldo[x]);
                       }
                       }
                   break;
              case 7:
                  System.out.println("los datos almacenados son");
                  for(int x=0;x<n;x++){
                      System.out.println(cuenta[x]+"      "+nombre[x]+"      "+saldo[x]);
                  }
                  break;
              case 8:
                  System.out.println("introduce saldo base");
                  d=leer.nextDouble();
                  for(int x=0;x<n;x++){
                      if(saldo[x]>=d){
                          System.out.println(cuenta[x]+"     "+nombre[x]+"      "+saldo[x]);
                      }
                  }
          }
      }
    }
    
}
