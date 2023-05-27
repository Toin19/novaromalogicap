import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[11];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 11; i++) {
            numeros[i] = input.nextInt();
        }
        
        System.out.println("Números pares:");
        for (int i = 0; i < 11; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}