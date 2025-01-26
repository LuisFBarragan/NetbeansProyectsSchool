package preubadowhile;
public class PreubaDoWhile {
    public static void main(String[] args) {
       String result = "";
       int i = 0;       
        do {
            i=i+1;
            result=result+i;          
        } while (i<5);      
        System.out.println(result);
    }   
}
