/*
 * Verificação de Altura meno que 100 não pode entrar e abaixo de 130, ainda e crianca.
 * 
 * ele ele ira perguntar a Altura até. escrever certa ou ( 0 ).
 * 
 * E digite ( 0 ), para finalizar o prigrama:
 * 
 */


import java.util.Scanner;


public class VerificaçãoDeAltura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE sua altura ( ou 0 ) para sair. ");
        int altura = scanner.nextInt();

        int soma = 1;

        while (altura != 0) {
            if (altura < 100) {
                System.out.println("Não pode entrar no brinquedo " + altura + "cm " + " muito pequena É perigoso. ");
            } else if (altura < 130) {
                System.out.println("Ainda é crianca " + altura + " cm " + " não pode entrar. ");
            } else {
                System.out.println("Pode entrar Altura. " + altura + " cm " + " Compatível. ");
            }

            System.out.println("DIGITE outro altura ( ou 0 ) para Sair. ");
            altura = scanner.nextInt();
        }
        System.out.println("PROGRAMA encerado. Obrigado! ");
        scanner.close();
        
    }
    }
