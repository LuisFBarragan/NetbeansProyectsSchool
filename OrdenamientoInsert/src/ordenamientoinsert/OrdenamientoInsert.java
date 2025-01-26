package ordenamientoinsert;

import java.util.Scanner;

public class OrdenamientoInsert {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int Insert[] = {50, 30, 80, 40, 90};
        int aux, p;

        for (int i = 0; i < 5; i++) {
            p = i;
            aux = Insert[i];
            
            while (p > 0 && Insert[p - 1] > aux) {
                Insert[p] = Insert[p - 1];
                p--;
            }//while
            
            Insert[p] = aux;
        }//for
        for (int j = 0; j < 5; j++) {
                System.out.print(" " + Insert[j]);
            }
            System.out.println("");
        
    }

}
