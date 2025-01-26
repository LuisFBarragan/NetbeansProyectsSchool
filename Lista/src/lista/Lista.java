package lista;
public class Lista {
    public static void main(String[] args) {
     Listan Mylista=new Listan();
    Mylista.AgregarInicio(100);
    Mylista.AgregarInicio(200);
    Mylista.AgregarInicio(300);
    Mylista.AgregarInicio(400);
    Mylista.mostrarLista();
        if (Mylista.listaVacia()) {
            System.out.println("\n lista");
        }
        else{
            System.out.println("elementos de la lista enlazada "+Mylista.cantidadNodod());
        }
    }
    
}
