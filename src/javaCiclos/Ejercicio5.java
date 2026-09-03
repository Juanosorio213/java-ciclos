/*
Realizar un programa que pida por teclado al usuario dos números, que serán el numerador y el
denominador de una fracción. Reducir luego la fracción a su mínima expresión, y escribir la fracción
resultante. Por ejemplo, si se escriben 24 y 30, debe escribir “Fracción reducida: 4/5”.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int numerador, denominador;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que sera el numerador: ");
        numerador = sc.nextInt();
        System.out.println("Introduce el numero que sera el denominador: ");
        denominador = sc.nextInt();
        int a = numerador;
        int b = denominador;
        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;

        }
        System.out.println("Fraccion reducida: "+ (numerador/a)+ "/"+ (denominador/a));

    }
}
