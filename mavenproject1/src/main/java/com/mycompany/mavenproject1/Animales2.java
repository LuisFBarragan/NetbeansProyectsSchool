/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class Animales2 {
 public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
        
        char s;
        String Nombre = "\n", NombreV = "\n", Familia = "\n", Habitad = "\n", Estado = "\n", EstadoN = "\n", EstadoEsp;
        int PeriodoExtincion = 0, Poblacion = 0, Opc, Opc2, Num;

   /* int Opc = 0;

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
                    for (int i = 0; i < Animales.length; i++) {
                        Animales[i] = new Especie(Nombre, NombreV, Familia, Poblacion, Habitad, Estado, PeriodoExtincion);
                        System.out.println("Animal " + (i + 1));

                        System.out.println("Ingresa el Nombre Cientifico del Animal ");
                        Nombre = Leer.next();
                        System.out.println("Ingresa el Nombre Vulgar del Animal ");
                        NombreV = Leer.next();
                        System.out.println("Ingresa la Familia a la Que Pertenece ");
                        Familia = Leer.next();
                        System.out.println("Ingresa El Habitad del Animal ");
                        Habitad = Leer.next();
                        System.out.println("Ingresa el Periodo de Extincion del Animal ");
                        PeriodoExtincion = Leer.nextInt();
                        System.out.println("Ingresa la poblacion del animal");
                        Poblacion = Leer.nextInt();
                        if (Poblacion == 0) {
                            System.out.println("El animal esta ");
                            Estado = "extinto";
                        }
                        if (Poblacion > 0 && Poblacion < 5000) {
                            System.out.println("El animal esta en peligro de extincion");
                            Estado = "peligro de extincion";
                        }
                        if (Poblacion > 5000) {
                            System.out.println("El animal esta sobrepoblado");
                            Estado = "sobrepoblado";
                        }
                        Animales[i] = new Especie(Nombre, NombreV, Familia, Poblacion, Habitad, Estado, PeriodoExtincion);

                    }
                    break;

                case 2:
                    System.out.println("Modificar Estado"
                            + "\n1. Animal 1"
                            + "\n2. Animal 2"
                            + "\n3. Animal 3");
                    Opc2 = Leer.nextInt();

                    System.out.println("Deseas cambiar el estado del animal?");
                    s = Leer.next().charAt(0);
                    if (Poblacion > 0 && Poblacion < 5000) {
                        System.out.println("Ingresa la nueva poblacion del animal");
                        Poblacion = Leer.nextInt();
                        if (Poblacion == 0) {
                            System.out.println("El nuevo estado del animal es extinto");
                            EstadoN = Leer.next();
                        }
                    }

                    break;
                case 3:
                    /*for (Especie Animale : Animales) {
                        System.out.println("\t  " + Animale.getNombre() + "\t  " + Animale.getNombreV() + "\t  " + Animale.getFamilia() + "\t  " + Animale.getPoblacion() + "\t  " + Animale.getHabitad() + "\t  " + Animale.getEstado() + "\t  " + Animale.getPeriodoExtincion() + " \t " + Animale.getEstadoN());
                    }

                    break;

                case 4:
                    

                default:
                    System.out.println("Opcion Incorrecta ");
            }

        } while (Opc != 0); */
    }
}
