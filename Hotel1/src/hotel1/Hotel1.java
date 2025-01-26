package hotel1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Recepsionista extends persona{            
      protected String categoria;;
      protected double sueldo;
           //CONSTRUCTORES 
    Recepsionista(String Nombre,int Edad, String Categoria,double Sueldo){
        this.nombre=Nombre;
        this.edad=Edad;
        categoria=Categoria;
        sueldo=Sueldo;
    }
    protected String getCategoria() {
        return categoria;
    }
    protected void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    protected double getSueldo() {
        return sueldo;
    }
    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
  static ArrayList <Recepsionista> listaRecep=new ArrayList();
   void registrar(){     
       listaRecep.add(new Recepsionista(getNombre(),
               getEdad(), getCategoria(),getSueldo()));     
    }//registrar 
   void mostrarRecep(){
        //REUTILIZACION DE MIEMBROS HEREDADOS. EN
        System.out.println("DATOS DE RECEPSIONISTAS ");
        for (int i = 0; i < listaRecep.size(); i++) {
           System.out.println("Recepsionista: "+i+"  "+
                   listaRecep.get(i).getNombre()+"  "
                   +listaRecep.get(i).getEdad()+" "+
                    listaRecep.get(i).getCategoria()+" "+listaRecep.get(i).getSueldo());            
     }//for
    }//mostrar
}//class recepsionista

class Cliente extends persona{       //3.2 DEFINCION CLASE DERIVADA
      int cuenta;
      String celular;      
                                                
      Cliente(int cuenta,String nombre, int edad, String celular){  
       this.nombre=nombre;
       this.edad=edad;
       this.cuenta=cuenta;
       this.celular=celular;       
   }
    public int getCuenta() {
        return cuenta;
    }
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    static ArrayList <Cliente> listaCte=new ArrayList();
    Scanner leer=new Scanner(System.in);
    void registrar(){   //3.6 REDEFINCIÓN DE METODOS EN CLASES DERIVADAS                  
       listaCte.add(new Cliente(getCuenta(),
               getNombre(),getEdad(), getCelular()));     
    }//registrar
    void mostrarClientes(){
        System.out.println(" DATOS DE CLIENTES");
        for (int i = 0; i < listaCte.size(); i++) {
           System.out.println(listaCte.get(i).getCuenta()+" "
                   +listaCte.get(i).getNombre()+" "+listaCte.get(i).getEdad()+" "+
                    listaCte.get(i).getCelular());            
     }//for
    }//mostrar
    void buscarNombre(String buscar){
        for (int i = 0; i < listaCte.size(); i++) {
            if (listaCte.get(i).getNombre().equals(buscar))
                {System.out.println(listaCte.get(i).getCuenta()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular());            
                   //3.3.-REUTILIZACION DE MIEMBROS HEREDADOS. EN LA LINEA ANTERIOR
                }
            
     }//for
    }//mostrar
    void modifica(String buscar){
         for (int i = 0; i < listaCte.size(); i++) {
            if (listaCte.get(i).getNombre().charAt(0)=='a')
                {System.out.println(listaCte.get(i).getCuenta()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular());            
                    System.out.println("Dar nuevos datos: ");  
                    listaCte.get(i).nombre=leer.next();
                    listaCte.get(i).celular=leer.next();
                }
            
     }//for
    }//mostrar
    
    public String buscarCliente(int cta){
        int w=0;
        String cadena=" ";
        for (int i = 0; i < listaCte.size(); i++) {
            if (listaCte.get(i).getCuenta()==cta)
               {    w=i;
                    cadena=listaCte.get(i).getNombre();
                    System.out.println("encontrado en "+i);
               }
            
            }//for
          return cadena;    
            
            //System.out.println(" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular());}//for
    }//bsucar      
     String modificarCliente(int  cta, String nuevo){
        int w=0;
        String cadena=" ";
        for (int i = 0; i < listaCte.size(); i++) {
            if (listaCte.get(i).getCuenta()==cta)
               {    listaCte.get(i).nombre=nuevo;
               }
            }//for
          return cadena;    
            
            //System.out.println(" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getCelular());}//for
    }//modificar
}//clas cliente
public class Hotel1 {
    public static void main(String[] args) throws IOException {
        Scanner leer=new Scanner (System.in);
        BufferedReader leerBuffer=new BufferedReader(new InputStreamReader(System.in));
        Cliente        objetoCte=new Cliente(1111,"Juan Perez ",0,"044-312-317-747-3");
        Recepsionista  objetoRecep=new Recepsionista(" ",0," ",0);
        int edad, opcion=0;
        int cuenta_cte,sueldo;
        String nombre, categoria, celular;
        do{
        System.out.println("1.-Registrar Clientes ");
        System.out.println("2.-Mostrar clientes");
        System.out.println("3.-Modificar Clientes");
            System.out.println(" ");
        System.out.println("4.-Registrar Recepsionistas ");
        System.out.println("5.-Mostrar Recepsionistas");
        
        System.out.println("6.-Salir ");
        opcion=leer.nextInt();
        switch(opcion){
            case 1: //clientes
                 
                 System.out.println("Num. de cuenta: ");
                 cuenta_cte=leer.nextInt();
                 
                 System.out.println("Nombre cliente: ");
                 nombre=leerBuffer.readLine();  //lectura con buffer
                 
                 System.out.println("Numero de Celular: ");
                 celular=leer.next();
                 
                 objetoCte.setCuenta(cuenta_cte);
                 objetoCte.setNombre(nombre);
                 objetoCte.setEdad(18);
                 objetoCte.setCelular(celular);
                 
                 objetoCte.registrar(); 
                 break;
            case 2://mostrar clientes
               objetoCte.mostrarClientes(); break;
            case 3:
                System.out.println("La cuenta a modificar  es: ");
                int cta=leer.nextInt();
                System.out.println("El nuevo nombre es: ");
                String nom=leer.next();
                objetoCte.modificarCliente(cta, nom);
                break;
         //RECEPSIONISTA
                
             case 4: //registrar RECEPSIONISTA
                 
                 System.out.println("Nombre Recepsionista: ");
                 nombre=leerBuffer.readLine();  //lectura con buffer
                 
                 System.out.println("Edad: ");
                 edad=leer.nextInt();
                 
                 System.out.println("Categoria: ");
                 categoria=leerBuffer.readLine();
                 
                 System.out.println("Sueldo: ");
                 sueldo=leer.nextInt();
                 
                 objetoRecep.setNombre(nombre);        //3.4.-REFERENCIA AL OBJETO DE LA CLASE BASE
                 objetoRecep.setEdad(edad);
                 objetoRecep.setCategoria(categoria);
                 objetoRecep.setSueldo(sueldo);
                 
                 objetoRecep.registrar(); 
                 break;
            case 5://mostrar recepsionista
               objetoRecep.mostrarRecep(); break;        
        }//switch
        }while(opcion!=6);
      }//ma
    }
