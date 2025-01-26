//Luis Barragan
package libreriaordenamiento;

public class LibOrdena {
    public void Ordenacion(int intercambio[]){
        int f;
        System.out.println("Se hacen weas ");
        for (int i = 0; i < intercambio.length-1; i++) {
            for (int j = i+1; j <intercambio.length-1; j++) {
                if (intercambio[i]>intercambio[j]) {
                 f=intercambio[i];   
                 intercambio[i]=intercambio[j];
                 intercambio[j]=f;
                }
            }
        }
        for (int k = 0; k < intercambio.length-1; k++) {
            System.out.print(" "+intercambio[k]);
        }
        System.out.println("");
    }
    
}
