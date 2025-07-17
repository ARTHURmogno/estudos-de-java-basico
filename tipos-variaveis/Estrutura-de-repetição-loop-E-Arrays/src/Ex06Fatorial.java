/*Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5 = 120
 * 
 * 
 */

import java.util.Scanner;


public class Ex06Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE um número. ");
        int numero = scanner.nextInt();

        long resultado = 1;
        for (int i = numero ; i >= 1; i--) {
            resultado = resultado * i;
        }
        System.out.println("Fatorial de: " + numero + " = " + resultado);

        
    }
    
}
