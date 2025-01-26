package escuela;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Escuela {
int nc, cal; String al, mat;
Escuela(int nc,int cal, String al,String mat){
    this.nc=nc;
    this.cal=cal;
    this.al=al;
    this.mat=mat;
}
    public int getNc() {
        return nc;
    }
    public void setNc(int nc) {
        this.nc = nc;
    }
    public int getCal() {
        return cal;
    }
    public void setCal(int cal) {
        this.cal = cal;
    }
    public String getAl() {
        return al;
    }
    public void setAl(String al) {
        this.al = al;
    }
    public String getMat() {
        return mat;
    }
    public void setMat(String mat) {
        this.mat = mat;
    }
    Scanner read=new Scanner(System.in);
    ArrayList<Escuela> esc=new ArrayList();
    void registrar(){
        esc.add(new Escuela(getNc(),getCal(),getAl(),getMat()));
    }
    void promCal(){
        int cont=0,suma=0,promgen=0;
        for (int i = 0; i < esc.size(); i++) {
            suma=suma+esc.get(i).getCal();
            System.out.println("Alumno: "+esc.get(i).getAl()+" CAlificacion: "+esc.get(i).getCal());
            if (esc.get(i).getCal()<70) {
                System.out.println(" has reprobado");
            }
            else{
                System.out.println(" Has aprobado");
            }
            cont++;
        }
        promgen=suma/cont;
        System.out.println("Promedio Grupal: "+promgen);
    }
    void mostrar(){
        for (int i = 0; i < esc.size(); i++) {
            System.out.println("Alumno: "+esc.get(i).getAl()+" Calificacion: "+esc.get(i).getCal()+" MAteria: "+esc.get(i).getMat());
        }
    }
    static final String Escuela="prueba.dat";
    FileOutputStream Gtex;
    DataOutputStream Gtexb;
    void A
    public static void main(String[] args) {
 
    }
    
}
