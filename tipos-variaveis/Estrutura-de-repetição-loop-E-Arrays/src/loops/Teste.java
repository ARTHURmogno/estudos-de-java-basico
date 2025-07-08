package loops;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
    
    
    
//        for(int i = 0; i < 5; i++) {
 //   System.out.println("Número: " + i);
//}
      
 //////////////////////////////////////////////////////     
      
      
 //       int i = 3;
//while(i < 5) {
 //   System.out.println("Número: " + i);
   // i++;
//}   //Não Tem ( = )


/////////////////////////////////////////////////////////


//int i = 0;
//while(i <= 5) {
   // System.out.println("Número: " + i);
   // i++;
//}  //Tem ( = )


/////////////////////////////////////////////////////////

//int i = 0;
//do {
   // System.out.println("Número: " + i);
   // i++;
//} while(i < 5);
// Não Tem ( = )

//int[] numeros = {1, 2, 3, 4, 5};
//for(int i = 0; i < numeros.length; i++) {
   // System.out.println("Elemento: " + numeros[i]);
//}


//int[] numeros = {1, 2, 3, 4, 5};
//int alvo = 4;
//int i = 1;
//boolean encontrado = false;
//while(i < numeros.length && !encontrado) {
    //if(numeros[i] == alvo) {
        //encontrado = true;
        //System.out.println("Elemento encontrado no índice: " + i);
    //}
    //i++;
//}
//if(!encontrado) {
    //System.out.println("Elemento não encontrado.");
//}


Scanner scanner = new Scanner(System.in);
int numero;
do {
    System.out.print("Digite um número maior que 0: ");
    numero = scanner.nextInt();
} while(numero <= 0);
System.out.println("Número válido: " + numero);
    }
}
