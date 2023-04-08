import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite o valor de A");
        int a = input.nextInt();

        System.out.println("Digite o valor de B");
        int b = input.nextInt();

        int c; //variavel para armazenar o resultado

        if (a > b ) {
            c = a + b;
            System.out.println("Caminho utilizado: Soma");

        } else {
            c = a * b;
            System.out.println("Caminho utilizado: Multiplicação");
            
        }

        System.out.println("Resultado:" + c);

        input.close();


    }
}
