package datosbancarios2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class DatosBancarios2 {
int cuenta;
String nombre;
double saldo;
String email;
DatosBancarios2(int cuenta,String nombre,double saldo,String email){
    this.cuenta=cuenta;
    this.nombre=nombre;
    this.saldo=saldo;
    this.email=email;
}

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
ArrayList <DatosBancarios2> list=new ArrayList();
BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
   Scanner leer2=new Scanner (System.in);
   void registrar(){
       list.add(new DatosBancarios2(getCuenta(),getNombre(),getSaldo(),getEmail()));
   }
   void modificar() throws IOException{
      try{
       int bus;
       System.out.println("ingresa la cuenta a buscar ");
       bus=leer2.nextInt();
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).cuenta==bus){
               System.out.println("ingresa la cuenta nueva");
               list.get(i).cuenta=Integer.parseInt(leer.readLine());
               System.out.println("ingresa nuevo nombre");
               list.get(i).nombre=leer.readLine();
               System.out.println("ingresa saldo nuevo");
               list.get(i).saldo=leer2.nextDouble();
               if(list.get(i).saldo<=0){
                   throw new Exception("Exception lanzada desde try");
               }
                int v=0;
           while(v!=1){
                System.out.println("ingrese el email del cliente");
               list.get(i).email=leer.readLine();
               for (int j = 0; j < list.get(i).email.length(); j++) {
                   if(list.get(i).email.charAt(j)=='@'){
                       v=1;
                   }
               }
               if(v!=1){
                   System.out.println("email incorrecto");
               }
           
           }
           }
       }
   }
       catch(NumberFormatException z){
        System.out.println("SE ATRAPO UN ERROR DE FORMATO... "+z);
        modificar();
    }
         catch(Exception x){
           System.out.println("SE ATRAPO UN ERROR..SALDO IGUAL O MENOR A 0");
           modificar();
       } 
   }
   void mostrarCliente(){
       int bus=0;
       System.out.println("ingresa la cuenta a mostrar");
       bus=leer2.nextInt();
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).cuenta==bus){
               System.out.println("");
               System.out.println(""+list.get(i).cuenta+"  "+list.get(i).nombre+"   "+list.get(i).saldo+"   "+list.get(i).email);
           }
       }
   }
   void eliminar(){
       int bus=0;
       System.out.println("ingresa la cuenta del registro a eliminar");
       bus=leer2.nextInt();
       for (int i = 0; i < list.size(); i++) {
          if(list.get(i).cuenta==bus) {
              list.remove(i);
              System.out.println("registro eliminado");
          }
       }
   }
   void deposito() throws IOException{
      try{
       int bus=0; double depo;
       System.out.println("ingresa la cuenta a depositar");
       bus=Integer.parseInt(leer.readLine());
          for (int i = 0; i < list.size(); i++) {
              if(list.get(i).cuenta==bus){
                  System.out.println("ingrese el monto a depositar");
                  depo=leer2.nextDouble();
                  list.get(i).saldo=list.get(i).saldo + depo;
              }
          }
   }
      catch(NumberFormatException z){
        System.out.println("SE ATRAPO UN ERROR DE FORMATO... "+z);
        deposito();
    }
   }
   void retiro() throws IOException{
       try{
           int bus=0; double reti;
           System.out.println("ingresa la cuenta para retirar");
           bus=Integer.parseInt(leer.readLine());
           for (int i = 0; i < list.size(); i++) {
               if(list.get(i).cuenta==bus){
                   System.out.println("ingrese el monto a retirar");
                   reti=leer2.nextDouble();
                  list.get(i).saldo=list.get(i).saldo - reti; 
               }
           }
       }
       catch(NumberFormatException z){
        System.out.println("SE ATRAPO UN ERROR DE FORMATO... "+z);
        retiro();
   }
   }
   void mostrarTodo(){
       for (int i = 0; i < list.size(); i++) {
            System.out.println(""+list.get(i).cuenta+"  "+list.get(i).nombre+"   "+list.get(i).saldo+"   "+list.get(i).email);
       }
   }
   void saldoMayores(){
       double mayores=0;
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).saldo>mayores){
               System.out.println(""+list.get(i).cuenta+"  "+list.get(i).nombre+"   "+list.get(i).saldo+"   "+list.get(i).email);
           }
       }
   }
   void saldoMenores(){
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).saldo<1000){
              System.out.println(""+list.get(i).cuenta+"  "+list.get(i).nombre+"   "+list.get(i).saldo+"   "+list.get(i).email);  
           }
       }
   }
    public static void main(String[] args) throws IOException {
       DatosBancarios2 objeto=new DatosBancarios2(22,"",22.5,"");
       BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
   Scanner leer2=new Scanner (System.in);
   int opcion=0;
   do{
       System.out.println("1.- ingresar datos");
       System.out.println("2.- modificar un registro");
       System.out.println("3.- mostrar un registro");
       System.out.println("4.- eliminar un registro");
       System.out.println("5.- depositar a cuenta");
       System.out.println("6.- retirar a cuenta");
       System.out.println("7.- mostrar todos los registros");
       System.out.println("8.- reporte de saldos mayores a un dato leido desde teclado");
       System.out.println("9.- reporte de saldos menores a 1000");
       System.out.println("10.-salir");
       opcion=leer2.nextInt();
       switch(opcion){
           case 1:
               try{ 
                   int cuenta; String nombre,email=""; double saldo;
                   saldo=0;
                    System.out.println("ingrese el numero de cuenta");
           cuenta=Integer.parseInt(leer.readLine());
           System.out.println("ingrese el nombre del cliente");
           nombre=leer.readLine();
           System.out.println("ingrese el saldo");
           saldo=leer2.nextDouble();
           if(saldo<=0){
               throw new Exception("Exception lanzada desde try");
           }
           int v=0;
           while(v!=1){
               System.out.println("ingrese el email del cliente");
               email=leer.readLine();
               for (int j = 0; j < email.length(); j++) {
                   if(email.charAt(j)=='@'){
                       v=1;
                   }
               }
               if(v!=1){
                   System.out.println("email incorrecto");
               }
           }
           objeto.setCuenta(cuenta);
           objeto.setNombre(nombre);
           objeto.setSaldo(saldo);
           objeto.setEmail(email);
           
           objeto.registrar();
           
               }
               catch(NumberFormatException z){
        System.out.println("SE ATRAPO UN ERROR DE FORMATO... "+z);
    }
                catch(Exception x){
           System.out.println("SE ATRAPO UN ERROR..SALDO IGUAL O MENOR A 0"+x);
             objeto.registrar();
       }
               break;
           case 2:
               objeto.modificar();
               break;
           case 3:
               objeto.mostrarCliente();
               break;
           case 4:
               objeto.eliminar();
               break;
           case 5:
               objeto.deposito();
               break;
           case 6:
               objeto.retiro();
               break;
           case 7:
               objeto.mostrarTodo();
               break;
           case 8:
               objeto.saldoMayores();
               break;
           case 9:
               objeto.saldoMenores();
               break;
       }
   }while(opcion!=10);
    }
    
}