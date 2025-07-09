/*                     💭 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO              
                                    DO-WHILE
🔸Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números
 */

package loops;

import java.util.Scanner;

public class Ex03MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;
        do {
            System.out.println("DIGITE Número! ");
            int numero = scanner.nextInt();

            soma = soma + numero;

        if (numero > maior) maior = numero;

        count = count + 1;
        } while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
