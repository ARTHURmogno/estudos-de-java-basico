/*
 * Contar de 1 até Número (com soma acumulada).
 * 
 * ira mostrar os números de 1 até o número digitado:
 * E ira mostras a soma.
 * 
 *                              UTILIZANDO O ( FOR ) 
 * 
 */


import java.util.Scanner;


public class SomarAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1;i <= numero;i++) {
            System.out.println(i);
                soma += i;
        }

        System.out.println("A Soma de numero é " + soma);
        
    }
    
}
