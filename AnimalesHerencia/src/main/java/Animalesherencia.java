
import java.util.ArrayList;
import java.util.Scanner;


class Especie {

    Scanner Leer = new Scanner(System.in);
    private String Nombre;
    private String NombreV;
    private String Familia;
    private int Poblacion;
    private String Habitad;
    private String Estado;
    private int PeriodoExtincion;
    private String EstadoN;

    public Especie(String Nombre, String NombreV, String Familia, int Poblacion, String Habitad, String Estado, int PeriodoExtincion) {
        this.Nombre = Nombre;
        this.NombreV = NombreV;
        this.Familia = Familia;
        this.Poblacion = Poblacion;
        this.Habitad = Habitad;
        this.Estado = Estado;
        this.PeriodoExtincion = PeriodoExtincion;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFamilia() {
        return Familia;
    }

    public String getHabitad() {
        return Habitad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNombreV() {
        return NombreV;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public int getPeriodoExtincion() {
        return PeriodoExtincion;
    }

    public String getEstadoN() {
        return EstadoN;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }

    public void setHabitad(String Habitad) {
        this.Habitad = Habitad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    public void setPeriodoExtincion(int PeriodoExtincion) {
        this.PeriodoExtincion = PeriodoExtincion;

    }

    public void setEstadoN(String EstadoN) {
        this.EstadoN = EstadoN;
    }

    public void RegistroAnimal(String Nombre, String NombreV, String Familia, int Poblacion, String Habitad, String Estado, int PeriodoExtincion) {
        this.Nombre = Nombre;
        this.NombreV = NombreV;
        this.Familia = Familia;
        this.Poblacion = Poblacion;
        this.Habitad = Habitad;
        this.Estado = Estado;
        this.PeriodoExtincion = PeriodoExtincion;

    }

    static ArrayList<Especie> animal = new ArrayList();

    void registrar() {
        animal.add(new Especie(getNombre(), getNombreV(), getFamilia(), getPoblacion(), getHabitad(), getEstado(), getPeriodoExtincion()));
    }

    void mostrar() {
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i).getNombre() + "  " + animal.get(i).getEstadoN() + "  " + animal.get(i).getFamilia()
                    + "  " + animal.get(i).getPoblacion() + "  " + animal.get(i).getHabitad() + "  " + animal.get(i).getEstado() + "  " + animal.get(i).getPeriodoExtincion());
        }
    }

    void modificarEstado() {
        String name = "", estado = "";
        System.out.println("Ingresa el nombre del animal a modificar su estado");
        name = Leer.next();
        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getNombre().equals(name)) {
                if (animal.get(i).getEstado() == "peligro de extincion") {
                    System.out.println("Elije 1.-  para extinto"
                            + "\n 2.- para sostenible");
                    int estadon = Leer.nextInt();
                    if (estadon == 1) {
                        System.out.println("Se cambio a extinto");
                        animal.get(i).setEstado("extinto");
                        System.out.println("Da la fecha de extincion");
                        int fecha = Leer.nextInt();
                        animal.get(i).setPeriodoExtincion(fecha);
                    } else {
                        animal.get(i).setEstado("sostenible");
                        System.out.println("Se cambio a sostenible");
                    }
                } else if (animal.get(i).getEstado() == "sostenible") {
                    System.out.println("Se cambio a peligro de extinsion");
                    animal.get(i).setEstado("peligro de extinsion");
                }

            }else{

                System.out.println("Animal no registrado");
}
        }
    }

    void MostrarEstado() {
        System.out.println("Ingresa el estado de la especie a mostrar:"
                + "\n 1.- Sostenible"
                + "\n 2.- Peligro de extincion"
                + "\n 3.- Extinto");
        int busEstado = Leer.nextInt();
        if (busEstado == 1) {
            for (int i = 0; i < animal.size(); i++) {
                if (animal.get(i).getEstado() == "sostenible") {
                    System.out.println(animal.get(i).getNombre() + "  " + animal.get(i).getEstadoN() + "  " + animal.get(i).getFamilia()
                            + "  " + animal.get(i).getPoblacion() + "  " + animal.get(i).getHabitad() + "  " + animal.get(i).getEstado() + "  " + animal.get(i).getPeriodoExtincion());

                }
            }
        } else if (busEstado == 2) {
            for (int i = 0; i < animal.size(); i++) {
                if (animal.get(i).getEstado() == "peligro de extincion") {
                    System.out.println(animal.get(i).getNombre() + "  " + animal.get(i).getEstadoN() + "  " + animal.get(i).getFamilia()
                            + "  " + animal.get(i).getPoblacion() + "  " + animal.get(i).getHabitad() + "  " + animal.get(i).getEstado() + "  " + animal.get(i).getPeriodoExtincion());
                }
            }
        } else if (busEstado == 3) {
            for (int i = 0; i < animal.size(); i++) {
                if (animal.get(i).getEstado() == "extinto") {
                    System.out.println(animal.get(i).getNombre() + "  " + animal.get(i).getEstadoN() + "  " + animal.get(i).getFamilia()
                            + "  " + animal.get(i).getPoblacion() + "  " + animal.get(i).getHabitad() + "  " + animal.get(i).getEstado() + "  " + animal.get(i).getPeriodoExtincion());
                }
            }
        }
    }
}

