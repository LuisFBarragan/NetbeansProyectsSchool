
package empresatry2;
import static empresatry2.cliente.listaCte;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
//----------------------------persona----------------------------------------------------------------------------------- 
abstract class claseAbs{
    abstract void metodoAbs();
}
class persona extends  claseAbs{
    public void metodoAbs(){} 
    String nombre;
    int edad;
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
class cliente extends persona{
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
    Scanner read=new Scanner(System.in);
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
  
       void registrarCte() {        
       listaCte.add(new cliente(getNumero(), getNombre(), getEdad()));
   }
    public void metodoAbs(){
        for (int i = 0; i <listaCte.size(); i++) {
        System.out.println(" "+listaCte.get(i).getNumero()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getEdad());
    }
    }
}
//---------------------------------------------------------empleado----------------------------------------------------------
class empleado extends persona{    
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
    Scanner read=new Scanner(System.in);
    int i=0;
    void registarEmp() throws Exception{
        
        try{
        
        System.out.println("da los datos del empleado a registrar");
                            System.out.println("sueldo: ");
                            sueldobruto=read.nextDouble();
                            System.out.println("da nombre");
                            nombre=read.next();
                            for (int j = 0; j < nombre.length(); j++) {
                            if (nombre.charAt(j)=='0'||nombre.charAt(j)=='1'||nombre.charAt(j)=='2'||nombre.charAt(j)=='3'||
                         nombre.charAt(j)=='4'||nombre.charAt(j)=='5'||nombre.charAt(j)=='6'||nombre.charAt(j)=='7'||
                         nombre.charAt(j)=='8'||nombre.charAt(j)=='9') {
         throw new Exception("Exception arrojada desde try");      
           }
                            System.out.println("da la edad");
                            edad=read.nextInt();
        }
                            i++;
        }
        catch(NumberFormatException y){
          System.out.println("SE PRODUCIO UN ERROR "+y); 
          i--; listaEmp.remove(i);
           
        }
            catch(Exception z){
                System.out.println("SE PRODUCIO UN ERROR "+z);
                registarEmp(); i--; listaEmp.remove(i);
            }
                            listaEmp.add(new empleado(getSueldobruto(), getNombre(), getEdad()));
    }
    public void metodoAbs(){
        for (int i = 0; i < listaEmp.size(); i++) {
            System.out.println(" "+listaEmp.get(i).getNombre()+" "+listaEmp.get(i).getEdad()+" "+listaEmp.get(i).getSueldobruto());
        }
    }
   } 
//-------------------------------------------------------------directivo---------------------------------------------------------------
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
    int w=0;
    void registrarDire() throws Exception{
        
        try{
            
                       System.out.println("da nombre");
                        nombre=read.next();
                        for (int j = 0; j < nombre.length(); j++) {
                            if (nombre.charAt(j)=='0'||nombre.charAt(j)=='1'||nombre.charAt(j)=='2'||nombre.charAt(j)=='3'||
                         nombre.charAt(j)=='4'||nombre.charAt(j)=='5'||nombre.charAt(j)=='6'||nombre.charAt(j)=='7'||
                         nombre.charAt(j)=='8'||nombre.charAt(j)=='9') {
         throw new Exception("Exception arrojada desde try");      
           }
                        }
                        System.out.println("da la edad");
                        edad=read.nextInt();
                        System.out.println("da sueldo");
                        sueldobruto=read.nextDouble();
                        System.out.println("da numero de categoria");
                        categoria=read.next();
                        for (int j = 0; j < nombre.length(); j++) {
                            if (categoria.charAt(j)=='0'||categoria.charAt(j)=='1'||categoria.charAt(j)=='2'||categoria.charAt(j)=='3'||
                         categoria.charAt(j)=='4'||categoria.charAt(j)=='5'||categoria.charAt(j)=='6'||categoria.charAt(j)=='7'||
                         categoria.charAt(j)=='8'||categoria.charAt(j)=='9') {
         throw new Exception("Exception arrojada desde try");      
           }
                        }
                        w++;
        } 
        catch(NumberFormatException y){
          System.out.println("SE PRODUCIO UN ERROR "+y); 
          w--; listaDire.remove(w);
           
        }
            catch(Exception z){
                System.out.println("SE PRODUCIO UN ERROR "+z);
                registrarDire(); w=0; listaDire.remove(w);
            }
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

public class EmpresaTry2 {
    public static void main(String[] args) throws IOException, Exception {
       Scanner read=new Scanner(System.in);
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
      directivo Dio=new directivo( 1000.00, " ", 18," ");
        cliente Cte=new cliente("312-143-692-3", "juan", 18);
        empleado Emp=new empleado(1000.00, "pedro",18);
        int opcion, edad,w=0;
        
        do {
            System.out.println("1.- registar");
            System.out.println("2.- mostrar");
            System.out.println("3.- salir");
            System.out.println("elije una opcion");
            opcion=Integer.parseInt(leer.readLine());
            switch(opcion){
                case 1:
                    int o;
                    System.out.println("Cliente=0/empleado=1/Directivo=2");
                    System.out.println("que quieres registrar");
                    o=Integer.parseInt(leer.readLine());
                    if (o==0) {
                         try{
          System.out.println("da la edad");
        edad=read.nextInt();
        Cte.setEdad(edad);
        Cte.registrarCte();
        w=w+1;
       }
       catch(NumberFormatException y){
          System.out.println("SE produjo eeror # no Letra "+y);Cte.registrarCte();
      }
                              
                       
                    }
                    if (o==1) {
                        Emp.registarEmp();
                        break;
                    }
                    if (o==2) {
                        Dio.registrarDire();break;
                    }
                    
                case 2:
                 int p;
                    System.out.println("Cliente=0/empleado=1/Directivo=2");
                    System.out.println("que quieres mostrar");
                    p=read.nextInt();
                    if (p==0) {
                        Cte.metodoAbs();
                        break;
                    }
                    if (p==1) {
                        Emp.metodoAbs();
                        break;
                    }
                    if (p==2) {
                        Dio.metodoAbs();
                        break;
                    }
                    break;
            }
        } while (opcion!=3);
        
    }
    
}
