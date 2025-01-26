package chelas;

import java.util.Scanner;

public class Chelas {

    Scanner read = new Scanner(System.in);
    int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
    int prom1, prom2, prom3, prom4, prom5;
    int sumc1 = 0, sumc2 = 0, sumc3 = 0, sumc4 = 0, sumc5 = 0;
    int promc1, promc2, promc3, promc4, promc5;
    int sumtot = 0, promtot;
    int aux;

    String materias[] = {"Calculo", "Estructura", "Fisica", "Cultura", "Desarrollo"};
    String Alumnos[] = {"Luisito", "ñora", "El joto", "Paquirris", "Byron"};
    String shell2[] = new String[Alumnos.length];
    int m[][] = new int[Alumnos.length][materias.length];
    int shell[] = new int[Alumnos.length];

    public void llenado() {
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("Da la calificacion de " + Alumnos[i]);

            for (int j = 0; j < materias.length; j++) {
                System.out.println(" " + materias[j]);
                m[i][j] = read.nextInt();
//___________________________sumas prom______________________________________________
                if (j == 0) {
                    sumc1 = sumc1 + m[i][j];
                }
                if (j == 1) {
                    sumc2 = sumc2 + m[i][j];
                }
                if (j == 2) {
                    sumc3 = sumc3 + m[i][j];
                }
                if (j == 3) {
                    sumc4 = sumc4 + m[i][j];
                }
                if (j == 4) {
                    sumc5 = sumc5 + m[i][j];
                }
//___________________________sumas cal_______________________________________________                
                if (i == 0) {
                    sum1 = sum1 + m[i][j];
                }
                if (i == 1) {
                    sum2 = sum2 + m[i][j];
                }
                if (i == 2) {
                    sum3 = sum3 + m[i][j];
                }
                if (i == 3) {
                    sum4 = sum4 + m[i][j];
                }
                if (i == 4) {
                    sum5 = sum5 + m[i][j];
                }
            }//for j
        }//for i 
        prom1 = sum1 / materias.length;
        prom2 = sum2 / materias.length;
        prom3 = sum3 / materias.length;
        prom4 = sum4 / materias.length;
        prom5 = sum5 / materias.length;
        promc1 = sumc1 / Alumnos.length;
        promc2 = sumc2 / Alumnos.length;
        promc3 = sumc3 / Alumnos.length;
        promc4 = sumc4 / Alumnos.length;
        promc5 = sumc5 / Alumnos.length;
    }

    public void promxAlum() {
        for (int i = 0; i < Alumnos.length; i++) {
            System.out.print("" + Alumnos[i]);
            if (i == 0) {
                System.out.println(" " + prom1);
                shell[i] = prom1;
            }//if 0
            if (i == 1) {
                System.out.println(" " + prom2);
                shell[i] = prom2;
            }//if 1
            if (i == 2) {
                System.out.println(" " + prom3);
                shell[i] = prom3;
            }// if 2
            if (i == 3) {
                System.out.println(" " + prom4);
                shell[i] = prom4;
            }//if 3
            if (i == 4) {
                System.out.println(" " + prom5);
                shell[i] = prom5;
            }//if 4
        }//for   
    }//void promxalum

    public void promxMat() {
        for (int i = 0; i < materias.length; i++) {
            System.out.print("" + materias[i]);
            if (i == 0) {
                System.out.println(" " + promc1);
            }//if 0
            if (i == 1) {
                System.out.println(" " + promc2);
            }//if 1
            if (i == 2) {
                System.out.println(" " + promc3);
            }//if 2
            if (i == 3) {
                System.out.println(" " + promc4);
            }//if 3
            if (i == 4) {
                System.out.println(" " + promc5);
            }//if 4
        }//for
    }

    public void total() {
        sumtot = prom1 + prom2 + prom3 + prom4 + prom5;
        promtot = sumtot / Alumnos.length;
        System.out.println(" " + promtot);
    }

    public void Shell() {
        for (int i = Alumnos.length / 2; i != 0; i = i / 2) {
            for (int j = 0; j != 1; j++) {
                j = 0;
                for (int k = i; k < Alumnos.length; k++) {
                    if (shell[k - i] > shell[k]) {
                        aux = shell[k];
                        shell[k] = shell[k - i];
                        shell[k - i] = aux;
                        j = 1;
                    }
                }
            }
        }
        for (int i = 0; i < Alumnos.length; i++) {
            if (shell[i] == prom1) {
                shell2[i] = "Luisito";
            }
            if (shell[i] == prom2) {
                shell2[i] = "Ñora";
            }
            if (shell[i] == prom3) {
                shell2[i] = "Luis";
            }
            if (shell[i] == prom4) {
                shell2[i] = "Paco";
            }
            if (shell[i] == prom5) {
                shell2[i] = "Byron";
            }
        }

        for (int i = 0; i < Alumnos.length; i++) {
            System.out.print(" " + shell2[i] + ": ");
            System.out.println(" [" + shell[i] + "]");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Chelas obj = new Chelas();
        int op = 0;
        do {
            System.out.println("1.- Llenar");
            System.out.println("2.- Mostrar prom de calificaciones");
            System.out.println("3.- Mostrar prom x materia");
            System.out.println("4.- promedio grupal");
            System.out.println("5.- Shell");
            System.out.println("6.- salir");
            System.out.println("Elije");
            op = read.nextInt();
            switch (op) {
                case 1:
                    obj.llenado();
                    break;
                case 2:
                    obj.promxAlum();
                    break;
                case 3:
                    obj.promxMat();
                    break;
                case 4:
                    obj.total();
                    break;
                case 5:
                    obj.Shell();
                    break;
            }
        } while (op != 6);
    }
}
