/*
Escribir un programa que pida cuantos hombres y mujeres hay en un aula (números enteros) y nos
informa del porcentaje de hombres y de mujeres.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Castañeda
 */
public class Ejecicio1 {

    public static void main(String[] args) {
        int hombres, mujeres, total;
        double porcentajeHombres, porcentajeMujeres;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos hombres hay en el aula? ");
        hombres = sc.nextInt();
        System.out.println("Cuantas mujeres hay en el aula? ");
        mujeres = sc.nextInt();
        total = hombres + mujeres;
        System.out.println("Este es el total de personas en el aula: " + total);
        porcentajeHombres = ((double) hombres / total) * 100;
        porcentajeMujeres = ((double) mujeres / total) * 100;
        System.out.println("Este es el porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Este es el porcentaje de mujeres: " + porcentajeMujeres + "%");

    }
}
