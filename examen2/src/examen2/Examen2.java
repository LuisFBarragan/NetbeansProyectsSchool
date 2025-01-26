package examen2;

import java.util.ArrayList;
import java.util.Scanner;
class peliculas{
String gen,sip, nombre; int año;
    peliculas(String gen,String sip, int año, String nombre){
    this.nombre=nombre;
    this.gen=gen;
    this.sip=sip;
    this.año=año;
}
      public String getGen() {
        return gen;
    }
    public void setGen(String gen) {
        this.gen = gen;
    }
    public String getSip() {
        return sip;
    }
    public void setSip(String sip) {
        this.sip = sip;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     Scanner read=new Scanner(System.in);
    ArrayList<peliculas> pel=new ArrayList();
    void RegistrarPel(){
        pel.add(new peliculas(getGen(),getSip(),getAño(),getNombre()));
    }
    void MostrarPelisXAño(){
        int busc;
        System.out.println("que año quieres buscar");
        busc=read.nextInt();
        for (int i = 0; i < pel.size(); i++) {
            if (pel.get(i).getAño()==busc) {
                System.out.println(" "+pel.get(i).getNombre()+" "+pel.get(i).getSip()+" "+pel.get(i).getAño());
            }
        }
    }
}
class persona extends peliculas{
String nombre; String apellido; String nf; String nacionalidad, cargo; int participacion;
    persona(String gen,String sip, int año,String nombre, String apellido, String nf, String nacionalidad, String cargo, int participacion){
    super(gen , sip, año, nombre);

        
    this.apellido=apellido;
    this.nf=nf;
    this.nacionalidad=nacionalidad;
}
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNf() {
        return nf;
    }
    public void setNf(String nf) {
        this.nf = nf;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getCargo() {
        return cargo;
    }
    public int getParticipacion() {
        return participacion;
    }
    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    Scanner read=new Scanner(System.in);
    ArrayList<persona> p=new ArrayList();
    void Registrar(){
        p.add(new persona(getGen(),getSip(),getAño(),getNombre(),getApellido(),getNf(),getNacionalidad(),getCargo(),getParticipacion()));
    }
    void mostrar(){
        int cont=0;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getAño()>=2) {
                System.out.println(""+p.get(i).getNombre()+" "+p.get(i).getApellido());
                System.out.println(" "+p.get(i).getNacionalidad());
                System.out.println(" "+p.get(i).getNf());
            cont++;
            }
            
        }
        if (cont==0) {
            
                System.out.println("no se encontro ninguna");
            
        }
        
    }
    void MostrarDirectores(){
       int cont=0;
       for (int i = 0; i <p.size(); i++) {
            if (p.get(i).getCargo()!="a") {
                System.out.println(""+p.get(i).getNombre()+" "+p.get(i).getApellido());
                System.out.println(" "+p.get(i).getNacionalidad());
                System.out.println(" "+p.get(i).getNf());
                cont++;
            }
        }
        if (cont==0) {
            
                System.out.println("no se encontro ningun@");
            
        }
    }
    void nacionalidad(){
        String na; int cont=0;
        System.out.println("DA la nacionalidad");
        na=read.next();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getNacionalidad()!=na) {
                System.out.println(""+p.get(i).getNombre()+" "+p.get(i).getApellido());
                System.out.println(" "+p.get(i).getNacionalidad());
                System.out.println(" "+p.get(i).getNf());
                cont++;
            }
        }
        if (cont==0) {
            
                System.out.println("no se encontro ningun@");
            
        }
    }
}

public class Examen2 {

   public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       persona obj=new persona(" "," ",000," "," "," "," "," ",0);
       peliculas obj2=new peliculas(" "," ",0," ");
       String nombre2,na,nombre,sip,genero,nf,apellido,nacionalidad, cargo;
       int op=0, participacion,cant,año;
   do {
           System.out.println("1.- Registo");
           System.out.println("2.- Mostrar personas con mas de 2 participaciones");
           System.out.println("3.- mostrar pelis por año");
           System.out.println("4.- mostrar personas que son directores");
           System.out.println("5.- mostar los nombres de persona por nacionalidad");
           System.out.println("6.- salir");
           System.out.println("elije");
           op=read.nextInt();
           switch(op){
               case 1:
                   int x;
                   System.out.println("persona=0/peliculas=1");
                   System.out.println(" que deseas registrar");
                   x=read.nextInt();
                   if (x==0) {
                   System.out.println("Da nombre de la persona");
                   nombre=read.next(); obj.setNombre(nombre);
                   System.out.println("Apellido");
                   apellido=read.next(); obj.setApellido(apellido);
                   System.out.println("fecha nacimiento");
                   nf=read.next(); obj.setNf(nf);
                   System.out.println("Tipo de participacion(d=director/a=actor)");
                   cargo=read.next(); obj.setCargo(cargo);
                   System.out.println("cantidad de peliculas hechas");
                   participacion=read.nextInt(); obj.setAño(participacion);
                   System.out.println("Da la nacionalidad");
                   na=read.next(); obj.setNacionalidad(na);
                   obj.Registrar();    
                   }
                   if (x==1) {
                       System.out.println("Da nombre");
                       nombre2=read.next(); obj2.setNombre(nombre2);
                       System.out.println("Da sipnosis breve");
                       sip=read.next();  obj2.setSip(sip);
                       System.out.println("Da año de estreno");
                       año=read.nextInt(); obj2.setAño(año);
                       System.out.println("Da genero");
                       genero=read.next(); obj2.setGen(genero);
                       obj2.RegistrarPel();
                   }
                   
                   break;
               case 2: obj.mostrar();break;
               case 3: obj2.MostrarPelisXAño(); break;
               case 4: obj.MostrarDirectores(); break;
               case 5: obj.nacionalidad(); break;
                   
           }
       } while (op!=6);
        
   }
    
}
