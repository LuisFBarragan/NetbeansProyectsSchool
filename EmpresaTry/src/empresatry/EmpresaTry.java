    package empresatry;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
    Scanner read1=new Scanner(System.in);
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
  int w=0;
       void registrarCte() throws IOException{
       int op=0;
       try{
           System.out.println("Da numero");
            numero=read1.next();
                       System.out.println("da nombre");
                        nombre=read1.next();
                        for (int j = 0; j < nombre.length(); j++) {
                            if (nombre.charAt(j)=='0'||nombre.charAt(j)=='1'||nombre.charAt(j)=='2'||nombre.charAt(j)=='3'||
                         nombre.charAt(j)=='4'||nombre.charAt(j)=='5'||nombre.charAt(j)=='6'||nombre.charAt(j)=='7'||
                         nombre.charAt(j)=='8'||nombre.charAt(j)=='9') {
         throw new Exception("Exception arrojada desde try");      
           }
                        }
                        System.out.println("da la edad");
                        edad=read1.nextInt();                        
                        w++;
        } 
        catch(NumberFormatException y){
          System.out.println("SE PRODUCIO UN ERROR "+y); 
          w--; listaCte.remove(w);
          registrarCte(); 
        }
            catch(Exception z){
                System.out.println("SE PRODUCIO UN ERROR "+z);
                registrarCte(); w=0; listaCte.remove(w);
            }    
       listaCte.add(new cliente(getNumero(), getNombre(), getEdad()));
   }
    public void metodoAbs(){
        for (int i = 0; i <listaCte.size(); i++) {
        System.out.println(" "+listaCte.get(i).getNumero()+" "+listaCte.get(i).getNombre()+" "+listaCte.get(i).getEdad());
    }
    }
    static final String Clinte_Cd="prueba.dat";
    FileOutputStream GTex;
    DataOutputStream GTexBin;
    void GuardarDiscoCte() throws FileNotFoundException, IOException{
      try{
        GTex=new FileOutputStream(Clinte_Cd,true);
       GTexBin=new DataOutputStream(GTex);
        for (int i = 0; i < listaCte.size(); i++) {
        GTexBin.writeUTF(listaCte.get(i).getNumero());
        GTexBin.writeUTF(listaCte.get(i).getNombre());
        GTexBin.writeInt(listaCte.get(i).getEdad());
        }
        GTexBin.close();
        GTex.close();
      }
      catch(FileNotFoundException er1){
          System.out.println("error... "+er1);
      }
      catch(Exception er2){
          System.out.println("ya valio... "+er2);
      }
    }
    FileInputStream MTex;
    DataInputStream MTexBin;
    void MostrarDicCte() throws FileNotFoundException, IOException{
        try{
        MTex=new FileInputStream("prueba.dat");
        MTexBin=new DataInputStream(MTex);
        while(MTexBin.available()!=0){
            System.out.println("Numero: "+MTexBin.readUTF());
            System.out.println("Nombre: "+MTexBin.readUTF());
            System.out.println("Edad: "+MTexBin.readInt());
        }
        MTexBin.close();
        MTex.close();
    }
        catch(FileNotFoundException er){
            
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
    
    int w=0;
    void registarEmp() throws Exception{
        
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
                        w++;
        } 
        catch(NumberFormatException y){
          System.out.println("SE PRODUCIO UN ERROR "+y); 
          w--; listaEmp.remove(w);
          registarEmp(); 
        }
            catch(Exception z){
                System.out.println("SE PRODUCIO UN ERROR "+z);
                registarEmp(); w=0; listaEmp.remove(w);
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
    }// cons dir   
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    } 
    static ArrayList<directivo> listaDire=new ArrayList();
    Scanner read=new Scanner(System.in);
          BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
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
          registrarDire(); 
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

public class EmpresaTry {
    public static void main(String[] args) throws IOException, Exception {
       Scanner read=new Scanner(System.in);
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
      directivo Dio=new directivo( 1000.00, " ", 18," ");
        cliente Cte=new cliente("312-143-692-3", "juan", 18);
        empleado Emp=new empleado(1000.00, "pedro",18);
        int opcion;
        
        do {
            System.out.println("1.- registar");
            System.out.println("2.- mostrar");
            System.out.println("3.- salir");
            System.out.println("elije una opcion");
            opcion=read.nextInt();
            switch(opcion){
                case 1:
                    int o;
                    System.out.println("Cliente=0/empleado=1/Directivo=2");
                    System.out.println("que quieres registrar");
                    o=read.nextInt();
                    if (o==0) {
                        Cte.registrarCte(); 
                        break;
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
                case 4:
                    int f;
                    System.out.println("Cliente=0/empleado=1/Directivo=2");
                    System.out.println("que quieres registrar");
                    f=read.nextInt();
                    if (f==0) {
                        Cte.GuardarDiscoCte();
                        break;
                    }
                    if (f==1) {
                        Emp.registarEmp();
                        break;
                    }
                    if (f==2) {
                        Dio.registrarDire();
                    }
                    break;
                case 5: int j;
                    System.out.println("Cliente=0/empleado=1/Directivo=2");
                    System.out.println("que quieres mostrar");
                    j=read.nextInt();
                    if (j==0) {
                        Cte.MostrarDicCte();
                        break;
                    }
                    if (j==1) {
                        Emp.metodoAbs();
                        break;
                    }
                    if (j==2) {
                        Dio.metodoAbs();
                        break;
                    }
            }
        } while (opcion!=3);
        
    }
    
}