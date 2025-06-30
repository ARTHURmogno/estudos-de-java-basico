public class Ff {
    public static void main(String[] args) {
        int contador = 1;

/* while - Repetição com condiçâo :
 * quando usar: quando você não sabe quantas vezes vai repetir, mas tem uma condição.
 * EX: a baixo ele ira repetir até chagar no três.
 */
        while (contador <= 3){
            System.out.println("Valor: " + contador);
            contador++;
        }

/*for - Repetiçâo com contador :
 * Quando usar: quando você sabe quantas vezes quer repetir algo.
 * EX: ele ira repetir até 5 vezes como está escrito.
 */
        for (int i = 1; i <= 5; i++){
            System.out.println("Contando: " + i);
        }

/*if, else if, else - Deciçâo Simples :
 * Quando usar: quando você executar algo se uma condiçâo for verdadeira.
 * EX: ele tém uma idade minima se for maior de idade ele ira, escrever uma mensagem porém se ele for meno de idade ira executar uma linha de código diferente.
 * ele so executa se ás informaçâo forem de a cordo com o que está sendo pedindo ele pede ( >= 18 ).
 */
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Maior de idade ");
        } else {
            System.out.println("Menor de idade ");
        }

/*switch - Decisão com vários opçôes :
 * Quando usar: quando você quer verificar vários valores diferentes de uma variavel.
 * EX: verificar qual o dia da semana com base no dia da semana, ex dia 1 dia 2 etc...
 */

        int dia = 7;

        switch (dia) {
            case 1:
             System.out.println("Domingo ");
            break;
            case 2:
            System.out.println("Segunda-Feira ");
            break;
            default:
            System.out.println("Dia inválido ");
        }

/*do while - Repetição com condiçâo (executa pelo menos uma vez) :
 * Quando usar: quando você quer executar pelo menos uma vez, mesmo que a condiçâo seja falso.
 * 
 */

        int num = 1;
        do {
            System.out.println("Número: " + num);
            num++;
        } while (num <= 3);

/*break - Para o loço :
 * Quando usar: quando você quer interromper um for, while ou switch imediatamente.
 * EX: abaixo ele ira para antes de chegar no 3.
 */

        for (int i = 1; i <= 5; i++){
            if (i == 3) {
                break; // Sai do laço
            }
            System.out.println("i = " + i);
        }

/*continue - Pular para a próxima repetiçâo :
 * Quando usar: quando você ignorar a restante do código dentro do laço e ir para o próximo.
 * 
 */

        for (int i = 1; i <= 5; i++){
            if (i == 3) {
                continue; // Sai do laço
            }
            System.out.println("i = " + i );

        }
        

        public static void verificarIdade(int idade) {{
            if (idade < 18) {
                System.out.println("Menor de idade ");
                return; // sai do método aqui
            }
            System.out.println("Maior de idade ");
        }
    }
    
    
    
}
