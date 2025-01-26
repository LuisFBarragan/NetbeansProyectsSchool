
package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
    String palabra;
    int x=0,opcion;
    
    Persona obj=new Persona("juan","lopez","04-12_88","Español","Productor");
    Pelicula obj2=new Pelicula("","","","","");
    Scanner teclado=new Scanner(System.in);   
        do{            
            System.out.println("_______ M E N U __________");
            System.out.println("1.Realizar registros");
            System.out.println("2.Mostrar datos de las personas");
            System.out.println("3.Mostrar las peliculas por año leido");
            System.out.println("4.Mostrar los nombres de las personas que son directores");
            System.out.println("5.Mostrar por nacionalidad");
            opcion=teclado.nextInt();
            
            switch(opcion)
            {
                case 1:
                      System.out.println("Datos Persona");
                     System.out.println("Ingresa el nombre de la persona ");
                     palabra=teclado.next();
                     obj.setNombre(palabra);
                     System.out.println("ingresa los apellidos");
                     palabra=teclado.next();
                     obj.setApellidos(palabra);
                     System.out.println("Ingresa la fecha de nac");
                     palabra=teclado.next();
                     obj.setFecha_nac(palabra);
                     System.out.println("Ingresa la nacionalidad");
                     palabra=teclado.next();
                     obj.setNacionalidad(palabra);
                     System.out.println("Ingresa tu papel que realizae en la pelicula");
                     palabra=teclado.next();
                     obj.setPuesto(palabra);
                     obj.datoss();
                     
                     System.out.println("");
                     System.out.println("DATOS DE LAS PELICULAS");
                     System.out.println("Ingresa el nombre de la pelicula");
                     palabra=teclado.next();
                     obj2.setNom_peli(palabra);
                     System.out.println("Ingresa algo de la sipnosis");
                     palabra=teclado.next();
                     obj2.setSipnosis(palabra);
                     System.out.println("Ingresa el año en que se estreno");
                     palabra=teclado.next();
                     obj2.setAño(palabra);
                     System.out.println("Ingresa el genero (drama,comedia,accion,aventuras)");
                     palabra=teclado.next();
                     obj2.setGenero(palabra);
                     System.out.println("Ingresa el pais");
                     palabra=teclado.next();
                     obj2.setPais(palabra);
                     obj2.datoss();
                     
                break;
                case 2:
                      obj.datoss("");
                      obj2.datoss("");
                break;
                case 3:
                      System.out.println("Ingresa el año a buscar");
                      palabra=teclado.next();
                      obj2.setAño(palabra);
                      obj2.datoss(palabra,"");
                break;
                case 4:
                      obj.datoss("","");
                break;
                case 5: 
                    //nacionalidad
                    obj.datoss(x);
                break;
                default:
                    System.out.println("Numero invalido");
                    break;
            }    
        } while (opcion!=6); 
    }
}