package recepcion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

class Recepcionista{
int tarjeta;
String nombre;
int edad;
String celular;
String colonia;
String municipio;
String horario;

Recepcionista(int tarjeta,String nombre,int edad, String celular, String colonia, String municipio, String horario){
    this.tarjeta=tarjeta;
    this.nombre=nombre;
    this.edad=edad;
    this.celular=celular;
    this.colonia=colonia;
    this.municipio=municipio;
    this.horario=horario;
}//constructor

public int getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    static ArrayList <Recepcionista> listaRep=new ArrayList();
    static Scanner read=new Scanner(System.in);

    void registrar(){
        listaRep.add(new Recepcionista(getTarjeta(),getNombre(),getEdad(),
                getCelular(),getColonia(),getMunicipio(),getHorario()));
    }
    void mostarRep(){
        for (int i = 0; i <listaRep.size(); i++) {
            System.out.println("# tarjeta: "+listaRep.get(i).getTarjeta()+
            " nombre: "+listaRep.get(i).getNombre()+" edad: "+listaRep.get(i).getEdad()+
            " celular: "+listaRep.get(i).getCelular()+" colonia: "+listaRep.get(i).getColonia()+
            " municipio: "+listaRep.get(i).getMunicipio()+" horario"+listaRep.get(i).getHorario());
        }
    }
    void borrarRep(String nameborr){
       int conteoa=0;
        for (int i = 0; i < listaRep.size(); i++) {
            if(listaRep.get(i).getNombre().equals(nameborr)){
                listaRep.remove(i);
                System.out.println("Se elemino registro del casillero "+i);
            }
            else{
               conteoa++; 
            }
        }
        if(conteoa==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
    void modificarRep(String nameb){
        int cb=0;
        for (int i = 0; i <listaRep.size(); i++) {
            if(listaRep.get(i).getNombre().equals(nameb)){
                listaRep.get(i).tarjeta=read.nextInt();
                listaRep.get(i).nombre=read.next();
                listaRep.get(i).edad=read.nextInt();
                listaRep.get(i).celular=read.next();
                listaRep.get(i).colonia=read.next();
                listaRep.get(i).municipio=read.next();
                listaRep.get(i).horario=read.next();   
            }
            else{
                cb++;
            }
        }
        if(cb==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
    void buscartarjRep(int tarjb){
        int cc=0;
        for (int i = 0; i <listaRep.size(); i++) {
            if(tarjb==listaRep.get(i).getTarjeta()){
                 System.out.println("# tarjeta: "+listaRep.get(i).getTarjeta()+
            " nombre: "+listaRep.get(i).getNombre()+" edad: "+listaRep.get(i).getEdad()+
            " celular: "+listaRep.get(i).getCelular()+" colonia: "+listaRep.get(i).getColonia()+
            " municipio: "+listaRep.get(i).getMunicipio()+" horario"+listaRep.get(i).getHorario());
            }
            else{
                cc++;
            }
        }
        if(cc==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
    void buscarcolRep(String colb){
       int cd=0;
        for (int i = 0; i <listaRep.size(); i++) {
            if(listaRep.get(i).getColonia().equals(colb)){
                 System.out.println("# tarjeta: "+listaRep.get(i).getTarjeta()+
            " nombre: "+listaRep.get(i).getNombre()+" edad: "+listaRep.get(i).getEdad()+
            " celular: "+listaRep.get(i).getCelular()+" colonia: "+listaRep.get(i).getColonia()+
            " municipio: "+listaRep.get(i).getMunicipio()+" horario"+listaRep.get(i).getHorario());
            }
            else{
                cd++;
            }
        }
        if(cd==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
    void buscarhorbRep(String horb){
        int ce=0;
        for (int i = 0; i < listaRep.size(); i++) {
            if(listaRep.get(i).getHorario().equals(horb)){
                 System.out.println("# tarjeta: "+listaRep.get(i).getTarjeta()+
            " nombre: "+listaRep.get(i).getNombre()+" edad: "+listaRep.get(i).getEdad()+
            " celular: "+listaRep.get(i).getCelular()+" colonia: "+listaRep.get(i).getColonia()+
            " municipio: "+listaRep.get(i).getMunicipio()+" horario"+listaRep.get(i).getHorario());
            }
            else{
                ce++;
            }
        }
        if(ce==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
    void mayorRep(){
       int cont=0;
        for (int i = 0; i < listaRep.size(); i++) {   
        if(listaRep.get(i).getEdad()>=18){
            cont++;
        }
    }
        System.out.println(" los mayores de edad son: "+cont);
    }
    void Mayorrep(int mmyor){
        mmyor=0;
        for (int i = 0; i <listaRep.size(); i++) {
            if(listaRep.get(i).getEdad()>mmyor){
                mmyor=listaRep.get(i).getEdad();
            }
        }
        System.out.println("La edadc mayor es: "+mmyor);
}
    void promedioedadrep(int cont){
        cont=0; int conta=0;double promedio;

        for (int i = 0; i <listaRep.size(); i++) {
            cont=cont+listaRep.get(i).getEdad();
            conta++;
        }
        promedio=cont/conta;
        System.out.println("Promedio: "+promedio);
    }
    void nemesc(){
        int cf=0;
        for (int i = 0; i <listaRep.size(); i++) {
            if(listaRep.get(i).getNombre().charAt(0)=='c'){
                 System.out.println("# tarjeta: "+listaRep.get(i).getTarjeta()+
            " nombre: "+listaRep.get(i).getNombre()+" edad: "+listaRep.get(i).getEdad()+
            " celular: "+listaRep.get(i).getCelular()+" colonia: "+listaRep.get(i).getColonia()+
            " municipio: "+listaRep.get(i).getMunicipio()+" horario"+listaRep.get(i).getHorario());
            }
            else{
                cf++;
            }
        }
        if(cf==listaRep.size()){
            System.out.println("no se encontro");
        }
    }
}// class recep  

public class Recepcion {
    public static void main(String[] args) {
      BufferedReader leerBuffer=new BufferedReader (new InputStreamReader(System.in));
      Scanner read=new Scanner(System.in);
      Recepcionista objetoRep=new Recepcionista(123,"Luis",19,"312-143-682-3","colonia","municipio","8am-2pm");
      
      int opcion=0; String nameb; int tarjb; String colb; String horb; String nameborr;
      int tarj; String name; int ed; String cell; String col; String mun; String hor;
              
      do{
          System.out.println("1.-registrar");
          System.out.println("2.-mostrar");
          System.out.println("3.-borrar un registro por nombre");
          System.out.println("4.-modoficar un registro");
          System.out.println("5.-buscar un registro por numero de tarjeta");
          System.out.println("6.-buscar por colonia");
          System.out.println("7.-buscar por horario");
          System.out.println("8.-contar cuantos son mayores de edad");
          System.out.println("9,.imprimir la edad mayor");
          System.out.println("10.-calcular el promedio de edades");
          System.out.println("11.-imprimir nombres que empiezan con la letra c");
          System.out.println("12.-salir");
          System.out.println("Da opcion");
          opcion=read.nextInt();
          
          switch(opcion){
              case 1:
                  System.out.println("Da numero de tarjeta");
                  tarj=read.nextInt();
                  objetoRep.setTarjeta(tarj);
                  System.out.println("Da nombre");
                  name=read.next();
                  objetoRep.setNombre(name);
                  System.out.println("Da edad");
                  ed=read.nextInt();
                  objetoRep.setEdad(ed);
                  System.out.println("Da numero de telefono");
                  cell=read.next();
                  objetoRep.setCelular(cell);
                  System.out.println("Da colonia");
                  col=read.next();
                  objetoRep.setColonia(col);
                  System.out.println("Da municipio");
                  mun=read.next();
                  objetoRep.setMunicipio(mun);
                  System.out.println("Da horario de trabajo");
                  hor=read.next();
                  objetoRep.setHorario(hor);
                  
                  objetoRep.registrar();
                  break;
              case 2:
                  objetoRep.mostarRep();
                  break;
              case 3:
                  System.out.println("Da nombre del registro a borrar");
                  nameborr=read.next();
                  
                  break;
              case 4:
                  System.out.println("Da nombre a modificar");
                  nameb=read.next();
                  objetoRep.mostarRep();
                  break;
              case 5:
                  System.out.println("Da # de tarjeta a buscar");
                  tarjb=read.nextInt();
                  objetoRep.buscartarjRep(tarjb);
                  break;
              case 6:
                  System.out.println("Da colonia a bucar");
                  colb=read.next();
                  objetoRep.buscarcolRep(colb);
                  break;
              case 7:
                  System.out.println("Da horario a buscar");
                  horb=read.next();
                  objetoRep.buscarhorbRep(horb);
                  break;
              case 8:
                  objetoRep.mayorRep();
                  break;
              case 9:
                  int mmyor=0;
                  objetoRep.Mayorrep(mmyor);
                  break;
              case 10:
                  int cont=0;
                  objetoRep.promedioedadrep(cont);
                  break;
              case 11:
                  objetoRep.nemesc();
                  break;          
          }
      }while(opcion!=12);
    }
}
    

