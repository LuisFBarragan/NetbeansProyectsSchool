package bancotry;

import bancotry.BancoTry;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    Scanner leer=new Scanner(System.in);
    BancoTry obj0=new BancoTry();
    int cuenta;
    String nombre;
    double saldo;
    int nip;
    String email;
    
    int nipadministrador=666;
    int error=0;

    public Cliente(int cuenta, String nombre, double saldo, int nip, String email) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.saldo = saldo;
        this.nip = nip;
        this.email = email;
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

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    ArrayList <Cliente> ListaCliente=new ArrayList();
    void registrar(){
        ListaCliente.add(new Cliente(getCuenta(), getNombre(), getSaldo(), getNip(), getEmail()));
    }
    void DatosCliente() throws Exception {
        int c;
        error=1;
        System.out.println("Dame la clave del cliente: ");
        c=leer.nextInt();
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getCuenta()==c) {
                error=0;
                System.out.println("Cuenta: "+ListaCliente.get(i).getCuenta()+"/ Nombre: "+ListaCliente.get(i).getNombre()+"/ Saldo: "+ListaCliente.get(i).getSaldo()+"/ Email: "+ListaCliente.get(i).getEmail());
            }
        }
        if (error==1) {
            error=0;
            throw new Exception("CUENTA NO ENCONTRADA");
        }
    }
    void Modificar() throws Exception{
        int c, n;
        String nnom, nemail;
        int nnip;
        error=1;
        System.out.println("Dame la clave: ");
        c=leer.nextInt();
        System.out.println("Dame el NIP: ");
        n=leer.nextInt();
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getCuenta()==c) {
                error=0;
                if (ListaCliente.get(i).getNip()==n) {
                    System.out.println("Dame el nuevo nombre:");
                    nnom=leer.next();
                    ListaCliente.get(i).setNombre(nnom);
                    System.out.println("Dame el nuevo email:");
                    nemail=leer.next();
                    ListaCliente.get(i).setEmail(nemail);
                    System.out.println("Dame el nuevo NIP:");
                    nnip=leer.nextInt();
                    ListaCliente.get(i).setNip(nnip);
                    System.out.println("DATOS MODIFICADOS CON EXITO");
                }
                else{
                    error=2;
                }
            }
        }
        if (error==2) {
            error=0;
            throw new Exception("NIP INCORRECTO");
        }
        if (error==1) {
            error=0;
            throw new Exception("CUENTA NO ENCONTRADA");
        }
    }//Modificar
    void Eliminar() throws Exception{
        int c, n;
        error=1;
        System.out.println("Dame la clave: ");
        c=leer.nextInt();
        System.out.println("Dame el NIP: ");
        n=leer.nextInt();
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getCuenta()==c) {
                error=0;
                if (ListaCliente.get(i).getNip()==n) {
                    ListaCliente.remove(i);
                    System.out.println("DATOS ELIMINADOS CON EXITO");
                }
                else{
                    error=2;
                }
            }
        }
        if (error==2) {
            error=0;
            throw new Exception("NIP INCORRECTO");
        }
        if (error==1) {
            error=0;
            throw new Exception("CUENTA NO ENCONTRADA");
        }
    }//Eliminar
    void Depositar() throws Exception{
        int c, n; 
        double deposito;
        error=1;
        System.out.println("Dame la clave: ");
        c=leer.nextInt();
        System.out.println("Dame el NIP: ");
        n=leer.nextInt();
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getCuenta()==c) {
                error=0;
                if (ListaCliente.get(i).getNip()==n) {
                    System.out.println("¿Cuanto deseas depositar?: ");
                    deposito=leer.nextDouble();
                    deposito=deposito+ListaCliente.get(i).getSaldo();
                    ListaCliente.get(i).setSaldo(deposito);
                    System.out.println("DEPOSITO REALIZADO CON EXITO");
                }
                else{
                    error=2;
                }
            }
        }
        if (error==2) {
            error=0;
            throw new Exception("NIP INCORRECTO");
        }
        if (error==1) {
            error=0;
            throw new Exception("CUENTA NO ENCONTRADA");
        }
    }//Depositar
    void Retirar() throws Exception {
        int c, n; 
        double retiro;
        error=1;
        System.out.println("Dame la clave: ");
        c=leer.nextInt();
        System.out.println("Dame el NIP: ");
        n=leer.nextInt();
        for (int i = 0; i < ListaCliente.size(); i++) {
            if (ListaCliente.get(i).getCuenta()==c) {
                error=0;
                if (ListaCliente.get(i).getNip()==n) {
                    System.out.println("¿Cuanto deseas retirar?: ");
                    retiro=leer.nextDouble();
                    retiro=ListaCliente.get(i).getSaldo()-retiro;
                    if (retiro<0) {
                        throw new Exception("NO CUENTA CON FONDOS SUFICIENTES PARA EL RETIRO");
                    }
                    ListaCliente.get(i).setSaldo(retiro);
                    System.out.println("RETIRO REALIZADO CON EXITO");
                }
                else{
                    error=2;
                }
            }
        }
        if (error==2) {
            error=0;
            throw new Exception("NIP INCORRECTO");
        }
        if (error==1) {
            error=0;
            throw new Exception("CUENTA NO ENCONTRADA");
        }
    }//Retirar
    void MostrarTodos() throws Exception{
        int nipa;
        System.out.println("Dame el NIP de administrador: ");
        nipa=leer.nextInt();
        if (nipa==nipadministrador) {
            for (int i = 0; i < ListaCliente.size(); i++) {
                System.out.println("Cuenta: "+ListaCliente.get(i).getCuenta()+"/ Nombre: "+ListaCliente.get(i).getNombre()+"/ Saldo: "+ListaCliente.get(i).getSaldo()+"/ Email: "+ListaCliente.get(i).getEmail()+"/ NIP: "+ListaCliente.get(i).getNip());
            }
        }
        else{
            throw new Exception("NIP DE ADMINISTRADOR INCORRECTO");
        }
    }//Mostrar Todos
    void MostrarMayorL() throws Exception{
        int s, nipa;
        System.out.println("Dame el saldo minimo");
        s=leer.nextInt();
        System.out.println("Dame el NIP de administrador: ");
        nipa=leer.nextInt();
        if (nipa==nipadministrador) {
            for (int i = 0; i < ListaCliente.size(); i++) {
                if(ListaCliente.get(i).getSaldo()>s){
                    System.out.println("Cuenta: "+ListaCliente.get(i).getCuenta()+"/ Nombre: "+ListaCliente.get(i).getNombre()+"/ Saldo: "+ListaCliente.get(i).getSaldo()+"/ Email: "+ListaCliente.get(i).getEmail()+"/ NIP: "+ListaCliente.get(i).getNip());
                }
            }
        }
        else{
            throw new Exception("NIP DE ADMINISTRADOR INCORRECTO");
        }
    }
    void MostrarMenores1K() throws Exception{
        int nipa;
        System.out.println("Dame el NIP de administrador: ");
        nipa=leer.nextInt();
        if (nipa==nipadministrador) {
            for (int i = 0; i < ListaCliente.size(); i++) {
                if(ListaCliente.get(i).getSaldo()<1000){
                    System.out.println("Cuenta: "+ListaCliente.get(i).getCuenta()+"/ Nombre: "+ListaCliente.get(i).getNombre()+"/ Saldo: "+ListaCliente.get(i).getSaldo()+"/ Email: "+ListaCliente.get(i).getEmail()+"/ NIP: "+ListaCliente.get(i).getNip());
                }
            }
        }
        else{
            throw new Exception("NIP DE ADMINISTRADOR INCORRECTO");
        }
    }
}
