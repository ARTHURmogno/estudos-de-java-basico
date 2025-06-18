public class CalculadoraSinples {

    int a = 10;
    int b = 5;
    int resultado;

//lllllllllllllllllllllllllll


    public void  somar(){
        resultado = a + b;
         System.out.println("A soma Será feita " + resultado );
    }

    public void subtração(){
        resultado = a - b;
        System.out.println("A subtração Será feita " + resultado );
    }
    public void multiplicação(){
        resultado = a * b;
        System.out.println("A sua Multiplicação será executada " + resultado);
    }
    public void divisão(){
        if (b == 0) {
            throw new ArithmeticException("A Divisão por zero não é permitida ");
        }
        resultado = a / b;
            System.out.println("A Dicisão ira acontecer " + resultado);
    }
}

