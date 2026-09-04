/*
Pedir por teclado un numero y pedir su factorial. Si el numero introducido es negativo
se seguira pidiendo hasta que sea positivo.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i, n;
            do {
                System.out.print("Introduce un número entero no negativo: ");
                n = sc.nextInt();
                if (n < 0) {
                    System.out.println("El número no puede ser negativo. Intenta de nuevo.");
                }
            } while (n < 0);
            
            
            long resultado = 1;
            for (i = 1; i <= n; i++) {
                resultado *= i;
            }
            System.out.println("El factorial de " + n + " es: " + resultado);
        }
    }
}
