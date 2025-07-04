import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class MêsEdiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        int ano = (2025);

        System.out.println("Qual o dia da Semana! ");
        int diaDaSemana = scanner.nextInt();

        System.out.println("Digite um número, Corespondendente ao mês! ");
        int numeroMes = scanner.nextInt();

        //if (diaDaSemana >= 1 && diaDaSemana <= 7) {
          //  System.out.println("Dia válido! ");
        //if (semana == 1) {
         //   System.out.println("Primeiro dia da Semana! Domingo")
       // }

        int mes = numeroMes;
        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Més válido! ");
        if (mes == 1) {
            System.out.println("Janeiro " + "de " + ano);
        } else if (mes == 2) {
            System.out.println("Fevereiro " + "de " + ano);
        } else if (mes == 3) {
            System.out.println("Março " + "de " + ano);
        } else if (mes == 4) {
            System.out.println("Abril " + "de " + ano);
        } else if (mes == 5) {
            System.out.println("Maio " + "de " + ano);
        } else if (mes == 6) {
            System.out.println("Junho " + "de " + ano);
        } else if (mes == 7) {
            System.out.println("Julho " + "de " + ano);
        } else if (mes == 8) {
            System.out.println("Agosto " + "de " + ano);
        } else if (mes == 9) {
            System.out.println("Setembro " + "de " + ano);
        } else if (mes == 10) {
            System.out.println("Outubro " + "de " + ano);
        } else if (mes == 11) {
            System.out.println("Novembro " + "de " + ano);
        } else {
            System.out.println("Dezembro " + "de " + ano);
        } 
    } else {
        System.out.println("Número inválido! ");
    }

    switch (numeroMes) {
        case 7:
        System.out.println("Julho É férias! ");
        break;
        case 12:
        System.out.println("Dezembro É férias! ");
        break;
        case 1:
        System.out.println("Janeiro É férias! ");
        break;
    }
    switch (diaDaSemana) {
     case 1:
        System.out.println("Primeiro dia da Semana! Domingo. ");
        break;
     case 2:
        System.out.println("Segundo dia da Semana! segunda-feira. ");
        break;
     case 3:
        System.out.println("Terceiro dia da semana! Terça-feira. ");
        break;
     case 4:
        System.out.println("Quarto dia da Semana! é quarta-feira. ");
        break;
    case 5:
        System.out.println("Quinta feira! mais já e quinta. ");
        break;
    case 6:
        System.out.println("Sexto dia da Semana! Sexta-feira. ");
        break;
    case 7:
        System.out.println("Agora sim! Sábado. ");
        break;
    default:
        System.out.println("Número inválido! Por favor, digite um número entre 1 e 7. ");

        
    }

    switch (diaDaSemana) {
        case 1,2,3:
        System.out.println("Certo. ");
        break;
        case 4:
        System.out.println("Errado. ");
        break;
        case 5:
        System.out.println("Talcez. ");
        break;
        default:
        System.out.println("Valor indefinido. ");
    }

        }
    }
