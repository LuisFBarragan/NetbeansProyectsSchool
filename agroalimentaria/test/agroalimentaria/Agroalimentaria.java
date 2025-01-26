package agroalimentaria;
import java.util.ArrayList;
import java.util.Scanner;

class productos{
 String feacad;
 int numlot;
    public void setFeacad(String feacad) {
        this.feacad = feacad;
    }
    public void setNumlot(int numlot) {
        this.numlot = numlot;
    }
    public String getFeacad() {
        return feacad;
    }
    public int getNumlot() {
        return numlot;
    }
}
class Frescos extends productos{
    String envasado;
    String from;
    Frescos(String feacad, int numlot, String envasado, String from){
        this.feacad=feacad;
        this.numlot=numlot;
        this.envasado=envasado;
        this.from=from;
    }
    public String getEnvasado() {
        return envasado;
    }
    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public Scanner getLeer() {
        return leer;
    }
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    ArrayList <Frescos> pf=new ArrayList ();
    Scanner leer=new Scanner(System.in);
    void registrarFre(){
        pf.add(new Frescos(getFeacad(),getNumlot(),getEnvasado(),getFrom()));
    }
    void mostrarFre(){
        for (int i = 0; i < pf.size(); i++) {
            System.out.println(""+pf.get(i).getFeacad()+"   "+pf.get(i).getNumlot()+"   "
                +pf.get(i).getEnvasado()+"   "+pf.get(i).getFrom());
        }
    }
}
class Refrigerados extends Frescos{
    String codigoOrg;
    double temRecom;
    Refrigerados(String feacad, int numlot, String envasado, String from,String codigoOrg,double temRecom){
        super(feacad,numlot,envasado,from);
        this.codigoOrg=codigoOrg;
        this.temRecom=temRecom;
    }
    public String getCodigoOrg() {
        return codigoOrg;
    }
    public void setCodigoOrg(String codigoOrg) {
        this.codigoOrg = codigoOrg;
    }
    public double getTemRecom() {
        return temRecom;
    }
    public void setTemRecom(double temRecom) {
        this.temRecom = temRecom;
    }
   
