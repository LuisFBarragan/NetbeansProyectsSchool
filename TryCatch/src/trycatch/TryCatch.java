
package trycatch;

/**
 *
 * @author luisf
 */
public class TryCatch {

    public static void main(String[] args) {
        try{
            String dato ="P123";
            int num = Integer.parseInt(dato);
            
        }catch(Exception e){
            System.out.println("Error, el valor string contine caracteres no numericos");
        }
    }
    
}
