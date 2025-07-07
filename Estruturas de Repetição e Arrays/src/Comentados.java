/*➿ ESTRUTURAS DE REPETIÇÃO
🔸 O real poder dos computadores está na sua habilidade para repetir uma operação ou uma série de operações várias vezes (loop).
🔸 Uma estrutura de repetição permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições são satisfeitas.
🔸 Essas condições são representadas por expressões lógica.
🔸 As estruturas de repetição podem ser classificadas em:

 Repetição com teste no início (while)
 Repetição com teste no final (do-while)
 Repetição contada (for)
🔸O comando break é utilizado para terminar de forma abrupta uma repetição.
🔸Quando comando continue é executado, os comandos restantes da repetição são ignorados e programa volta a testar novamente a condição.
 * 
 * 
 * /////////////////
 * 
 * Estruturas de Repetição em Java
Java oferece três principais estruturas de repetição: for, while e do-while. Cada uma tem suas peculiaridades e casos de uso ideais.
For Loop
O loop for é ideal quando o número de iterações é conhecido antecipadamente.
 Sua sintaxe facilita a inicialização de uma variável,
  a definição da condição de continuação e o incremento ou decremento dessa variável.
 * 
 *         for(int i = 0; i < 5; i++) {
              System.out.println("Número: " + i);
            }
 * 
 * 
 * While Loop
O loop while é utilizado quando o número de iterações não é necessariamente conhecido de antemão. Ele continua a executar enquanto a condição especificada for verdadeira.
Exemplo Básico:
int i = 0;
while(i < 5) {
    System.out.println("Número: " + i);
    i++;
}
 * 
 * 
 * 
 * Do-While Loop
O loop do-while garante que o bloco de código seja executado pelo menos uma vez, com a condição sendo verificada após a execução do bloco.
Exemplo Básico:
int i = 0;
do {
    System.out.println("Número: " + i);
    i++;
} while(i < 5);
 * 
 * 
 * 
 * Aplicações
Vamos agora explorar aplicações das estruturas de repetição em Java, aprofundando nosso entendimento através de exemplos práticos.
Exemplo 1: Processamento de Arrays
Se ainda não tem conhecimento sobre Arrays, sugiro a leitura do seguinte artigo: Java: Um Guia Sobre Ordenação.
Arrays são estruturas de dados fundamentais em qualquer linguagem de programação. Com o loop for, podemos iterar sobre cada elemento de um array facilmente.
int[] numeros = {1, 2, 3, 4, 5};
for(int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento: " + numeros[i]);
}
Exemplo 2: Busca Sequencial
A busca sequencial é um algoritmo simples que busca por um elemento específico em uma coleção. Este é um exemplo clássico onde um loop while pode ser eficaz.
int[] numeros = {1, 2, 3, 4, 5};
int alvo = 3;
int i = 0;
boolean encontrado = false;
while(i < numeros.length && !encontrado) {
    if(numeros[i] == alvo) {
        encontrado = true;
        System.out.println("Elemento encontrado no índice: " + i);
    }
    i++;
}
if(!encontrado) {
    System.out.println("Elemento não encontrado.");
}
Exemplo 3: Validação de Entrada
Um loop do-while pode ser particularmente útil para a validação de entradas do usuário,
 garantindo que o usuário forneça uma entrada válida antes de prosseguir.
Scanner scanner = new Scanner(System.in);
int numero;
do {
    System.out.print("Digite um número maior que 0: ");
    numero = scanner.nextInt();
} while(numero <= 0);
System.out.println("Número válido: " + numero);
 
As estruturas de repetição são ferramentas indispensáveis para um programador.
 Elas não apenas melhoram a eficiência e a clareza do código,
  mas também ampliam as capacidades do programa para lidar com tarefas complexas e dados dinâmicos.
   Ao dominar o uso de loops for, while e do-while em Java,
    você se equipa com a habilidade de escrever programas robustos e adaptáveis,
     prontos para enfrentar uma ampla gama de desafios de programação.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */
