
package tipodemetodos;

import java.util.Scanner;

public class Tipodemetodos {
    int n1,n2;
    
    Tipodemetodos(int n1, int n2){
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
    return Math.pow(getN1(), getN2());
    }

long resta(int x){
    long r=getN1()-x;
    return r;
}

float redondeo(int x){
    float redondeo=Math.round(7.3);
    return redondeo;
}

double suma(double num1, int num2){
    return num1+num2;
}

String cadena(String cad){
    String cadl=" ";
    for (int i = 0; i < 10; i++) {
        cadl=cadl+cad;
    }
    return cadl;
}

byte bitee(){
    if (getN1()!=getN2())
        return 1;
    else
        return 0;
}

boolean boleano(){
    if(getN1()==getN2())
        return true;
    else
        return false;
}

char metodocaracter(){
    char caracterAscii=(char) getN1();
    return caracterAscii;
}
int valorAscii(){
    int valorAscii= (int) metodocaracter();
    return valorAscii;
}

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
    }
    
}
