package lechitaspancho;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
 class paTicket{
int cantidad; int ml2; int clave2; int costo;
paTicket(int cantidad,int ml2,int clave2,int costo){
    this.cantidad=cantidad;
    this.ml2=ml2;
    this.clave2=clave2;
    this.costo=costo;
}
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getMl2() {
        return ml2;
    }
    public void setMl2(int ml2) {
        this.ml2 = ml2;
    }
    public int getClave2() {
        return clave2;
    }
    public void setClave2(int clave2) {
        this.clave2 = clave2;
    }
    public int getCosto() {
        return costo;
    }
    public void setCosto(int costo) {
        this.costo = costo;
    }
    ArrayList<paTicket> t=new ArrayList();
   void venta(){
       t.add(new paTicket(getCantidad(),getMl2(),getClave2(),getCosto()));
   }
    File ruta=new File("C:\\Lalecheee\\ticket.txt");
    static BufferedReader tec=new BufferedReader(new InputStreamReader(System.in));
    void ArchivoTexto() throws IOException{
    try{ int total=0,cont=0; double Iva; 
        String sabor2;
        FileWriter acR=new FileWriter(ruta);
        BufferedWriter acA=new BufferedWriter(acR); 
        PrintWriter write=new PrintWriter(acA);
       write.println("Cadena comercial Lechitas Pancho. S.A de C.V (CC0-860523-1N4)");
       write.println("                   SEVILLA DEL RIO CLA                       ");
       write.println("  Edisun  Nte. Numero 1235 Colonia talleres Monterrey, Nuev  ");
       write.println("       Regimen de Opcionala para Grupos de Sociedades        ");
       write.println("=============================================================");
       write.println("CAFLKA8606020                cantidad        costo    ");
        for (int i = 0; i <t.size(); i++) {
            if (t.get(i).getClave2()==1) {
                sabor2="Chocolate";
       write.println(""+sabor2+"  ml "+t.get(i).getMl2()+"                "+t.get(i).getCantidad()+"            "+t.get(i).getCosto());
            }
            else{
                if (t.get(i).getClave2()==2) {
                    sabor2="Vainilla";
                     write.println(""+sabor2+"  ml "+t.get(i).getMl2()+"                "+t.get(i).getCantidad()+"            "+t.get(i).getCosto());
                }
                else{
                    if (t.get(i).getClave2()==3) {
                        sabor2="arandano";
                          write.println(""+sabor2+"  ml "+t.get(i).getMl2()+"                "+t.get(i).getCantidad()+"            "+t.get(i).getCosto());
                    }
                    else{
                        if (t.get(i).getClave2()==4) {
                            sabor2="Capuchino";
                              write.println(""+sabor2+" ml "+t.get(i).getMl2()+"                "+t.get(i).getCantidad()+"            "+t.get(i).getCosto());
                        }
                    }
                }
            }
            total=total+t.get(i).getCosto();
          
        }
        write.println("                                             Total: "+total);
        
         write.println("                   GRACIAS POR SU COMPRA                                                           ");
        acA.close();
    } 
    catch(Exception er){
        System.out.println("error "+er);
    }
    }
}
public class LechitasPancho{
    int clave;String sabor;int ml; String caducidad; int existencias;
    LechitasPancho(int clave,String sabor,int ml,String caducidad,int existencias){
        this.clave=clave;
        this.sabor=sabor;
        this.ml=ml;
        this.caducidad=caducidad;
        this.existencias=existencias;
    }
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public int getMl() {
        return ml;
    }
    public void setMl(int ml) {
        this.ml = ml;
    }
    public String getCaducidad() {
        return caducidad;
    }
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    public int getExistencias() {
        return existencias;
    }
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    Scanner read=new Scanner(System.in);
    ArrayList<LechitasPancho> Lp=new ArrayList(); 
    void Registro(){
        Lp.add(new LechitasPancho(getClave(),getSabor(),getMl(),getCaducidad(),getExistencias()));
    }
    void Mostrar(){
        for (int i = 0; i < Lp.size(); i++) {
            System.out.println("Clave: "+Lp.get(i).getClave()+" Sabor: "+Lp.get(i).getSabor()+" Ml: "+Lp.get(i).getMl()+
            " Caducidad: "+Lp.get(i).getCaducidad()+" existencias: "+Lp.get(i).getExistencias());
        }
    }
    static final String Lechitas="C:\\Lalecheee\\ticket.txt";
    FileOutputStream Gtex;
    DataOutputStream GtexB;
    void RegistroDisco() throws FileNotFoundException, IOException{
        try{
            Gtex=new FileOutputStream(Lechitas,true);
            GtexB=new DataOutputStream(Gtex);
            for (int i = 0; i < Lp.size(); i++) {
                GtexB.writeInt(Lp.get(i).getClave());
                GtexB.writeUTF(Lp.get(i).getSabor());
                GtexB.writeInt(Lp.get(i).getMl());
                GtexB.writeUTF(Lp.get(i).getCaducidad());
                GtexB.writeInt(Lp.get(i).getExistencias());
            }
            GtexB.close();
            Gtex.close();
        }
        catch(FileNotFoundException er){
            System.out.println("Error "+er);
        }
        catch(Exception er){
            System.out.println("ya es toda we");
        }
    }
    FileInputStream Mtex;
    DataInputStream MtexB;
    void MostrarDisco() throws FileNotFoundException, IOException{
    try{
        Mtex=new  FileInputStream("C:\\Lalecheee\\ticket.txt"); 
    MtexB=new DataInputStream(Mtex);
    while(MtexB.available()!=0){
        System.out.println("Clave: "+MtexB.readInt());
        System.out.println("Sabor: "+MtexB.readUTF());
        System.out.println("Ml: "+MtexB.readInt());
        System.out.println("Caducidad: "+MtexB.readUTF());
        System.out.println("Existencias: "+MtexB.readInt());
    }
    MtexB.close();
    Mtex.close();
    }
    catch(FileNotFoundException er){
        System.out.println(" "+er);
    }
    catch(Exception e){
        System.out.println("ya es toda we");
    }
    }
    void borrarDisco() throws FileNotFoundException, IOException{
        try{
            Gtex=new FileOutputStream(Lechitas);
            GtexB=new DataOutputStream(Gtex);
           for (int i = 0; i < Lp.size(); i++) {
                GtexB.writeInt(Lp.get(i).getClave());
                GtexB.writeUTF(Lp.get(i).getSabor());
                GtexB.writeInt(Lp.get(i).getMl());
                GtexB.writeUTF(Lp.get(i).getCaducidad());
                GtexB.writeInt(Lp.get(i).getExistencias());
            }
            GtexB.close();
            Gtex.close();
        }
        catch(FileNotFoundException er){
            System.out.println("Error "+er);
        }
        catch(Exception er2){
            System.out.println("Error "+er2);
        }
    }
    void BuscarXteclado (int claveb){
        for (int i = 0; i < Lp.size(); i++) {
            if (claveb==Lp.get(i).getClave()) {
                System.out.println("Clave: "+Lp.get(i).getClave()+" Sabor: "+Lp.get(i).getSabor()+" Ml: "+Lp.get(i).getMl()+
            " Caducidad: "+Lp.get(i).getCaducidad()+" existencias: "+Lp.get(i).getExistencias());
            }
        }
    }
    void Ram() throws FileNotFoundException, IOException{
    try{
        Mtex=new  FileInputStream("C:\\Lalecheee\\ticket.txt"); 
    MtexB=new DataInputStream(Mtex);
    while(MtexB.available()!=0){
       int m=MtexB.readInt();
        String m2=MtexB.readUTF();
        int m3=MtexB.readInt();
        String m4=MtexB.readUTF();
        int m5=MtexB.readInt();
        Lp.add(new LechitasPancho(m,m2,m3,m4,m5));
        System.out.println(" ");
    }
    MtexB.close();
    Mtex.close();
    }
    catch(FileNotFoundException er){
        System.out.println(" "+er);
    }
    }
    void BuscarXRango(){
        int min,max;
        System.out.println("Da valor minimo");
        min=read.nextInt();
        System.out.println("Da valor Maximo");
        max=read.nextInt();
        for (int i = 0; i < Lp.size(); i++) {
            if (Lp.get(i).getExistencias()>=min && Lp.get(i).getExistencias()<=max) {
             System.out.println("Clave: "+Lp.get(i).getClave()+" Sabor: "+Lp.get(i).getSabor()+" Ml: "+Lp.get(i).getMl()+
            " Caducidad: "+Lp.get(i).getCaducidad()+" existencias: "+Lp.get(i).getExistencias());  
            }
        }
    }
    void IniciaA(){
        for (int i = 0; i < Lp.size(); i++) {
            if (Lp.get(i).getCaducidad().charAt(0)=='a'||Lp.get(i).getCaducidad().charAt(0)=='A') {
             System.out.println("Clave: "+Lp.get(i).getClave()+" Sabor: "+Lp.get(i).getSabor()+" Ml: "+Lp.get(i).getMl()+
            " Caducidad: "+Lp.get(i).getCaducidad()+" Existencias: "+Lp.get(i).getExistencias());  
            }
        }
    }
    void Eliminar(){
        int cle;
        System.out.println("Da la clavedel producto que quieras eliminar");
        cle=read.nextInt();
         for (int i = 0; i < Lp.size(); i++) {
            if (cle==Lp.get(i).getClave()) {
            Lp.remove(i);
            }
        }
    }
    void Modificar(){
        int Modi;
        System.out.println("Da la clavedel producto que quieras modificar");
        Modi=read.nextInt();
         for (int i = 0; i < Lp.size(); i++) {
            if (Modi==Lp.get(i).getClave()) {
              System.out.println("Da la nueva clave");    
               Lp.get(i).clave=read.nextInt();
               System.out.println("Da el nuevo sabor");
               Lp.get(i).sabor=read.next();
               System.out.println("Da los ml");
               Lp.get(i).ml=read.nextInt();
               System.out.println("Da la caducidad");
               Lp.get(i).caducidad=read.next();
               System.out.println("Da las existencias");
               Lp.get(i).existencias=read.nextInt();
               System.out.println("El nuevo registro es");
            System.out.println("Clave: "+Lp.get(i).getClave()+" Sabor: "+Lp.get(i).getSabor()+" Ml: "+Lp.get(i).getMl()+
            " Caducidad: "+Lp.get(i).getCaducidad()+" Existencias: "+Lp.get(i).getExistencias());  
            }
        }
    }
    
