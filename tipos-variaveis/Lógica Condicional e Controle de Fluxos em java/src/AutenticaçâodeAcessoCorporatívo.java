/**
 * ===============================================
 *          SISTEMA DE ENTRADA CONDICIONAL
 * ===============================================
 *
 * 🧠 Objetivo:
 * Este programa simula um sistema de segurança que libera ou nega a entrada
 * de uma pessoa com base em diferentes condições lógicas.
 *
 * ✅ O que vamos treinar neste desafio:
 * - Uso dos principais operadores lógicos: AND (&&), OR (||), XOR (^), NOT (!)
 * - Entrada de dados com Scanner
 * - Estruturas de decisão com if, else e else if
 * - Comparação de valores booleanos
 * - Validação de múltiplas condições
 * - Prática de lógica de programação
 *
 * 🎯 Regras de acesso:
 * 1. A pessoa pode entrar se for FUNCIONÁRIO e tiver CRACHÁ.
 * 2. Ou se for VISITANTE e estiver AGENDADO.
 * 3. Mas não pode ser funcionário e visitante ao mesmo tempo (regra XOR).
 *
 * 🔐 Finalidade:
 * Simular um sistema básico de autenticação condicional,
 * como em uma portaria digital de empresa ou evento.
 *
 * 🧪 Ideal para praticar lógica com operadores em situações do mundo real!
 */

import java.util.Locale;
import java.util.Scanner;

public class AutenticaçâodeAcessoCorporatívo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome! ");
        String nome = scanner.nextLine();

        System.out.println("É funcionario? (true ou false) ");
        boolean eFuncionario = scanner.nextBoolean();

        System.out.println("Tem crachá? (true pu false) ");
        boolean temCracha = scanner.nextBoolean();

        System.out.println("É visitante? (true ou false) ");
        boolean eVisitante = scanner.nextBoolean();

        System.out.println("Tem agendamento confirmado? (true ou false) ");
        boolean agendamento = scanner.nextBoolean();

        boolean identidadeValida = eFuncionario ^ eVisitante;

        boolean acessoFuncionario = eFuncionario && temCracha;
        boolean acessoVisitante = eVisitante && agendamento;

        if(identidadeValida && (acessoFuncionario || acessoVisitante)){
            System.out.println("Acesso liberado. Bem-vindo, " + nome + "!");
        } else {
            System.out.println("Acesso nagado. Verifique suas credenciaís. ");
        }

        scanner.close();

    }

}
