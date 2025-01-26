
package sobrecargar1;


public class Sobrecargar1 {
double imprime(double x){
    System.out.println(" "+x);
    return 0;
}
    int imprime(int y, String n){
        System.out.println("edad "+y+" cadena "+n);
        return y;
        
    }
    
    String  imprime(String z){
        System.out.println("domicilio "+z);
        return z;
    }
    public static void main(String[] args) {
       Sobrecargar1 o=new Sobrecargar1();
       String x;
        System.out.println(" "+ o.imprime(5656666665.5));
        System.out.println(" "+o.imprime(3, " hola"));
        x=o.imprime("madero 1000");
        System.out.println(" "+x);
    }
    
}
