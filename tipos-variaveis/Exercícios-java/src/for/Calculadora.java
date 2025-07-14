/*
 * TABUADA utilizando for:
 * 
 * Saida 
 * 
 * ira diser se o número e valido ou não:
 * 5 x 5 = 25
 * 5 x 6 = 30
 * etc...
 */


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuade de 1 a 10. ");
        System.out.println("Escreva um Número de 1 A 10. ");

        System.out.println("Digite um Número. ");
        int numero = scanner.nextInt();

        for (int i = 1;i <= 10;i++) {
            int resultado = i * numero;

            if (numero > 10) {
                System.out.println("Número " + numero + " Inválido. ");
               break;
            }

                System.out.println("TABUADA de: " + numero + " x " + i + " = " + resultado);

            } if (numero < 10) {
                System.out.println("Número Válido. ");
            }


        }
        
    }
    

