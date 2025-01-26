
package listadoble;

/**
 *
 * @author Usuario
 */
public class Lista {
    Nodo inicio,fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    public boolean listaVacia(){
         return inicio==null;
    }
    
    public void insertInicio(String d){
       if(!listaVacia()){
            inicio=new Nodo(d,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new Nodo(d);
        }
    }  
    
  public void agregarFinal(String d){
        if(!listaVacia()){
            fin=new Nodo(d,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new Nodo(d);
        }
    }
    
    public void mostrarListaI(){
        if(!listaVacia()){
            String datos=" ";
            Nodo aux=inicio;
            while(aux!=null){
                datos=datos+"["+aux.dato+"]<=>";
                aux=aux.siguiente;
            }
            System.out.println(datos);
        }   
       }
    
    public void mostrarListaF(){
        if(!listaVacia()){
            String datos=" ";
            Nodo aux=fin;
            while(aux!=null){
                datos=datos+"["+aux.dato+"]<=>";
                aux=aux.anterior;
            }
            System.out.println(datos);
        }   
       }
}
