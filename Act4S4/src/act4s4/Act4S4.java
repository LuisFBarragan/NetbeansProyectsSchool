package act4s4;
import java.util.Scanner;
class operaciones{
    double sum,rest, mult; double x,y;
    double div;
    public operaciones(double sum,double rest,double mult,double div){
        this.sum=sum;
        this.rest=rest;
        this.mult=mult;
        this.div=div;
    }
    Scanner read=new Scanner(System.in);
    void llenar(){
        
        System.out.println("Da el 1er valor");
        x=read.nextDouble();
        System.out.println("Da el 2er valor");
        y=read.nextDouble();
}
    void suma(){
        sum=x+y;
        System.out.println("R: "+sum);
    }
    void resta(){
        rest=x-y;
        System.out.println("R: "+rest);
    }
    void multiplicación(){
        mult=x*y;
        System.out.println("R: "+mult);
    }
    void división(){
        div=x/y;
        System.out.println("R: "+div);
    }
}
public class Act4S4 {

    public static void main(String[] args) {
 operaciones obj=new operaciones(0,0,0,0);
  Scanner read=new Scanner(System.in);
int op;
  do {
            System.out.println("1.- llenar");
            System.out.println("2.- sumar");
            System.out.println("3.- restar");
            System.out.println("4.- multiplicar");
            System.out.println("5.- dividir");
            System.out.println("6.- salir");
            System.out.println("elije");
            op=read.nextInt();
            switch(op){
                case 1: obj.llenar(); break;
                case 2: obj.suma(); break;
                case 3: obj.resta(); break;
                case 4: obj.multiplicación(); break;
                case 5:obj.división(); break;
            }
        } while (op!=6);
        
    }
    
}
