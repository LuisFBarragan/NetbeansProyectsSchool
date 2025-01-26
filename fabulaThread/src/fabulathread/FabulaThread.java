//Barragan Flores Luis Francisco
//18460194
package fabulathread;

public class FabulaThread {

    public static void main(String[] args) {
        Animal liebre=new Animal(7, "L");
        Animal tortuga=new Animal(3, "T");
        tortuga.start();
        liebre.start();
    }
    
}
