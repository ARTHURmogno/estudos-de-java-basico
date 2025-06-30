import java.util.Locale;
import java.util.Scanner;

public class MêsEdiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String ano = "2025";

        System.out.println("Digite um número, Corespondendente ao mês! ");
        int numeroMes = scanner.nextInt();
        
       
        switch (numeroMes) {
            case 1:
             System.out.println("janeiro de " + ano);
            break;
            case 2:
             System.out.println("fevereiro de " + ano);
            break;
            default:
            System.out.println("Número inválido! ");

        }
    }
}
