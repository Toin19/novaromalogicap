import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = input.nextDouble();

        System.out.println("Digite o segundo número");
        double numero2 = input.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operação = input.next().charAt(0);

        double resultado = 0.0;

        switch (operação) {
            case '+':
               resultado = numero1 + numero2; 
                   break;

            case '-':
                resultado = numero1 - numero2;
                    break;

            case '*':
                 resultado = numero1 * numero2;
                    break;

            case '/':
                 resultado = numero1 / numero2;
                    break;

            default:
                System.out.println("Operação inválida");
                return;
        }

            System.out.println("Resultado: " + resultado);








    }
}
