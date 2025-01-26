package barragan;

public class Barragan {

    public static void main(String[] args) {
        
        int[] v = {1,5,3,4,2};//Shaker
        
        //Ordenamiento burbuja
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j + 1] > v[j]) {
                    int aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print("" + v[i] + ",");
        }
    }
}
