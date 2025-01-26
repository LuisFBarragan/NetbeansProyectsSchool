package productospercedderos;
import java.util.ArrayList;
import java.util.Scanner;
abstract class ClaseAbst{
    abstract void mostrarAbst();  
}
class Productos extends ClaseAbst{
    int clave;
    String descripcion;
    int existencias;
    public void mostrarAbst(){}
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getExistencias() {
        return existencias;
    }
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
      Scanner read=new Scanner (System.in);
}
class Percederos extends Productos{
    String caducidad;
    Percederos(int clave, String descripcion, int existencias, String caducidad){
        this.clave=clave;
        this.descripcion=descripcion;
        this.existencias=existencias;
        this.caducidad=caducidad;
    }
    public String getCaducidad() {
        return caducidad;
    }
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    ArrayList<Percederos> per=new ArrayList();
    void RegistrarPer(){
        per.add(new Percederos(getClave(),getDescripcion(),getExistencias(),getCaducidad()));
    }
    public void mostrarAbst(){
        for (int i = 0; i < per.size(); i++) {
            System.out.println("Nombre: "+per.get(i).getDescripcion()+" clave del Producto: "+per.get(i).getClave()+" Caducidad: "
                    +per.get(i).getCaducidad()+" Existencias: "+per.get(i).getExistencias());
        }
    }
         void aumentarPer(int cant){
        int suma, hay; 
        for (int i = 0; i <per.size(); i++) {
         hay=per.get(i).getExistencias();
            suma=hay+cant;
            per.get(i).existencias=suma;
        }
    }
         void DisminuirPer(int dism){
        int resta, hay2; 
        for (int i = 0; i <per.size(); i++) {
         hay2=per.get(i).getExistencias();
            resta=hay2-dism;
          per.get(i).existencias=resta;
        }
    }
    }
class NoPercederos extends Productos{
  int limiteExist;
   NoPercederos(int clave, String descripcion, int existencias,int limiteExist){
        this.clave=clave;
        this.descripcion=descripcion;
        this.existencias=existencias;
        this.limiteExist=100;
    }
    public int getLimiteExist() {
        return limiteExist;
    }
    public void setLimiteExist(int limiteExist) {
        this.limiteExist = limiteExist;
    }
   ArrayList<NoPercederos> nop=new ArrayList();
void RegistrarNoPer(){
        nop.add(new NoPercederos(getClave(),getDescripcion(),getExistencias(),getLimiteExist()));
    }
public void mostrarAbst(){
        for (int i = 0; i < nop.size(); i++) {
            System.out.println("Nombre: "+nop.get(i).getDescripcion()+" clave del Producto: "+nop.get(i).getClave()+" Existencias: "+
                    nop.get(i).getExistencias()+" Limite de existencias: "+nop.get(i).getLimiteExist());
        }
    }
void aumentarNoper(int cant){
        int suma, afca, hay; 
        for (int i = 0; i <nop.size(); i++) {
         hay=nop.get(i).getExistencias();
            suma=hay+cant;
            if(suma>=100){
                afca=suma-100;
                System.out.println("se paso del limite por: "+afca);
            }
            nop.get(i).existencias=suma;   
        }
}
void DisminuirNoper(int dism){
        int resta, hay2; 
        for (int i = 0; i <nop.size(); i++) {
         hay2=nop.get(i).getExistencias();
            resta=hay2-dism;
          nop.get(i).existencias=resta;
        }
    }
}
public class ProductosPercedderos {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        Percederos p=new Percederos(1009,"pan",12,"12-12-2012");
        NoPercederos n=new NoPercederos(1009,"pan",12,100);
        int op; int c,c1,e,e1=0,l; String d,d1,caduci;
        do{
        System.out.println("1.- Registrar");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Aumentar");
        System.out.println("4.- Disminuir");
        System.out.println("5.- salir");
        System.out.println("Elije una opcion");
        op=read.nextInt();
        switch(op){
            case 1:
                int pon;
                System.out.println("Percederos=1/No percederos=2");
                System.out.println("elije una Opcion");
                pon=read.nextInt();
                if (pon==1) {
                    System.out.println("Da la clave");
                    c=read.nextInt(); p.setClave(c);
                    System.out.println("Da descripcion");
                    d=read.next(); p.setDescripcion(d);
                    System.out.println("Da existencias");
                    e=read.nextInt(); p.setExistencias(e);
                    System.out.println("Ingresa la fecha de caducidad");
                    caduci=read.next(); p.setCaducidad(caduci);
                    p.RegistrarPer();
                }
                if (pon==2) {
                    int caca=0;
                    System.out.println("Da la clave");
                    c1=read.nextInt(); n.setClave(c1);
                    System.out.println("Da descripcion");
                    d1=read.next(); n.setDescripcion(d1);
                    do{
                    System.out.println("Da existencias");
                    e1=read.nextInt();
                        if (e1<=100) {
                         n.setExistencias(e1);
                    n.RegistrarNoPer();   caca=1; 
                        }                  
                }while(caca==1);
                }
                break;
            case 2:
                int ponm;
                System.out.println("Percederos=1/No percederos=2");
                System.out.println("elije una Opcion");
                ponm=read.nextInt();
                if (ponm==1) {
                    p.mostrarAbst();
                }
                if(ponm==2){
                    n.mostrarAbst();
                }
                break;
            case 3:
                int pona;
                System.out.println("Percederos=1/No percederos=2");
                System.out.println("elije una Opcion");
                pona=read.nextInt();
                if (pona==1) {
                    int cant;
                    System.out.println("da la cantidad a aumentar");
                    cant=read.nextInt();
                    p.aumentarPer(cant);
                }
                if (pona==2) {
                    int cant;
                    System.out.println("da la cantidad a aumentar");
                    cant=read.nextInt();
                    n.aumentarNoper(cant);
                }
                break;
            case 4:
                int pond;
                System.out.println("Percederos=1/No percederos=2");
                System.out.println("elije una Opcion");
                pond=read.nextInt();
                if (pond==1) {
                    int dism;
                    System.out.println("da la cantidad a disminuir");
                    dism=read.nextInt();
                    p.DisminuirPer(dism);
                }
                if (pond==2) {
                    int dism;
                    System.out.println("da la cantidad a disminuir");
                    dism=read.nextInt();
                    n.DisminuirNoper(dism);
        }
        }//switch
    }while(op!=5);
        }
}