
package cinema;

public class Persona implements datos{
    String nombre,Apellidos,fecha_nac,nacionalidad,puesto;

        public Persona(String nombre, String Apellidos, String fecha_nac, String nacionalidad, String puesto) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public String getFecha_nac() {
        return fecha_nac;
    }
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void datoss(){
        ListP.add(new Persona(getNombre(),getApellidos(), getFecha_nac(),getNacionalidad(),getPuesto()));
    }
    void datoss(String x){
        System.out.println("Datos de las personas");
        System.out.println("_________________________________________________________________________");
        for (int i = 0; i <ListP.size(); i++) 
        {
            System.out.println("" + ListP.get(i).getNombre() + "  " + ListP.get(i).getApellidos() + " " + ListP.get(i).getFecha_nac() + " " + ListP.get(i).getNacionalidad() + " " + ListP.get(i).getPuesto());    
        }
        System.out.println("___________________________________________________________________________");
    
    }
    void datoss(String x,String xx){
        System.out.println("Personas que son directores");
        for (int i = 0; i <ListP.size(); i++)
        {
            if (ListP.get(i).getPuesto().equals("director")) 
            {
               System.out.println("" + ListP.get(i).getNombre() + " " + ListP.get(i).getPuesto());     
            }   
        }
    }
    void datoss(int x){
        System.out.println("Ingrese la nacionalidad");
        String y=leer.next();
        for (int i = 0; i < ListP.size(); i++) {
            if (ListP.get(i).getNacionalidad().equals(y)) {
                System.out.println("" + ListP.get(i).getNombre() + " " + ListP.get(i).getPuesto() + " " + ListP.get(i).getNacionalidad()); 
            }
        }
    }
}
