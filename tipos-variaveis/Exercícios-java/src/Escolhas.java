import java.util.Scanner;


public class Escolhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma ação: ");
        System.out.println("1 - Verificar idade! ");
        System.out.println("2 - verificar par ou impar! ");
        System.out.println("3 - para Sair. ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("DIGITE UM NÚMERO! ");
            int num = scanner.nextInt();

            if (num < 18) {
                System.out.println("Menor de idade! Não pode entrar. ");
            } else {
                System.out.println("Maior de idade! pode entrar. ");
            }
            break;
            case 2:
            System.out.println("DIGITE UM NÚMERO! ");
            int idade = scanner.nextInt();

            if (idade % 2 == 0) {
                System.out.println(idade + " Idade par! ");
            } else {
                System.out.println(idade + " idade impar! ");
            }
            break;
            case 3:
            System.out.println("FIm ");
            break;
            default:
            System.out.println("Opção inválida. ");
            break;
        }

        scanner.close();
    }
    
}
