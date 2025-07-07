import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE o NOME do Aluno ( ou 0 para Sair): ");
        String nome = scanner.next();

        while(!nome.equals("0")) {
            System.out.println("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            System.out.println("Digite o nome do próximo aluno ( ou 0 para Sair): ");
            nome = scanner.next();
        }
        System.out.println("Programa Finalizado. ");
        scanner.close();
    }
}
