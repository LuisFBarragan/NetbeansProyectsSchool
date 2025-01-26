package metodomatris;
import java.util.Scanner;
public class Metodomatris {
    char [][] matrices=new char [3][3];
    Scanner read=new Scanner(System.in);
    void almacenar(){
        try{
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                matrices[r][c]=read.next().charAt(0);       
            }
        }
    }
        catch(Exception x){
            System.out.println(" "+x);
            almacenar();
        }
    }
void mostrar(){
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
            System.out.print(" "+matrices[r][c]);
        }
        System.out.println(" ");
    }
}
    public static void main(String[] args) {
        Metodomatris o=new Metodomatris();
        o.almacenar();
        o.mostrar();
    }
}