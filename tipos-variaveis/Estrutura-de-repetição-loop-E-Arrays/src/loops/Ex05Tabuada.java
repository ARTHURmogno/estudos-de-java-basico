/*                             📝 FOR
* Tabuada: Desenvolva um gerador de tabuada,
* capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
* O usuário deve informar de qual numero ele deseja ver a tabuada.
* A saída deve ser conforme o exemplo abaixo:
*
* Tabuada de 5:
* 5 X 1 = 5
* 5 X 2 = 10
* ...
* 5 X 10 = 50
 */



package loops;

import java.util.Scanner;

public class Ex05Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a tabuada: ");
        int tabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * tabuada;

            if (tabuada > 10) {
                System.out.println("Número: " + tabuada + " inválido: ");
                break;
            }

            System.out.println("TABUADA de: " + tabuada + " x " + i + " = " + resultado);
        
        }
            
    }
}

