import java.util.Scanner;


public class Idade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua idade! ");
        int idade = scanner.nextInt();

        if (idade <= 17) {
            System.out.println("Menor de idade! (não tem 18 anos). ");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Maior de idade! (PARABEMS)");
        } else {
            System.out.println("PARABEMS, IDOSO! ");
        } if (idade % 2 == 0) {
            System.out.println("Sua idade e (PAR)! ");
        } else {
            System.out.println("Sua idade e (impar)");
        }


        scanner.close();
    }
}
