package hanoi;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
    int x=1;
        System.out.println("cuantos discos quieres");
        x=leer.nextInt();
        Hanoi obj=new Hanoi();
        obj.torre(x,"a","b","c");
    }
    void torre(int x,String a,String b, String c){
        if (x==1){
            System.out.println(a+" se mueve a "+c);
           
        }
        else{
       torre(x-1,a,c,b);
       System.out.println(a+" se mueve a "+c);
       torre(x-1,b,a,c);
        }
}
}
