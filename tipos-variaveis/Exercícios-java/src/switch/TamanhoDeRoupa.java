import java.util.Scanner;

public class TamanhoDeRoupa {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho (XS, S, M, L, XL): ");
        String tamanho = scanner.nextLine().toUpperCase();

        switch (tamanho) {
            case "XS":
                System.out.println("Extra Pequeno");
                break;
            case "S":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "L":
                System.out.println("Grande");
                break;
            case "XL":
                System.out.println("Extra Grande");
                break;
            default:
                System.out.println("Tamanho inválido");
        }

        scanner.close();

    
}

}