public class Animalesherencia {
ArrayList<Animalesherencia> animal = new ArrayList();
    public static void main(String[] args) {
     Scanner Leer = new Scanner(System.in);
        Leer.useDelimiter("\n");
        //int N = 20;

       

        char s;
        String Nombre = "\n", NombreV = "\n", Familia = "\n", Habitad = "\n", Estado = "\n", EstadoN = "\n", EstadoEsp;
        int PeriodoExtincion = 0, Poblacion = 0, Opc, Opc2, Num;

        Especie ObjEspecie = new Especie(Nombre, NombreV, Familia, Poblacion, Habitad, Estado, PeriodoExtincion);

        do {
            System.out.println("  MENU  "
                    + "\n1. Agregar Especie Animal "
                    + "\n2. Modificar el Estado de la Especie "
                    + "\n3. Mostar Todas Las Especies Animales "
                    + "\n4. Mostrar Especies en Estado Especifico "
                    + "\n0. Terminar");
            System.out.println("Elige Una Opcion : ");
            Opc = Leer.nextInt();

            switch (Opc) {
                case 1:

                    System.out.println("cantidad de animales a ingrear");
                    int N = Leer.nextInt();
                    for (int i = 0; i < N; i++) {
                        System.out.println("Ingresa el Nombre Cientifico del Animal ");
                        Nombre = Leer.next();
                        ObjEspecie.setNombre(Nombre);
                        System.out.println("Ingresa el Nombre Vulgar del Animal ");
                        NombreV = Leer.next();
                        ObjEspecie.setNombreV(NombreV);
                        System.out.println("Ingresa la Familia a la Que Pertenece ");
                        Familia = Leer.next();
                        ObjEspecie.setFamilia(Familia);
                        System.out.println("Ingresa El Habitad del Animal ");
                        Habitad = Leer.next();
                        ObjEspecie.setHabitad(Habitad);
                        System.out.println("Ingresa la poblacion del animal");
                        Poblacion = Leer.nextInt();
                        ObjEspecie.setPoblacion(Poblacion);
                        if (Poblacion == 0) {
                            System.out.println("El animal esta extinto");
                            Estado = "extinto";
                            ObjEspecie.setEstado(Estado);
                            System.out.println("Ingresa el Periodo de Extincion del Animal ");
                            PeriodoExtincion = Leer.nextInt();
                            ObjEspecie.getPeriodoExtincion();
                        }
                        if (Poblacion > 0 && Poblacion <= 5000) {
                            System.out.println("El animal esta en peligro de extincion");
                            Estado = "peligro de extincion";
                            ObjEspecie.setEstado(Estado);
                        }
                        if (Poblacion > 5000) {
                            System.out.println("El animal esta sostenible");
                            Estado = "sostenible";
                            ObjEspecie.setEstado(Estado);
                        }
                        ObjEspecie.registrar();
                    }// for

                    break;

                case 2:
                    ObjEspecie.modificarEstado();
                    break;
                case 3:
                    ObjEspecie.mostrar();

                    break;

                case 4:
                    ObjEspecie.MostrarEstado();
                break;
                default:
                    System.out.println("Opcion Incorrecta ");
            }

        } while (Opc != 0);
}
}