
package sistemacontrolbancario3;

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
public class Sistemacontrolbancario3 {
int cuenta;
    String cliente;  
    double saldo;
    String correo; 
    Sistemacontrolbancario3(int cuenta,String cliente,double saldo,String correo){
        this.cuenta=cuenta;
        this.cliente=cliente;
        this.saldo=saldo;
        this.correo=correo;
    }
    public int getCuenta() {
        return cuenta;
    }
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    Scanner read1=new Scanner(System.in);
    BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Sistemacontrolbancario3> baka=new ArrayList();
    void registro(){
     baka.add(new Sistemacontrolbancario3(getCuenta(),getCliente(),getSaldo(),getCorreo()));   
    }
    void mostrar(){
        for (int j = 0; j < baka.size(); j++) {
            System.out.println(" cuenta:  "+  baka.get(j).getCuenta()+"nombre: "+baka.get(j).getCliente()+" saldo: "+baka.get(j).getSaldo()+" correo: "+baka.get(j).getCorreo()
            );
        }
}
    static final String Nombre_Archivo="prueba.dat";
    FileOutputStream GuardTex;
    DataOutputStream GuardTexBi;
    void GuardarRam(){
        try{
            GuardTex=new FileOutputStream(Nombre_Archivo,true);
            GuardTexBi=new DataOutputStream(GuardTex);
            for (int i = 0; i < baka.size(); i++) {
               GuardTexBi.writeInt(baka.get(i).getCuenta());
               GuardTexBi.writeUTF(baka.get(i).getCliente());
               GuardTexBi.writeDouble(baka.get(i).getSaldo());
               GuardTexBi.writeUTF(baka.get(i).getCorreo());
           }//for
        GuardTexBi.close();
             GuardTex.close();
        }
          catch(FileNotFoundException er1){
          System.out.println("error en archivos.fin  "+er1); 
       }//catch not
       catch(Exception er2){
           System.out.println("error en disco "+er2);
       }//catch tó  
    }
    FileInputStream TexMost;
    DataInputStream TexMostBi;
    void MoCD() throws FileNotFoundException, IOException{
      try{
       TexMost=new FileInputStream("prueba.dat");  
       TexMostBi=new DataInputStream(TexMost);
       System.out.println("archivo en disco es: " +Nombre_Archivo);
       while(TexMostBi.available()!=0){
           System.out.println("Cuenta: "+TexMostBi.readInt());
           System.out.println("Cliente: "+TexMostBi.readUTF());
           System.out.println("Saldo: "+TexMostBi.readDouble());
           System.out.println("Correo: "+TexMostBi.readUTF());
       }
      TexMostBi.close();
       TexMost.close();
      }
      catch(FileNotFoundException er1){
          System.out.println("error en archivos.fin  "+er1);
      }
      catch(Exception er2){
          System.out.println("error en disco "+er2);
      } 
    }
   void Modificar(int cuentacam) {
        int op=0; 
        try{
        for (int i = 0; i < baka.size(); i++) {
            if (cuentacam==baka.get(i).getCuenta()) {
                System.out.println("Da nuevo nombre");
                baka.get(i).cliente=leer.readLine();
                for (int j = 0; j < cliente.length(); j++) {
                 if (cliente.charAt(j)=='0'&& cliente.charAt(j)=='1'&&cliente.charAt(j)=='2'&&cliente.charAt(j)=='3'&&
                         cliente.charAt(j)=='4'&&cliente.charAt(j)=='5'&&cliente.charAt(j)=='6'&&cliente.charAt(j)=='7'&&
                         cliente.charAt(j)=='8'&&cliente.charAt(j)=='9'){
                  throw new Exception("Exception marcada desde try");
                         }

                System.out.println("da correo");
                baka.get(i).correo=read1.next();
            }//for try
             System.out.println("Da el # de cuenta nuevo");
            baka.get(i).cuenta=read1.nextInt(); 
            System.out.println("Da el saldo nuevo");
              baka.get(i).saldo=read1.nextDouble(); 
            if (saldo<=0) {
            throw new Exception ("Exception marcada desde try");
        }
            System.out.println("Da  el corre nuevo");
              baka.get(i).correo=read1.next();
            for (int j = 0; j < correo.length(); j++) {
                    if (correo.charAt(j)=='@') {
                        op++;
                    }
                    if(op==0||op>=2){
                        throw new Exception("Exception marcada desde try");
                    }
            }   
        }//if buscar        
    }//for buscar  
       
    }
        catch(NumberFormatException z){
                System.out.println("SE ATRAPA UN ERROR DE FORMATO....."+z);
       
      
            }
        catch(Exception y){
            System.out.println("Error arrojado desde el try... "+y);
        }
    }
    void delete(int cuentacam2){
        for (int i = 0; i < baka.size(); i++) {
            if (cuentacam2==baka.get(i).getCuenta()) {
                baka.remove(i);
                System.out.println("Se elimino la cuenta ");
            }
            else{
                System.out.println("No se encontro la cuenta");
            }
        }
    }
    void depositar(int cuentadep){
        double sum,hay,dep;
        for (int i = 0; i < baka.size(); i++) {
            if (cuentadep==baka.get(i).getCuenta()) {
                System.out.println("Da catidad que se desea depositar");
                dep=read1.nextInt();
                hay=baka.get(i).getSaldo();
              sum=hay+dep;
              baka.get(i).saldo=sum;
                System.out.println("saldo nuevo: "+sum);
            }
        }
    }
    void retirar(int cuentaret){
        double hay2, ret, resta;
        for (int i = 0; i < baka.size(); i++) {
            if (cuentaret==baka.get(i).getCuenta()) {
                System.out.println("Da la cantidad a retirar");
                ret=read1.nextDouble();
                hay2=baka.get(i).getSaldo();
                resta=hay2-ret;
                
                System.out.println("La cantidad que quedo es "+resta);
            }
        }
    }
    void datoscliente(int cuentamost){
        for (int i = 0; i < baka.size(); i++) {
            if (cuentamost==baka.get(i).getCuenta()) {
             System.out.println("nombre: "+baka.get(i).getCliente()+" correo: "+baka.get(i).getCorreo()+" saldo: "+baka.get(i).getSaldo()+
                    baka.get(i).getCuenta());   
            }
        }
    }
    void saldoM100(){
        for (int i = 0; i < 10; i++) {
            if (baka.get(i).getSaldo()>100) {
             System.out.println("nombre: "+baka.get(i).getCliente()+" correo: "+baka.get(i).getCorreo()+" saldo: "+baka.get(i).getSaldo()+
                    baka.get(i).getCuenta());   
            }
        }
}
    public static void main(String[] args) throws Exception {
       Scanner read=new Scanner(System.in);
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
       Sistemacontrolbancario3 obj=new Sistemacontrolbancario3(12345,"Juan",1529.9,"juan@gmail.com");
       int opcion=0;    
        int cuenta;
    String cliente;
    double saldo;
    String correo; int i=0, op=0;
   do{
           System.out.println("1.- registrar");
           System.out.println("2.- mostrar");
           System.out.println("3.- Almacenar en Disco");
           System.out.println("4.- Mostrar Disco");
           System.out.println("5.- modificar");
           System.out.println("6.- eliminar");
           System.out.println("7.- depositar");
           System.out.println("8.- retirar");
           System.out.println("9.- mostrar datos de un cliente");
           System.out.println("10.- saldos>100");
           System.out.println("11.- salir");
           System.out.println("elije una opcion ");
           opcion=read.nextInt();
           switch(opcion){
               case 1:
                   try{
            System.out.println("Da # de cuenta");
            cuenta=read.nextInt();
            System.out.println("Da nombre del cliente");
            cliente=read.next(); 
                for (int j = 0; j < cliente.length(); j++) {
                 if (cliente.charAt(j)=='0'|| cliente.charAt(j)=='1'||cliente.charAt(j)=='2'||cliente.charAt(j)=='3'||
                         cliente.charAt(j)=='4'||cliente.charAt(j)=='5'||cliente.charAt(j)=='6'||cliente.charAt(j)=='7'||
                         cliente.charAt(j)=='8'||cliente.charAt(j)=='9'){
                  throw new Exception("Exception marcada desde try");
                         }
                 }//for     
                 System.out.println("Da saldo");
            saldo=read.nextDouble();
            if (saldo<=0) {
            throw new Exception ("Exception marcada desde try");
        }
           System.out.println("da correo");
            correo=leer.readLine();
            for (int j = 0; j < correo.length(); j++) {
                    if (correo.charAt(j)=='@') {
                        op=1;
                    }      
            }
            if(op==0||op>=2){
                        throw new Exception("Exception marcada desde try");
                    }
            obj.setCuenta(cuenta);
            obj.setCliente(cliente);
            obj.setSaldo(saldo);
            obj.setCorreo(correo);
            obj.registro(); 
                       
                   }
                   catch(NumberFormatException z){
                System.out.println("SE ATRAPA UN ERROR DE FORMATO....."+z);
                   }
                   catch(Exception y){
                System.out.println("SE PRODUCIO UN ERROR "+y);
                   obj.registro();
                   }
                   break;
               case 2:
                   obj.mostrar();
               break;
               case 3:
                   obj.GuardarRam(); break;
                   
               case 4:
                   obj.MoCD(); break;
               case 5:
                   int cuentacam;
                   System.out.println("# de cuenta de Cliente a modificar");
                   cuentacam=read.nextInt();
                   obj.Modificar(cuentacam);
                   break;
               case 6:
                   int cuentacam2;
                   System.out.println("# de cuenta de Cliente a eliminar");
                   cuentacam2=read.nextInt(); obj.delete(cuentacam2);
                   break;
               case 7: 
                   int cuentadep;
                   System.out.println("Da cuenta a depositar");
                   cuentadep=read.nextInt(); obj.depositar(cuentadep);
                   break;
               case 8:
                  int cuentaret;
                   System.out.println("da cuenta de la que deseas retirar");
                   cuentaret=read.nextInt(); obj.retirar(cuentaret);
                   break;
               case 9:
                   int cuentamost;
                   System.out.println("Da cuenta del cliente a mostar");
                   cuentamost=read.nextInt(); obj.datoscliente(cuentamost);
                   break;
               case 10:
                   obj.saldoM100();
                   break;
           }       
       }while(opcion!=11);
    }
}
