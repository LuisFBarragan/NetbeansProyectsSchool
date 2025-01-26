
package hotel;
import java.util.ArrayList;
import java.util.Scanner;

public class cliente {
    
int cuenta;
String nombre;
String celular;
int buscar;
int edad;
String municipio;
String colonia;
int tarjeta;

cliente(int cta,String nombre,String celular, int edt, String muni, String colonia, int tarjeta){
    this.cuenta=cta;
    this.nombre=nombre;
    this.celular=celular;
    this.edad=edt;
    this.municipio=muni;
    this.colonia=colonia;
    this.tarjeta=tarjeta;
}

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setBuscar(int buscar) {
        this.buscar = buscar;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public static void setLeer(Scanner leer) {
        cliente.leer = leer;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public int getBuscar() {
        return buscar;
    }

    public int getEdad() {
        return edad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    
    public static Scanner getLeer() {
        return leer;
    }
  
    static ArrayList <cliente> listaCte=new ArrayList();
    static Scanner leer=new Scanner (System.in);
        
    void registrarClientes(){
        listaCte.add(new cliente(getCuenta(),getNombre(),getCelular(), getEdad(), getMunicipio(), getColonia(), getTarjeta()));
    }
    
    void mostrarCliente(){
        for (int i = 0; i < listaCte.size(); i++) {
System.out.println(" "+listaCte.get(i).getCuenta()+"     "+listaCte.get(i).getNombre()+"   "+listaCte.get(i).getCelular()+
" "+listaCte.get(i).getEdad()+" "+ listaCte.get(i).getMunicipio()+" "+listaCte.get(i).getColonia()+" "+listaCte.get(i).getTarjeta());   
    }
    }
    
   void buscarCliente(int buscar){
        for (int i = 0; i < listaCte.size(); i++) {    
        if(buscar==listaCte.get(i).getCuenta()){
            System.out.println(" "+listaCte.get(i).getCuenta()+"     "+listaCte.get(i).getNombre()+"   "+listaCte.get(i).getCelular()+
" "+listaCte.get(i).getEdad()+" "+ listaCte.get(i).getMunicipio()+" "+listaCte.get(i).getColonia());  
            }
        }  
   }//buscar
   
   void borrarCliente(String delate){
       for (int i = 0; i <listaCte.size(); i++) {
           if (listaCte.get(i).getNombre().equals(delate)) {
               listaCte.remove(i);
               System.out.println("se elimino");
           }
           else{
               System.out.println("no se encontro");
           }       
       }
   }
   
   void igualedCliente(int eded){
       int conta=0;
       for (int i = 0; i <listaCte.size(); i++) {
       if(eded==listaCte.get(i).getEdad()){
           conta=conta+1;
       }    
       }
       System.out.println("edades igulaes "+conta);
   }
   
   void modificarCliente(int modcuent){
       for (int i = 0; i <listaCte.size(); i++) {
           if(modcuent==listaCte.get(i).getCuenta()){
               System.out.println(" "+listaCte.get(i).getCuenta()+"     "+listaCte.get(i).getNombre()+"   "+listaCte.get(i).getCelular()+
" "+listaCte.get(i).getEdad()+" "+ listaCte.get(i).getMunicipio()+" "+listaCte.get(i).getColonia()+" "+listaCte.get(i).getTarjeta());  
       }
   }
   }
   
   void busformun(String munipb){
       for (int i = 0; i <listaCte.size(); i++) {
           if(listaCte.get(i).getMunicipio().equals(munipb)){
               System.out.println(" "+listaCte.get(i).getCuenta()+"     "+listaCte.get(i).getNombre()+"   "+listaCte.get(i).getCelular()+
" "+listaCte.get(i).getEdad()+" "+ listaCte.get(i).getMunicipio()+" "+listaCte.get(i).getColonia()+" "+listaCte.get(i).getTarjeta());  
           }
       }
   }
   
   void promed(){
       int promeded=0, cont=0;
       double promnofake;
       for (int i = 0; i <listaCte.size(); i++) {
           promeded=promeded+listaCte.get(i).getEdad();
       cont++;    
       }
       promnofake=promeded/cont;
       System.out.println("el proedio de edades es: "+promnofake);
   }
   
   void primeromero(){
        System.out.println(" "+listaCte.get(0).getCuenta()+"     "+listaCte.get(0).getNombre()+"   "+listaCte.get(0).getCelular()+
" "+listaCte.get(0).getEdad()+" "+ listaCte.get(0).getMunicipio()+" "+listaCte.get(0).getColonia()+" "+listaCte.get(0).getTarjeta());  
   }
   
   void medio(){
       int medio;
               medio=listaCte.size()/2;
       System.out.println(" "+listaCte.get(medio).getCuenta()+"     "+listaCte.get(medio).getNombre()+"   "+listaCte.get(medio).getCelular()+
" "+listaCte.get(medio).getEdad()+" "+ listaCte.get(medio).getMunicipio()+" "+listaCte.get(medio).getColonia()+" "+listaCte.get(medio).getTarjeta());  
   }
   
   void end(){
       int endeded;
       endeded=listaCte.size()-1;
        System.out.println("Cuenta; "+listaCte.get(endeded).getCuenta()+" name: "+listaCte.get(endeded).getNombre()+" cel: "
                    +listaCte.get(endeded).getCelular()+" edad: "+listaCte.get(endeded).getEdad()+
                       " municipio "+listaCte.get(endeded).getMunicipio()+" "
                +listaCte.get(endeded).getColonia()+" "+listaCte.get(endeded).getTarjeta());
   }//lista.get(i).nombre().charAt(lista.get(i).nombre.length-1)->ultima letra
}//clas
