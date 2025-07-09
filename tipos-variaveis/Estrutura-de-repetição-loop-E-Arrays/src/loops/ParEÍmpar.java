/*Par e Ímpar: Faça um programa que peça N números inteiros.
 Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 *
 */

package loops;

import java.util.Scanner;

public class ParEÍmpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numeroPar = 0;
        int numeroÍmpar = 0;

        System.out.println("DIGITE os Números: ");
        int qualNumero = scanner.nextInt();

        do {
            System.out.println("DIGITE Número! ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) numeroPar++;
              else numeroÍmpar++;

        count++;
        } while (count < qualNumero);
    }
}