        public static void main(String[] args) throws IOException {
        Scanner read=new Scanner(System.in); BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        int op=0; int clave=0; String sabor;  int ml=0; String caducidad;  int existencias=0;
        LechitasPancho obj=new LechitasPancho(153,"Chocolate",600,"12/09/07",100);
        paTicket obj2=new paTicket(0,0,0,0);
        do {
            System.out.println("1.- Llenado o Registrar Disco");
            System.out.println("2.- Mostrar o Mostrar Disco");
            System.out.println("3.- Buscar por teclado");
            System.out.println("4.- Buscar por  rango");
            System.out.println("5.- Empieza con a");
            System.out.println("6.- Eliminar");
            System.out.println("7.- Modificar");
            System.out.println("8.- venta");
            System.out.println("9.- Imprimir Ticket");
            System.out.println("10.- Salir");
            System.out.println("Elije");
            op=Integer.parseInt(leer.readLine());
            switch(op){
                case 1:
                    int x;
                    System.out.println("Registrar=0/Registrar Disco=1");
                    System.out.println("Elije");
                    x=read.nextInt();
                    if (x==0) {
                        try{
               System.out.println("Da la nueva clave");    
               clave=Integer.parseInt(leer.readLine());
                if (clave==0 && clave<100) {
                  throw new Exception(" Error marcado desde try");              
                }
               System.out.println("Da el nuevo sabor");
               sabor=read.next();
               for (int j = 0; j < sabor.length(); j++) {
                 if (sabor.charAt(j)=='0'|| sabor.charAt(j)=='1'||sabor.charAt(j)=='2'||sabor.charAt(j)=='3'||
                         sabor.charAt(j)=='4'||sabor.charAt(j)=='5'||sabor.charAt(j)=='6'||sabor.charAt(j)=='7'||
                         sabor.charAt(j)=='8'||sabor.charAt(j)=='9'){
                  throw new Exception("Exception marcada desde try");
                         }
                 }//for     
               System.out.println("Da los ml");
               ml=Integer.parseInt(leer.readLine());
               if (ml==0) {
                  throw new Exception(" Error marcado desde try");              
                }
               System.out.println("Da la caducidad");
               caducidad=read.next();
               System.out.println("Da las existencias");
               existencias=Integer.parseInt(leer.readLine());   
               obj.setClave(clave);
               obj.setSabor(sabor);
               obj.setMl(ml);
               obj.setCaducidad(caducidad);
               obj.setExistencias(existencias);
               obj.Registro();
                    }
                        catch(NumberFormatException er3){
                             System.out.println("Error "+er3); 
                             obj.Registro();
                        }
                        catch(Exception er){
                            System.out.println("Error "+er);
                            obj.Registro();
                        }
                    }
                    if (x==1) {
                        obj.RegistroDisco();
                    }
                    break;
                case 2:
                    int o;
                    System.out.println("Mostrar=0/MostrarDisco=1");
                    System.out.println("Elije");
                    o=read.nextInt();
                    if (o==0) {
                        obj.Mostrar();
                    }
                    if (o==1) {
                        obj.MostrarDisco();
                    }
                    break;
                case 3:
                    int claveb;
                    System.out.println("Da la clave a buscar");
                    claveb=read.nextInt();
                    obj.BuscarXteclado(claveb);
                    break;
                case 4: obj.BuscarXRango();break;
                case 5: obj.IniciaA(); break;
                case 6: obj.Eliminar(); break;
                case 7: obj.Modificar(); break;
                case 8:  int ml2,fin=0,c,cantidad,costo,clave2; String sab;
                    do {System.out.println("Chocolate=1/vainilla=2/arandano=3/Capuchino=4");
                        System.out.println("Que sabor quieres");
                        clave2=read.nextInt(); obj2.setClave2(clave2);
                        System.out.println("cantidad");  
                        cantidad=read.nextInt(); obj2.setCantidad(cantidad);
                        System.out.println("presentaciones en 355/600/955");
                        System.out.println("Ingresa la cantidad de ml que quieras comprar");
                        ml2=Integer.parseInt(leer.readLine());obj2.setMl2(ml2);
                        if (ml2==355) {
                                c=15;
                                costo=cantidad*c;
                                obj2.setCosto(costo);
                            }
                       if (ml2==600) {
                                c=17;
                            
                                
                                costo=cantidad*c;
                                obj2.setCosto(costo);
                            }
                       if (ml2==955) {
                                c=20;
                                costo=cantidad*c;
                                obj2.setCosto(costo);
                                }
                       obj2.venta();
                       System.out.println("algo mas(no=0/yes=1");
                        fin=read.nextInt();    
                    } while (fin==1);
                break;
                case 9: obj2.ArchivoTexto(); break;
                case 10: obj.borrarDisco(); break;
                case 11: obj.Ram(); break;
            }
        } while (op!=11);   
    }
}