


import java.util.Scanner;


public class SomarNúmeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE um Número: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1;i <= numero;i++) {
            if (i % 2 == 0) {
                soma += i;
            }

            }
            System.out.println("A soma dos números pares de 1 até " + numero + " é " + soma);

            }

        }
    

