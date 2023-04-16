import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Digite um número inteiro ");
            int decimal = input.nextInt();

            String binario = " ";
            while (decimal > 0) {
                int resto = decimal % 2;
                binario = resto + binario;
                decimal /= 2;
            }
                System.out.println("O número em binário é " + binario);





    }





}
