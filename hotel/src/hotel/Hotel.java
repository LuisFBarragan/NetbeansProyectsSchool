package hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) throws IOException {
     BufferedReader leerBuffer=new BufferedReader(new InputStreamReader(System.in));
     Scanner read=new Scanner (System.in);
     cliente objetoCte=new cliente(111," ","312-317-747-3", 1,"  ", " ", 0);
     recepcionista objetoRep=new recepcionista(111," ","312-317-747-3", 1,"  ", " ", 0, " ");
     
     int opcion=0; String nama; int edd, cont=0;
     int cuenta_cte, buscar;  String nombre; String celular; String col; String hor; int credit;
     String delate; String munip; String munipb;
     int modcuent; int ok; 
      String nameb; int tarjb; String colb; String horb; String nameborr;
      
        
     do{
        System.out.println("1.- Registrar ");
        System.out.println("2.- Mostrar ");
        System.out.println("3.- buscar");
        System.out.println("4.- borrar");
        System.out.println("5.- Edad igual");
        System.out.println("6.- modificar");
        System.out.println("7.- municipio");
        System.out.println("8.- promedio edades");
        System.out.println("9.- el 1ro");
        System.out.println("10.- el del medio");
        System.out.println("11.- el ultimo");
        System.out.println("12.-borrar un registro por nombre");
          System.out.println("13.-modoficar un registro");
          System.out.println("14.-buscar un registro por numero de tarjeta");
          System.out.println("15.-buscar por colonia");
          System.out.println("16.-buscar por horario");
          System.out.println("17.-contar cuantos son mayores de edad");
          System.out.println("18,.imprimir la edad mayor");
          System.out.println("19.-calcular el promedio de edades");
          System.out.println("20.-imprimir nombres que empiezan con la letra c");
        System.out.println("21.-Salir");
        System.out.println("selecciona una opcion ");
        opcion=read.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("da registro");
                System.out.println("cliente=0, repcepcionista=1");
                ok=read.nextInt();
                if(ok==0){
int fofa1=1;
                while(fofa1==1) {                
                System.out.println("Num. de cuenta");
                cuenta_cte=read.nextInt();               
      if (cuenta_cte>=100){       
          System.out.println(" Se acepto cuenta ");
           objetoCte.setCuenta(cuenta_cte);
      fofa1++;
      }      
      else{
          System.out.println("No se acepto la cuenta: ");
          
      }
                }
//______________________________________________________________________________
           int fofa5=0;  
        do{
                System.out.println("Nombre del Cliente");
                nombre=leerBuffer.readLine();    
    for (int i = 0; i < nombre.length(); i++) {
        if (nombre.charAt(i)=='0'|| nombre.charAt(i)=='1'||nombre.charAt(i)=='2'||nombre.charAt(i)=='3'||nombre.charAt(i)=='4'||nombre.charAt(i)=='5'||nombre.charAt(i)=='6'||nombre.charAt(i)=='7'||nombre.charAt(i)=='8'||nombre.charAt(i)=='9'){
            System.out.println("no se acepto ");          
        fofa5=1;
        } 
        else{
        fofa5++;
         objetoCte.setNombre(nombre); 
        }
    }
    if(fofa5==1){      
    }    
    }while(fofa5==1);                           
//____________________________________________________________________              
int at=1;
while(at==1) {  
                
                System.out.println("Celular");
                celular=leerBuffer.readLine();
     int pp=0;
      for (int i = 3; i <celular.length(); i=i+4) {
            
          if(celular.charAt(i)=='-'){
              pp=pp+1;       
      }//If    
      }//for
      if (pp==3){
              System.out.println("es valido: ");
               objetoCte.setCelular(celular);                  
      at++;
      }
          else
          {
              System.out.println("no es valido: ");
              
          }
        }
//_____________________________________________________________________________
int ett=1;
while(ett==1){
               System.out.println("da edad");
                edd=read.nextInt();
               if(edd<=99){     
                   
                if(edd>=18){
                    System.out.println("Es mayor de edad");
                    cont=cont+1;                   
                }
                else{
                    System.out.println("no es maor de edad");
                }
                   System.out.println("las personas mayores de edad son "+cont);
               objetoCte.setEdad(edd);
                  ett++;
               }
                
               else{
                   System.out.println("da edad otra vez");
                  
               }
//_____________________________________________________________________________
               System.out.println("da municipio");
               munipb=read.next();
               objetoCte.busformun(munipb);
}
                System.out.println("da colonia");
                col=read.next();
                objetoCte.setColonia(col);
                System.out.println("da tarjeta");
                credit=read.nextInt();
                objetoCte.setTarjeta(ett);
                
               objetoCte.registrarClientes();
                }
//_________________________________________________________________________________________________
//______________________________________________________________________________________________________
//______________________________________________________________________________________________                
                else{
                    int fofa1=1;
                while(fofa1==1) {                
                System.out.println("Num. de cuenta");
                cuenta_cte=read.nextInt();               
      if (cuenta_cte>=100){       
          System.out.println(" Se acepto cuenta ");
           objetoRep.setCuenta(cuenta_cte);
      fofa1++;
      }      
      else{
          System.out.println("No se acepto la cuenta: ");
          
      }
                }
//______________________________________________________________________________
           int fofa5=0;  
        do{
                System.out.println("Nombre del Cliente");
                nombre=leerBuffer.readLine();    
    for (int i = 0; i < nombre.length(); i++) {
        if (nombre.charAt(i)=='0'|| nombre.charAt(i)=='1'||nombre.charAt(i)=='2'||nombre.charAt(i)=='3'||nombre.charAt(i)=='4'||nombre.charAt(i)=='5'||nombre.charAt(i)=='6'||nombre.charAt(i)=='7'||nombre.charAt(i)=='8'||nombre.charAt(i)=='9'){
            System.out.println("no se acepto ");          
        fofa5=1;
        } 
        else{
        fofa5++;
         objetoRep.setNombre(nombre); 
        }
    }
    if(fofa5==1){      
    }    
    }while(fofa5==1);                           
//____________________________________________________________________              
int at=1;
while(at==1) {  
                
                System.out.println("Celular");
                celular=leerBuffer.readLine();
     int pp=0;
      for (int i = 3; i <celular.length(); i=i+4) {
            
          if(celular.charAt(i)=='-'){
              pp=pp+1;       
      }//If    
      }//for
      if (pp==3){
              System.out.println("es valido: ");
               objetoRep.setCelular(celular);                  
      at++;
      }
          else
          {
              System.out.println("no es valido: ");
              
          }
        }
//_____________________________________________________________________________
int ett=1;
while(ett==1){
               System.out.println("da edad");
                edd=read.nextInt();
               if(edd<=99){     
                   
                if(edd>=18){
                    System.out.println("Es mayor de edad");
                    cont=cont+1;                   
                }
                else{
                    System.out.println("no es maor de edad");
                }
                   System.out.println("las personas mayores de edad son "+cont);
               objetoRep.setEdad(edd);
                  ett++;
               }
                
               else{
                   System.out.println("da edad otra vez");
                  
               }
//_____________________________________________________________________________
               System.out.println("da municipio");
               munipb=read.next();
               objetoRep.busformun(munipb);
}
                System.out.println("da colonia");
                col=read.next();
                objetoRep.setColonia(col);
                System.out.println("da tarjeta");
                credit=read.nextInt();
                objetoRep.setTarjeta(ett);
                    System.out.println("da horario");
                hor=read.next();
                objetoRep.setHorario(hor);
                objetoRep.registrar();
                }
                break;
                case 2:
                    System.out.println("da a mostrar");
                System.out.println("cliente=0, repcepcionista=1");
                ok=read.nextInt();
                if(ok==0){
                objetoCte.mostrarCliente();}
                else{objetoRep.mostarRep();}
                break;
                case 3:
                Scanner leer=new Scanner(System.in);
                System.out.println("da numero de cuenta");
                buscar=leer.nextInt();
                objetoCte.buscarCliente(buscar);
                break;
                case 4:
                   System.out.println("da  a eliminar");
                   delate=read.next();
                  objetoCte.borrarCliente(delate);
                case 5:
                    int eded;
                    System.out.println("da edad para comprovar");
                    eded=read.nextInt();
                    objetoCte.igualedCliente(eded);
                    break;
                case 6:
                    System.out.println("da numero de cuenta a modificar");
                    modcuent=read.nextInt();
                    
                    break;
                case 7:
                    System.out.println("da municipio");
                    munipb=read.next();
                    objetoCte.busformun(munipb);
                    break;
                case 8:
                    objetoCte.promed();
                    break;
                case 9:
                    objetoCte.primeromero();
                    break;
                case 10:
                    objetoCte.medio();
                    break;
                case 11:
                    objetoCte.end();
                     case 12:
                  System.out.println("Da nombre del registro a borrar");
                  nameborr=read.next();
                  objetoRep.borrarRep(nameborr);
                  break;
              case 13:
                  System.out.println("Da nombre a modificar");
                  nameb=read.next();
                  objetoRep.mostarRep();
                  break;
              case 14:
                  System.out.println("Da # de tarjeta a buscar");
                  tarjb=read.nextInt();
                  objetoRep.buscartarjRep(tarjb);
                  break;
              case 15:
                  System.out.println("Da colonia a bucar");
                  colb=read.next();
                  objetoRep.buscarcolRep(colb);
                  break;
              case 16:
                  System.out.println("Da horario a buscar");
                  horb=read.next();
                  objetoRep.buscarhorbRep(horb);
                  break;
              case 17:
                  objetoRep.mayorRep();
                  break;
              case 18:
                  int mmyor=0;
                  objetoRep.Mayorrep(mmyor);
                  break;
              case 19:
                  int cont00=0;
                  objetoRep.promedioedadrep(cont00);
                  break;
              case 20:
                  objetoRep.nemesc();
                  break;          
        }
        }while(opcion!=20);
    }
}