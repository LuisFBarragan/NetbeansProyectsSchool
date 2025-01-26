
package sobrecargavectores;
public class Sobrecargavectores {
int [] vector = new int [5];
void metodoVector(){
    for (int i = 0; i < 5; i++) {
        vector[i]=(int) (Math.random()*100);
        metodoVector (vector);
        
        
    }//m.vector
}
int metodoVector(int vect[]){
    int suma=0;
    for (int r = 0; r < 5; r++) {
        System.out.println("["+r+"]= "+ vect[r]);
        suma=suma+vect[r];
        
    }//for
    return suma;

}//metodo2



    
    public static void main(String[] args) {
     
    Sobrecargavectores o=new Sobrecargavectores();
    o.metodoVector();
    
    }
    
}
