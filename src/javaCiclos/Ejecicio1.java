/*
Pedir por teclado 10 sueldos, mostrar su suma y cuales son mayores de 500.
 */
package javaCiclos;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Castañeda
 */
public class Ejecicio1 {

    public static void main(String[] args) {
        int sueldo, i;
        int sumaSueldos = 0;
        int contadorMayor = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.println("Introduce el sueldo " + i + ": ");
            sueldo = sc.nextInt();

            sumaSueldos += sueldo;
            
            if (sueldo>500) {
                contadorMayor++;
            }

        }
        System.out.println("RESULTADOS");
        System.out.println("Suma total de sueldos: "+sumaSueldos);
        System.out.println("Numero de personas con sueldo mayor a 500: "+contadorMayor);
        

    }
}