    ArrayList <Refrigerados> ref=new ArrayList();
    Scanner leer=new Scanner (System.in);
    void registrarRef(){
        ref.add(new Refrigerados(getFeacad(),getNumlot(),getEnvasado(),getFrom(),getCodigoOrg(),getTemRecom()));
    }
    void mostrarRef(){
        for (int i = 0; i < ref.size(); i++) {
            System.out.println(""+ref.get(i).getFeacad()+"   "+ref.get(i).getNumlot()+"   "+ref.get(i).getEnvasado()+
                    "   "+ref.get(i).getFrom()+"   "+ref.get(i).getCodigoOrg()+"   "+ref.get(i).getTemRecom());
        }
    }
}
class Congelados extends Frescos{
    double tempRecom;
    String tipo;
    Congelados(String feacad, int numlot, String envasado, String from,double tempRecom,String tipo){
        super(feacad,numlot,envasado,from);
        this.tempRecom=tempRecom;
        this.tipo=tipo;
    }
    public double getTempRecom() {
        return tempRecom;
    }
    public void setTempRecom(double tempRecom) {
        this.tempRecom = tempRecom;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    ArrayList <Congelados> ice=new ArrayList();
    Scanner leer=new Scanner(System.in);
    void registrarCon(){
        ice.add(new Congelados(getFeacad(),getNumlot(),getEnvasado(),getFrom(),getTempRecom(),getTipo()));
    }
    void mostrarCon(){
        for (int i = 0; i < ice.size(); i++) {
            System.out.println(""+ice.get(i).getFeacad()+"   "+ice.get(i).getNumlot()+"   "+ice.get(i).getEnvasado()+
                    "   "+ice.get(i).getFrom() +"   "+ice.get(i).getTempRecom()+"   "+ice.get(i).getTipo());
        }
    }
}
public class Agroalimentaria {
    public static void main(String[] args){
     Frescos fre=new Frescos ("",33,"","");
     Refrigerados ref=new Refrigerados("",33,""," ","",2.2);
     Congelados con=new Congelados("",22,"","",2.2,"");
     Scanner leer=new Scanner (System.in);
      String caducidad,fenv,made; int lot;  
      String caducidad2,fenv2,made2,Co; int lot2;double Tem;
      String Tipo,caducidad3,fenv3,made3,Co2; int lot3;double Tem2;
        int opcion=0;
        do{
            System.out.println("1.-registrar productos frescos");
            System.out.println("2.-mostrar productos frescos");
            System.out.println("3.-registrar productos refrigerados");
            System.out.println("4.-mostrar productos refrigerados");
            System.out.println("5.-registrar productos congelados");
            System.out.println("6.-mostrar productos congelados");
            
            System.out.println("7.-salir");
            System.out.println("elige una opcion");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:                 
                    System.out.println("ingrese fecha de caducidad del producto");
                    caducidad=leer.next();fre.setFeacad(caducidad);
                    System.out.println("ingrese el numero de lote");
                    lot=leer.nextInt();fre.setNumlot(lot);
                    System.out.println("ingrese fecha de envasado");
                    fenv=leer.next();fre.setEnvasado(fenv);
                    System.out.println("ingrese pais de origen");
                    made=leer.next(); fre.setFrom(made);
                    fre.registrarFre();
                    break;
                case 2:
                    fre.mostrarFre();
                    break;
                case 3:    
                    System.out.println("ingrese fecha de cacudidad del producto");
                    caducidad2=leer.next();
                    ref.setFeacad(caducidad2);
                    System.out.println("ingrese numero de lote");
                    lot2=leer.nextInt();ref.setNumlot(lot2);
                    System.out.println("ingrese fecha de envasado");
                    fenv2=leer.next();ref.setFrom(fenv2);
                    System.out.println("ingrese el pais de origen");
                    made2=leer.next();ref.setFrom(made2);
                    System.out.println("ingrese el codigo de organismo de supervision alimentaria");
                    Co=leer.next();ref.setCodigoOrg(Co);
                    System.out.println("ingrese la temperatura recomendada");
                    Tem=leer.nextDouble();ref.setTemRecom(Tem);
                    ref.registrarRef();
                    break;
                case 4:
                    ref.mostrarRef();
                    break;
                case 5:
                    int op=0;
                    
                    int Nl3; String Fc3,Fe3,Po3; double Tr2;
                    System.out.println("elije una opcion");
                    System.out.println("1 congelado por aire");
                    System.out.println("2 congelado por agua");
                    System.out.println("3 congelado por nitrogeno");
                    op=leer.nextInt();
                    if(op==1){
                        System.out.println("ingrese fecha de caducidad del producto");
                        caducidad3=leer.next();con.setFeacad(caducidad3);
                        System.out.println("ingrese numero de lote");
                        lot3=leer.nextInt(); con.setNumlot(lot3);
                        System.out.println("ingrese fecha de envasado");
                        fenv3=leer.next(); con.setEnvasado(fenv3);
                        System.out.println("ingrese pais de origen");
                        made3=leer.next();con.setFrom(made3);
                        System.out.println("ingrese temperatura recomendada");
                        Tem2=leer.nextDouble();con.setTempRecom(Tem2);
                        System.out.println("Ingrese la informacion de la composicion del aire");
                        Tipo=leer.next(); con.setTipo(Tipo);
                       con.registrarCon();
                    }
                    if(op==2){
                        System.out.println("ingrese fecha de caducidad del producto");
                        caducidad3=leer.next();con.setFeacad(caducidad3);
                        System.out.println("ingrese numero de lote");
                        lot3=leer.nextInt(); con.setNumlot(lot3);
                        System.out.println("ingrese fecha de envasado");
                        fenv3=leer.next(); con.setEnvasado(fenv3);
                        System.out.println("ingrese pais de origen");
                        made3=leer.next();con.setFrom(made3);
                        System.out.println("ingrese temperatura recomendada");
                        Tem2=leer.nextDouble();con.setTempRecom(Tem2);
                        System.out.println("Ingrese la informacion de la salinidad del agua en gramos por litros");
                        Tipo=leer.next();con.setTipo(Tipo);
                        con.registrarCon();
                    }
                    if(op==3){
                        System.out.println("ingrese fecha de caducidad del producto");
                        caducidad3=leer.next();con.setFeacad(caducidad3);
                        System.out.println("ingrese numero de lote");
                        lot3=leer.nextInt(); con.setNumlot(lot3);
                        System.out.println("ingrese fecha de envasado");
                        fenv3=leer.next(); con.setEnvasado(fenv3);
                        System.out.println("ingrese pais de origen");
                        made3=leer.next();con.setFrom(made3);
                        System.out.println("ingrese temperatura recomendada");
                        Tem2=leer.nextDouble();con.setTempRecom(Tem2);
                        System.out.println("Ingrese la informacion del metodo empleado y del tiempo de exposicion al nitrogeno "
                                + "en segundos");
                        Tipo=leer.next(); con.setTipo(Tipo);
                        con.registrarCon();
                    }
                    break;
                case 6:
                    con.mostrarCon();
                    break;
            }
        }while(opcion!=7);
    }
    
}
