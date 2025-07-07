/*💭 EXERCÍCIOS ESTRUTURAS DE REPETIÇÃO
📝 WHILE
🔸Nome e Idade: Faça um programa que leia conjuntos de dois valores,
 o primeiro representando o nome do aluno e o segundo representando a sua idade.
  (Pare o programa inserindo o valor 0 no campo nome)
 */

package loops;
import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       while (true) {
         System.out.println("Digite nome do Aluno(ou 0 para Sair) ");
       String nome = scanner.next();

        if (nome.equals("0")) {
            System.out.println("PROGRAMA FINALIZADO. ");
            break;
        }

         System.out.println("Digite a idade de " + nome + ":");
       int idade = scanner.nextInt();

        System.out.println("Aluno " + nome + " Sua idade e " + idade + "anos" + ":");
        System.out.println();

    }

scanner.close();
    }
}
