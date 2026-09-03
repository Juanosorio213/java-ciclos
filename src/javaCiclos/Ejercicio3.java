/*
Pedir por teclado 10 numeros e indicar si cada uno de ellos es positivo o negativo
y par o impar.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i;
        int num;
        for (i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Su numero es positivo");
            } else {
                System.out.println("Su numero es negativo");
            }
            if (num % 2 == 0) {
                System.out.println("Su numero es par");
            } else {
                System.out.println("Su numero es impar");
            }
        }
    }
}
