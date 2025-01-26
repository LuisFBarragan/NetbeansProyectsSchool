
package hotel2;
import java.util.Scanner;
public class Hotel2 {
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       cliente cte=new cliente(" "," "," ");
       Reservacion rep=new Reservacion(194,"00:00","12:00","recepcionista",666,"ocupado","cajeme","312-143-682-3","kk");
       Habitacion hab=new Habitacion(666,"ocupado","cajeme","312-143-682-3","kk");
       String nombre; String cell; String domicilio; String namerep;
       int op=0; int cuenta; int habit; String ent; String sal; String estado; int numhab; int cuentacan;
       do{
        System.out.println("1.- llenar estado de habitaciones  ");
        System.out.println("2.- mostara habitaciones disponibles");
        System.out.println("3.- Ficha de recepcion");
        System.out.println("4.- mostrar clientes atendidos");
        System.out.println("5.- mostrar la ficha de recepcion");
        System.out.println("6.- mostrar las habitaciones ocupadas");
        System.out.println("7.- cancelar reservacion");
        System.out.println("8.- salir");
        System.out.println("elije una opcion");
        op=read.nextInt();
        switch(op){
            case 1:
                for ( numhab = 0; numhab <3; numhab++) {
                System.out.println("da estado de habitacion");
                estado=read.next();
                hab.setEstado(estado);
                hab.setNhab(numhab);
                hab.registrarHab();
                }               
                break;
            case 2:
                hab.mostrarHab();
                break;
            case 3:
                System.out.println("da nombre");
                nombre=read.next();
                cte.setNombre(nombre);
                rep.setNombre(nombre);
                System.out.println("da telefono");
                cell=read.next();
                cte.setTelefono(cell);
                rep.setTelefono(cell);
                System.out.println("da domicilio");
                domicilio=read.next();
                cte.setDomicilio(domicilio);
                rep.setDomicilio(domicilio);
                System.out.println("asigna num cuenta");
                cuenta=read.nextInt();
                rep.setCuenta(cuenta);
                System.out.println("da hora de entrada");
                ent=read.next();
                rep.setEntrada(ent);
                System.out.println("da salida");
                sal=read.next();
                rep.setSalida(sal);
                System.out.println("da nombre de la recepcionista que lo atendio");
                namerep=read.next();
                rep.setNamerep(namerep); 
                System.out.println("asignar habitacion");
                habit=hab.asignarHab();
                rep.setNhab(habit);     
                cte.registrarCte();
                rep.registrarRev();
                break;
            case 4:
                cte.mostrarCte();
                break;
            case 5:
                rep.mostrarRev();
                break;    
            case 6:
                hab.mostaraOcupadas();
                break;
            case 7:
                System.out.println("da num de cuenta");
                cuentacan=read.nextInt();
                rep.removeRev(cuentacan);
        }          
        }while(op!=7);
       
    }
}
