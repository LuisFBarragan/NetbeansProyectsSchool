package listajf;

public class Lista {
     Nodo inicio, fin;
    int cont=0;
    public Lista(){
        inicio=null; 
        fin=null;
    }
    public boolean listaVacia(){
        if (inicio==null) { // return inicio==null;
            return true;
        }
        else{
            return false;
        }
    }
   
    public int AgregarInicio(int d){
        cont++; //se cuenta cuantos nodos hay
       if (listaVacia()) {//si aun no hay lista entra
       inicio=new Nodo(d,inicio); 
       fin=inicio;
       }
        else{
            inicio=new Nodo(d,inicio);//ya hay lista
        }
        return cont;
    }
    
    public int AgregarFinal(int d){
        cont++;
        if (listaVacia()) {
            inicio=new Nodo(d);
            fin=inicio;
        }
        else{
        fin.siguiente=new Nodo(d);
        fin=fin.siguiente;
                    }
        return cont;
    }//void Agregar
    
    public String mostrarLista(){
        Nodo aux=inicio; int vec[]=new int[100]; 
        String j="";
        while(aux!=null){
          j=j+"-->"+aux.dato;
            aux=aux.siguiente;
        }
        return j;
    }
    
    public boolean buscarDatos(int d){
    boolean encontrado=false;
    Nodo aux=inicio;
    while(encontrado!=true&&aux!=null){
        if (d==aux.dato) {
            encontrado=true;
        }
        else{
            aux=aux.siguiente;
        }        
    }
    return encontrado;
}    
    
    public void eliminarInicio(){
    int eliminado=inicio.dato;
    if (cont==1) {
        inicio=null;
        fin=null;
    }
    else{
        inicio=inicio.siguiente;
    }
    cont--;
}

    public void eliminarFin(){
   int eliminado2=fin.dato;
    Nodo aux=inicio;
    while(aux.siguiente!=fin){
        aux=aux.siguiente;
    }
fin=aux;
fin.siguiente=null;
cont--;
}
    
    public  int eliminarNodo(int d){
    if (!listaVacia()) {
        if (inicio==fin&&d==inicio.dato) {
            inicio=fin=null;
        }
        else if (d==inicio.dato) {
                inicio=inicio.siguiente;
        }
        else{
            Nodo anterior=inicio;
            Nodo temporal=inicio.siguiente;
            while(temporal!=null&&temporal.dato!=d){
                  anterior=anterior.siguiente;
                  temporal=temporal.siguiente;
            }
            if (temporal!=null) {
                anterior.siguiente=temporal.siguiente;
                if (temporal==fin) {
                    fin=anterior;
                }
            }
        }
    }
    return d;
}       
    public void ListaOrdenada(int d){
         if (listaVacia()) {//si aun no hay lista entra
       inicio=new Nodo(d,inicio); 
       fin=inicio;
       }
         else if(inicio.dato>d){//poner d al inicio
            cont++;
            inicio= new Nodo(d,inicio);
        }
        else if(d>fin.dato){//poner d al final
            cont++;
             fin.siguiente=new Nodo(d);
           fin=fin.siguiente;
        }
        else{
            Nodo actual=inicio;
            Nodo elquesigue=inicio.siguiente;
            while(actual.dato!=d && elquesigue.dato<d){
                actual=actual.siguiente;
                elquesigue=elquesigue.siguiente;
            }
            if(actual.dato!=d){
                cont++;
              int x=elquesigue.dato;
              elquesigue.dato=d;
               while(elquesigue!= fin){
                   elquesigue=elquesigue.siguiente;
                   int y=elquesigue.dato;
                   elquesigue.dato=x;
                   x=y;
                   }
                 if(elquesigue==fin){
                         fin.siguiente=new Nodo(x);
                          fin=fin.siguiente;
                    }
            }
        }
    }
}
