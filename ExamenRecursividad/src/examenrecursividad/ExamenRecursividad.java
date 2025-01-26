
package examenrecursividad;

public class ExamenRecursividad {
   static int suma=0;
    public  void SumaMatriz(int matriz[][],int i, int j){
        suma=suma+matriz[i][j];
       
        if (i!=matriz.length-1||j!=matriz[i].length-1) {
            if (j==matriz[i].length-1) {
                i++;
                j=0;
            }else{
                j++;
            }
            SumaMatriz(matriz,i,j);
        }
        else{
            System.out.println("resultado "+suma);
        }
    }

    public static void main(String[] args) {
        ExamenRecursividad obj=new ExamenRecursividad();
        int matiz[][]={ {1,2,3,},{1,2,3},{1,2,3}};
        obj.SumaMatriz(matiz, 0, 0);
       
    }
    
}
