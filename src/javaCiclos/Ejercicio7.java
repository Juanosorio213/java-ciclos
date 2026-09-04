/*
Escribir un programa que muestre esto por pantalla:
*
**
***
****
*****
 */
package javaCiclos;

/**
 *
 * @author Juan Sebastian Osorio
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int i,j;
        
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
