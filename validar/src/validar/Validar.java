package validar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
class Cliente{
    int cuenta;
    String nombre;
    String celular;
    String email;
    int edad;

    int buscar;
    int borrar;
    public int getBorrar() {
        return borrar;
    }
    public void setBorrar(int borrar) {
        this.borrar = borrar;
    }
    public int getBuscar() {
        return buscar;
    }
    public void setBuscar(int buscar) {
        this.buscar = buscar;
    }
    Cliente(int cta, String nombre, String celular, int edad){ //Constructor
        this.cuenta=cta;
        this.nombre=nombre;
        this.celular=celular;
        this.edad=edad;
    }
    public int getCuenta() { //Manda a llamar
        return cuenta;
    }
    public void setCuenta(int cuenta) { //Asignar valor
        this.cuenta = cuenta;
    }
    public String getNombre() {
    return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    static ArrayList <Cliente> listaCte=new ArrayList();//Array con datos de constructor. Después de Get y Set
    Scanner leer=new Scanner(System.in);
    void registrarClientes(){
        
        listaCte.add(new Cliente(getCuenta(), getNombre(), getCelular(), getEdad())); //Agregar datos al Array
    }
    void mostrarClientes(){
        for (int i = 0; i < listaCte.size(); i++) {
            System.out.println(" "+listaCte.get(i).getCuenta()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular()+" "+listaCte.get(i).getEdad());
        }
    }
    void buscar(String a){
       int w=0;
        for (int i = 0; i < listaCte.size(); i++) {
            if (listaCte.get(i).getNombre().equals(a)){
            System.out.println(" "+listaCte.get(i).getCuenta()+
                    " "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular()+" "+listaCte.get(i).getEdad());
                System.out.println("Está en posición "+i);
        }
        }
    }
    void borrar(int cuenta){
        for (int i = 0; i < listaCte.size(); i++) {
            if (cuenta==(listaCte.get(i).getCuenta())){
                listaCte.remove(i);
        }    
        }  
    }
    void contar(){
       int c=0;
        for (int i = 0; i < listaCte.size(); i++) {
            if (18<=(listaCte.get(i).getEdad())) {
                c++;
                
            }
    }
        System.out.println("Son "+c+" mayores de edad");
        }
    void modificar(String mod){
          int w=0;
        for (int i = 0; i < listaCte.size(); i++) {
            if (nombre.equals(listaCte.get(i).getNombre())){
           System.out.println("Capturar nuevo nombre");
            listaCte.get(i).nombre=leer.next();
    }
    }
    }
    
} //class Cliente
public class Validar {

    public static void main(String[] args) throws IOException {
        Scanner leer=new Scanner(System.in);
       BufferedReader leerBuffer=new BufferedReader(new InputStreamReader(System.in));
       Cliente objetoCte=new Cliente(111," ","312-317-747-3", 18);
       int option=0;
       int cta_cte, a=0, bor=0, edad; String b=" ", nombre, celular;
       do{ 
        System.out.println("1. Registrar");
        System.out.println("2. Mostrar");
        System.out.println("3. Buscar");
        System.out.println("4. Borrar");
        System.out.println("5. Mayores de edad");
        System.out.println("6. Modificar");
        System.out.println("7. Salir");
        System.out.println("Seleccione una opción");
        option=leer.nextInt();
        switch(option){
            case 1:
                System.out.println("Dar número de cuenta");
                cta_cte=leer.nextInt();
                System.out.println("Nombre del clente");
                nombre=leerBuffer.readLine();
                System.out.println("Celular");
                celular=leerBuffer.readLine();
                System.out.println("Edad");
                edad=leer.nextInt();
                
                objetoCte.setCuenta(cta_cte);
                objetoCte.setNombre(nombre);
                objetoCte.setCelular(celular);
                objetoCte.setEdad(edad);
                objetoCte.registrarClientes(); //Asignar valores de teclado al Array
                break;
            case 2:
                objetoCte.mostrarClientes();
                break;
            case 3:    
                 System.out.println("Nombre a buscar");
                b=leer.next();
                
                objetoCte.buscar(b);
                break;
            case 4:
                System.out.println("Cuenta a borrar");
                bor=leer.nextInt();
                
                objetoCte.borrar(bor);
                break;
            case 5:
                objetoCte.contar();
                break;
            case 6:
                String mod;
                System.out.println("Da el nombre a modificar");
                mod=leer.next();
                objetoCte.modificar(b);
                break;
        }
    }while(option!=7); 
  }
}