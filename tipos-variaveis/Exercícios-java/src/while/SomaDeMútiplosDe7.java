/*Soma de múltiplos de 7 ( com while ).
 * 
 * soma todos os numeros de 1 a 100 que são divisíveis por 7.
 * 
 * ao final era mostrar a soma dos números e a média dos nuúmeros encontrados.
 * 
 */

import java.util.Scanner;


public class SomaDeMútiplosDe7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 1;
        int quantidade = 0;

        while (contador <= 100) {
            if (contador % 7 == 0) {
                soma += contador;
                quantidade++;
            }
            contador++;
        }

        double media = quantidade > 0 ? (double) soma / quantidade : 0;

        System.out.println("Soma dos múltiplos de 7 de 1 a 100: " + soma);
        System.out.println("Quantidade de mútiplos de 7: " + quantidade);
        System.out.println("Média: " + media);
        
    }
    
}
