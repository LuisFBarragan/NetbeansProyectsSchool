
package hotel;
import java.util.ArrayList;
import java.util.Scanner;

    
public class recepcionista extends cliente{

String horario;
public recepcionista(int cta,String nombre,String celular, int edt, String muni, String colonia, int tarjeta, String horario){
    super(cta, nombre, celular, edt, muni, colonia, tarjeta);
    this.horario=horario;
}//Constructor

        public String getHorario() {
            return horario;
        }

        public void setHorario(String horario) {
            this.horario = horario;
        }
 ArrayList <recepcionista> listaRep=new ArrayList();
 Scanner read=new Scanner(System.in);   

    void registrar(){
        listaRep.add(new recepcionista(getCuenta(),getNombre(),getCelular(), getEdad(), getMunicipio(), getColonia(), getTarjeta(), getHorario()));
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

