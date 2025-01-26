package elwalmart;
import java.util.Scanner;
public class Elwalmart {
Scanner read=new Scanner (System.in);
 int a=0; int b=0; int c=0;
   int f, x=9; int i=1; int conta=0; int j=25; int y=8; int r1=0; int r2=0; int r3=0; int espera; int esp=1;int v1=1; int v2=2; int v3=3;
int Cola1[]=new int[x]; int c1=0; int p1=-1; int e1=p1+1;
int Cola2[]=new int[y]; int c2=0; int p2=-1; int e2=p2+1;
int Cola3[]=new int[y]; int c3=0; int p3=-1; int e3=p3+1;
int Espera[]=new int[100]; 
void LLenado_rapido(){
    
    for (int k = 0; k <x-1; k++) {
        p1++; e1++;
        Cola1[p1]=v1;
        v1=v1+3;
        r1++;
    }
   // System.out.println(" "+(v-1));
     for (int k = 0; k <y; k++) {
        p2++; e2++;
        Cola2[p2]=v2;
        v2=v2+3; r2++;
    }
     // System.out.println(" "+(v-1));
     for (int k = 0; k <y; k++) {
        p3++; e3++;
        Cola3[p3]=v3;
        v3=v3+3; r3++;
    } 
     f=j-r2-r3-r1;
     System.out.println("Quedan "+f+" Carros disponibles");
      //System.out.println(" "+(v-1));
}
void Entra_de_one(){
   
    int conta1=1; int conta2=1; int conta3=1;  
    System.out.println("Fila menos disponible");
    i=read.nextInt();
    if (Cola1[x-1]<25) {
            if (i==1) {
        for (int k = 0; k < x; k++) {
            
             conta1++;
            if (conta1==x) {
           System.out.println("Entro cliente fila 1");
           Cola1[x-1]=v1;
           f--;
           break;
            }
            }
}
    }else{
        System.out.println(" cola llena ");a=1;
    }
    
    if (Cola2[y-1]<23) {
         if (i==2) {
        for (int k = 0; k < x; k++) {
            
             conta2++;
            if (conta2==x) {
           System.out.println("Entro cliente fila 2");
           Cola2[x-1]=v2;
           f--;
           break;
            }
            }
}
    }else{
        System.out.println("Fila llena "); b=1;
    }
    
    if (Cola3[y-1]<24) {
            if (i==3) {
        for (int k = 0; k < x; k++) {
            
             conta3++;
            if (conta3==x) {
           System.out.println("Entro cliente fila 3");
           Cola3[x-1]=v3;
           f--;
           break;
            }
            }
}
    }
    else{
        System.out.println("Fila llena"); c=1;
    }
    
    if (a==1 && b==1 && c==1) {
            System.out.println("No hay carros");
}
}
void Avanza_Ahora_si_weon(){
    System.out.println("Carritos disponibles "+f);
    if (f==0 && conta==0) {
        System.out.println("Espera tu carrito");
        conta=1; f=3;   
    }
    else{
        System.out.println("Aprovecha y agarra tu carrito");
        conta=0; f=0;
        
         int conta1=1; int conta2=1; int conta3=1; 
    if (i==1) {
        for (int k = 0; k < x; k++) {
            Cola1[k]=Cola1[k+1];
             conta1++;
            if (conta1==x) {
           System.out.println("Entro cliente fila 1");
           Cola1[x-1]=esp;
           esp++; i=2;
           break;
            }
            }
}
        if (i==2) {
        for (int k = 0; k < y; k++) {
            Cola2[k]=Cola2[k+1];
             conta2++;
            if (conta2==y) {
          System.out.println("Entro cliente fila 2");
           Cola2[y-1]=esp;
           esp++; i=3;
           break;
            }
            }
}
            if (i==3) {
        for (int k = 0; k < y; k++) {
            Cola3[k]=Cola3[k+1];
             conta3++;
            if (conta3==y) {
          System.out.println("Entro cliente fila 3");
           Cola3[y-1]=esp; 
           esp++; i=1;
           break;
            }
            }
}
            System.out.println("carritos restantes "+f);
    }
}
void Mostrar(){
          System.out.println("Situacion actual de cola 1");
    for (int k = 0; k < x; k++) {
        System.out.print(" "+Cola1[k]);
    }
    System.out.println(" ");
    //  System.out.println("_____________________________2_____________________________");
    System.out.println("Situacion actual de cola 2");
    for (int k = 0; k < y; k++) {
        System.out.print(" "+Cola2[k]);
    }
    System.out.println(" ");
     //  System.out.println("_____________________________3_____________________________");
    System.out.println("Situacion actual de cola 3");
    for (int k = 0; k < y; k++) {
        System.out.print(" "+Cola3[k]);
    }
    System.out.println(" ");           
}
    public static void main(String[] args) {
   Scanner read=new Scanner (System.in);
   Elwalmart obj=new Elwalmart();
int op=0;
       do{
        System.out.println("1.- Llenar rapido"); 
        System.out.println("2.- Avanza la cola");
        System.out.println("3.- The one");
        System.out.println("4.- Mostrar situacion de la fila");
        System.out.println("5.- Salir");
        System.out.println("Elije una opcion");
        op=read.nextInt();
        switch(op){
            case 1: obj.LLenado_rapido(); obj.Mostrar(); break;
            case 2: obj.Avanza_Ahora_si_weon();  break;
            case 3: obj.Entra_de_one(); break;
            case 4: obj.Mostrar(); break;
        }
    }while(op!=5);
       }
}