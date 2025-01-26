
package cositas;

import java.util.Scanner;


public class Cositas {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        char [][] matriz=new char[3][3];
        matriz [0][0]='q';
        matriz[0][1]='♥';
      matriz[0][2]='☺';
      matriz[1][0]='☺';
      matriz[1][1]='☺';
      matriz[1][2]='☺';
      matriz[2][0]='☺';
      matriz[2][1]='☺';
      matriz[2][2]='☺';
        System.out.println("impresion de matriz");
        for(int r=0; r<3; r++){
            System.out.println(" ");
            for(int c=0; c<3; c++){
                System.out.println(" "+matriz[r][c]);
            }
            
        }

    }
    
}
