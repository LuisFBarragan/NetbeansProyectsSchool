
package fofa;

import java.util.Scanner;

public class Fofa {
static Scanner leer=new Scanner (System.in);
String name;
int longitud,c=0;
double [] vent=new double [5];
double [] com=new double [5];
void cadena(){
    System.out.println("dame un nombre");
    name=leer.next();
    longitud=name.length();
    for(int i=0;i<longitud;i++){
        if((name.charAt(i)=='a')||(name.charAt(i)=='e')||
        (name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u')){
           c++; 
            System.out.println("se encontro en el casillero "+i);
        }
    }
   
    System.out.println("se repite "+c+" veces");
}
  void two(){
      int limit;
      System.out.println("ingrese el limite");
      limit=leer.nextInt();
      for(int n=1;n<=limit;n++){          
          for (int x=1;x<=n;x++){
              System.out.print(x+" ");
          }
          System.out.println(" ");
      }
}
  void com(){
      for(int x=0;x<5;x++){
          System.out.println("ingresa ventas del vendedor "+x);
          vent[x]=leer.nextDouble();
          if(vent[x]<3000){
              com[x]=vent[x]*0.03;
          }
          else{
              if(vent[x]<5000){
                com[x]=vent[x]*0.04;  
              }
              else{
                  if(vent[x]<7000){
                     com[x]=vent[x]*0.05;   
                  }
                  else{
                      com[x]=vent[x]*0.06;  
                  }
              }
          }
      }
      for(int x=0;x<5;x++){
          System.out.println(vent[x]+"  "+com[x]);
      }
  }
  void sum(){
      int cont=0,num=0,sum=0,prom;
      while(num!=-999){
          System.out.println("ingresa # a sumar");
          num=leer.nextInt();
          if(num==-999){
              break;
          }
          sum=sum+num;
          cont++;
      }
      prom=sum/cont;
      System.out.println("la suma es de: "+sum);
      System.out.println("el promedio es de: "+prom);
  }
  void pinitobonito(){
      int aste;
      System.out.println("ingrese numero de asteriscos");
      aste=leer.nextInt();
      for(int n=0;n<aste;n++){
          for(int x=0;x<=n;x++){
              System.out.print("*");
          }
          System.out.println("");
      }
  }
 
      
  void calendario(){
            String[][] di=new String [1][7];
            int[][] dias=new int [6][7];            
            int d,x,sum=0;
            String m;
            System.out.println("Dame el mes");
            m=leer.next();
            System.out.println("En que dia de la semana empieza el mes?");
            d=leer.nextInt();
            System.out.println("Cuantos dias tiene el mes");
            x=leer.nextInt();            
            di[0][0]="Lu";
            di[0][1]="Ma";
            di[0][2]="Mi";
            di[0][3]="Ju";
            di[0][4]="Vi";
            di[0][5]="Sa";
            di[0][6]="Do";
            for (int i = 1; i < 1; i++) {
                for (int j = 1; j < d; j++) {
                    dias[i][j]=0;
                }
            }            
            for (int i = 0; i < 6; i++) {
                for (int j = d; j < 7; j++) {
                    sum=sum+1;
                    dias[i][j]=sum;
                    if(sum==x){
                        sum=0;
                    }
                }
                d=0;
            }
            System.out.println("Dame el mes");
            m=leer.next();
            System.out.println(m);
            for (int i = 0; i < 1; i++) {
                System.out.println("");
                for (int j = 0; j < 7; j++) {
                    System.out.print(di[i][j]+" ");
                }
            }
            for (int i = 0; i < 6; i++) {
                System.out.println("");
                for (int j = 0; j < 7; j++) {                    
                    if(dias[i][j]<10){
                        System.out.print("0"+dias[i][j]+" ");
                    }
                    else{
                        System.out.print(dias[i][j]+" ");
                    }
                }
            }
            System.out.println("");
        }

    public static void main(String[] args) {
      Fofa objeto=new Fofa();
        int op=0;
        do{
            System.out.println("1.- veces se repite una vocal en una variable");
            System.out.println("2.-numeros sucesivos");
            System.out.println("3.-comision de venta");
            System.out.println("4.-suma de n numeros hasta que llegue -999");
            System.out.println("5.-pino de asteriscos");
            System.out.println("6.-calendario");
            System.out.println("7.-salir");
            System.out.println("elige una opcion");
            op=leer.nextInt();
            switch(op){
                case 1:
                    objeto.cadena();
                    break;
                case 2:
                     objeto.two();
                    break;
                case 3:
                      objeto.com();
                    break;
                case 4:
                    objeto.sum();
                    break;
                case 5:
                    objeto.pinitobonito();
                    break;
                case 6:
                    objeto.calendario();
                    break;
            }
        }while(op!=6);
    }
    }
