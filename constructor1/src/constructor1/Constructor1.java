
package constructor1;

public class Constructor1 {
int memoria;
String procesador;
String marca;
String color;

Constructor1(){
memoria=8;
procesador="icore";
marca="dell";
color="black";
}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }



void imprimir(){
    System.out.println("memoria ram "+memoria);
    System.out.println("procesador "+procesador);
}
    public static void main(String[] args) {
        Constructor1 obj=new Constructor1();
        obj.imprimir();
        
        obj.setMemoria(8);
        obj.setProcesador("icore");
        obj.setMarca("dell");
        obj.setColor("black");
        
        int memoria;
        String procesador;
        String marca;
        String color;
        
        obj.getColor();
        color=obj.getColor();
        
        obj.getMarca();
        marca=obj.getMarca();
        
        obj.getMemoria();
        memoria=obj.getMemoria();
        
        procesador=obj.getProcesador();
        obj.getProcesador();
        
        System.out.println(memoria+", "+procesador+", "+color+", "+marca);
    }
    
}