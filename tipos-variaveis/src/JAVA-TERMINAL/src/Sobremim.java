import java.util.Scanner;
import java.util.Locale;

public class Sobremim {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = Scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = Scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = Scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = Scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
    
}
