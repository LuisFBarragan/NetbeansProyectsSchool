
package cinema;

public class Pelicula implements datos{
    String nom_peli,sipnosis,año,genero,pais;

    public Pelicula(String nom_peli, String sipnosis, String año, String genero, String pais) {
        this.nom_peli = nom_peli;
        this.sipnosis = sipnosis;
        this.año = año;
        this.genero = genero;
        this.pais = pais;
    }

    public String getNom_peli() {
        return nom_peli;
    }
    public void setNom_peli(String nom_peli) {
        this.nom_peli = nom_peli;
    }
    public String getSipnosis() {
        return sipnosis;
    }
    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void datoss(){
        ListPL.add(new Pelicula(getNom_peli(),getSipnosis(),getAño(),getGenero(),getPais()));    
    }

    public void datoss(String x){
    System.out.println("Datos de las peliculas");
        System.out.println("_________________________________________________________________________________");
        for (int i = 0; i <ListPL.size(); i++) 
        {
            System.out.println("" + ListPL.get(i).getNom_peli() + " " + ListPL.get(i).getSipnosis() + " " + ListPL.get(i).getAño() + " " + ListPL.get(i).getGenero() + " " + ListPL.get(i).getPais());    
        }
        System.out.println("__________________________________________________________________________________");
    
    }
    public void datoss(String x,String xx){
        int b=0;
        System.out.println("Peliculas buscadas en un Año");
        System.out.println("____________________________________________________");
        System.out.println("Ingrese el año");
        x=leer.next();
        for (int i = 0; i <ListPL.size(); i++) 
        {
            if(ListPL.get(i).getAño().equals(x))
            {
                System.out.println("" + ListPL.get(i).getNom_peli() + " " + ListPL.get(i).getAño());
                
            }
            b=b+1;
        }
        System.out.println("____________________________________________________");
        if(b==0)
        {
            System.out.println("No se encontro ninguna pelicula en ese año");
        } 
    }
}
