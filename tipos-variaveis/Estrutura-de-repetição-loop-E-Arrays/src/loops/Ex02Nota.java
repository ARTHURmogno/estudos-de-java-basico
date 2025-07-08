/*               💭 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO
                            📝 WHILE
 * 
 * 🔸Nota: Faça um programa que peça uma nota,
 *  entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
 *  continue pedindo até que o usuário informe um valor válido.
/* /* */



package loops;

import java.util.Scanner;

public class Ex02Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("DIGITE uma noto de 0 á 10: ");
            int nota = scanner.nextInt();
            

            if (nota < 10) {
                System.out.println("NÚMERO VÁLIDO! ");
                break;
            } else {
                System.out.println("NÚMERO INVÁLIDO! ");
            }

        }
    }
}
