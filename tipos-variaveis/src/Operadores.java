public class Operadores {
    
    public static void main(String[] args) {
        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);


        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

//concatenacao = 1+1+1+"1";

//concatenacao = 1+"1"+1+1;

//concatenacao = 1+"1"+1+"1";

//concatenacao = "1"+1+1+1;

//concatenacao = "1"+(1+1+1);

    System.out.println(concatenacao);

    //classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++;
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);


// classe Operadores.java
int a, b;

a = 6;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println( resultado );





//classe Operadores.java
int numero1 = 22;
int numero2 = 23;

if(numero1 > numero2)

	System.out.print("Numero 1 maior que numero 2 ");

if(numero1 < numero2)

	System.out.print("Numero 1 menor que numero 2 ");

if(numero1 >= numero2)

	System.out.print("Numero 1 maior ou igual que numero 2 ");

if(numero1 <= numero2)

	System.out.print("Numero 1 menor ou igual que numero 2 ");

if(numero1 != numero2)

	System.out.print("Numero 1 é diferente de numero 2 ");



    // ComparacaoAvancada.java


        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

       
        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;


        //System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    



        // ComparacaoAvancada.java
int numero11 = 1;
int numero12 = 1;

if(numero11== 2 & numero12 ++ == 2 )
    System.out.println("As 2 condições são verdadeiras");

System.out.println("O numero 1 agora é " + numero11);
System.out.println("O numero 2 agora é " + numero12);

// Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
    }      
}
