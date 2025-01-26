package act5s3;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
class Años{
    int dia,año,mes;
    Años(int dia,int mes,int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    Scanner sca=new Scanner(System.in);
    void CalcularEdad(int dia,int año,int mes){
          try{
        System.out.println("Da el dia de nacimiento");
       dia=sca.nextInt();   
        if (dia>31 || dia<1) {
                throw new Exception("el día está mal puesto");
            }
        System.out.println("Da el mes de nacimiento");
         mes=sca.nextInt();
            if (mes>12 || mes<01) {
                throw new Exception("el mes está mal puesto");
            }
        System.out.println("Da el año");
         año=sca.nextInt();
            if(año<1 || año>2019){
                throw new Exception("el año que pusiste no se puede");
            }
    }
        catch(Exception x){
        System.out.println("Ha habido un error " + x);
    } 
        Calendar cal = new GregorianCalendar();
           int mesActual = cal.get(Calendar.MONTH);
           int añoActual = cal.get(Calendar.YEAR);
           int diaActual = cal.get(Calendar.DATE);
           int mesResultado, diaResultado;
           int añoResultado,añoResultado2;  
           mesResultado = Math.abs((mesActual)-mes);
           diaResultado = Math.abs(diaActual-dia);
           añoResultado =Math.abs(añoActual-año);
           añoResultado2=añoResultado-1;
            if(mesActual>mes){
           System.out.println("Tienes " + añoResultado + " años" + ", " + añoResultado2
                    + " meses " + " y " + diaResultado + " días");
        }
            else{
                   System.out.println("Tienes " + (añoResultado-2) + " años" + ", " + mesResultado
                    + " meses " + " y " + diaResultado + " días"); 
                }   
    }
   void Año6(){ 
       if (año%4==0) {
           System.out.println("Naciste en año bisiesto");
       }
       else{
           System.out.println("No naciste en año bisiesto");
       }
   }
}
public class Act5S3 {
    public static void main(String[] args) {
 Scanner sca=new Scanner(System.in);
  Años obj=new  Años(17,9,2002);
 int op=0;  int dia=0,año=0,mes=0;
        do {
        System.out.println("1.- Calcular edad");
        System.out.println("2.- Averiguar si naciste en año 4");
        System.out.println("3.- Salir");
        System.out.println("Elije");
        op=sca.nextInt();
        switch(op){           
            case 1:
                obj.CalcularEdad(dia, mes, año);
                break;
            case 2: 
                obj.Año6();
                break;
        }
        } while (op!=3);       
        }
    }