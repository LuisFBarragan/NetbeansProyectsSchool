/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        Test obj=new Test();
double n;double x; double j;
        System.out.println("Da el numero");
        n=read.nextDouble();
        System.out.println("Da la pontecia a elevar n");
        x=read.nextDouble();
       j=Alan(n,x);
        System.out.println(" "+j);
    }
    public static double Alan(double n,double x){
        if (x==0) {
            return 1;
        }
        else{
            if (x>0) {
                 return n*Alan(n,x-1);
            }
            else{
                return Math.pow(n, x);
            }
            
        }
    }
}
