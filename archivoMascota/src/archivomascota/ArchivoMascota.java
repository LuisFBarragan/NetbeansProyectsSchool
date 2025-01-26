package archivomascota;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class Historial{
      short codigo;
      String enfermedad;
      void  setCodigo(short codigo){
             this.codigo=codigo;
       }     
       short getCodigo(){
         return codigo;
       }  
      void  setEnfermedad(String enfermedad){
             this.enfermedad=enfermedad;
       }     
       String  getEnfermedad(){
         return enfermedad;
       }     
 }
public class ArchivoMascota extends Historial {
    String raza;
    String nombre;
    double peso;
    long edad;
    float estatura;
    char sexo;
    //ArrayList <Mascota2> lista=new ArrayList<>();
    Scanner leer=new Scanner(System.in);
    //CONSTRUCTOR   
    ArchivoMascota(String nombre,String raza, double peso,long edad,float estatura, 
            char sexo, short codigo,  String enfermedad){  
     this.raza=raza;
     this.peso=peso;
     this.edad=edad;
     this.nombre=nombre;
     this.codigo=codigo;
     this.estatura=estatura;
     this.sexo=sexo;
     this.enfermedad=enfermedad; 
     
    }
    void setNombre(String nombre){
      this.nombre=nombre;     
    }
    String getNombre(){
         return nombre;
    }
    void setSexo(char sexo){
       this.sexo=sexo;
    }
    char getSexo(){
      return sexo;
    }
    void setEdad(long eda){
       this.edad=eda;
    }
    long getEdad(){
      return edad;
    } 
    void setRaza(String raz){
       this.raza=raz;
    } 
    String getRaza(){
    return raza;
    }
    void setPeso(double pes){
       this.peso=pes;
    } 
    double getPeso(){
      return peso;
    }  
    void setEstatura(float estatura){
       this.estatura=estatura;
    } 
    float getEstatura(){
      return estatura;
    }
     ArrayList <ArchivoMascota> lista=new ArrayList<>();
     void almacenarRAM(){  //ALMACENAR EN RAM
              lista.add(new ArchivoMascota(getNombre(),
             getRaza(),getPeso(),getEdad(),
             getEstatura(),getSexo(),getCodigo(),getEnfermedad()));
     }
      void Mostrar(){ //MOSTRAR RAM
        System.out.println(" DATOS ALAMCENADO arrayList ");
        for(int i=0;i<lista.size();i++){
          System.out.println( " "+lista.get(i).getNombre()+ " "+
          lista.get(i).getRaza()+" "+
          lista.get(i).getPeso()+" "+lista.get(i).getEdad()+
           lista.get(i).getEnfermedad());
       }//for
    }//void mostrar RAM
     static final String NOMBRE_ARCHIVO="prueba.dat";
     FileOutputStream ficheroTextoSalida; //guardar en archivo texto
     DataOutputStream ficheroBinarioSalida;  //guardar archivo texto en binaria en disco 
     void almacenarDisco() { //ALMACENAR EN DISCO
        try{  
            ficheroTextoSalida = new FileOutputStream(NOMBRE_ARCHIVO,true);
            ficheroBinarioSalida = new DataOutputStream(ficheroTextoSalida);
             for(int i=0;i<lista.size();i++){         
                 System.out.println("...almacenandooooooo.....   ");
                ficheroBinarioSalida.writeUTF(lista.get(i).getNombre());
                ficheroBinarioSalida.writeUTF(lista.get(i).getRaza());
                ficheroBinarioSalida.writeDouble(lista.get(i).getPeso());
                ficheroBinarioSalida.writeLong(lista.get(i).getEdad());
                ficheroBinarioSalida.writeUTF(lista.get(i).getEnfermedad());
                ficheroBinarioSalida.writeFloat(lista.get(i).getEstatura());
                ficheroBinarioSalida.writeChar(lista.get(i).getSexo());    
           }//for      
               ficheroBinarioSalida.close();
               ficheroTextoSalida.close();
         }//try
        catch(FileNotFoundException e){
        System.out.println("error en archivos.fin");
    }//catch
      catch(Exception error){ 
        System.out.println("error en disco "+error);
      }//catch             
    }//almacenar en Disco
     FileInputStream ficheroTextoEntrada; //
     DataInputStream ficheroBinarioEntrada; 
     void MostrarDisco() {
     try{
     ficheroTextoEntrada = new FileInputStream("prueba.dat");
     ficheroBinarioEntrada = new DataInputStream(ficheroTextoEntrada);
     System.out.println("archivo en disco es: " +NOMBRE_ARCHIVO);
     System.out.println(" N O M B R E   "+"  R  A  Z  A  "+"PESOD "+" EDAD "+" ENFERMEDAD "+"ESTATURA "+"SEXO"); 
     while (ficheroBinarioEntrada.available()!=0)
     { System.out.print(" Nombre: "+ficheroBinarioEntrada.readUTF());  
       System.out.print("   Raza:   "+ficheroBinarioEntrada.readUTF());        
       System.out.print("   Peso:  "+ficheroBinarioEntrada.readDouble());
       System.out.print(("  Edad:       "+ficheroBinarioEntrada.readLong()));
       System.out.print(("  Enfermedad: "+ficheroBinarioEntrada.readUTF()));
       System.out.print(("  Estatura: "+ficheroBinarioEntrada.readFloat()));
       System.out.print(("  Sexo: "+ficheroBinarioEntrada.readChar()));
       System.out.println(" ");
     }
      ficheroBinarioEntrada.close();
      ficheroTextoEntrada.close();
    }//try
    catch(FileNotFoundException e){
        System.out.println("error en archivos.fin");
    }//catch
    catch(Exception error){ 
        System.out.println("error en disco "+error);
     }//catch
     }//MOSTRAR EN DISCO
     void mayor(){
        int ed;
        long mayor=lista.get(0).getEdad();
        for(int i=1;i<lista.size();i++){
           if (lista.get(i).getEdad()>mayor) 
               mayor=lista.get(i).getEdad();  
         }
         System.out.println("el mayor es: "+mayor);
        //JOptionPane.showMessageDialog(null,"EL MAYOR ES  "+mayor);             
     }
    public static void main(String[] args) throws IOException {
        char otro;
        String nombre2,raza2,enfermedad;
        double peso;
        long edad;
        float estatura;
        char sexo;
        short codigo;
        ArchivoMascota objeto=new ArchivoMascota(" "," ",0.0,0,0,'M',(short) 222, "gripa");
       //Historial objeto2=new Historial((short)0," ");
       BufferedReader leer2=new BufferedReader  (new InputStreamReader(System.in));
       Scanner leer=new Scanner(System.in);
        int opcion=0;
        do{
           System.out.println("1.-Altas");
           System.out.println("2.-Mostrar ");
           System.out.println("3.-Guardar en Disco");
           System.out.println("4.-Mostrar Disco");
           System.out.println("5.-Salir");
           System.out.println(" selecciona una opcion 1-5...");
           opcion=leer.nextInt();
        switch(opcion){
            
            case 1:    
        do{    
        System.out.println(" ");
        System.out.println("Capturar Nombre: ");
        nombre2=leer2.readLine();
        int c=0;
        System.out.println("Capturar Raza: ");
        raza2=leer2.readLine();
        System.out.println("Peso:");
        peso=leer.nextDouble();
        System.out.println("Edad: ");
        edad=leer.nextLong();
        System.out.println("Capturar Estatura: ");
        estatura=leer.nextFloat();
        System.out.println("Char sexo H - M");
        sexo=leer.next().charAt(0);  
        System.out.println("dar codigo");
        codigo=leer.nextShort();
        System.out.println("Enfermedad: ");
        enfermedad=leer2.readLine();         
       objeto.setNombre(nombre2);
       objeto.setRaza(raza2);
       objeto.setPeso(peso);
       objeto.setEdad(edad);
       objeto.setEstatura(estatura);
       objeto.setSexo(sexo);
       objeto.setCodigo((short) codigo);          
       objeto.setCodigo((short) codigo);
       objeto.setEnfermedad(enfermedad);       
       System.out.println("\n");
       System.out.println("Otra Captura s/n... ");
       otro=leer.next().charAt(0);
       objeto.almacenarRAM();     
     }while(otro=='s');
     break;
     case 2: objeto.Mostrar(); break;
      case 3: objeto.almacenarDisco(); break;
      case 4: objeto.MostrarDisco(); break;
      case 5: objeto.mayor(); break;  
    }//switch
        }while(opcion!=5);    
}
}
