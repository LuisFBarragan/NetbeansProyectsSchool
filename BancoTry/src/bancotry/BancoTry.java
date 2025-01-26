package bancotry;

import java.util.Scanner;

public class BancoTry {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cliente obj=new Cliente(1234,"Marcelo",3999.99,1105,"@gmail.com");
        int op=0, error=0;
        
        int cuenta;
        String nombre;
        int nip;
        String email = null;
        
        while(op!=10){
            try{
            System.out.println("\n-MENU SISTEMA BANCARIO-");
            System.out.println("1.-Registrar cliente");
            System.out.println("2.-Mostrar datos de un cliente");
            System.out.println("3.-Modificar datos de un cliente");
            System.out.println("4.-Eliminar datos de un cliente");
            System.out.println("5.-Depositar a una cuenta");
            System.out.println("6.-Retirar de una cuenta");
            System.out.println("7.-Mostrar todos los datos de los clientes (Administrador)"); //NIP DE ADMINISTRADOR: 666
            System.out.println("8.-Mostrar saldos mayores a un dato leido (Administrador)");
            System.out.println("9.-Mostrar saldos menores a $1000 (Administrador)");
            System.out.println("10.-Salir");
            System.out.println("SELECCIONE UNA OPCION:");
            op=leer.nextInt();
            
            switch(op){
                case 1:
                    error=0;
                    System.out.println("\n-REGISTRO DE NUEVO CLIENTE-");
                    System.out.println("\nDame el nombre:");
                    nombre=leer.next();
                    while(error==0){
                        System.out.println("Dame el email:");
                        email=leer.next();
                        for (int i = 0; i < email.length(); i++) {
                            if (email.charAt(i)=='@') {
                                error=1;
                            }
                        }
                        if(error==0){
                            throw new Exception("El email no tiene '@'");
                        }
                    }
                    System.out.println("Dame el NIP:");
                    nip=leer.nextInt();
                    
                    cuenta= (int) (Math.random()*8999) + 1000;
                    System.out.println("Tu numero de cuenta es: "+cuenta);
                    
                    obj.setCuenta(cuenta);
                    obj.setNombre(nombre);
                    obj.setEmail(email);
                    obj.setNip(nip);
                    obj.setSaldo(0);
                    obj.registrar();
                    break;
                case 2:
                    obj.DatosCliente();
                break;
                case 3:
                    obj.Modificar();
                break;
                case 4:
                    obj.Eliminar();
                break;
                case 5:
                    obj.Depositar();
                break;
                case 6:
                    obj.Retirar();
                break;
                case 7:
                    obj.MostrarTodos();
                break;
                case 8:
                    obj.MostrarMayorL();
                break;
                case 9:
                    obj.MostrarMenores1K();
                break;
            }//switch
        }//try
            catch(NumberFormatException x){
                System.out.println("¡ERROR DE FORMATO! "+x);
            }
            catch(Exception z){
                System.out.println("¡ERROR!: "+z);
            }
    }//while
    
}

}