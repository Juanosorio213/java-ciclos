/*
Escribir un programa que pida una base y un exponente (ambos números son enteros positivos) y que
calcule la potencia. Ejemplo, si se indica 3 y 4, nos da 81 de solución (3 elevado a 4, es 3*3*3*3).
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio 
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente, i;
        int resultado = 1;

        System.out.println("Digite el numero base: ");
        base = sc.nextInt();
        System.out.println("Digite el exponente: ");
        exponente = sc.nextInt();
        for (i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println("El resultado de la potenciacion seria: " + resultado);
    }
}
