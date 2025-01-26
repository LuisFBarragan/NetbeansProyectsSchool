
package u3herencia;

import java.util.ArrayList;
import java.util.Scanner;
 class persona{
     String nombre;
      String apellido;
     String fechanaci;
      String nacionalida;
      String participacion;
     persona(String nombre, String apellido,String fechanaci, String nacionalida, String participacion){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechanaci=fechanaci;
        this.nacionalida=nacionalida;
        this.participacion=participacion;
     }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }
     Scanner read=new Scanner (System.in);
     ArrayList<persona> a=new ArrayList();
     void registrarPers(){
         a.add(new persona(getNombre(),getApellido(),getFechanaci(),getNacionalida(),getParticipacion()));
     }
     void mostarPers(){
         for (int i = 0; i <a.size(); i++) {
             System.out.println(" "+a.get(i).getNombre()+" "+a.get(i).getApellido()+" "+a.get(i).getFechanaci()+" "+
                     a.get(i).getParticipacion());
         }
     }
     void mostrarDirePers(){
         for (int i = 0; i < a.size(); i++) {
             String direc="director";
             if (a.get(i).getParticipacion().equals(direc)) {
                 System.out.println(" "+a.get(i).getNombre()+" "+a.get(i).getApellido()+" "+a.get(i).getFechanaci()+" "+
                     a.get(i).getParticipacion());
             }
         }
     }
     void mostrarxnacionalidadPers(String nacisearch){
         for (int i = 0; i < a.size(); i++) {
             if (a.get(i).getNacionalida().equals(nacisearch)) {
                 System.out.println(" "+a.get(i).getNombre()+" "+a.get(i).getApellido()+" "+a.get(i).getFechanaci()+" "+
                     a.get(i).getParticipacion());
             }
         }
     }
 }
//________________________________________________PELICULA______________________________________________________________________//
class pelicula extends persona{
    String sipnosis;
    String genero;
    int año;
    pelicula(String sipnosis, String genero, int año,String nombre, String apellido,String fechanaci, String nacionalida, String participacion){
        super(nombre,apellido,fechanaci, nacionalida,participacion);
        this.sipnosis=sipnosis;       
        this.genero=genero;
        this.año=año;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    ArrayList<pelicula> p=new ArrayList();
    Scanner read=new Scanner (System.in);
    
    void registarP(){
        p.add(new pelicula(getSipnosis(),getGenero(),getAño(),getNombre(),getApellido(),getFechanaci(),getNacionalida(), getParticipacion()));
    }
    void mostarP(){
        for (int i = 0; i < 10; i++) {        
        System.out.println(" "+p.get(i).getNombre()+" "+p.get(i).getSipnosis()+" "+p.get(i).getFechanaci()+" "+p.get(i).getGenero()); 
    }
    }
    void mostaregeP(int añosearch){
        for (int i = 0; p.size()< 10; i++) {
            if(añosearch==p.get(i).getAño()){
                System.out.println(" "+p.get(i).getNombre()+" "+p.get(i).getSipnosis()+" "+p.get(i).getFechanaci()+" "+p.get(i).getGenero());
            }
            else{
                System.out.println("no se encontro ninguna pelicula");
            }
        }
}
}

public class U3herencia {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        pelicula p=new pelicula("sipnosis","genero",2019,"nombre","apellido","fechanaci","naciona","parti");
        persona a=new persona("nombre", "apellido","fechanaci","naciona","parti");
       int op=0; String titulo,tipo,nombre,apellido,sipnosis,fechanaci,genero,nacionalida; int po,año, añosearch, po2; String nacisearch;
        do{
            System.out.println("1.- ingresa datos");
            System.out.println("2.- mostrar datos");
            System.out.println("3.- mostar por año");
            System.out.println("4.- mostar directores");
            System.out.println("5.- mostar personas por nacionalidad");
            System.out.println("6.- salir");
            System.out.println("elije una opcion");
            op=read.nextInt();
            switch(op){
                case 1:
                    System.out.println("que quieres registar");
                    System.out.println("1=pelicula, 2=elenco");
                    po=read.nextInt();
                    if(po==1){
                        System.out.println("da nombre de pelicula");
                    titulo=read.next();    p.setNombre(titulo);
                    System.out.println("da año de la pelicula");
                    año=read.nextInt(); p.setAño(año);
                    System.out.println("da genero");
                    genero=read.next();    p.setGenero(genero);
                    System.out.println("da sipnosis");
                    sipnosis=read.next();  p.setSipnosis(sipnosis);
                    System.out.println("da pais de origen");
                    nacionalida=read.next(); p.setNacionalida(nacionalida);
                    p.registarP();
                    }
                    else{
                        int popo=0;
                        while(popo==3){
                        System.out.println("director=1, actor=2, guinista=3");
                        po2=read.nextInt();
                       int popo1=0; while(popo1==1){
                        if (po2==1) {
                            System.out.println("da los datos del director");
                            System.out.println("da nombre del men");
                            titulo=read.next(); a.setNombre(titulo);
                            System.out.println("da fecha de nacimiento");
                            fechanaci=read.next(); a.setFechanaci(fechanaci);
                            System.out.println("da apllido");
                            apellido=read.next(); a.setApellido(apellido);
                            System.out.println("da nacionalidad");
                            nacionalida=read.next();   a.setNacionalida(nacionalida);
                            tipo="director"; a.setParticipacion(tipo);
                          popo++; popo1++;
                          a.registrarPers();
                        }}
                       int popo2=0; while(popo2==1){
                            if (popo==2) {
                                System.out.println("da los datos del director");
                            System.out.println("da nombre del men");
                            titulo=read.next(); a.setNombre(titulo);
                            System.out.println("da fecha de nacimiento");
                            fechanaci=read.next(); a.setFechanaci(fechanaci);
                            System.out.println("da apllido");
                            apellido=read.next(); a.setApellido(apellido);
                            System.out.println("da nacionalidad");
                            nacionalida=read.next();   a.setNacionalida(nacionalida);
                            tipo="actor"; a.setParticipacion(tipo);
                            popo2++; popo++;
                            a.registrarPers();
                            }}
                       int popo3=0; while(popo3==1){
                            if (popo==3) {
                            System.out.println("da los datos del director");
                            System.out.println("da nombre del men");
                            titulo=read.next(); a.setNombre(titulo);
                            System.out.println("da fecha de nacimiento");
                            fechanaci=read.next(); a.setFechanaci(fechanaci);
                            System.out.println("da apllido");
                            apellido=read.next(); a.setApellido(apellido);
                            System.out.println("da nacionalidad");
                            nacionalida=read.next();   a.setNacionalida(nacionalida);
                            tipo="guinista"; a.setParticipacion(tipo);
                            popo3++;   popo++;
                            a.registrarPers();
                            }}
                        }
                    } 
                   break;
                case 2:
                    p.mostarP();
                    System.out.println("elenco");
                    a.mostarPers();
                    break;
                case 3:
                    System.out.println("da año a buscar");
                    añosearch=read.nextInt();
                    p.mostaregeP(añosearch);
                    break;
                case 4:
                   a.mostrarDirePers();
                   break;
                case 5:
                    System.out.println("da la nacionalidad ");
                    nacisearch=read.next();
                    a.mostrarxnacionalidadPers(nacisearch);
            }
        }while(op!=5);
    }
    
}
