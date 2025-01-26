
package empresaabstrac;

import java.util.ArrayList;
import java.util.Scanner;

abstract class claseAbs{
    abstract void metodoAbs();
}
class Persona extends claseAbs{
    String nombre;
    int edad;
    public void metodoAbs(){}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }    
}
class cliente extends Persona{
    String numero;
     public  cliente(String numero, String nombre, int edad){
        this.numero=numero;
        this.nombre=nombre;
        this.edad=edad;
    }   
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    static ArrayList<cliente> listaCte=new ArrayList();
    
   void registrarCte(){
       listaCte.add(new cliente(getNumero(), getNombre(), getEdad()));
   }
    public void metodoAbs(){
        for (int i = 0; i <listaCte.size(); i++) {
            
        System.out.println(" "+listaCte.get(i).getNumero()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getEdad());
    }
    }
}
class empleado extends Persona{    
    double sueldobruto;
    public empleado(double sueldobruto, String nombre, int edad){
        this.sueldobruto=sueldobruto;
        this.nombre=nombre;
        this.edad=edad;
    }
    public double getSueldobruto() {
        return sueldobruto;
    }
    public void setSueldobruto(double sueldobruto) {
        this.sueldobruto = sueldobruto;
    }  
    static ArrayList<empleado> listaEmp=new ArrayList();
    void registarEmp(){
        listaEmp.add(new empleado(getSueldobruto(), getNombre(), getEdad()));
    }
    public void metodoAbs(){
        for (int i = 0; i < listaEmp.size(); i++) {
            System.out.println(" "+listaEmp.get(i).getNombre()+" "+listaEmp.get(i).getEdad()+" "+listaEmp.get(i).getSueldobruto());
        }
    }
   } 
class directivo extends empleado {
    private String categoria;
    directivo(double sueldobruto, String nombre, int edad, String categoria){
       super(sueldobruto, nombre, edad);
        this.categoria=categoria;       
    }// cons dire
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    static ArrayList<directivo> listaDire=new ArrayList();
    Scanner read=new Scanner(System.in);
    
    void registrarDire(){
        listaDire.add(new directivo(getSueldobruto(), getNombre(), getEdad(), getCategoria()));
    }
    public void metodoAbs(){
        for (int i = 0; i <listaDire.size(); i++) {
            System.out.println(" "+listaDire.get(i).getCategoria()+" "+
           listaDire.get(i).getNombre()+" "+listaDire.get(i).getSueldobruto()
            +" "+listaDire.get(i).getEdad());
        }
    }    
}
public class Empresaabstrac {
    public static void main(String[] args) {
Scanner read=new Scanner(System.in);
        directivo Dio=new directivo( 1000.00, " ", 18," ");
        cliente Cte=new cliente("312-143-692-3", "juan", 18);
        empleado Emp=new empleado(1000.00, "pedro",18);
        int po=0; int tipo; String nombre;  double sueld; int ed; String cell; String cat;
        do{
            System.out.println("1.- llenar datos del empleado");
            System.out.println("2.- llenar datos del cliente");
            System.out.println("3.- llenar datos del directivo");
            System.out.println("4.- mostrar datos de los empleados");
            System.out.println("5.- mostrar datos de los dirctivos");
            System.out.println("6.- mostrar datos de los clientes");
            System.out.println("7.- salir");
            System.out.println("elije una opcion");
            po=read.nextInt();
            switch(po){
                    case 1:
                       
                            System.out.println("da los datos del empleado a registrar");
                            System.out.println("sueldo: ");
                            sueld=read.nextDouble();
                            Emp.setSueldobruto(sueld);
                            System.out.println("da nombre");
                            nombre=read.next();
                            Emp.setNombre(nombre);
                            System.out.println("da la edad");
                            ed=read.nextInt();
                            Emp.setEdad(ed);
                            Emp.registarEmp();
                            break;
                    case 2:
                                    System.out.println("da nombre");
                                    nombre=read.next();
                                    Cte.setNombre(nombre);
                                    System.out.println("da la edad");
                                    ed=read.nextInt();
                                    Cte.setEdad(ed);
                                    System.out.println("da numero de cel");
                                    cell=read.next();
                                    Cte.setNumero(cell);
                                    Cte.registrarCte();
                                break;
                    case 3:
                        System.out.println("da nombre");
                        nombre=read.next();
                        Dio.setNombre(nombre);
                        System.out.println("da la edad");
                        ed=read.nextInt();
                        Dio.setEdad(ed);
                        System.out.println("da sueldo");
                        sueld=read.nextDouble();
                        Dio.setSueldobruto(sueld);
                        System.out.println("da numero de categoria");
                        cat=read.next();
                        Dio.setCategoria(cat);
                        Dio.registrarDire();
                        break;
                    case 4:
                        Emp.metodoAbs();
                        break;
                    case 5:
                       Dio.metodoAbs();
                        break;
                    case 6:
                        Dio.metodoAbs();
                        break; 
      }//switch
    }while(po!=7);
        
    }
    
}
