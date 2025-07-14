import java.util.Scanner;

public class MêseNúmeroDeDias {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1,3,5,7,8,10,12: 
                System.out.println("Este mês tem 31 dias.");
                break;
            case 4,6,9,11:
                System.out.println("Este mês tem 30 dias.");
                break;
            case 2:
                System.out.println("Fevereiro tem 28 ou 29 dias.");
                break;
            default:
                System.out.println("Número de mês inválido.");
        }

        scanner.close();

        
        
    }
    
}
