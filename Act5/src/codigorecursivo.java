
public class codigorecursivo {// En esta clase estan los metodos recursivos 
    public static String Potencia(String cadena, int n){//programa para sacar la potencia
         //comprobamos el valor de n dependiendo de su valor se realizara lo correspondiente
         if (n == 0) {
             return "λ";  //si n es igual a cero regresa landa
         }
         else if(n == 1){ // si n es igual a uno regresa la cadena
         return cadena;
         }
         else {
             return cadena + Potencia(cadena,n-1); // aqui inicia la recursividad, empezamos a juntar las palabras 
         }
     }
    public static String Inversa(String cadena, int lon){//Programa para sacar la inversa
        if (lon == 0) {
            return cadena.charAt(lon) + ""; //retorna la letra de la cadena que se encuentra en la posición lon 
        }
        else{
        return cadena.charAt(lon) + Inversa(cadena,lon-1);// inicia la recursividad, en esta parte toma la letra que se encuentra en la posición
                                                          //lon y la suma con la letra que se encuentra en la posición lon-1 de la cadena y la suma 
        }
    }
}
