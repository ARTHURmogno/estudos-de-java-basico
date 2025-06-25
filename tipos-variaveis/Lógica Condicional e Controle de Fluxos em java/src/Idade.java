/**Faça um programa que solicite a idade do usuário e infome:
 *  - se ele é maior ou menor de idade.
 *  - se o número que representa a sua idade é um valor par ou ímpar.
 */



import java.util.Locale;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       // solicitação da idade (ENTRADA)

        System.out.println("Qual seu nome! ");
        String nome = scanner.next();

        System.out.println("Qual sua idade! ");
        int idade = scanner.nextInt();


        // verificação da idade (PROCESSAMENTO)
        if(idade >= 18){ // se é maior de idade
            System.out.println("Maior de idade! ");
        }else{// caso contrário
            System.out.println("Menor de idade! ");
        }


        if((idade%2) == 0 ){// verifica se o valor e par 
            System.out.println("A idade é PAR, porquê é divisivel por 2 ");
            
        }else{// caso contrário
            System.out.println("A idade é ÍMPA ");
        }

        if(idade >= 18 ){
            System.out.println("Você, Pode emtra na reuniâo ");
        }else{
            System.out.println("Você, NÃO pode entrar na reuniâo ");
        }
        



    

       
        
    }
}
