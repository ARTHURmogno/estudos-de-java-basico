/**O programa ira libera a entrada de uma pessoa em um brinquedo, com as seguintes regras:
 * 
 * A pessoa pode entrar se:
 * tem 12 anos ou, Está aconpanhada de um responsável:
 * 
 * O programa ira perguntar se:
 * 
 * o nome a idade, se está com responsável(true ou false)
 * e ira mostrar se a entrada é permitida ou negada.
 * 
 * 
 */



import java.util.Locale;
import java.util.Scanner;

public class EntradaNoParqueDeDiversões {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome! ");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade! ");
        int idade = scanner.nextInt();

        System.out.println("Você está com responsável! ");
        boolean responsavel = scanner.nextBoolean();

        if (idade >= 12  || responsavel ) {
            System.out.println("Pode entrar, " + nome + "!");
        } else {
            System.out.println("Entrade negada. Você precisa ter 12 anos ou com um responsável. ");
        }

        scanner.close();


        

    }
}
