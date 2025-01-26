/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package li;

import java.util.Scanner;

public class Li {

    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
       int num, x,y;
       int [][] par=new int [3][3]; 
       
       for (x = 0; x < 3; x++) {
            for ( y= 0; y < 3; y++) {
                System.out.println("da # de casillero"+x+" "+y);
                 par [x][y]=leer.nextInt();
                if(( par [x][y]%2==0)&&( par [x][y]<30)){
                    System.out.println(" "+ par [x][y]);
                    
                    
                }
                else{
                    y--;
                }
                
              
            }
            
        }
        
    }
    
}
