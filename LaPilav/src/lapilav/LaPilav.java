package lapilav;
import java.util.Scanner;
public class LaPilav {
int x=3;
int [] pila1=new int[x];int [] pila2=new int[x];int [] pila3=new int[x];int [] pila4=new int[x];int [] pila5=new int[x];
int p1=-1,p2=-1,p3=-1,p4=-1,p5=-1;
void insertar(int i,int j){
   if(i==1){
       if(p1<x-1){
     p1++;
     pila1[p1]=j;
       }else
       System.out.println("se lleno la pila 1");
   }
   if(i==2){
     if(p2<x-1){
     p2++;
     pila2[p2]=j;
       }else
       System.out.println("se lleno la pila 2");  
   }
   if(i==3){
       if(p3<x-1){
     p3++;
     pila3[p3]=j;
       }else
       System.out.println("se lleno la pila 3");
   }
   if(i==4){
       if(p4<x-1){
     p4++;
     pila4[p4]=j;
       }else
       System.out.println("se lleno la pila 4");
   }
   if(i==5){
       if(p5<x-1){
     p5++;
     pila5[p5]=j;
       }   else
       System.out.println("se lleno la pila 5");
   }
}
void eliminar(int i,int j){
   if(i==-1){
      if(p1!=-1){
      if(pila1[p1]==j) {
          pila1[p1]=0;
          p1--;
      }else
               System.out.println("valor incorrecto ");
       }else
           System.out.println("pila 1 vacia");
   }
   if(i==-2){
        if(p2!=-1){
      if(pila2[p2]==j) {
          pila2[p2]=0;
          p2--;
      } else
               System.out.println("valor incorrecto ");
       } else
           System.out.println("pila 2 vacia");
   }
   if(i==-3){
        if(p3!=-1){
      if(pila3[p3]==j) {
          pila3[p3]=0;
          p3--;
      } else
               System.out.println("valor incorrecto ");
       }
       else
           System.out.println("pila 3 vacia");
   }
   if(i==-4){
        if(p4!=-1){
      if(pila4[p4]==j) {
          pila4[p4]=0;
          p4--;
      }else
               System.out.println("valor incorrecto");
       }else
           System.out.println("pila 4 vacia");
   }
   if(i==-5){
        if(p5!=-1){
      if(pila5[p5]==j) {
          pila5[p5]=0;
          p5--;
      }   else
               System.out.println("valor incorrecto");
       }  else
           System.out.println("pila 5 vacia");
   } 
}
void mostrar(){ 
    System.out.println("pila 1: ");
    for (int i = 0; i <= p1; i++) {
        System.out.print(" "+pila1[i]+",");
    }
    System.out.println("");
    System.out.println("pila 2: ");
    for (int i = 0; i <= p2; i++) {
        System.out.print(" "+pila2[i]+",");
    }
    System.out.println("");  
     System.out.println("pila 3: ");
    for (int i = 0; i <= p3; i++) {
        System.out.print(" "+pila3[i]+",");
    }
     System.out.println("");
     System.out.println("pila 4: ");
    for (int i = 0; i <= p4; i++) {
        System.out.print(" "+pila4[i]+",");
    }
     System.out.println("");
     System.out.println("pila 5: ");
    for (int i = 0; i <= p5; i++) {
        System.out.print(" "+pila5[i]+",");
    }
    System.out.println(" ");
     System.out.println("-------------------------------------------------");
}
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       LaPilav obj=new LaPilav();
       int op=0; int j=0,i=0;  
       do{
           System.out.println("1.- Insertar (eliminar if -)");
           System.out.println("2.- Mostrar");
           System.out.println("3.- Salir");
           op=read.nextInt();
           switch(op){
               case 1:
                   System.out.println("Da el valor de i");
                   i=read.nextInt();
                   System.out.println("Da el valor de j");
                   j=read.nextInt();
                   if(i>0 && i<6){
                       obj.insertar(i, j);
                   }
                   else{
                   if(i<0 && i>-6){
                       obj.eliminar(i, j);
                   } else{
                      System.out.println("no valido");
                   }
                   }
                   break;
               case 2:
                   obj.mostrar();
                   break;
           }           
       }while(op!=3);
    }   
}