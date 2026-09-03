/*
Pedir números por teclado hasta que se teclee un 0, mostrar la suma y la media de todos los números
introducidos.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int num;
        int i = 0;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero(0 para salir): ");
        num = sc.nextInt();
        while (num != 0) {
            suma += num;
            i++;

            System.out.print("Introduce otro numero (0 para salir): ");
            num = sc.nextInt();

        }
        System.out.println("RESULTADOS");
        System.out.println("Suma total "+ suma);
        
        if(i>0) {
            double media= suma/i;
            System.out.println("Media: "+media);
        } else {
            System.out.println("No se introdujo ningun numero para calcular la media.");
        }

    }
}
