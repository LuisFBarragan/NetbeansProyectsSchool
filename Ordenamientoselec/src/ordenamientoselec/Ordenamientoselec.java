package ordenamientoselec;

import java.util.Scanner;

public class Ordenamientoselec {

    public static void main(String[] args) {
        
        int inter[] = {50, 30, 80, 40, 90};
        int aux ;
        for (int i = 0; i < 5; i++) {
            int min = i;
            for (int j = i + 1; j < 5; j++) {
                if (inter[j] < inter[min]) {
                    min = j;
                }
            }
            if (i != min) {
                aux= inter[i];
                inter[i] = inter[min];
                inter[min] = aux;
            }
        }

        for (int w = 0; w < 5; w++) {
            System.out.print(" " + inter[w]);
        }
        System.out.println(" ");


    }
}
