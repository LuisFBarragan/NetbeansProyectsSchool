
package serie;

import java.util.Scanner;


public class Serie {

    public static void main(String[] args) {
Scanner read=new Scanner(System.in);
Serie  obj=new Serie ();
obj.loge();
       }
           double enl=1;double delta=1;double fact=1; int n=1;   
           void loge(){
       if (enl==enl+delta) {
        System.out.println(""+enl);
    }
       else{
enl+=delta;
           n++;
        fact*=n;
        delta=1.0/fact;
        loge();
       }
    }
}
