package tiposdemetodos100realnofake;
import java.util.Scanner;
class calculadora{        
    int n1;
    int n2;
    calculadora (int n1, int n2){
        this.n1=n1;
        this.n2=n2;        
    }//constructor   
   public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    double potencia(){
        return Math.pow(n1, n2);
    }
    
    long resta(int x){
        long r=getN1()-x;
        return r;
    }//long resta
    
    float redondeo(double x){
        float redondo=Math.round(x);
        return Math.round(x);
    }//floatredon
    
    double suma(int num1, int num2){
        return num1+num2;
    }//sum    
    String cadena(){
        String cad1=" ";
        for (int i = 0; i < 2; i++) {
            cad1=cad1+"grupo de poo ";
        }//for
        return cad1;
    }//string    
    byte bitee(){
        if(getN1()!=getN2())
            return 1;
        else
            return 0;
    }//byte
    boolean boleano(){
        if(getN1()!=getN2())
            return true;
        else
            return false;
    }//bolean   
    char caracter(){
        char carac= (char) getN1();
        return carac;
    }//char   
    int valorAscii(){
        int valorascii= (int) caracter();
        return valorascii;
    }//int    
    double tarea(double num1){
     double c=0;      
     c=num1;
        for (int i=1 ; i<num1; i++) {
            c=c*i;        
        }
          return c;   
    }
    String bin (String binario, int num1){       
        if (num1>0) {            
            while (num1>0) {                
                if (num1%2==0) {
                    binario= "0" + binario;
                }//if                 
                else {
                    binario= "1"+ binario;
                }//else                
                num1=num1/2;            
            }//while       
        }//if       
         else 
            if (num1 == 0) {
            binario= "0";
        }//if             
            else {
            binario="No se puede convertir, ingrese solo # positivos";
        }//else    
        return binario;
    }
}//clas.calcu
public class Tiposdemetodos100realnofake {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    double f;
    int num1, num2;
     
    System.out.println("da nalor a n1");
        num1=leer.nextInt();
        System.out.println("da valor num2");
        num2=leer.nextInt();
        
        calculadora obj=new calculadora(num1,num2);
        
        System.out.println("resta "+obj.resta(num2) );
        System.out.println("potencia "+obj.potencia());
        System.out.println("cadena "+obj.cadena());
        System.out.println("boleano "+obj.boleano());
        System.out.println("ascii "+obj.valorAscii());
        System.out.println("caracter "+obj.caracter());
        System.out.println("suma "+obj.suma(num1, num2));
        System.out.println("redondeo "+obj.redondeo(5.5));
        System.out.println("bitee  "+obj.bitee());
        System.out.println("tarea " + obj.tarea(num1));
        System.out.println("binario "+obj.bin("binario", num1));
        
    }//psv    
}//pc1